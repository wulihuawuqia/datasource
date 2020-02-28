package com.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import net.riking.core.annos.Comment;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * 描述: 基础段model（适用只有一个表的业务：如借贷特殊事件，个人证件有效期等）
 *
 * @author qia.wu
 * @create 2018-09-03 20:31
 */
@Comment("基础段model,用于继承")
@MappedSuperclass
public class BaseSegSingleEntity extends BaseEntity {

	@Comment("当前操作导出报文名")
	@Column(name = "listReportFile", length = 34)
	private String listReportFile;

	@Comment("重置原因")
	@Column(name = "resetReason", length = 400)
	private String resetReason;

	@Comment("重置用户名")
	@Column(name = "resetBy", length = 64)
	private String resetBy;

	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@Comment("重置时间")
	@Temporal(TemporalType.TIMESTAMP)
	private Date resetTime;

	@Comment("提交用户名")
	@Column(name = "submitBy", length = 64)
	private String submitBy;

	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@Comment("提交时间")
	@Temporal(TemporalType.TIMESTAMP)
	private Date submitTime;

	@JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	@Comment("审核时间")
	@Temporal(TemporalType.TIMESTAMP)
	private Date checkTime;

	@Comment("审核人用户名")
	@Column(name = "checkBy", length = 64)
	private String checkBy;

	@Comment("审核备注")
	@Column(name = "refuseReason", length = 400)
	private String refuseReason;

	@Comment("变更状态（记录数据来源为：非手动，状态曾今为：待补录的记录）")
	@Column(name = "changeStatus", precision = 1)
	private Integer changeStatus;

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckBy() {
		return checkBy;
	}

	public void setCheckBy(String checkBy) {
		this.checkBy = checkBy;
	}

	public String getRefuseReason() {
		return refuseReason;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public Integer getChangeStatus() {
		return changeStatus;
	}

	public void setChangeStatus(Integer changeStatus) {
		this.changeStatus = changeStatus;
	}

	public String getListReportFile() {
		return listReportFile;
	}

	public void setListReportFile(String listReportFile) {
		this.listReportFile = listReportFile;
	}

	public String getResetReason() {
		return resetReason;
	}

	public void setResetReason(String resetReason) {
		this.resetReason = resetReason;
	}

	public String getResetBy() {
		return resetBy;
	}

	public void setResetBy(String resetBy) {
		this.resetBy = resetBy;
	}

	public Date getResetTime() {
		return resetTime;
	}

	public void setResetTime(Date resetTime) {
		this.resetTime = resetTime;
	}

	public String getSubmitBy() {
		return submitBy;
	}

	public void setSubmitBy(String submitBy) {
		this.submitBy = submitBy;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

}
