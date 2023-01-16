package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;

public interface LaborerService {
	List<Laborer> getLaborers(); //creat
	void addLaborer(String laboreName, LocalDate hireDate); //read
	void fixLaborer(Laborer laborer);//update
	void delLaborer(int laborerId); //delete
}
