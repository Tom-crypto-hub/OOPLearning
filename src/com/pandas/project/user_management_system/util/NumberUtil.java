package com.pandas.project.user_management_system.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author wangjing
 * @create 2020-08-14 8:09
 */
public class NumberUtil {

    /**
      * 正则表达式校验邮箱
      * @param email 待匹配的邮箱
      * @return匹配成功返回true 否则返回false;
      *    
      */
    public static boolean checkEmail(String email) {
        String RULE_EMAIL = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
        //正则表达式的模式
        Pattern p = Pattern.compile(RULE_EMAIL);
        //正则表达式的匹配器
        Matcher m = p.matcher(email);
        //进行正则匹配
        return m.matches();
    }
    /**
     * 手机号匹配
     *
     * @param str
     * @return
     */
    public static boolean isMobile(String str) {
        String s2 = "^[1](([3][0-9])|([4][5,7,9])|([5][0-9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$";// 验证手机号
        //正则表达式的模式
        Pattern p = Pattern.compile(s2);
        //正则表达式的匹配器
        Matcher m = p.matcher(str);
        //进行正则匹配
        return m.matches();
    }
}