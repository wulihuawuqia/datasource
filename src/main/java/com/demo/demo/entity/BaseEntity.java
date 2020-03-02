/**
 *
 */
package com.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.riking.core.annos.Comment;

import javax.persistence.*;
import java.util.Date;

/**
 * 基础model,用于继承
 * <p>
 * <p>
 * 〈功能详细描述〉
 *
 * @author Administrator
 * @date 2017年9月25日 上午10:44:45
 * @see
 * @since 1.0
 */
@Comment("基础model,用于继承")
@MappedSuperclass
@JsonIgnoreProperties(ignoreUnknown = true, value = {"handler", "hibernateLazyInitializer", "fieldHandler"})
public abstract class BaseEntity {
    @Comment("创建时间")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdTime", nullable = false, updatable = false)
    private Date createdTime;

    @Comment("最后修改时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastModifiedTime", nullable = false)
    private Date lastModifiedTime;

    @Comment("数据是否有效 0有效，1无效")
    @org.hibernate.annotations.ColumnDefault("0")
    @Column(name = "invalid", nullable = false, precision = 1)
    private Integer invalid;

    @Comment("物理主键")
    @Id
    @Column(name = "id", precision = 19)
    @GeneratedValue
    @Basic(optional = true)
    private Long id;

    @Comment("创建人用户名")
    @Column(name = "createdBy", length = 64)
    private String createdBy;

    @Comment("最后修改人用户名")
    @Column(name = "lastModifiedBy", length = 64)
    private String lastModifiedBy;

    /**
     * 机构名称
     **/
    @Transient
    private String branchName;

    /**
     * 机构代码
     **/
    @Transient
    private String branchCode;

    /**
     * 查询条件-机构id集合
     **/
    @Transient
    private String branchIds;

    @Comment("操作类型")
    @Column(name = "ACTION_TYPE", length = 1)
    private String actionType;

    @Comment("数据来源")
    @Column(name = "DATA_SOURCE", precision = 1)
    private Integer dataSource;

    @Comment("数据状态")
    @Column(name = "DATA_STATUS", precision = 2)
    private Integer dataStatus;

    @Comment("机构ID")
    @Column(name = "BRANCH_ID", precision = 19)
    private Long branchId;

    @Comment("导出报文名")
    @Column(name = "reportFile", length = 34)
    private String reportFile;

    public Date getCreatedTime() {
        return createdTime;
    }

    public Long getBranchId() {
        return branchId;
    }

    public String getReportFile() {
        return reportFile;
    }

    public void setReportFile(String reportFile) {
        this.reportFile = reportFile;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    /**
     * @param createdTime the createdTime to set
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @param lastModifiedTime the lastModifiedTime to set
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Integer getInvalid() {
        return invalid;
    }

    /**
     * @param invalid the invalid to set
     */
    public void setInvalid(Integer invalid) {
        this.invalid = invalid;
    }

    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchIds() {
        return branchIds;
    }

    public void setBranchIds(String branchIds) {
        this.branchIds = branchIds;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public void setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }


}
