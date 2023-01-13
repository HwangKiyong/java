package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;

public interface LaborerDao {
	public List<Laborer> selectLaborers();
	public void insertLaborer(Laborer laborer);
	public void updateLaborer(int laborerId, String laborerName, LocalDate hireDate);
	public void deleteLaborer(int laborerId);
}
