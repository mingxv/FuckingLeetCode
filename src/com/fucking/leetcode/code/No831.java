package com.fucking.leetcode.code;

public class No831 {
    //先判断是邮箱还是电话
    //有@为邮箱，邮箱前面1个字母为小写，后面字母也都为小写
    //电话注意*的设置
    public String maskPII(String s) {
        //判断是否是电话
        //判断是否是邮箱
        if (s == null) {
            return "";
        }
        if (s.length() >= 8 && s.contains("@")) {
//            maybe mail
            int i = s.indexOf("@");
            String result = s.substring(0,1).toLowerCase() + "*****" + s.substring(s.indexOf("@") - 1).toLowerCase();
            return result;
        }
        if (s.length() >= 10) {
//            maybe phone num
            String nums = s.replaceAll("\\D+", "");
            String result = "***-***-" + nums.substring(nums.length() - 4);
            if(nums.length() > 10){
                StringBuilder sb = new StringBuilder();
                for(int i =0;i<nums.length() - 10;i++){
                    sb.append("*");
                }
                String pre = "+" + sb.toString();
                result = pre + "-" + result;
            }
            return result;
        }
        return "";
    }
}
