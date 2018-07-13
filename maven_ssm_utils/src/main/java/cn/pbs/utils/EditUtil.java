package cn.pbs.utils;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EditUtil extends PropertyEditorSupport   {

	@Override
	public void setAsText(String dateStr) throws IllegalArgumentException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
		Date date = sdf.parse(dateStr);
		setValue(date);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
