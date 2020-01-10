package com.lzc.smallbyuser.utils;

import java.util.List;
import java.util.Map;

/**
 * @AUTHOR HG-captain
 * @Data 2019/12/31
 * @Description
 */
public class Util {

    /**
     * 非空判断
     * @param obj
     * @return
     */
    public static boolean isNull(Object obj){
        if(obj==null){
            return true;
        }
        if(obj instanceof String){
            return ((String) obj).isEmpty();

        }else if(obj instanceof Map){
            return ((Map) obj).isEmpty();
        }
        else if(obj instanceof List){
            return ((List) obj).isEmpty();
        }

        return false;
    }

}
