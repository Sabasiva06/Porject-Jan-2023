package com.overriding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IndianBank2021 {

	public static void main(String[] args) {

		String s = "I Love My India";
		s = s.toLowerCase();
		s = s.replace(" ", "");
		char[] charArray = s.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (map.containsKey(c)) {
				int in = map.get(c);
				map.put(c, in + 1);

			} else {
				map.put(c, 1);

			}

		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}

	}

}
