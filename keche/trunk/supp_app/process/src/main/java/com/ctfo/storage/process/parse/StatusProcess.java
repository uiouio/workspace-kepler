/**
 * 
 */
package com.ctfo.storage.process.parse;

import java.util.concurrent.ArrayBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ctfo.storage.process.model.Location;
import com.ctfo.storage.process.model.ThVehicleStatus;

/**
 *	状态处理线程
 */
public class StatusProcess extends Thread {
	private static Logger log = LoggerFactory.getLogger(StatusProcess.class);
	/**	多媒体文件队列	*/
	private static ArrayBlockingQueue<Location> queue = new ArrayBlockingQueue<Location>(100000);
	/**	计数器	*/
	private int index = 0;
	/**	最后提交时间	*/
	private long lastTime = System.currentTimeMillis();
	/**	状态存储线程	*/
	private StatusStorage statusStorage;
	
	public StatusProcess() throws Exception{ 
		setName("StatusProcess");
//		启动存储线程
		statusStorage = new StatusStorage();
		statusStorage.start();
	}
	
	public void run(){
		while(true){
			try {
				Location location = queue.take();//获取并移除此队列的头部，在元素变得可用之前一直等待（如果有必要）。						
				index++;
				process(location);
				long current = System.currentTimeMillis();
				if ((current - lastTime) > 10000) {
					int queueSize = getQueueSize();
					log.info("StatusProcess-10秒处理[{}]条, 排队[{}]条", index, queueSize);
					index = 0;
					lastTime = System.currentTimeMillis();
				}	
			} catch (Exception e) {
				log.error("处理报警队列数据异常:" + e.getMessage(), e);
			}
		}
	}
	/**
	 * 获取队列大小
	 * @return
	 */
	private int getQueueSize() {
		return queue.size();
	}

