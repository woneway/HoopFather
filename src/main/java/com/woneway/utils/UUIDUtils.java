package com.woneway.utils;

import java.util.UUID;
/**
 * 
 * UUIDUtils
 * Description: 生成一个32位的激活码
 * author: woneway
 * 2018年4月9日
 */
public class UUIDUtils {
	public static String getUUID(){
		//返回一个32为的字符串
		return UUID.randomUUID().toString().replace("-", "");
	}
}