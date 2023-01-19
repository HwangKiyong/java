package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;

public interface LaborerService {
	List<Laborer> getLaborers(); //read
	void addLaborer(String laborerName, LocalDate hireDate); //creat
	void fixLaborer(Laborer laborer); //update
	void delLaborer(int laborerId); //delete
}
