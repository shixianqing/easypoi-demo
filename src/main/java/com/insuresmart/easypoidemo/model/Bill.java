package com.insuresmart.easypoidemo.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * create by :shixianqing  2019/6/30
 *
 * @mbg.generated
 */
public class Bill implements Serializable {
    private Integer id;

    /**
     * 文件ID
     *
     * @mbg.generated
     */
    private Integer fileId;

    /**
     * 申请ID
     *
     * @mbg.generated
     */
    private Integer claimId;

    /**
     * 序列号
     *
     * @mbg.generated
     */
    private String serialNo;

    /**
     * 账单对应案件中的序号
     *
     * @mbg.generated
     */
    private String claimSerialNo;

    /**
     * 账单号
     *
     * @mbg.generated
     */
    private String billNo;

    /**
     * 账单类型
     *
     * @mbg.generated
     */
    private Integer billType;

    /**
     * 是否急诊(Y,N)
     *
     * @mbg.generated
     */
    private String mergencyType;

    /**
     * 是否康复(Y,N)
     *
     * @mbg.generated
     */
    private String healthType;

    /**
     * 是否特需(Y,N)
     *
     * @mbg.generated
     */
    private String vipType;

    /**
     * 就诊日期
     *
     * @mbg.generated
     */
    private Date treatmentDate;

    /**
     * 入院日期
     *
     * @mbg.generated
     */
    private Date inHospitalDate;

    /**
     * 出院日期
     *
     * @mbg.generated
     */
    private Date outHospitalDate;

    /**
     * 医院编码
     *
     * @mbg.generated
     */
    private String hospitalCode;

    /**
     * 医院名称
     *
     * @mbg.generated
     */
    private String hospitalName;

    /**
     * 科室代码
     *
     * @mbg.generated
     */
    private Integer hospitalDept;

    /**
     * 科室名称
     *
     * @mbg.generated
     */
    private String hospitalDeptName;

    /**
     * 匹配后的标准代码
     *
     * @mbg.generated
     */
    private String matchHospitalCode;

    /**
     * 匹配后的便准名称
     *
     * @mbg.generated
     */
    private String matchHospitalName;

    /**
     * 医院匹配状态(1待自动匹配,2待人工匹配,99匹配完成)
     *
     * @mbg.generated
     */
    private Integer matchHospitalStatus;

    /**
     * 原疾病代码
     *
     * @mbg.generated
     */
    private String diagnoseCode;

    /**
     * 原疾病名称
     *
     * @mbg.generated
     */
    private String diagnoseName;

    /**
     * 疾病匹配代码
     *
     * @mbg.generated
     */
    private String matchDiagnoseCode;

    /**
     * 疾病匹配名称
     *
     * @mbg.generated
     */
    private String matchDiagnoseName;

    /**
     * 诊断匹配状态(1未完成（缺省）,99匹配完成)
     *
     * @mbg.generated
     */
    private Integer matchDiagnoseStatus;

    /**
     * 发票金额
     *
     * @mbg.generated
     */
    private BigDecimal billAmount;

    /**
     * 账单状态
     *
     * @mbg.generated
     */
    private Integer billStatus;

    /**
     * 社保支付金额
     *
     * @mbg.generated
     */
    private BigDecimal socialPayAmount;

    /**
     * 分类自付金额
     *
     * @mbg.generated
     */
    private BigDecimal classPayAmount;

    /**
     * 自费金额
     *
     * @mbg.generated
     */
    private BigDecimal ownPayAmount;

    /**
     * 第三方支付金额
     *
     * @mbg.generated
     */
    private BigDecimal thirdPartyPayAmount;

    /**
     * 他方支付(N 无，Y 有)
     *
     * @mbg.generated
     */
    private String isThirdPartyPay;

    /**
     * 统筹基金支付
     *
     * @mbg.generated
     */
    private BigDecimal fundPayAmount;

    /**
     * 大额互助资金支付（住院）
     *
     * @mbg.generated
     */
    private BigDecimal largeFundHosPayAmount;

    /**
     * 统筹基金年度内累计支付
     *
     * @mbg.generated
     */
    private BigDecimal fundYearTotalPayAmount;

