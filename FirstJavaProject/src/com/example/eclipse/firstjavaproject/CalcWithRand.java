package com.example.eclipse.firstjavaproject;

import java.util.HashMap;
import java.util.Map;

public class CalcWithRand {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 10); //
		int num2 = (int) (Math.random() * 10); //
		Addition add = new Addition(); //
		int ans = add.plus(num1, num2); //
		System.out.println("答えは" + ans); // 
	}

	public static void map(String[] args) {
		Map<String, String> map = new HashMap<>();
		System.out.println(map);
	}
}
