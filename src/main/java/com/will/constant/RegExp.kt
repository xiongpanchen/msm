package com.will.constant

/**
 * Created by zoumy on 2017/5/11 15:01.
 */
object RegExp {

    /**
     * 手机号
     */
    val PHONE = "^1[3|4|5|7|8]\\d{9}$"
    /**
     * 中文字符
     */
    val CHINESE_CHARACTER = "[\u4e00-\u9fa5]+"
    /**
     * 双字节字符
     */
    val DOUBLE_CHARACTER = "[^x00-xff]"
    /**
     * html标签
     */
    val HTML = "^<(S*?)[^>]*>.*?|<.*? />$"
    /**
     * 电子邮件
     */
    val EMAIL = "\\w+([-+.]\\w+)*@\\w+([-.]w+)*.\\w+([-.]\\w+)*"
    /**
     * url
     */
    val URL = "[a-zA-z]+://[^s]*"
    /**
     * qq号
     */
    val QQ = "[1-9][0-9]{4,}"
    /**
     * 邮编
     */
    val ZIP = "^[1-9]\\d{5}(?!d)$"
    /**
     * 域名
     */
    val DOMAIN = "[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+\\.?"
    /**
     * 账户允许大小写字母数字和下划线，4到15个
     */
    val ACCOUNT = "^[a-zA-Z0-9_]{4,15}$"
    /**
     * ipv4
     */
    val IPv4 = "^((25[0-5]|2[0-4]\\d|[0,1]?\\d\\d?)\\.){3}((25[0-5]|2[0-4]\\d|[0,1]?\\d\\d?))$"
    /**
     * ipv6
     */
    val IPv6 = "^([\\da-fA-F]{1,4}:){7}[\\da-fA-F]{1,4}|:((:[\\da−fA−F]1,4)1,6|:)|:((:[\\da−fA−F]1,4)1,6|:)|^[\\da-fA-F]{1,4}:((:[\\da-fA-F]{1,4}){1,5}|:)|([\\da−fA−F]1,4:)2((:[\\da−fA−F]1,4)1,4|:)|([\\da−fA−F]1,4:)2((:[\\da−fA−F]1,4)1,4|:)|^([\\da-fA-F]{1,4}:){3}((:[\\da-fA-F]{1,4}){1,3}|:)|([\\da−fA−F]1,4:)4((:[\\da−fA−F]1,4)1,2|:)|([\\da−fA−F]1,4:)4((:[\\da−fA−F]1,4)1,2|:)|^([\\da-fA-F]{1,4}:){5}:([\\da-fA-F]{1,4})?|([\\da−fA−F]1,4:)6:"
    /**
     * 国内电话号码
     */
    val TEL = "^\\d{3}-\\d{8}|\\d{4}-{0,1}(\\d{8}|\\d{7})$"
}