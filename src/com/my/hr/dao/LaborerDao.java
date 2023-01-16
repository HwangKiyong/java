package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;

public interface LaborerDao {	//CRUD를 만든다.
	List<Laborer> selectLaborers();//read
	void insertLaborer(String laborerName, LocalDate hireDate);//creat
	void updateLaborer(Laborer laborer); //update
	void deleteLaborer(int laborerId);//delete
}
