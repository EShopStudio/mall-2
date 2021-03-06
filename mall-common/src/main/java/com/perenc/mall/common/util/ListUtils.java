package com.perenc.mall.common.util;

import com.perenc.mall.common.constant.PunctuationConstants;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: ListUtils
 * @Description: intenger 型数组工具类
 *
 * @Author: GR
 * @Date: 2019/9/18 15:54
 *
 * Modification History:
 * Date         Author      Description
 *---------------------------------------------------------*
 * 2019/9/18     GR     		
 */
public class ListUtils {

    /**
     * @description: 获取数组的并集
     * @param source
     * @param target
     * @return java.util.Set<T>
     * @author: GR
     * @date: 2019/9/18
     */
    public static <T> Set<T> getSum(List<T> source, List<T> target) {
        HashSet<T> set = new HashSet<>();
        for (T t : source) {
            set.add(t);
        }
        for (T t : target) {
            set.add(t);
        }
        return set;
    }

    /**
     * @description: 获取数组的交集
     * @param source
     * @param target
     * @return java.util.Set<T>
     * @author: GR
     * @date: 2019/9/18
     */
    public static <T> Set<T> getIntersection(List<T> source, List<T> target) {
        Set<T> list = new HashSet<>();
        source.forEach(i -> {
            if (target.contains(i)) {
                list.add(i);
            }
        });
        return list;
    }

    /**
     * @description: 获取目标数据中在源数据里不存在的数据
     * @param source 源数据
     * @param target 目标数据
     * @return java.util.Set<T>
     * @author: GR
     * @date: 2019/9/18
     */
    public static <T> Set<T> getNotExistBySource(List<T> source, List<T> target) {
        Set<T> list = new HashSet<>();
        target.forEach(i -> {
            if (!source.contains(i)) {
                list.add(i);
            }
        });
        return list;
    }

    /**
     * @description: 字符串数组转整形数组
     * @param array
     * @return java.util.List<java.lang.Integer>
     * @author: GR
     * @date: 2019/9/18
     */
    public static List<Integer> convertIntegerList(String[] array) {
        List<Integer> list = new ArrayList<>();
        for (String str : array) {
            if (!StringUtils.isBlank(str) && StringHelper.isNumeric(str)) {
                list.add(Integer.valueOf(str));
            }
        }
        return list;
    }

    /**
     * @description: 根据符号将字符串拆分为数组
     * @param str 字符串
     * @param punctuation 符号
     * @return java.util.List<java.lang.Integer>
     * @author: GR
     * @date: 2019/9/19
     */
    public static List<Integer> getIntegerListByString(String str, String punctuation) {
        if (StringUtils.isBlank(str)) {
            return new ArrayList<>();
        }
        String[] integerArray = str.split(PunctuationConstants.COMMAS);
        return convertIntegerList(integerArray);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(6);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);


        System.out.println(ListUtils.getNotExistBySource(list1, list2));
    }
}
