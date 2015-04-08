package com.ctfo.basic.service;

import com.ctfo.basic.beans.TbOrganizationMultiple;
import com.ctfo.common.local.exception.CtfoAppException;
import com.ctfo.common.local.obj.DynamicSqlParameter;
import com.ctfo.common.local.obj.PaginationResult;

/**
 * 
 * 
 * <p>
 * ----------------------------------------------------------------------------- <br>
 * 工程名 ： datacenterApp <br>
 * 功能： 主中心组织管理<br>
 * 描述： 主中心组织管理<br>
 * 授权 : (C) Copyright (c) 2011 <br>
 * 公司 : 北京中交慧联信息科技有限公司 <br>
 * ----------------------------------------------------------------------------- <br>
 * 修改历史 <br>
 * <table width="432" border="1">
 * <tr>
 * <td>版本</td>
 * <td>时间</td>
 * <td>作者</td>
 * <td>改变</td>
 * </tr>
 * <tr>
 * <td>1.0</td>
 * <td>2014-6-26</td>
 * <td>xuehui</td>
 * <td>创建</td>
 * </tr>
 * </table>
 * <br>
 * <font color="#FF0000">注意: 本内容仅限于[北京中交慧联信息科技有限公司]内部使用，禁止转发</font> <br>
 * 
 * @version 1.0
 * 
 * @author xuehui
 * @since JDK1.6
 */
public interface TbOrganizationMultipleService {

	/**
	 * 根据组织id获取该组织下所有id
	 * 
	 * @param param
	 * @return
	 * @throws CtfoAppException
	 */
	public String findEntIds(DynamicSqlParameter param) throws CtfoAppException;

	/**
	 * 查询组织列表
	 * 
	 * @param param
	 * @return
	 * @throws CtfoAppException
	 */
	public PaginationResult<TbOrganizationMultiple> findOrgMultByParamPage(DynamicSqlParameter param) throws CtfoAppException;

	/**
	 * 添加组织
	 * 
	 * @param org
	 * @return
	 * @throws CtfoAppException
	 */
	public PaginationResult<TbOrganizationMultiple> addOrganizationMult(TbOrganizationMultiple org) throws CtfoAppException;

	/**
	 * 修改组织
	 * 
	 * @param org
	 * @return
	 * @throws CtfoAppException
	 */
	public PaginationResult<TbOrganizationMultiple> modifyOrganizationMult(TbOrganizationMultiple org) throws CtfoAppException;

	/**
	 * 删除组织(逻辑删除)
	 * 
	 * @param org
	 * @return
	 * @throws CtfoAppException
	 */
	public PaginationResult<TbOrganizationMultiple> deleteOrganizationMult(TbOrganizationMultiple org) throws CtfoAppException;

	/**
	 * 吊销、启用组织
	 * 
	 * @param org
	 * @return
	 * @throws CtfoAppException
	 */
	public PaginationResult<TbOrganizationMultiple> revokeOpenOrgMult(TbOrganizationMultiple org) throws CtfoAppException;

}
