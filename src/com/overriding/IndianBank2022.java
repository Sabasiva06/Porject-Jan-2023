package com.overriding;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class IndianBank2022 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.add("A");
		v.add("J");
		v.add("P");
		v.add("S");

		// List Iterator:
		ListIterator<String> listIterator = v.listIterator();
// forward
		while (listIterator.hasNext()) {
			String string = listIterator.next();
			if (string.equals("A")) {
				listIterator.add("A");
			}else if (string.equals("J")) {
				listIterator.set("C#");
			}else if (string.equals("S")) {
				listIterator.remove();
			}
		}
		
		System.out.println(v);
//backward
//		while (listIterator.hasPrevious()) {
//			String string =  listIterator.previous();
//			System.out.println(string);
//		}
	}

}
