package guri.tool;

import guri.util.ClipboardUtil;

import java.util.Random;

public class TextGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		String txt = "";
		for (int i = 0; i < 8; ++i) {
			int j = ran.nextInt(62);
			if (j < 10) {
				txt += (char)('0' + j);
				continue;
			}
			j -= 10;
			if (j < 26) {
				txt += (char)('a' + j);
				continue;
			}
			j -= 26;
			if (j < 26) {
				txt += (char)('A' + j);
				continue;
			}
			j -= 26;
		}
		ClipboardUtil.setString(txt);
	}

}
