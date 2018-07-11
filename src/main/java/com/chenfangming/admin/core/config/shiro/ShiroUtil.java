//package com.chenfangming.admin.core.util;
//
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.session.Session;
//import org.apache.shiro.subject.Subject;
//
///**
// * @author fangming.chen
// * @since 2018-07-01 17：59
// * Email cfmmail@sina.com
// * Description Shiro工具类
// */
//public class ShiroUtil {
//
//    /**
//     * 获取Session
//     * @return Session
//     */
//    public static Session getSession() {
//        return SecurityUtils.getSubject().getSession();
//    }
//
//    /**
//     * 获取Subject
//     * @return Subject
//     */
//    public static Subject getSubject() {
//        return SecurityUtils.getSubject();
//    }
//
//    /**
//     * 获取指定session
//     * @param key key
//     * @return 值
//     */
//    public static Object getSessionAttribute(Object key) {
//        return getSession().getAttribute(key);
//    }
//
//    /**
//     * 设置指定session
//     * @param key   key
//     * @param value 值
//     */
//    public static void setSessionAttribute(Object key, Object value) {
//        getSession().setAttribute(key, value);
//    }
//
//    /**
//     * 是否登陆
//     * @return true已登陆 false未登陆
//     */
//    public static boolean isLogin() {
//        return null != SecurityUtils.getSubject().getPrincipal();
//    }
//
//    public static void logOut() {
//        SecurityUtils.getSubject().logout();
//    }
//}
