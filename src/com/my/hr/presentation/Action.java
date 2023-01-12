package com.my.hr.presentation;

public enum Action { 
	EXIT, LIST, ADD, FIX , DEL;

	static Action valueOf(int choice) {		
		return values()[choice];
	}
}
