package com.demo.demo.entity;

import net.riking.core.annos.Comment;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 描述: 基础段model
 *
 * @author qia.wu
 * @create 2018-09-03 20:31
 */
@MappedSuperclass
public class BaseSegEntity extends BaseSegSingleEntity {

	@Comment("列表数据状态")
	@Column(name = "LIST_DATA_STATUS", precision = 2 )
	private Integer listDataStatus;

	@Comment("列表操作状态")
	@Column(name = "LIST_ACTION_TYPE", precision = 1 )
	private String listActionType;

	public void setListDataStatus(Integer listDataStatus) {
		this.listDataStatus = listDataStatus;
	}

	public Integer getListDataStatus() {
		return listDataStatus;
	}

	public String getListActionType() {
		return listActionType;
	}

	public void setListActionType(String listActionType) {
		this.listActionType = listActionType;
	}
}
