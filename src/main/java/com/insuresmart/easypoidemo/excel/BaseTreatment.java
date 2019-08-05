package com.insuresmart.easypoidemo.excel;

import com.excel.poi.annotation.ExportField;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author shixianqing
 * @mbg.generated
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseTreatment implements Serializable {

    private Integer id;

    /**
     * 诊疗编码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_code")
    private String treatmentCode;

    @ExportField(columnName = "treatment_name")
    private String treatmentName;

    /**
     * 次项
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_sub_term")
    private String treatmentSubTerm;

    /**
     * 应用部位
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_application_site")
    private String treatmentApplicationSite;

    /**
     * 项目内涵
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_connotation")
    private String treatmentConnotation;

    /**
     * 诊疗费用大类（项目类型）
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_fee_type")
    private String treatmentFeeType;

    /**
     * 项目类型名称
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_fee_type_name")
    private String treatmentFeeTypeName;

    /**
     * 记录生效日 YYYY-mm-dd HH:mm:ss
     *
     * @mbg.generated
     */
    @ExportField(columnName = "effective_date",dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date effectiveDate;

    /**
     * 是否有效  0-无效   1-有效
     *
     * @mbg.generated
     */
    @ExportField(columnName = "is_valid")
    private Integer isValid;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ExportField(columnName = "create_time",dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 创建者
     *
     * @mbg.generated
     */
    @ExportField(columnName = "create_operator")
    private Integer createOperator;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    @ExportField(columnName = "update_time",dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    /**
     * 修改者
     *
     * @mbg.generated
     */
    @ExportField(columnName = "update_operator")
    private Integer updateOperator;

    /**
     * 适应症
     *
     * @mbg.generated
     */
    @ExportField(columnName = "subcategory_no")
    private String subcategoryNo;

    /**
     * 适应症名称
     *
     * @mbg.generated
     */
    @ExportField(columnName = "subcategory_desc")
    private String subcategoryDesc;

    /**
     * 分类1
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_class1")
    private String treatmentClass1;

    /**
     * 分类1
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_class2")
    private String treatmentClass2;

    /**
     * 分类1
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_class3")
    private String treatmentClass3;

    /**
     * 分类1
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_class4")
    private String treatmentClass4;

    /**
     * 次项代码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "sub_item_code")
    private String subItemCode;

    /**
     * 细项代码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "detail_item_code")
    private String detailItemCode;

    /**
     * 细项
     *
     * @mbg.generated
     */
    @ExportField(columnName = "detail_item_name")
    private String detailItemName;

    /**
     * 服务类型码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "service_type_code")
    private String serviceTypeCode;

    /**
     * 原诊疗码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "treatment_match_id")
    private String treatmentMatchId;

    @ExportField(columnName = "create_operator_name")
    private String createOperatorName;

    @ExportField(columnName = "update_operator_name")
    private String updateOperatorName;

    /**
     * 版本号
     *
     * @mbg.generated
     */
    @ExportField(columnName = "version")
    private String version;

    /**
     * 次版本号
     *
     * @mbg.generated
     */
    @ExportField(columnName = "sub_version")
    private BigDecimal subVersion;

    @ExportField(columnName = "version_date",dateFormat = "yyyy-MM-dd")
    private Date versionDate;

    /**
     * 来源类型的key
     *
     * @mbg.generated
     */
    @ExportField(columnName = "origin_type")
    private String originType;

    /**
     * 来源类型的value
     *
     * @mbg.generated
     */
    @ExportField(columnName = "origin_type_value")
    private String originTypeValue;

    /**
     * 可信度
     *
     * @mbg.generated
     */
    @ExportField(columnName = "confident_level")
    private BigDecimal confidentLevel;

    private static final long serialVersionUID = 1L;

}