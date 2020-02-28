package com.demo.demo.entity;

import net.riking.core.annos.Comment;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.util.Date;

@Comment("个人基本信息记录_基础段")
@Entity
@Table(name = "T_ICIRS_BS_SGMT")
public class BsSgmt extends BaseSegEntity {
    public static final String TABLE = "T_PER_BS_SGMT";

    /**
     * 基础信息
     **/
    @Comment("姓名")
    @Column(name = "NAME", length = 30)
    private String name;

    @Comment("证件类型")
    @Column(name = "I_D_TYPE", length = 2)
    private String idType;

    @Comment("证件号码")
    @Column(name = "I_D_NUM", length = 20)
    private String idNum;

    @Comment("信息来源编码")
    @Column(name = "INF_SURC_CODE", length = 60)
    private String infSurcCode;

    @Comment("信息报告日期")
    @Temporal(TemporalType.DATE)
    @Column(name = "reportDate")
    private Date reportDate;

    @Comment("报告时点说明代码")
    @Column(name = "reportPoint", precision = 2)
    private Integer reportPoint;

    @Comment("客户资料维护机构代码")
    @Column(name = "CIMOC", length = 14)
    private String cimoc;

    @Comment("客户资料类型")
    @Column(name = "CUSTOMER_TYPE", precision = 2)
    private Integer customerType;

    /**
     * 基本信息
     **/
    @Comment("性别")
    @Column(name = "SEX", precision = 1)
    private Integer sex;

    @Temporal(TemporalType.DATE)
    @Comment("出生日期")
    @Column(name = "D_O_B")
    private Date dob;

    @Comment("国籍")
    @Column(name = "NATION", length = 3)
    private String nation;

    @Comment("户籍地址")
    @Column(name = "HOUSE_ADD", length = 100)
    private String houseAdd;

    @Comment("户籍所在地行政区划")
    @Column(name = "HH_DIST", length = 6)
    private String hhDist;

    @Comment("手机号码")
    @Column(name = "CELL_PHONE", length = 11)
    private String cellPhone;

    @Comment("电子邮箱")
    @Column(name = "EMAIL", length = 60)
    private String email;

    @Comment("基本信息信息更新日期")
    @Temporal(TemporalType.DATE)
    @Column(name = "fcsInfoUpDate")
    private Date fcsInfoUpDate;

    /**
     * 教育信息
     **/
    @Comment("学历")
    @Column(name = "EDU_LEVEL", precision = 2)
    private Integer eduLevel;

    @Comment("学位")
    @Column(name = "ACA_DEGREE", precision = 1)
    private Integer acaDegree;

    @Comment("教育信息信息更新日期")
    @Temporal(TemporalType.DATE)
    @Column(name = "eduInfoUpDate")
    private Date eduInfoUpDate;

    /**
     * 职业信息
     **/
    @Comment("就业状况")
    @Column(name = "EMP_STATUS", precision = 2)
    private Integer empStatus;

    @Comment("单位名称")
    @Column(name = "CPN_NAME", length = 80)
    private String cpnName;

    @Comment("单位性质")
    @Column(name = "CPN_TYPE", precision = 2)
    private Integer cpnType;

    @Comment("单位所属行业")
    @Column(name = "INDUSTRY", length = 1)
    private String industry;

    @Comment("单位详细地址")
    @Column(name = "CPN_ADDR", length = 100)
    private String cpnAddr;

    @Comment("单位所在地邮编")
    @Column(name = "CPN_PC", length = 8)
    private String cpnPc;

    @Comment("单位所在地行政区划")
    @Column(name = "CPN_DIST", length = 6)
    private String cpnDist;

    @Comment("单位电话")
    @Column(name = "CPN_T_E_L", length = 25)
    private String cpnTEL;

    @Comment("职业")
    @Column(name = "OCCUPATION", length = 1)
    private String occupation;

    @Comment("职务")
    @Column(name = "TITLE", precision = 1)
    private Integer title;

    @Comment("职称")
    @Column(name = "TECH_TITLE", length = 1)
    private Integer techTitle;

    @Comment("本单位工作起始年份")
    @Column(name = "WORK_START_DATE", precision = 4)
    private Integer workStartDate;

