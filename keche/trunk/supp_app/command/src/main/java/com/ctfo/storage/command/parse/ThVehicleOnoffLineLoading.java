/**
 * 2014-6-4thVehicleOnOffLineLoading.java
 */
package com.ctfo.storage.command.parse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ctfo.storage.command.model.OnOffLineModel;
import com.ctfo.storage.command.service.HBaseService;

/**
 * thVehicleOnOffLineLoading
 * 
 * 
 * @author huangjincheng
 * 2014-6-4上午11:18:40
 * 
 */
public class ThVehicleOnoffLineLoading extends Thread{
	private static Logger log = LoggerFactory.getLogger(ThVehicleOnoffLineLoading.class);
	
	private static ArrayBlockingQueue<OnOffLineModel> queue = new ArrayBlockingQueue<OnOffLineModel>(50000);
	
	private static HBaseService hBaseService;
	
	private int batchSize = 1000; // 默认每次批量提交100条
	private static int processSize = 0;//提交数据库总条数
	private static int size = 0;
	private boolean isDataFlag = false;
	private boolean isListenFlag = false;
	private static long lastTime = System.currentTimeMillis();
	
	private static List<OnOffLineModel> list = new ArrayList<OnOffLineModel>();
	
	public ThVehicleOnoffLineLoading(){
		setName("ThVehicleOnoffLineLoading");
		hBaseService = new HBaseService();
	}
	
	public void run(){
		while(true){
			try {
				if(isDataFlag){
					if(!isListenFlag){
						OnoffLineListListen ll = new OnoffLineListListen();
						ll.start();
						log.info("list监听线程启动!");
						isListenFlag = true;
					}
				}
//				OnOffLineModel o = queue.poll();//获取并移除此队列的头，如果此队列为空，则返回 null。 		
				OnOffLineModel o = queue.take();//获取并移除此队列的头部，在元素变得可用之前一直等待（如果有必要）。
				isDataFlag = true;	
				size++;
				process(o); 
				
			} catch (Exception e) {
				log.error("Loading处理队列数据异常:" + e.getMessage());
			}
		}
	}
	
	private void process(OnOffLineModel o) {
		
		if(o != null){
			list.add(o);
		}
		if(size == batchSize){			
			long start = System.currentTimeMillis();
			hBaseService.saveOnOffLineModelList(list);
			processSize += list.size();
			log.info("【上下线数据】 1000条批量提交:{}, 耗时:{}ms, 共提交总数:{}"  , list.size(), (System.currentTimeMillis() - start), processSize);
			list.clear();
			size = 0;
			lastTime = System.currentTimeMillis();
			
		}
		
		
	}
	
	static void updateList(HBaseService hBaseService) {	
		long start = System.currentTimeMillis();
		List<OnOffLineModel> listCopy = new ArrayList<OnOffLineModel>();
		listCopy.addAll(list);
		list.clear();
		hBaseService.saveOnOffLineModelList(listCopy);	
		processSize += listCopy.size();
		log.info("【上下线数据】 自动批量提交:{}, 耗时:{}ms, 共提交总数:{}" , listCopy.size(), (System.currentTimeMillis() - start), processSize);

		size = 0;
		lastTime = System.currentTimeMillis();
			
		}


	/**
	 * 将data插入到此队列的尾部（如果立即可行且不会超过该队列的容量），在成功时返回 true，如果此队列已满，则返回 false。
	 * @param data
	 */
	public static boolean offer(OnOffLineModel data){
		return queue.offer(data);
	}
	/**
	 * 将指定的元素插入此队列的尾部，如果该队列已满，则等待可用的空间。
	 * @param data
	 * @return
	 */
	public void put(OnOffLineModel data){
		try {
			queue.put(data);
		} catch (InterruptedException e) {
			log.error("插入数据到队列异常!"); 
		}
	}
	/**
	 * 将指定的元素插入到此队列的尾部（如果立即可行且不会超过该队列的容量），在成功时返回 true，如果此队列已满，则抛出 IllegalStateException。
	 * @param data
	 * @return
	 */
	public static boolean add(OnOffLineModel data){
		return queue.add(data);
	}

	/**
	 * 获取list的值
	 * @return list  
	 */
	public static List<OnOffLineModel> getList() {
		return list;
	}

	/**
	 * 设置list的值
	 * @param list
	 */
	public static void setList(List<OnOffLineModel> list) {
		ThVehicleOnoffLineLoading.list = list;
	}

	/**
	 * 获取lastTime的值
	 * @return lastTime  
	 */
	public static long getLastTime() {
		return lastTime;
	}

	/**
	 * 设置lastTime的值
	 * @param lastTime
	 */
	public static void setLastTime(long lastTime) {
		ThVehicleOnoffLineLoading.lastTime = lastTime;
	}
	
	


}
