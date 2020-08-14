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
        return reMatch(RULE_EMAIL, email);
    }
    /**
     * 手机号匹配
     *
     * @param phone
     * @return
     */
    public static boolean isMobile(String phone) {
        String RULE_PHONE = "^[1](([3][0-9])|([4][5,7,9])|([5][0-9])|([6][6])|([7][3,5,6,7,8])|([8][0-9])|([9][8,9]))[0-9]{8}$";// 验证手机号
        return reMatch(RULE_PHONE, phone);
    }

    /**
     * 通用匹配模板
     * @param RULL_STR 正则规则字符串
     * @param str 匹配的字符串
     * @return
     */
    public static boolean reMatch(String RULL_STR, String str){
        //正则表达式的模式
        Pattern p = Pattern.compile(RULL_STR);
        //正则表达式的匹配器
        Matcher m = p.matcher(str);
        //进行正则匹配
        return m.matches();
    }
}