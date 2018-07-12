package com.yk.cal;

import java.math.BigDecimal;

/**
 * Created by zsyoung on 2017/8/7.
 */
public class MyMath {

    //保留小数点位数
    public static final  int DEFAULT_SCALE = 20;

    /**
     * 为一个数字创建BigDecimal对象
     * @param number
     * @return
     */
    public static BigDecimal getBigDecimal(double number){
        return  new BigDecimal(number);
    }

    /**
     * 加法
     * @param num1
     * @param num2
     * @return
     */
    public static double add(double num1,double num2){
        BigDecimal first  =getBigDecimal(num1);
        BigDecimal second = getBigDecimal(num2);
        return  first.add(second).doubleValue();
    }

    /**
     * 减法
     * @param num1
     * @param num2
     * @return
     */
    public static double subtract(double num1,double num2){
        BigDecimal first = getBigDecimal(num1);
        BigDecimal second =getBigDecimal(num2);
        return first.subtract(second).doubleValue();
    }

    /**
     * 乘法
     * @param num1
     * @param num2
     * @return
     */
    public static double multiply(double num1,double num2){
        BigDecimal first = getBigDecimal(num1);
        BigDecimal second = getBigDecimal(num2);
        return first.multiply(second).doubleValue();
    }

    /**
     * 除法
     * @param num1
     * @param num2
     * @return
     */
    public static double divide(double num1,double num2){
        BigDecimal first = getBigDecimal(num1);
        BigDecimal second = getBigDecimal(num2);
        return first.divide(second).doubleValue();
    }
}
