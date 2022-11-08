package com.lang.details;

/**
 * @author Dell
 *
 */
public class LanguageInfo extends StateDetails {

	public void tamilLang() {

		String Lang1 = "Tamil Is My Mother Tongue";
		System.out.println(Lang1);

	}

	public void EngLang() {

		String Lang2 = "English Is Universal Language";
		System.out.println(Lang2);

	}

	public void hindiLang() {

		String Lang3 = "Hindi Is Our National Language";
		System.out.println(Lang3);

	}

	public static void main(String[] args) {
		LanguageInfo li = new LanguageInfo();
		li.southIndia();
		li.northIndia();
		li.EngLang();
		li.hindiLang();
		li.tamilLang();
	}
}
