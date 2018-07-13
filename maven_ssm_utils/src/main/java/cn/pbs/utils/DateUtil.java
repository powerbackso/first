package cn.pbs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil  {
	public static String dateToString(Date date) {
		//使用SimpleDateFormat格式化传递进来的date参数
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sd.format(date);
	}
}
