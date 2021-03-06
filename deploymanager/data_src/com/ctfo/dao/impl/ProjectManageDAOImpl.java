package com.ctfo.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ctfo.beans.Project;
import com.ctfo.dao.ProjectManageDAO;
import com.ctfo.exception.CtfoAppException;
import com.ctfo.service.DynamicSqlParameter;

/**
 * 
 * 
 * <p>
 * -----------------------------------------------------------------------------
 * <br>
 * 工程名 ： InformationSer <br>
 * 功能： <br>
 * 描述： <br>
 * 授权 : (C) Copyright (c) 2011 <br>
 * 公司 : 北京中交兴路信息科技有限公司 <br>
 * -----------------------------------------------------------------------------
 * <br>
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
 * <td>2012-12-12</td>
 * <td>xuehui</td>
 * <td>创建</td>
 * </tr>
 * </table>
 * <br>
 * <font color="#FF0000">注意: 本内容仅限于[北京中交兴路信息科技有限公司]内部使用，禁止转发</font> <br>
 * 
 * @version 1.0
 * 
 * @author xuehui
 * @since JDK1.6
 */
@SuppressWarnings("unchecked")
public class ProjectManageDAOImpl extends GenericIbatisAbstract<Project, Long> implements ProjectManageDAO {

	/***
	 * 根据条件查询登陆信息
	 */
	public static final String GET_PROJECT_LIST = "getProjectList";
	public static final String GET_PROJECT_LIST_COUNT = "getProjectListCount";
	private static final String GET_EDIT_PROJECT = "getEditProject";
	private static final String ADD_PROJECT = "addProject";
	private static final String DEL_PROJECT = "delProject";
	private static final String EDIT_PROJECT = "editProject";

	//@Override
	public Map<String,Object> getProjectList(DynamicSqlParameter param) throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			List<Project> data = getSqlMapClientTemplate().queryForList(sqlmapNamespace + "." + GET_PROJECT_LIST, param);
			int total = (Integer) getSqlMapClientTemplate().queryForObject(sqlmapNamespace + "." + GET_PROJECT_LIST_COUNT, param);
			map.put("data", data);
			map.put("total", total);
		} catch (Exception e) {
			map = null;
			throw new CtfoAppException(e.fillInStackTrace());
		}
		return map;
	}

	//@Override
	public Map<String, Object> getEditProject(DynamicSqlParameter requestParam) {
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			List<Project> data = getSqlMapClientTemplate().queryForList(sqlmapNamespace + "." + GET_EDIT_PROJECT, requestParam);
			map.put("data", data);
		} catch (Exception e) {
			map = null;
			throw new CtfoAppException(e.fillInStackTrace());
		}
		return map;
	}

	//@Override
	public int addProject(DynamicSqlParameter requestParam) {
		int isertProjectId = 0;
		try {
			isertProjectId = getSqlMapClientTemplate().update(sqlmapNamespace + "." + ADD_PROJECT, requestParam);
		} catch (Exception e) {
			throw new CtfoAppException(e.fillInStackTrace());
		}
		return isertProjectId;
	}

	//@Override
	public int delProject(DynamicSqlParameter requestParam) {
		int delProjectId = 0;
		try {
			delProjectId = getSqlMapClientTemplate().update(sqlmapNamespace + "." + DEL_PROJECT, requestParam);
		} catch (Exception e) {
			throw new CtfoAppException(e.fillInStackTrace());
		}
		return delProjectId;
	}

	//@Override
	public int editProject(DynamicSqlParameter requestParam) {
		int editProjectId = 0;
		try {
			editProjectId = getSqlMapClientTemplate().update(sqlmapNamespace + "." + EDIT_PROJECT, requestParam);
		} catch (Exception e) {
			throw new CtfoAppException(e.fillInStackTrace());
		}
		return editProjectId;
	}

}
