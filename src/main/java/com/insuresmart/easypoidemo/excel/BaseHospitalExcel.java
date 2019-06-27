package com.insuresmart.easypoidemo.excel;

import lombok.*;

import java.io.Serializable;

/**
 * create by :shixianqing  2019/6/27
 *
 * @mbg.generated
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BaseHospitalExcel implements Serializable {
    private Integer id;

    /**
     * 医院编码
     *
     * @mbg.generated
     */
    private String hospitalCode;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 医院等级
     *
     * @mbg.generated
     */
    private String hospitalGrade;

    /**
     * 医院次等级
     *
     * @mbg.generated
     */
    private String hospitalSubgrade;

    /**
     * 医院性质
     *
     * @mbg.generated
     */
    private String hospitalType;

    /**
     * 专业类别
     *
     * @mbg.generated
     */
    private String hospitalProfession;

    /**

    /**
     * 省份名称
     *
     * @mbg.generated
     */
    private String provinceName;

    /**
     * 地区名称
     *
     * @mbg.generated
     */
    private String cityName;


    /**
     * 是否医保
     *
     * @mbg.generated
     */
    private String medicareType;


    /**
     * 医院类型
     *
     * @mbg.generated
     */
    private String hospitalCategory;



    private static final long serialVersionUID = 1L;

}