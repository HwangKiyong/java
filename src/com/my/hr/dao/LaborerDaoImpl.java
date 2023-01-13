package com.my.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;

public class LaborerDaoImpl implements LaborerDao {
	private List<Laborer> laborers;
	
	public LaborerDaoImpl(List<Laborer> laborers) {
		this.laborers = laborers;
	}

	@Override
	public List<Laborer> selectLaborers() {
		return laborers;
	}

	@Override
	public void insertLaborer(Laborer laborer) {
		laborers.add(laborer);
	}

	@Override
	public void updateLaborer(int laborerId, String laborerName, LocalDate hireDate) {
		int index = Laborer.getLaborerIndexFromId(laborers, laborerId);
		if(index == -1) return;
		Laborer laborer = laborers.get(index);
		laborer.setLaborerName(laborerName);
		laborer.setHireDate(hireDate);
		laborers.set(index, laborer);
	}

	@Override
	public void deleteLaborer(int laborerId) {
		int index = Laborer.getLaborerIndexFromId(laborers, laborerId);
		if(index == -1) return;
		laborers.remove(index);
	}
}