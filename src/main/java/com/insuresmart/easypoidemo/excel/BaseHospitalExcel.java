package com.insuresmart.easypoidemo.excel;

import com.excel.poi.annotation.ExportField;
import com.excel.poi.annotation.ImportField;
import lombok.*;

import java.io.Serializable;

/**
 * create by :shixianqing  2019/6/27
 * 与excel映射的实体
 * @mbg.generated
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseHospitalExcel implements Serializable {

    /**
     * 医院编码
     *
     * @mbg.generated
     */
    @ExportField(columnName = "医院码")
    @ImportField(required = true)
    private String hospitalCode;

    /**
     * 医院名称
     */
    @ExportField(columnName = "医院名称")
    @ImportField(required = true)
    private String hospitalName;

    /**
     * 医院等级
     *
     * @mbg.generated
     */
    @ExportField(columnName = "医院等级")
    @ImportField
    private String hospitalGrade;

    /**
     * 医院次等级
     *
     * @mbg.generated
     */
    @ExportField(columnName = "医院次等级")
    @ImportField
    private String hospitalSubgrade;

    /**
     * 医院性质
     *
     * @mbg.generated
     */
    @ExportField(columnName = "医院性质")
    @ImportField
    private String hospitalType;

    /**
     * 专业类别
     *
     * @mbg.generated
     */
    @ExportField(columnName = "专业类型")
    @ImportField
    private String hospitalProfession;

    /**

    /**
     * 省份名称
     *
     * @mbg.generated
     */
    @ExportField(columnName = "省份名称")
    @ImportField
    private String provinceName;

    /**
     * 地区名称
     *
     * @mbg.generated
     */
    @ExportField(columnName = "地区名称")
    @ImportField
    private String cityName;


    /**
     * 是否医保
     *
     * @mbg.generated
     */
    @ExportField(columnName = "是否医保")
    @ImportField
    private String medicareType;


    /**
     * 医院类型
     *
     * @mbg.generated
     */
    @ExportField(columnName = "医院类型")
    @ImportField
    private String hospitalCategory;



    private static final long serialVersionUID = 1L;

}