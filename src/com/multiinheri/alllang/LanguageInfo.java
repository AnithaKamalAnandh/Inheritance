package com.multiinheri.alllang;

import com.multiinhrti.tamil.TamilLang;

public class LanguageInfo extends TamilLang {

	public void allLang() {

		System.out.println("There Are Plenty Of Languages In India .. few as below");

	}

	public static void main(String[] args) {

		LanguageInfo li = new LanguageInfo();
		li.allLang();
		li.tamil();
		li.english();
		li.telugu();

	}

}
