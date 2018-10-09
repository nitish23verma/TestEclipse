package com.aphabetsequence;

import java.util.ArrayList;

public class TestList {

	ArrayList<String> s = new ArrayList<String>();

	public void Enter(String passportNumber) {
		s.add(passportNumber);
		System.out.println(s);
	}

	public void Leave() {
		if (s.isEmpty()) {
			System.out.println("IS NULL");
		} else {
			s.remove(0);
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		TestList tl = new TestList();
		tl.Enter("ABC123");
		tl.Enter("XYZ789");
		tl.Leave();
		tl.Leave();
	}

}