	/**
	 * 处理多媒体文件
	 * @param MediaEvent
	 * @throws  InterruptedException 
	 */
	private void process(Location location)  {
		ThVehicleStatus status = new ThVehicleStatus();
		status.setVid(location.getVid());
		status.setVehicleNo(location.getPlate());
		status.setVinCode(location.getVinCode());
		status.setInnerCode(location.getInnerCode());
		status.setEntId(location.getEntId());
		status.setEntName(location.getEntName());
		status.setTeamId(location.getTeamId());
		status.setTeamName(location.getTeamName());
		status.setStaffId(location.getStaffId());
		status.setStaffName(location.getStaffName());
		status.setGatherTime(location.getUtcTime());
		status.setCreateTime(System.currentTimeMillis());
		
//		GPS状态  [ 车辆状态值用(0 绿灯 1红灯 2 灰灯)表示 ]
		String statusFlag = location.getStatusFlag();
		if(statusFlag != null){
			if(isPosition(statusFlag)){ // 定位状态
				status.setGpsStatus(1);
				status.setGpsStatusValue(0);
			} else {
				status.setGpsStatus(0);
				status.setGpsStatusValue(1);
			}
		} else {
			status.setGpsStatus(2);
		}
		// 冷却液温度  [ 车辆状态值用(0 绿灯 1红灯 2 灰灯)表示 ]
		int coolantTemperature = location.getCoolantTemperature();
		if(coolantTemperature != 0){
			status.seteWaterTempStatus(0);
			status.seteWaterTemp(coolantTemperature);
		} else {
			status.seteWaterTempStatus(2);
			status.seteWaterTemp(-2);
		}
//		if (dataMap.get("509") != null && !dataMap.get("509").equals("-1") && !dataMap.get("509").equals("")) {
//			double eWater = Double.parseDouble(dataMap.get("509"));
//			equipmentStatus.seteWaterValue(eWater);
//			if (MathUtils.checkEWaterValue(statusCode.geteWater(), eWater - 40)) {
//				equipmentStatus.seteWaterStatus(0);
//				Cache.addFiveEWaterStatus(vid, 0); // 缓存当前状态值
//			} else {
//				equipmentStatus.seteWaterStatus(1);
//				Cache.addFiveEWaterStatus(vid, 1); // 缓存当前状态值
//			}
//		} else if (dataMap.get("509") != null && dataMap.get("509").equals("-1")) { // 上报无效值
//			equipmentStatus.seteWaterValue(-2);
//			equipmentStatus.seteWaterStatus(2);
//			Cache.addFiveEWaterStatus(vid, 2); // 缓存当前状态值
//		} else {// 无值上报
//			int status = Cache.getFiveEWaterStatus(vid);
//			equipmentStatus.seteWaterStatus(status);
//			if (status == 2) {
//				equipmentStatus.seteWaterValue(-2);
//			}
//		}
		
		
//		status.setTerminalStatus(terminalStatus);
//		status.setTerminalStatusValue(terminalStatusValue);

//		status.setExtVoltageStatus(extVoltageStatus);
//		status.setExtVoltage(extVoltage);
//		status.setOilPressureStatus(oilPressureStatus);
//		status.setOilPressure(oilPressure);
//		status.setBreakPressureStatus(breakPressureStatus);
//		status.setBreakPressure(breakPressure);
//		status.setBreakpadFrayStatus(breakpadFrayStatus);
//		status.setBreakpadFray(breakpadFray);
//		status.setOilAlarmStatus(oilAlarmStatus);
//		status.setOilAlarm(oilAlarm);
//		status.setAbsBugStatus(absBugStatus);
//		status.setAbsBug(absBug);
//		status.setCoolantLevel(coolantLevel);
//		status.setCoolant(coolant);
//		status.setAirFilterClogStatus(airFilterClogStatus);
//		status.setAirFilterClog(airFilterClog);
//		status.setmWereBlockingStatus(mWereBlockingStatus);
//		status.setmWereBlocking(mWereBlocking);
//		status.setFuelBlockingStatus(fuelBlockingStatus);
//		status.setFuelBlocking(fuelBlocking);
//		status.seteOilTemperatureAlarmStatus(eOilTemperatureAlarmStatus);
//		status.seteOilTemperatureAlarm(eOilTemperatureAlarm);
//		status.setRetarderHtAlarmStatus(retarderHtAlarmStatus);
//		status.setRetarderHtAlarm(retarderHtAlarm);
//		status.seteHousingHtAlarmStatus(eHousingHtAlarmStatus);
//		status.seteHousingHtAlarm(eHousingHtAlarm);
//		status.setVehicleStatus(vehicleStatus);
//		status.setAirPressureStatus(airPressureStatus);
//		status.setAirPressure(airPressure);
//		status.setLineId(lineId);
//		status.setGpsFaultStatus(gpsFaultStatus);
//		status.setGpsFault(gpsFault);
//		status.setGpsOpenCircuitStatus(gpsOpenCircuitStatus);
//		status.setGpsOpenCircuit(gpsOpenCircuit);
//		status.setGpsShortCircuitStatus(gpsShortCircuitStatus);
//		status.setGpsShortCircuit(gpsShortCircuit);
//		status.setTerminalUnderVoltageStatus(terminalUnderVoltageStatus);
//		status.setTerminalUnderVoltage(terminalUnderVoltage);
//		status.setTerminalPowerDownStatus(terminalPowerDownStatus);
//		status.setTerminalPowerDown(terminalPowerDown);
//		status.setTerminalScreenFaultStatus(terminalScreenFaultStatus);
//		status.setTerminalScreenFault(terminalScreenFault);
//		status.setTtsFaultStatus(ttsFaultStatus);
//		status.setTtsFault(ttsFault);
//		status.setCameraFaultStatus(cameraFaultStatus);
//		status.setCameraFault(cameraFault);
		
		statusStorage.put(status);
	}
	
	


	/**
	 * 是否定位
	 * @param statusFlag
	 * @return
	 */
	private boolean isPosition(String statusFlag) {
		if(statusFlag.endsWith("10") || statusFlag.endsWith("11")){
			return true;
		}
		return false;
	}

