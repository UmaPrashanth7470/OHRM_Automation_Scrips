package com.inheritance;

import java.util.ArrayList;
import java.util.List;

public class TCS_class {
	public void Tcsservices(String x, String y) {
		System.out.println(x);
		System.out.println(y);
	}
	public void TcsServices0 () {
		String ts ="it has world wide clients,";
		String ts1="it has wold wide branches";
		System.out.println(ts+ts1);
		
	}

	protected void Tcsservices1() {
		int tcs1[] = new int[5];
		tcs1[0] = 22;
		tcs1[1] = 233;
		tcs1[2] = 333;
		tcs1[3] = 444;
		tcs1[4] = 555;
		for (int x = 0; x <= 4; x++) {
			System.out.println(tcs1[x]);
		}

	}
	

	void Tcsservices2() {
		List<String> tcs2 = new ArrayList<>();
		tcs2.add("it done all govt projects ");
		tcs2.add("govt belives only tcs");
		tcs2.add("govt application has majorly develop by tcs");
		for (int y = 0; y <= 2; y = ++y) {
			System.out.println(tcs2.get(y));
		}
		System.out.println("haiiiiiiiiiiiiiiii");

	}
}
