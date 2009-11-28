package guri.tool;

import guri.util.ClipboardUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGenerator {

	final static private String dateFormatString = "yyyyMMddHHmmss";

	final static private DateFormat dateFormat = new SimpleDateFormat(
			dateFormatString);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		String dateString = dateFormat.format(date);
		ClipboardUtil.setString(dateString);
	}

}
