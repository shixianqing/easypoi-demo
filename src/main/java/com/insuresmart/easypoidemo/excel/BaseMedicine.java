package com.insuresmart.easypoidemo.excel;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *药品
 * @author shixianqing
 * @mbg.generated
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseMedicine implements Serializable {

    /**
     * 药品编码
     *
     * @mbg.generated
     */
    private String drugCode;

    private String drugName;

    /**
     * 药品成分
     *
     * @mbg.generated
     */
    private String drugComponent;

    /**
     * 药品剂型
     *
     * @mbg.generated
     */
    private String drugForm;

    /**
     * 药品费用大类（项目类型）
     *
     * @mbg.generated
     */
    private String drugFeeType;

    /**
     * 项目类型名称
     *
     * @mbg.generated
     */
    private String drugFeeTypeName;

    /**
     * 生效日 YYYY-mm-dd HH:mm:ss
     *
     * @mbg.generated
     */
    private Date effectiveDate;

    /**
     * 是否有效  0-无效   1-有效
     *
     * @mbg.generated
     */
    private Integer isValid;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 创建者
     *
     * @mbg.generated
     */
    private Integer createOperator;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 修改者
     *
     * @mbg.generated
     */
    private Integer updateOperator;

    /**
     * 适应症
     *
     * @mbg.generated
     */
    private String subcategoryNo;

    /**
     * 适应症名称
     *
     * @mbg.generated
     */
    private String subcategoryDesc;

    private String oldCode;

    /**
     * 药品成分代码
     *
     * @mbg.generated
     */
    private String drugComponentCode;

    /**
     * 药品剂型code
     *
     * @mbg.generated
     */
    private String drugFormCode;

    /**
     * 细项
     *
     * @mbg.generated
     */
    private String detailItem;

    /**
     * 细项code
     *
     * @mbg.generated
     */
    private String detailItemCode;

    /**
     * 服务类型码
     *
     * @mbg.generated
     */
    private String serviceTypeCode;

    /**
     * 产地
     *
     * @mbg.generated
     */
    private String prodAddr;

    /**
     * 原疾病码
     *
     * @mbg.generated
     */
    private String drugMatchId;

    private String createOperatorName;

    private String updateOperatorName;

    /**
     * 版本号
     *
     * @mbg.generated
     */
    private String version;

    /**
     * 版本时间
     *
     * @mbg.generated
     */
    private Date versionDate;

    /**
     * 次版本号
     *
     * @mbg.generated
     */
    private BigDecimal subVersion;

    /**
     * 来源类型的key
     *
     * @mbg.generated
     */
    private String originType;

    /**
     * 来源类型的value
     *
     * @mbg.generated
     */
    private String originTypeValue;

    /**
     * 可信度
     *
     * @mbg.generated
     */
    private BigDecimal confidentLevel;

    private static final long serialVersionUID = 1L;

}