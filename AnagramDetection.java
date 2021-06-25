package com.bridgelabz.Algorithms;

import java.util.Arrays;

public class AnagramDetection {
	public static void main(String[] args) {
		AnagramDetection ana = new AnagramDetection();
		String str1 = "heart";
		String str2 = "earth";
		String str3 = "head";
		ana.anagram(str1, str2);
		ana.anagram(str1, str3);

	}

	private void anagram(String str1, String str2) {

		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {					
			char[] arrS1 = s1.toLowerCase().toCharArray();
			char[] arrS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrS1);
			Arrays.sort(arrS2);
			status = Arrays.equals(arrS1, arrS2);
		}
		if (status) {
			System.out.println(str1 + " is anagram to " + str2);
		} else {
			System.out.println(str1 + " is not anagram to " + str2);
		}
	}

}