    @Comment("职业信息信息更新日期")
    @Temporal(TemporalType.DATE)
    @Column(name = "octpnInfoUpDate")
    private Date octpnInfoUpDate;

    /**
     * 居住地址段
     **/
    @Comment("居住状况")
    @Column(name = "RESI_STATUS", length = 2)
    private Integer resiStatus;

    @Comment("居住地详细地址")
    @Column(name = "RESI_ADDR", length = 100)
    private String resiAddr;

    @Comment("居住地邮编")
    @Column(name = "RESI_PC", length = 8)
    private String resiPc;

    @Comment("居住地行政区划")
    @Column(name = "RESI_DIST", length = 6)
    private String resiDist;

    @Comment("住宅电话")
    @Column(name = "HOME_TEL", length = 25)
    private String homeTel;

    @Comment("居住地址信息信息更新日期")
    @Temporal(TemporalType.DATE)
    @Column(name = "resiInfoUpDate")
    private Date resiInfoUpDate;

    /**
     * 通讯地址段
     **/
    @Comment("通讯地址")
    @Column(name = "MAIL_ADDR", length = 100)
    private String mailAddr;

    @Comment("通讯地邮编")
    @Column(name = "MAIL_PC", length = 8)
    private String mailPc;

    @Comment("通讯地行政区划")
    @Column(name = "MAIL_DIST", length = 6)
    private String mailDist;

    @Comment("通讯地址信息信息更新日期")
    @Temporal(TemporalType.DATE)
    @Column(name = "mlgInfoUpDate")
    private Date mlgInfoUpDate;

    /**
     * 婚姻信息段
     **/
    @Comment("婚姻状况")
    @Column(name = "MARI_STATUS", precision = 2)
    private Integer mariStatus;

    @Comment("配偶姓名")
    @Column(name = "SPO_NAME", length = 30)
    private String spoName;

    @Comment("配偶证件类型")
    @Column(name = "SPO_I_D_TYPE", length = 2)
    private String spoIDType;

    @Comment("配偶证件号码")
    @Column(name = "SPO_I_D_NUM", length = 20)
    private String spoIDNum;

    @Comment("配偶联系电话")
    @Column(name = "SPO_TEL", length = 25)
    private String spoTel;

    @Comment("配偶工作单位")
    @Column(name = "SPS_CMPY_NM", length = 80)
    private String spsCmpyNm;

    @Comment("婚姻信息信息更新日期")
    @Temporal(TemporalType.DATE)
    @Column(name = "spsInfoUpDate")
    private Date spsInfoUpDate;

    /**
     * 收入信息段
     **/
    @Comment("自报年收入")
    @Column(name = "ANNL_INC", precision = 15)
    private Long annlInc;

    @Comment("纳税年收入")
    @Column(name = "TAX_INCOME", precision = 15)
    private Long taxIncome;

    @Comment("收入信息信息更新日期")
    @Temporal(TemporalType.DATE)
    @Column(name = "incInfoUpDate")
    private Date incInfoUpDate;

    @Comment("列表数据状态")
    @Column(name = "LIST_DATA_STATUS", precision = 2)
    private Integer listDataStatus;

    @Comment("列表操作类型")
    @Column(name = "LIST_ACTION_TYPE", length = 1)
    private String listActionType;

    @Comment("ODS导入任务id")
    @Column(name = "ODS_ID", precision = 19)
    private Long odsId;

    @Comment("是否报送")
    @Column(name = "ISREPORT", precision = 10)
    private Integer isReport;

    @Transient
    private String operate;

    @Transient
    private String idTypeVal;

    @Transient
    private String customerTypeVal;

    @Transient
    private String code;

    @Transient
    private String businessType;

    @Transient
    private String speNotReport;

    public String getSpeNotReport() {
        return speNotReport;
    }