	/*****************************************
	 * <li>描        述：处理车辆状态 		</li><br>
	 * <li>时        间：2013-10-18  下午3:08:40	</li><br>
	 * <li>参数： @param dataMap
	 * <li>参数： @return
	 * <li>参数： @throws SQLException			</li><br>
	 * 
	 *****************************************/
//	private EquipmentStatus analyVehicleLineStatus(Map<String, String> dataMap) throws SQLException {
////		处理车辆状态
//		EquipmentStatus equipmentStatus = new EquipmentStatus();
//		StatusCode statusCode = null;
//		String vid = dataMap.get(Constant.VID);
//		statusCode = oracleJdbcService.queryStatusCode(vid);
//		if (statusCode != null) {
//			equipmentStatus.setVid(vid);
//			// 车辆状态值用(0 绿灯 1红灯 2 灰灯)表示
//			// 实体bean属性以code结尾的表示状态，
//			// 8:位置基本信息状态位
//			// GPS状态
/**			if (statusCode.getGpsStatus().getType() == 0) {
//				if (dataMap.containsKey("8")) {
//					String tempStatus = dataMap.get("8");
//					String status = Long.toBinaryString(Long.parseLong(tempStatus));
//					if (status.matches(".*0\\d{1}") || status.equals("0") || status.equals("1")) {
//						equipmentStatus.setGpsStatusStatus(1);
//						equipmentStatus.setGpsValue(0);
//					} else {
//						equipmentStatus.setGpsStatusStatus(0);
//						equipmentStatus.setGpsValue(1);
//					}
//				} else {
//					equipmentStatus.setGpsStatusStatus(2);
//				}
//			} else {
//				equipmentStatus.setGpsStatusStatus(2);
			}
**/
//			// 冷却液温度
//			if (dataMap.get("509") != null && !dataMap.get("509").equals("-1") && !dataMap.get("509").equals("")) {
//				double eWater = Double.parseDouble(dataMap.get("509"));
//				equipmentStatus.seteWaterValue(eWater);
//				if (MathUtils.checkEWaterValue(statusCode.geteWater(), eWater - 40)) {
//					equipmentStatus.seteWaterStatus(0);
//					Cache.addFiveEWaterStatus(vid, 0); // 缓存当前状态值
//				} else {
//					equipmentStatus.seteWaterStatus(1);
//					Cache.addFiveEWaterStatus(vid, 1); // 缓存当前状态值
//				}
//			} else if (dataMap.get("509") != null && dataMap.get("509").equals("-1")) { // 上报无效值
//				equipmentStatus.seteWaterValue(-2);
//				equipmentStatus.seteWaterStatus(2);
//				Cache.addFiveEWaterStatus(vid, 2); // 缓存当前状态值
//			} else {// 无值上报
//				int status = Cache.getFiveEWaterStatus(vid);
//				equipmentStatus.seteWaterStatus(status);
//				if (status == 2) {
//					equipmentStatus.seteWaterValue(-2);
//				}
//			}
//
//			// 蓄电池电压
//			if (dataMap.containsKey("507") && !dataMap.get("507").equals("-1") && !dataMap.get("507").equals("")) { // 1bit=0.1V,//
//																										// 0=0V
//				double extVoltage = Double.parseDouble(dataMap.get("507"));
//				equipmentStatus.setExtVoltageValue(extVoltage);
//				if (MathUtils.checkValue(statusCode.getExtVoltage(), extVoltage * 0.1)) {
//					equipmentStatus.setExtVoltageStatus(0);
//					Cache.addFiveExtVoltageStatus(vid, 0); // 缓存当前状态值
//				} else {
//					equipmentStatus.setExtVoltageStatus(1);
//					Cache.addFiveExtVoltageStatus(vid, 1); // 缓存当前状态值
//				}
//			} else if (dataMap.get("507") != null && dataMap.get("507").equals("-1")) { // 上报无效值
//				equipmentStatus.setExtVoltageValue(-2);
//				equipmentStatus.setExtVoltageStatus(2);
//				Cache.addFiveExtVoltageStatus(vid, 2); // 缓存当前状态值
//			} else { // 无值上报
//				int status = Cache.getFiveExtVoltageStatus(vid);
//				if (status == 2) {
//					equipmentStatus.setExtVoltageValue(-2);
//				}
//				equipmentStatus.setExtVoltageStatus(status);
//			}
//
//			// 大气压力
//			if (dataMap.containsKey("511") && !dataMap.get("511").equals("-1") && !dataMap.get("511").equals("")) {
//				double airPressure = Double.parseDouble(dataMap.get("511"));
//				if (MathUtils.checkValue(statusCode.getAirPressure(), airPressure / 2)) {
//					equipmentStatus.setAirPressureStatus(0);
//					Cache.addFiveAirPressureStatus(vid, 0); // 缓存当前状态值
//				} else {
//					equipmentStatus.setAirPressureStatus(1);
//					Cache.addFiveAirPressureStatus(vid, 1); // 缓存当前状态值
//				}
//				equipmentStatus.setAirPressureValue(airPressure);
//			} else if (dataMap.get("511") != null && dataMap.get("511").equals("-1")) { // 上报无效值
//				equipmentStatus.setAirPressureValue(-2);
//				equipmentStatus.setAirPressureStatus(2);
//				Cache.addFiveAirPressureStatus(vid, 2); // 缓存当前状态值
//			} else { // 无值上报
//				int status = Cache.getFiveAirPressureStatus(vid);
//				equipmentStatus.setAirPressureStatus(status);
//				if (status == 2) {
//					equipmentStatus.setAirPressureValue(-2);
//				}
//			}
//
//			String alarmCode = dataMap.get("21"); // 扩展报警位
//			if (alarmCode == null) {
//				equipmentStatus.setOilPressureStatus(2);// 油压状态
//				equipmentStatus.setBrakePressureStatus(2);// 制动气压值
//				equipmentStatus.setBrakepadFrayStatus(2);// 制动蹄片磨损
//				equipmentStatus.setOilAramStatus(2);// 燃油告警
//				equipmentStatus.setCoolantLevelStatus(2);// 水位低状态
//				equipmentStatus.setAirFilterStatus(2);// 空滤堵塞
//				equipmentStatus.setMwereBlockingStatus(2);// 机虑堵塞
//				equipmentStatus.setFuelBlockingStatus(2);// 燃油堵塞
//				equipmentStatus.setEoilTemperatureStatus(2);// 机油温度
//				equipmentStatus.setRetarerHtStatus(2);// 缓速器高温
//				equipmentStatus.setEhousingStatus(2);// 仓温高状态
//				equipmentStatus.setAbsBugStatus(2); // ABS故障状态
//			} else {
//
//				// ABS故障状态
//				if (alarmCode.contains(",53,")) { // 开始
//					equipmentStatus.setAbsBugStatus(1);
//					equipmentStatus.setAbsBugValue(1);
//				} else { // 结束
//					equipmentStatus.setAbsBugStatus(0);
//					equipmentStatus.setAbsBugValue(0);
//				}
//
//				// 油压状态
//				if (alarmCode.contains(",34,")) { // 开始
//					equipmentStatus.setOilPressureStatus(1);
//					equipmentStatus.setOilPressureValue(1);
//				} else { // 结束
//					equipmentStatus.setOilPressureStatus(0);
//					equipmentStatus.setOilPressureValue(0);
//				}
//
//				// 制动气压值
//				if (alarmCode.contains(",33,")) { // 开始
//					equipmentStatus.setBrakePressureStatus(1);
//					equipmentStatus.setBrakePressureValue(1);
//				} else { // 结束
//					equipmentStatus.setBrakePressureStatus(0);
//					equipmentStatus.setBrakePressureValue(0);
//				}
//
//				// 制动蹄片磨损
//				if (alarmCode.contains(",36,")) { // 开始
//					equipmentStatus.setBrakepadFrayStatus(1);
//					equipmentStatus.setBrakepadFrayValue(1);
//				} else { // 结束
//					equipmentStatus.setBrakepadFrayStatus(0);
//					equipmentStatus.setBrakepadFrayValue(0);
//				}
//
//				// 燃油告警
//				if (alarmCode.contains(",41,")) { // 开始
//					equipmentStatus.setOilAramStatus(1);
//					equipmentStatus.setOilAramValue(1);
//				} else { // 结束
//					equipmentStatus.setOilAramStatus(0);
//					equipmentStatus.setOilAramValue(0);
//				}
//
//				// 水位低状态
//				if (alarmCode.contains(",35,")) { // 开始
//					equipmentStatus.setCoolantLevelStatus(1);
//					equipmentStatus.setCoolantLevelValue(1);
//				} else { // 结束
//					equipmentStatus.setCoolantLevelStatus(0);
//					equipmentStatus.setCoolantLevelValue(0);
//				}
//
//				// 空滤堵塞
//				if (alarmCode.contains(",37,")) { // 开始
//					equipmentStatus.setAirFilterStatus(1);
//					equipmentStatus.setAirFilterValue(1);
//				} else { // 结束
//					equipmentStatus.setAirFilterStatus(0);
//					equipmentStatus.setAirFilterValue(0);
//				}
//
//				// 机虑堵塞
//				if (alarmCode.contains(",40,")) { // 开始
//					equipmentStatus.setMwereBlockingStatus(1);
//					equipmentStatus.setMwereBlockingValue(1);
//				} else { // 结束
//					equipmentStatus.setMwereBlockingStatus(0);
//					equipmentStatus.setMwereBlockingValue(0);
//				}
//
//				// 燃油堵塞
//				if (alarmCode.contains(",41,")) { // 开始
//					equipmentStatus.setFuelBlockingStatus(1);
//					equipmentStatus.setFuelBlockingValue(1);
//				} else { // 结束
//					equipmentStatus.setFuelBlockingStatus(0);
//					equipmentStatus.setFuelBlockingValue(0);
//				}
//
//				// 机油温度
//				if (alarmCode.contains(",42,")) { // 开始
//					equipmentStatus.setEoilTemperatureStatus(1);
//					equipmentStatus.setEoilTemperatureValue(1);
//				} else { // 结束
//					equipmentStatus.setEoilTemperatureStatus(0);
//					equipmentStatus.setEoilTemperatureValue(0);
//				}
//
//				// 缓速器高温
//				if (alarmCode.contains(",38,")) { // 开始
//					equipmentStatus.setRetarerHtStatus(1);
//					equipmentStatus.setRetarerHtValue(1);
//				} else { // 结束
//					equipmentStatus.setRetarerHtStatus(0);
//					equipmentStatus.setRetarerHtValue(0);
//				}
//
//				// 仓温高状态
//				if (alarmCode.contains(",39,")) { // 开始
//					equipmentStatus.setEhousingStatus(1);
//					equipmentStatus.setEhousingValue(1);
//				} else { // 结束
//					equipmentStatus.setEhousingStatus(0);
//					equipmentStatus.setEhousingValue(0);
//				}
//			}
//
//			// 终端状态
//			String alarmAddCode = dataMap.get("20"); // 标准报警
//			if (alarmAddCode == null) {
//				equipmentStatus.setGpsFaultStatus(2); // GNSS模块故障报警
//				equipmentStatus.setGpsOpenciruitStatus(2); // GNSS天线未接或被剪断报警
//				equipmentStatus.setGpsShortciruitStatus(2); // GNSS天线短路报警
//				equipmentStatus.setTerminalUnderVoltageStatus(2); // 终端主电源欠压报警
//				equipmentStatus.setTerminalPowerDownStatus(2); // 终端主电源掉电报警
//				equipmentStatus.setTerminalScreenfalutStatus(2); // 终端LCD显示屏故障报警
//				equipmentStatus.setTtsFaultStatus(2); // TTS模块故障报警
//				equipmentStatus.setCameraFaultStatus(2); // 摄像头故障报警
//				equipmentStatus.setTerminalStatus(2);// 终端状态
//			} else {
//				// GNSS模块故障报警
//				if (alarmAddCode.contains(",4,")) { // 开始
//					equipmentStatus.setGpsFaultStatus(1);
//					equipmentStatus.setGpsFaultValue(1);
//				} else { // 结束
//					equipmentStatus.setGpsFaultStatus(0);
//					equipmentStatus.setGpsFaultValue(0);
//				}
//
//				// GNSS天线未接或被剪断报警
//				if (alarmAddCode.contains(",5,")) { // 开始
//					equipmentStatus.setGpsOpenciruitStatus(1);
//					equipmentStatus.setGpsOpenciruitValue(1);
//				} else { // 结束
//					equipmentStatus.setGpsOpenciruitStatus(0);
//					equipmentStatus.setGpsOpenciruitValue(0);
//				}
//
//				// GNSS天线短路报警
//				if (alarmAddCode.contains(",6,")) { // 开始
//					equipmentStatus.setGpsShortciruitStatus(1);
//					equipmentStatus.setGpsShortciruitValue(1);
//				} else { // 结束
//					equipmentStatus.setGpsShortciruitStatus(0);
//					equipmentStatus.setGpsShortciruitValue(0);
//				}
//
//				// 终端主电源欠压报警
//				if (alarmAddCode.contains(",7,")) { // 开始
//					equipmentStatus.setTerminalUnderVoltageStatus(1);
//					equipmentStatus.setTerminalUnderVoltageValue(1);
//				} else { // 结束
//					equipmentStatus.setTerminalUnderVoltageStatus(0);
//					equipmentStatus.setTerminalUnderVoltageValue(0);
//				}
//
//				// 终端主电源掉电报警
//				if (alarmAddCode.contains(",8,")) { // 开始
//					equipmentStatus.setTerminalPowerDownStatus(1);
//					equipmentStatus.setTerminalPowerDownValue(1);
//				} else { // 结束
//					equipmentStatus.setTerminalPowerDownStatus(0);
//					equipmentStatus.setTerminalPowerDownValue(0);
//				}
//
//				// 终端LCD显示屏故障报警
//				if (alarmAddCode.contains(",9,")) { // 开始
//					equipmentStatus.setTerminalScreenfalutStatus(1);
//					equipmentStatus.setTerminalScreenfalutValue(1);
//				} else { // 结束
//					equipmentStatus.setTerminalScreenfalutStatus(0);
//					equipmentStatus.setTerminalScreenfalutValue(0);
//				}
//
//				// TTS模块故障报警
//				if (alarmAddCode.contains(",10,")) { // 开始
//					equipmentStatus.setTtsFaultStatus(1);
//					equipmentStatus.setTtsFaultValue(1);
//				} else { // 结束
//					equipmentStatus.setTtsFaultStatus(0);
//					equipmentStatus.setTtsFaultValue(0);
//				}
//
//				// 摄像头故障报警
//				if (alarmAddCode.contains(",11,")) { // 开始
//					equipmentStatus.setCameraFaultStatus(1);
//					equipmentStatus.setCameraFaultValue(1);
//				} else { // 结束
//					equipmentStatus.setCameraFaultStatus(0);
//					equipmentStatus.setCameraFaultValue(0);
//				}
//
//				if (alarmAddCode.contains(",4,") // GNSS模块故障报警 开始
//						|| alarmAddCode.contains(",5,") // GNSS天线未接或被剪断报警 开始
//						|| alarmAddCode.contains(",6,") // GNSS天线短路报警 开始
//						|| alarmAddCode.contains(",7,") // 终端主电源欠压报警 开始
//						|| alarmAddCode.contains(",8,") // 终端主电源掉电报警 开始
//						|| alarmAddCode.contains(",9,") // 终端LCD显示屏故障报警 开始
//						|| alarmAddCode.contains(",10,") // TTS模块故障报警 开始
//						|| alarmAddCode.contains(",11,")) { // 摄像头故障报警 开始
//					equipmentStatus.setTerminalStatus(1);
//					equipmentStatus.setTerminalValue(1);
//				} else {
//					equipmentStatus.setTerminalStatus(0);
//					equipmentStatus.setTerminalValue(0);
//				}
//			}
//		}
//		return equipmentStatus;
//	}
	
	/**
	 * 将data插入到此队列的尾部（如果立即可行且不会超过该队列的容量），在成功时返回 true，如果此队列已满，则返回 false。
	 * @param data
	 */
	public static boolean offer(Location location){
		return queue.offer(location);
	}
	/**
	 * 将指定的元素插入此队列的尾部，如果该队列已满，则等待可用的空间。
	 * @param data
	 * @return
	 */
	public void put(Location location){
		try {
			queue.put(location);
		} catch (InterruptedException e) {
			log.error("插入数据到队列异常!"); 
		}
	}
	/**
	 * 将指定的元素插入到此队列的尾部（如果立即可行且不会超过该队列的容量），在成功时返回 true，如果此队列已满，则抛出 IllegalStateException。
	 * @param data
	 * @return
	 */
	public static boolean add(Location location){
		return queue.add(location);
	}
}
