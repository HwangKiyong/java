package com.my.hr.domain;

import java.time.LocalDate;
import java.util.List;

public class Laborer {
	private static int lastLaborerId = 1;
	private final int laborerId;
	private String laborerName;
	private LocalDate regDate;
	
	public Laborer(String laborerName, LocalDate regDate) {
		this.laborerId = lastLaborerId++;
		this.laborerName = laborerName;
		this.regDate = regDate;
	}

	public static int getLastLaborerId() {
		return lastLaborerId;
	}

	public int getLaborerId() {
		return laborerId;
	}

	public String getLaborerName() {
		return laborerName;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public static void setLastLaborerId(int lastLaborerId) {
		Laborer.lastLaborerId = lastLaborerId;
	}

	public void setLaborerName(String laborerName) {
		this.laborerName = laborerName;
	}

	public void setHireDate(LocalDate hireDate) {
		this.regDate = hireDate;
	}
	
	@Override
	public String toString() {
		return String.format("%5d %5s %s", laborerId, laborerName, regDate);		
	}
	
	public static int getLaborerInexFromId(List<Laborer> laborers, int laborerId) {
		for(int i = 0; i < laborers.size(); i++)
			if(laborerId == laborers.get(i).getLaborerId()) {
				return i;
			}
		return -1;
	}
}