    public void setSpeNotReport(String speNotReport) {
        this.speNotReport = speNotReport;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getIsReport() {
        return isReport;
    }

    public void setIsReport(Integer isReport) {
        this.isReport = isReport;
    }

    public Long getOdsId() {
        return odsId;
    }

    public void setOdsId(Long odsId) {
        this.odsId = odsId;
    }

    public String getIdTypeVal() {
        return idTypeVal;
    }

    public void setIdTypeVal(String idTypeVal) {
        this.idTypeVal = idTypeVal;
    }

    public String getCustomerTypeVal() {
        return customerTypeVal;
    }

    public void setCustomerTypeVal(String customerTypeVal) {
        this.customerTypeVal = customerTypeVal;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the infSurcCode
     */
    public String getInfSurcCode() {
        return infSurcCode;
    }

    /**
     * @param infSurcCode the infSurcCode to set
     */
    public void setInfSurcCode(String infSurcCode) {
        this.infSurcCode = infSurcCode;
    }

    /**
     * @return the reportDate
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * @param reportDate the reportDate to set
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * @return the reportPoint
     */
    public Integer getReportPoint() {
        return reportPoint;
    }

    /**
     * @param reportPoint the reportPoint to set
     */
    public void setReportPoint(Integer reportPoint) {
        this.reportPoint = reportPoint;
    }

    /**
     * @return the cimoc
     */
    public String getCimoc() {
        return cimoc;
    }

    /**
     * @param cimoc the cimoc to set
     */
    public void setCimoc(String cimoc) {
        this.cimoc = cimoc;
    }

    /**
     * @return the customerType
     */
    public Integer getCustomerType() {
        return customerType;
    }

    /**
     * @param customerType the customerType to set
     */
    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    /**
     * @return the sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * @return the nation
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation the nation to set
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * @return the houseAdd
     */
    public String getHouseAdd() {
        return houseAdd;
    }

    /**
     * @param houseAdd the houseAdd to set
     */
    public void setHouseAdd(String houseAdd) {
        this.houseAdd = houseAdd;
    }

    /**
     * @return the hhDist
     */
    public String getHhDist() {
        return hhDist;
    }

    /**
     * @param hhDist the hhDist to set
     */
    public void setHhDist(String hhDist) {
        this.hhDist = hhDist;
    }

    /**
     * @return the cellPhone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fcsInfoUpDate
     */
    public Date getFcsInfoUpDate() {
        return fcsInfoUpDate;
    }

    /**
     * @param fcsInfoUpDate the fcsInfoUpDate to set
     */
    public void setFcsInfoUpDate(Date fcsInfoUpDate) {
        this.fcsInfoUpDate = fcsInfoUpDate;
    }

    /**
     * @return the eduLevel
     */
    public Integer getEduLevel() {
        return eduLevel;
    }

    /**
     * @param eduLevel the eduLevel to set
     */
    public void setEduLevel(Integer eduLevel) {
        this.eduLevel = eduLevel;
    }

    /**
     * @return the acaDegree
     */
    public Integer getAcaDegree() {
        return acaDegree;
    }

    /**
     * @param acaDegree the acaDegree to set
     */
    public void setAcaDegree(Integer acaDegree) {
        this.acaDegree = acaDegree;
    }

    /**
     * @return the eduInfoUpDate
     */
    public Date getEduInfoUpDate() {
        return eduInfoUpDate;
    }

    /**
     * @param eduInfoUpDate the eduInfoUpDate to set
     */
    public void setEduInfoUpDate(Date eduInfoUpDate) {
        this.eduInfoUpDate = eduInfoUpDate;
    }

    /**
     * @return the empStatus
     */
    public Integer getEmpStatus() {
        return empStatus;
    }

    /**
     * @param empStatus the empStatus to set
     */
    public void setEmpStatus(Integer empStatus) {
        this.empStatus = empStatus;
    }

    /**
     * @return the cpnName
     */
    public String getCpnName() {
        return cpnName;
    }

    /**
     * @param cpnName the cpnName to set
     */
    public void setCpnName(String cpnName) {
        this.cpnName = cpnName;
    }

    /**
     * @return the cpnType
     */
    public Integer getCpnType() {
        return cpnType;
    }

    /**
     * @param cpnType the cpnType to set
     */
    public void setCpnType(Integer cpnType) {
        this.cpnType = cpnType;
    }

    /**
     * @return the industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * @param industry the industry to set
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * @return the cpnAddr
     */
    public String getCpnAddr() {
        return cpnAddr;
    }

    /**
     * @param cpnAddr the cpnAddr to set
     */
    public void setCpnAddr(String cpnAddr) {
        this.cpnAddr = cpnAddr;
    }

    /**
     * @return the cpnDist
     */
    public String getCpnDist() {
        return cpnDist;
    }

    /**
     * @param cpnDist the cpnDist to set
     */
    public void setCpnDist(String cpnDist) {
        this.cpnDist = cpnDist;
    }

    /**
     * @return the cpnTEL
     */
    public String getCpnTEL() {
        return cpnTEL;
    }

    /**
     * @param cpnTEL the cpnTEL to set
     */
    public void setCpnTEL(String cpnTEL) {
        this.cpnTEL = cpnTEL;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the title
     */
    public Integer getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(Integer title) {
        this.title = title;
    }

    /**
     * @return the techTitle
     */
    public Integer getTechTitle() {
        return techTitle;
    }

    /**
     * @param techTitle the techTitle to set
     */
    public void setTechTitle(Integer techTitle) {
        this.techTitle = techTitle;
    }

    /**
     * @return the idType
     */
    public String getIdType() {
        return idType;
    }

    /**
     * @param idType the idType to set
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * @return the idNum
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * @param idNum the idNum to set
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * @return the workStartDate
     */
    public Integer getWorkStartDate() {
        return workStartDate;
    }

    /**
     * @param workStartDate the workStartDate to set
     */
    public void setWorkStartDate(Integer workStartDate) {
        this.workStartDate = workStartDate;
    }

    /**
     * @return the octpnInfoUpDate
     */
    public Date getOctpnInfoUpDate() {
        return octpnInfoUpDate;
    }

    /**
     * @param octpnInfoUpDate the octpnInfoUpDate to set
     */
    public void setOctpnInfoUpDate(Date octpnInfoUpDate) {
        this.octpnInfoUpDate = octpnInfoUpDate;
    }

    /**
     * @return the resiStatus
     */
    public Integer getResiStatus() {
        return resiStatus;
    }

    /**
     * @param resiStatus the resiStatus to set
     */
    public void setResiStatus(Integer resiStatus) {
        this.resiStatus = resiStatus;
    }

    /**
     * @return the resiAddr
     */
    public String getResiAddr() {
        return resiAddr;
    }

    /**
     * @param resiAddr the resiAddr to set
     */
    public void setResiAddr(String resiAddr) {
        this.resiAddr = resiAddr;
    }

    /**
     * @return the resiDist
     */
    public String getResiDist() {
        return resiDist;
    }

    /**
     * @param resiDist the resiDist to set
     */
    public void setResiDist(String resiDist) {
        this.resiDist = resiDist;
    }

    /**
     * @return the homeTel
     */
    public String getHomeTel() {
        return homeTel;
    }

    /**
     * @param homeTel the homeTel to set
     */
    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    /**
     * @return the resiInfoUpDate
     */
    public Date getResiInfoUpDate() {
        return resiInfoUpDate;
    }

    /**
     * @param resiInfoUpDate the resiInfoUpDate to set
     */
    public void setResiInfoUpDate(Date resiInfoUpDate) {
        this.resiInfoUpDate = resiInfoUpDate;
    }

    /**
     * @return the mailAddr
     */
    public String getMailAddr() {
        return mailAddr;
    }

    /**
     * @param mailAddr the mailAddr to set
     */
    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    /**
     * @return the cpnPc
     */
    public String getCpnPc() {
        return cpnPc;
    }

    /**
     * @param cpnPc the cpnPc to set
     */
    public void setCpnPc(String cpnPc) {
        this.cpnPc = cpnPc;
    }

    /**
     * @return the resiPc
     */
    public String getResiPc() {
        return resiPc;
    }

    /**
     * @param resiPc the resiPc to set
     */
    public void setResiPc(String resiPc) {
        this.resiPc = resiPc;
    }

    /**
     * @return the mailPc
     */
    public String getMailPc() {
        return mailPc;
    }

    /**
     * @param mailPc the mailPc to set
     */
    public void setMailPc(String mailPc) {
        this.mailPc = mailPc;
    }

    /**
     * @return the mailDist
     */
    public String getMailDist() {
        return mailDist;
    }

    /**
     * @param mailDist the mailDist to set
     */
    public void setMailDist(String mailDist) {
        this.mailDist = mailDist;
    }

    /**
     * @return the mlgInfoUpDate
     */
    public Date getMlgInfoUpDate() {
        return mlgInfoUpDate;
    }

    /**
     * @param mlgInfoUpDate the mlgInfoUpDate to set
     */
    public void setMlgInfoUpDate(Date mlgInfoUpDate) {
        this.mlgInfoUpDate = mlgInfoUpDate;
    }

    /**
     * @return the mariStatus
     */
    public Integer getMariStatus() {
        return mariStatus;
    }

    /**
     * @param mariStatus the mariStatus to set
     */
    public void setMariStatus(Integer mariStatus) {
        this.mariStatus = mariStatus;
    }

    /**
     * @return the spoName
     */
    public String getSpoName() {
        return spoName;
    }

    /**
     * @param spoName the spoName to set
     */
    public void setSpoName(String spoName) {
        this.spoName = spoName;
    }

    /**
     * @return the spoIDType
     */
    public String getSpoIDType() {
        return spoIDType;
    }

    /**
     * @param spoIDType the spoIDType to set
     */
    public void setSpoIDType(String spoIDType) {
        this.spoIDType = spoIDType;
    }

    /**
     * @return the spoIDNum
     */
    public String getSpoIDNum() {
        return spoIDNum;
    }

    /**
     * @param spoIDNum the spoIDNum to set
     */
    public void setSpoIDNum(String spoIDNum) {
        this.spoIDNum = spoIDNum;
    }

    /**
     * @return the spoTel
     */
    public String getSpoTel() {
        return spoTel;
    }

    /**
     * @param spoTel the spoTel to set
     */
    public void setSpoTel(String spoTel) {
        this.spoTel = spoTel;
    }

    /**
     * @return the spsCmpyNm
     */
    public String getSpsCmpyNm() {
        return spsCmpyNm;
    }

    /**
     * @param spsCmpyNm the spsCmpyNm to set
     */
    public void setSpsCmpyNm(String spsCmpyNm) {
        this.spsCmpyNm = spsCmpyNm;
    }

    /**
     * @return the spsInfoUpDate
     */
    public Date getSpsInfoUpDate() {
        return spsInfoUpDate;
    }

    /**
     * @param spsInfoUpDate the spsInfoUpDate to set
     */
    public void setSpsInfoUpDate(Date spsInfoUpDate) {
        this.spsInfoUpDate = spsInfoUpDate;
    }

    /**
     * @return the annlInc
     */
    public Long getAnnlInc() {
        return annlInc;
    }

    /**
     * @param annlInc the annlInc to set
     */
    public void setAnnlInc(Long annlInc) {
        this.annlInc = annlInc;
    }

    /**
     * @return the taxIncome
     */
    public Long getTaxIncome() {
        return taxIncome;
    }

    /**
     * @param taxIncome the taxIncome to set
     */
    public void setTaxIncome(Long taxIncome) {
        this.taxIncome = taxIncome;
    }

    /**
     * @return the incInfoUpDate
     */
    public Date getIncInfoUpDate() {
        return incInfoUpDate;
    }

    /**
     * @param incInfoUpDate the incInfoUpDate to set
     */
    public void setIncInfoUpDate(Date incInfoUpDate) {
        this.incInfoUpDate = incInfoUpDate;
    }

    /**
     * @return the listDataStatus
     */
    public Integer getListDataStatus() {
        return listDataStatus;
    }

    /**
     * @param listDataStatus the listDataStatus to set
     */
    public void setListDataStatus(Integer listDataStatus) {
        this.listDataStatus = listDataStatus;
    }

    /**
     * @return the listActionType
     */
    public String getListActionType() {
        return listActionType;
    }

    /**
     * @param listActionType the listActionType to set
     */
    public void setListActionType(String listActionType) {
        this.listActionType = listActionType;
    }

    /**
     * @return the operate
     */
    public String getOperate() {
        return operate;
    }

    /**
     * @param operate the operate to set
     */
    public void setOperate(String operate) {
        this.operate = operate;
    }

    /**
     * 获取个人基本信息 唯一标识
     *
     * @return
     */
    public String getKey() {
        return StringUtils.defaultString(this.getIdType()) + "-" + StringUtils.defaultString(this.getIdNum()) + "-"
                + StringUtils.defaultString(this.getName());
    }
}