    /**
     * 大额互助资金支付（门诊）-本次支付
     *
     * @mbg.generated
     */
    private BigDecimal largeFundOutCurrPayAmount;

    /**
     * 大额互助资金支付（门诊）-年度累计
     *
     * @mbg.generated
     */
    private BigDecimal largeFundOutYearPayAmount;

    /**
     * 发票姓名
     *
     * @mbg.generated
     */
    private String billUserName;

    /**
     * 影像序号
     *
     * @mbg.generated
     */
    private String imageFileNo;

    /**
     * 影像ID
     *
     * @mbg.generated
     */
    private Integer imageFileId;

    /**
     * 账单转人工原因
     *
     * @mbg.generated
     */
    private String reasonNotes;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 逻辑删除标志(0否，1逻辑删除)
     *
     * @mbg.generated
     */
    private String deleteFlag;

    /**
     * 创建者
     *
     * @mbg.generated
     */
    private Integer createOperator;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 修改者
     *
     * @mbg.generated
     */
    private Integer updateOperator;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getClaimSerialNo() {
        return claimSerialNo;
    }

    public void setClaimSerialNo(String claimSerialNo) {
        this.claimSerialNo = claimSerialNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getMergencyType() {
        return mergencyType;
    }

    public void setMergencyType(String mergencyType) {
        this.mergencyType = mergencyType;
    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public Date getInHospitalDate() {
        return inHospitalDate;
    }

    public void setInHospitalDate(Date inHospitalDate) {
        this.inHospitalDate = inHospitalDate;
    }

    public Date getOutHospitalDate() {
        return outHospitalDate;
    }

    public void setOutHospitalDate(Date outHospitalDate) {
        this.outHospitalDate = outHospitalDate;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Integer getHospitalDept() {
        return hospitalDept;
    }

    public void setHospitalDept(Integer hospitalDept) {
        this.hospitalDept = hospitalDept;
    }

    public String getHospitalDeptName() {
        return hospitalDeptName;
    }

    public void setHospitalDeptName(String hospitalDeptName) {
        this.hospitalDeptName = hospitalDeptName;
    }

    public String getMatchHospitalCode() {
        return matchHospitalCode;
    }

    public void setMatchHospitalCode(String matchHospitalCode) {
        this.matchHospitalCode = matchHospitalCode;
    }

    public String getMatchHospitalName() {
        return matchHospitalName;
    }

    public void setMatchHospitalName(String matchHospitalName) {
        this.matchHospitalName = matchHospitalName;
    }

    public Integer getMatchHospitalStatus() {
        return matchHospitalStatus;
    }

    public void setMatchHospitalStatus(Integer matchHospitalStatus) {
        this.matchHospitalStatus = matchHospitalStatus;
    }

    public String getDiagnoseCode() {
        return diagnoseCode;
    }

    public void setDiagnoseCode(String diagnoseCode) {
        this.diagnoseCode = diagnoseCode;
    }

    public String getDiagnoseName() {
        return diagnoseName;
    }

    public void setDiagnoseName(String diagnoseName) {
        this.diagnoseName = diagnoseName;
    }

    public String getMatchDiagnoseCode() {
        return matchDiagnoseCode;
    }

    public void setMatchDiagnoseCode(String matchDiagnoseCode) {
        this.matchDiagnoseCode = matchDiagnoseCode;
    }

    public String getMatchDiagnoseName() {
        return matchDiagnoseName;
    }

    public void setMatchDiagnoseName(String matchDiagnoseName) {
        this.matchDiagnoseName = matchDiagnoseName;
    }

    public Integer getMatchDiagnoseStatus() {
        return matchDiagnoseStatus;
    }

    public void setMatchDiagnoseStatus(Integer matchDiagnoseStatus) {
        this.matchDiagnoseStatus = matchDiagnoseStatus;
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public Integer getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    public BigDecimal getSocialPayAmount() {
        return socialPayAmount;
    }

    public void setSocialPayAmount(BigDecimal socialPayAmount) {
        this.socialPayAmount = socialPayAmount;
    }

    public BigDecimal getClassPayAmount() {
        return classPayAmount;
    }

    public void setClassPayAmount(BigDecimal classPayAmount) {
        this.classPayAmount = classPayAmount;
    }

    public BigDecimal getOwnPayAmount() {
        return ownPayAmount;
    }

    public void setOwnPayAmount(BigDecimal ownPayAmount) {
        this.ownPayAmount = ownPayAmount;
    }

    public BigDecimal getThirdPartyPayAmount() {
        return thirdPartyPayAmount;
    }

    public void setThirdPartyPayAmount(BigDecimal thirdPartyPayAmount) {
        this.thirdPartyPayAmount = thirdPartyPayAmount;
    }

    public String getIsThirdPartyPay() {
        return isThirdPartyPay;
    }

    public void setIsThirdPartyPay(String isThirdPartyPay) {
        this.isThirdPartyPay = isThirdPartyPay;
    }

    public BigDecimal getFundPayAmount() {
        return fundPayAmount;
    }

    public void setFundPayAmount(BigDecimal fundPayAmount) {
        this.fundPayAmount = fundPayAmount;
    }

    public BigDecimal getLargeFundHosPayAmount() {
        return largeFundHosPayAmount;
    }

    public void setLargeFundHosPayAmount(BigDecimal largeFundHosPayAmount) {
        this.largeFundHosPayAmount = largeFundHosPayAmount;
    }

    public BigDecimal getFundYearTotalPayAmount() {
        return fundYearTotalPayAmount;
    }

    public void setFundYearTotalPayAmount(BigDecimal fundYearTotalPayAmount) {
        this.fundYearTotalPayAmount = fundYearTotalPayAmount;
    }

    public BigDecimal getLargeFundOutCurrPayAmount() {
        return largeFundOutCurrPayAmount;
    }

    public void setLargeFundOutCurrPayAmount(BigDecimal largeFundOutCurrPayAmount) {
        this.largeFundOutCurrPayAmount = largeFundOutCurrPayAmount;
    }

    public BigDecimal getLargeFundOutYearPayAmount() {
        return largeFundOutYearPayAmount;
    }

    public void setLargeFundOutYearPayAmount(BigDecimal largeFundOutYearPayAmount) {
        this.largeFundOutYearPayAmount = largeFundOutYearPayAmount;
    }

    public String getBillUserName() {
        return billUserName;
    }

    public void setBillUserName(String billUserName) {
        this.billUserName = billUserName;
    }

    public String getImageFileNo() {
        return imageFileNo;
    }

    public void setImageFileNo(String imageFileNo) {
        this.imageFileNo = imageFileNo;
    }

    public Integer getImageFileId() {
        return imageFileId;
    }

    public void setImageFileId(Integer imageFileId) {
        this.imageFileId = imageFileId;
    }

    public String getReasonNotes() {
        return reasonNotes;
    }

    public void setReasonNotes(String reasonNotes) {
        this.reasonNotes = reasonNotes;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(Integer createOperator) {
        this.createOperator = createOperator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(Integer updateOperator) {
        this.updateOperator = updateOperator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fileId=").append(fileId);
        sb.append(", claimId=").append(claimId);
        sb.append(", serialNo=").append(serialNo);
        sb.append(", claimSerialNo=").append(claimSerialNo);
        sb.append(", billNo=").append(billNo);
        sb.append(", billType=").append(billType);
        sb.append(", mergencyType=").append(mergencyType);
        sb.append(", healthType=").append(healthType);
        sb.append(", vipType=").append(vipType);
        sb.append(", treatmentDate=").append(treatmentDate);
        sb.append(", inHospitalDate=").append(inHospitalDate);
        sb.append(", outHospitalDate=").append(outHospitalDate);
        sb.append(", hospitalCode=").append(hospitalCode);
        sb.append(", hospitalName=").append(hospitalName);
        sb.append(", hospitalDept=").append(hospitalDept);
        sb.append(", hospitalDeptName=").append(hospitalDeptName);
        sb.append(", matchHospitalCode=").append(matchHospitalCode);
        sb.append(", matchHospitalName=").append(matchHospitalName);
        sb.append(", matchHospitalStatus=").append(matchHospitalStatus);
        sb.append(", diagnoseCode=").append(diagnoseCode);
        sb.append(", diagnoseName=").append(diagnoseName);
        sb.append(", matchDiagnoseCode=").append(matchDiagnoseCode);
        sb.append(", matchDiagnoseName=").append(matchDiagnoseName);
        sb.append(", matchDiagnoseStatus=").append(matchDiagnoseStatus);
        sb.append(", billAmount=").append(billAmount);
        sb.append(", billStatus=").append(billStatus);
        sb.append(", socialPayAmount=").append(socialPayAmount);
        sb.append(", classPayAmount=").append(classPayAmount);
        sb.append(", ownPayAmount=").append(ownPayAmount);
        sb.append(", thirdPartyPayAmount=").append(thirdPartyPayAmount);
        sb.append(", isThirdPartyPay=").append(isThirdPartyPay);
        sb.append(", fundPayAmount=").append(fundPayAmount);
        sb.append(", largeFundHosPayAmount=").append(largeFundHosPayAmount);
        sb.append(", fundYearTotalPayAmount=").append(fundYearTotalPayAmount);
        sb.append(", largeFundOutCurrPayAmount=").append(largeFundOutCurrPayAmount);
        sb.append(", largeFundOutYearPayAmount=").append(largeFundOutYearPayAmount);
        sb.append(", billUserName=").append(billUserName);
        sb.append(", imageFileNo=").append(imageFileNo);
        sb.append(", imageFileId=").append(imageFileId);
        sb.append(", reasonNotes=").append(reasonNotes);
        sb.append(", remark=").append(remark);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", createOperator=").append(createOperator);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateOperator=").append(updateOperator);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Bill other = (Bill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFileId() == null ? other.getFileId() == null : this.getFileId().equals(other.getFileId()))
            && (this.getClaimId() == null ? other.getClaimId() == null : this.getClaimId().equals(other.getClaimId()))
            && (this.getSerialNo() == null ? other.getSerialNo() == null : this.getSerialNo().equals(other.getSerialNo()))
            && (this.getClaimSerialNo() == null ? other.getClaimSerialNo() == null : this.getClaimSerialNo().equals(other.getClaimSerialNo()))
            && (this.getBillNo() == null ? other.getBillNo() == null : this.getBillNo().equals(other.getBillNo()))
            && (this.getBillType() == null ? other.getBillType() == null : this.getBillType().equals(other.getBillType()))
            && (this.getMergencyType() == null ? other.getMergencyType() == null : this.getMergencyType().equals(other.getMergencyType()))
            && (this.getHealthType() == null ? other.getHealthType() == null : this.getHealthType().equals(other.getHealthType()))
            && (this.getVipType() == null ? other.getVipType() == null : this.getVipType().equals(other.getVipType()))
            && (this.getTreatmentDate() == null ? other.getTreatmentDate() == null : this.getTreatmentDate().equals(other.getTreatmentDate()))
            && (this.getInHospitalDate() == null ? other.getInHospitalDate() == null : this.getInHospitalDate().equals(other.getInHospitalDate()))
            && (this.getOutHospitalDate() == null ? other.getOutHospitalDate() == null : this.getOutHospitalDate().equals(other.getOutHospitalDate()))
            && (this.getHospitalCode() == null ? other.getHospitalCode() == null : this.getHospitalCode().equals(other.getHospitalCode()))
            && (this.getHospitalName() == null ? other.getHospitalName() == null : this.getHospitalName().equals(other.getHospitalName()))
            && (this.getHospitalDept() == null ? other.getHospitalDept() == null : this.getHospitalDept().equals(other.getHospitalDept()))
            && (this.getHospitalDeptName() == null ? other.getHospitalDeptName() == null : this.getHospitalDeptName().equals(other.getHospitalDeptName()))
            && (this.getMatchHospitalCode() == null ? other.getMatchHospitalCode() == null : this.getMatchHospitalCode().equals(other.getMatchHospitalCode()))
            && (this.getMatchHospitalName() == null ? other.getMatchHospitalName() == null : this.getMatchHospitalName().equals(other.getMatchHospitalName()))
            && (this.getMatchHospitalStatus() == null ? other.getMatchHospitalStatus() == null : this.getMatchHospitalStatus().equals(other.getMatchHospitalStatus()))
            && (this.getDiagnoseCode() == null ? other.getDiagnoseCode() == null : this.getDiagnoseCode().equals(other.getDiagnoseCode()))
            && (this.getDiagnoseName() == null ? other.getDiagnoseName() == null : this.getDiagnoseName().equals(other.getDiagnoseName()))
            && (this.getMatchDiagnoseCode() == null ? other.getMatchDiagnoseCode() == null : this.getMatchDiagnoseCode().equals(other.getMatchDiagnoseCode()))
            && (this.getMatchDiagnoseName() == null ? other.getMatchDiagnoseName() == null : this.getMatchDiagnoseName().equals(other.getMatchDiagnoseName()))
            && (this.getMatchDiagnoseStatus() == null ? other.getMatchDiagnoseStatus() == null : this.getMatchDiagnoseStatus().equals(other.getMatchDiagnoseStatus()))
            && (this.getBillAmount() == null ? other.getBillAmount() == null : this.getBillAmount().equals(other.getBillAmount()))
            && (this.getBillStatus() == null ? other.getBillStatus() == null : this.getBillStatus().equals(other.getBillStatus()))
            && (this.getSocialPayAmount() == null ? other.getSocialPayAmount() == null : this.getSocialPayAmount().equals(other.getSocialPayAmount()))
            && (this.getClassPayAmount() == null ? other.getClassPayAmount() == null : this.getClassPayAmount().equals(other.getClassPayAmount()))
            && (this.getOwnPayAmount() == null ? other.getOwnPayAmount() == null : this.getOwnPayAmount().equals(other.getOwnPayAmount()))
            && (this.getThirdPartyPayAmount() == null ? other.getThirdPartyPayAmount() == null : this.getThirdPartyPayAmount().equals(other.getThirdPartyPayAmount()))
            && (this.getIsThirdPartyPay() == null ? other.getIsThirdPartyPay() == null : this.getIsThirdPartyPay().equals(other.getIsThirdPartyPay()))
            && (this.getFundPayAmount() == null ? other.getFundPayAmount() == null : this.getFundPayAmount().equals(other.getFundPayAmount()))
            && (this.getLargeFundHosPayAmount() == null ? other.getLargeFundHosPayAmount() == null : this.getLargeFundHosPayAmount().equals(other.getLargeFundHosPayAmount()))
            && (this.getFundYearTotalPayAmount() == null ? other.getFundYearTotalPayAmount() == null : this.getFundYearTotalPayAmount().equals(other.getFundYearTotalPayAmount()))
            && (this.getLargeFundOutCurrPayAmount() == null ? other.getLargeFundOutCurrPayAmount() == null : this.getLargeFundOutCurrPayAmount().equals(other.getLargeFundOutCurrPayAmount()))
            && (this.getLargeFundOutYearPayAmount() == null ? other.getLargeFundOutYearPayAmount() == null : this.getLargeFundOutYearPayAmount().equals(other.getLargeFundOutYearPayAmount()))
            && (this.getBillUserName() == null ? other.getBillUserName() == null : this.getBillUserName().equals(other.getBillUserName()))
            && (this.getImageFileNo() == null ? other.getImageFileNo() == null : this.getImageFileNo().equals(other.getImageFileNo()))
            && (this.getImageFileId() == null ? other.getImageFileId() == null : this.getImageFileId().equals(other.getImageFileId()))
            && (this.getReasonNotes() == null ? other.getReasonNotes() == null : this.getReasonNotes().equals(other.getReasonNotes()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getCreateOperator() == null ? other.getCreateOperator() == null : this.getCreateOperator().equals(other.getCreateOperator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateOperator() == null ? other.getUpdateOperator() == null : this.getUpdateOperator().equals(other.getUpdateOperator()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFileId() == null) ? 0 : getFileId().hashCode());
        result = prime * result + ((getClaimId() == null) ? 0 : getClaimId().hashCode());
        result = prime * result + ((getSerialNo() == null) ? 0 : getSerialNo().hashCode());
        result = prime * result + ((getClaimSerialNo() == null) ? 0 : getClaimSerialNo().hashCode());
        result = prime * result + ((getBillNo() == null) ? 0 : getBillNo().hashCode());
        result = prime * result + ((getBillType() == null) ? 0 : getBillType().hashCode());
        result = prime * result + ((getMergencyType() == null) ? 0 : getMergencyType().hashCode());
        result = prime * result + ((getHealthType() == null) ? 0 : getHealthType().hashCode());
        result = prime * result + ((getVipType() == null) ? 0 : getVipType().hashCode());
        result = prime * result + ((getTreatmentDate() == null) ? 0 : getTreatmentDate().hashCode());
        result = prime * result + ((getInHospitalDate() == null) ? 0 : getInHospitalDate().hashCode());
        result = prime * result + ((getOutHospitalDate() == null) ? 0 : getOutHospitalDate().hashCode());
        result = prime * result + ((getHospitalCode() == null) ? 0 : getHospitalCode().hashCode());
        result = prime * result + ((getHospitalName() == null) ? 0 : getHospitalName().hashCode());
        result = prime * result + ((getHospitalDept() == null) ? 0 : getHospitalDept().hashCode());
        result = prime * result + ((getHospitalDeptName() == null) ? 0 : getHospitalDeptName().hashCode());
        result = prime * result + ((getMatchHospitalCode() == null) ? 0 : getMatchHospitalCode().hashCode());
        result = prime * result + ((getMatchHospitalName() == null) ? 0 : getMatchHospitalName().hashCode());
        result = prime * result + ((getMatchHospitalStatus() == null) ? 0 : getMatchHospitalStatus().hashCode());
        result = prime * result + ((getDiagnoseCode() == null) ? 0 : getDiagnoseCode().hashCode());
        result = prime * result + ((getDiagnoseName() == null) ? 0 : getDiagnoseName().hashCode());
        result = prime * result + ((getMatchDiagnoseCode() == null) ? 0 : getMatchDiagnoseCode().hashCode());
        result = prime * result + ((getMatchDiagnoseName() == null) ? 0 : getMatchDiagnoseName().hashCode());
        result = prime * result + ((getMatchDiagnoseStatus() == null) ? 0 : getMatchDiagnoseStatus().hashCode());
        result = prime * result + ((getBillAmount() == null) ? 0 : getBillAmount().hashCode());
        result = prime * result + ((getBillStatus() == null) ? 0 : getBillStatus().hashCode());
        result = prime * result + ((getSocialPayAmount() == null) ? 0 : getSocialPayAmount().hashCode());
        result = prime * result + ((getClassPayAmount() == null) ? 0 : getClassPayAmount().hashCode());
        result = prime * result + ((getOwnPayAmount() == null) ? 0 : getOwnPayAmount().hashCode());
        result = prime * result + ((getThirdPartyPayAmount() == null) ? 0 : getThirdPartyPayAmount().hashCode());
        result = prime * result + ((getIsThirdPartyPay() == null) ? 0 : getIsThirdPartyPay().hashCode());
        result = prime * result + ((getFundPayAmount() == null) ? 0 : getFundPayAmount().hashCode());
        result = prime * result + ((getLargeFundHosPayAmount() == null) ? 0 : getLargeFundHosPayAmount().hashCode());
        result = prime * result + ((getFundYearTotalPayAmount() == null) ? 0 : getFundYearTotalPayAmount().hashCode());
        result = prime * result + ((getLargeFundOutCurrPayAmount() == null) ? 0 : getLargeFundOutCurrPayAmount().hashCode());
        result = prime * result + ((getLargeFundOutYearPayAmount() == null) ? 0 : getLargeFundOutYearPayAmount().hashCode());
        result = prime * result + ((getBillUserName() == null) ? 0 : getBillUserName().hashCode());
        result = prime * result + ((getImageFileNo() == null) ? 0 : getImageFileNo().hashCode());
        result = prime * result + ((getImageFileId() == null) ? 0 : getImageFileId().hashCode());
        result = prime * result + ((getReasonNotes() == null) ? 0 : getReasonNotes().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getCreateOperator() == null) ? 0 : getCreateOperator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateOperator() == null) ? 0 : getUpdateOperator().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}