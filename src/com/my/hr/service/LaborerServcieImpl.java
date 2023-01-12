package com.my.hr.service;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.dao.LaborerDao;
import com.my.hr.domain.Laborer;

public class LaborerServcieImpl implements LaborerService {
	private LaborerDao laborerDao;
	
	public LaborerServcieImpl(LaborerDao laborerDao) {
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
	public void fixLaborer(String laborerName, int laobrerId, LocalDate regDate) {
		laborerDao.updateLaborer(laobrerId, laborerName, regDate);
	}
	
	@Override
	public void delLaborer(int laborerId) {
		laborerDao.deleteLaborer(laborerId);
	}
}
