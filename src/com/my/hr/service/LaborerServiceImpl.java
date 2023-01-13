package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.dao.LaborerDao;
import com.my.hr.domain.Laborer;

public class LaborerServiceImpl implements LaborerService {
	private LaborerDao laborerDao;
	
	public LaborerServiceImpl(LaborerDao laborerDao) {
		this.laborerDao = laborerDao;
	}

	@Override
	public List<Laborer> getLaborer() {
		return laborerDao.selectLaborers();
	}

	@Override
	public void addLaborer(Laborer laborer) {
		laborerDao.insertLaborer(laborer);
	}

	@Override
	public void fixLaborer(int laborerId, String laborerName, LocalDate hireDate) {
		laborerDao.updateLaborer(laborerId, laborerName, hireDate);
	}

	@Override
	public void delLaborer(int laborerId) {
		laborerDao.deleteLaborer(laborerId);
	}
}