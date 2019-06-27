package com.insuresmart.easypoidemo.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

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
public class BaseHospital implements Serializable {
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
    private Integer hospitalGrade;

    /**
     * 医院次等级
     *
     * @mbg.generated
     */
    private Integer hospitalSubgrade;

    /**
     * 医院性质
     *
     * @mbg.generated
     */
    private Integer hospitalType;

    /**
     * 专业类别
     *
     * @mbg.generated
     */
    private Integer hospitalProfession;

    /**
     * 所属地区
     *
     * @mbg.generated
     */
    private Integer regionId;

    /**
     * 省份ID
     *
     * @mbg.generated
     */
    private Integer provinceId;

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
     * 医院状态
     *
     * @mbg.generated
     */
    private Integer isValid;

    /**
     * 是否医保
     *
     * @mbg.generated
     */
    private Integer medicareType;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 医院类型
     *
     * @mbg.generated
     */
    private String hospitalCategory;

    /**
     * 医院类型名称
     *
     * @mbg.generated
     */
    private String hospitalCategoryName;


    private static final long serialVersionUID = 1L;

}