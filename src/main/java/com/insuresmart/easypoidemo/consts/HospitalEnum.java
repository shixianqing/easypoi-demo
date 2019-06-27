package com.insuresmart.easypoidemo.consts;

import io.swagger.models.auth.In;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:sxq
 * @Date: 2019/5/18
 * @Description:
 */
public interface HospitalEnum {

    /**
     * 医院等级
     */
    enum HospitalLev{
        FIRST("一级",1),SECOND("二级",2),THIRD("三级",3),NONE("未定级",0);

        String name;
        Integer code;

        HospitalLev(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public static String getCodeByName(Integer code){
            if (code == null){
                return null;
            }
            String lev = null;
            if (code.equals(FIRST.code)){
                lev = FIRST.name;
            } else if (code.equals(SECOND.code)){
                lev = SECOND.name;
            } else if (code.equals(THIRD.code)){
                lev = THIRD.name;
            } else {
                lev = NONE.name;
            }

            return lev;
        }
    }


    /**
     * 医院此等级
     */
    enum HospitalSubLev{
        FIRST("甲级",1),SECOND("乙级",2),NONE("未无等级定级",0);

        String name;
        Integer code;

        HospitalSubLev(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public static String getCodeByName(Integer code){

            if (code == null){
                return "";
            }

           String lev;
            if (code.equals(FIRST.code)){
                lev = FIRST.name;
            } else if (code.equals(SECOND.code)){
                lev = SECOND.name;
            } else {
                lev = NONE.name;
            }

            return lev;
        }
    }

    enum HospitalNature{
        PUBLIC("公立",1),PRIMARY("私立",2);

        String name;
        Integer code;

        HospitalNature(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public static String getCodeByName(Integer code){
            String nature = null;
            if (code.equals(PUBLIC.code)){
                nature = PUBLIC.name;
            } else if (code.equals(PRIMARY.code)){
                nature = PRIMARY.name;
            }

            return nature;
        }
    }


    enum HospitalType{
       ;
        private static final Map<String, String> TYPE = new HashMap<>();

        static {
            TYPE.put("1", "医院 ");
            TYPE.put("2", "武警部队医院");
            TYPE.put("3", "诊所");
            TYPE.put("4", "门诊部");
            TYPE.put("5", "卫生院");
            TYPE.put("6", "服务中心");
            TYPE.put("7", "医务室");
            TYPE.put("8", "疾控预防传染所");
            TYPE.put("9", "妇幼保健院");
            TYPE.put("10", "康复护理疗养院");
            TYPE.put("11", "体检检验所");
            TYPE.put("12", "药店");
            TYPE.put("13", "乡村卫生室");
        }



        public static String getCodeByName(String code) {

            return TYPE.get(code);
        }
    }

    /**
     * 医院专业
     */
    enum HospitalPro{

        ;

        private static final Map<Integer,String> TYPE = new HashMap<>();

        static {
            TYPE.put(1,"综合");
            TYPE.put(2,"专科");
            TYPE.put(3,"中医");
            TYPE.put(4,"眼科");
            TYPE.put(5,"妇儿");
            TYPE.put(6,"生育");
            TYPE.put(7,"血液");
            TYPE.put(8,"肿瘤");
            TYPE.put(9,"急救");
            TYPE.put(10,"体检检验");
            TYPE.put(11,"疾控预防传染");
            TYPE.put(12,"口腔");
            TYPE.put(13,"戒毒");
            TYPE.put(14,"康复");
            TYPE.put(15,"精神病");
            TYPE.put(16,"美容整形");
            TYPE.put(17,"药店");
        }


        public static String getCodeByName(Integer code){

            return TYPE.get(code);
        }
    }
}
