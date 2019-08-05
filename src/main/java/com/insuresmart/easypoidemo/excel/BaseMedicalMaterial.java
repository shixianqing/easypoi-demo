package com.insuresmart.easypoidemo.excel;

import com.excel.poi.annotation.ExportField;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author shixianqing
 * @mbg.generated 材料
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseMedicalMaterial {

    private Integer id;

    /**
     * 材料编码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_code")
    private String materialCode;

    /**
     * 材料名称
     */
    @ExportField(columnName = "material_name")
    private String materialName;

    /**
     * 材料使用范围
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_use")
    private String materialUse;

    /**
     * 材料费用大类（项目类型）
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_fee_type")
    private String materialFeeType;

    /**
     * 项目类型名称
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_fee_type_name")
    private String materialFeeTypeName;

    /**
     * 记录生效日 YYYY-mm-dd HH:mm:ss
     *
     * @mbg.generated
     */
    @ExportField(columnName = "effective_date")
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
    @ExportField(columnName = "",dateFormat = "yyyy-MM-dd HH:mm:ss")
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

    @ExportField(columnName = "old_code")
    private String oldCode;

    /**
     * 分类1
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_class1")
    private String materialClass1;

    /**
     * 分类1
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_class2")
    private String materialClass2;

    /**
     * 分类1
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_class3")
    private String materialClass3;

    /**
     * 分类1
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_class4")
    private String materialClass4;

    /**
     * 次项代码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "sub_item_code")
    private String subItemCode;

    /**
     * 次项
     *
     * @mbg.generated
     */
    @ExportField(columnName = "sub_item_name")
    private String subItemName;

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
     * 原材料码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "material_match_id")
    private String materialMatchId;

    /**
     * 产地
     *
     * @mbg.generated
     */
    @ExportField(columnName = "prod_addr")
    private String prodAddr;

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


}