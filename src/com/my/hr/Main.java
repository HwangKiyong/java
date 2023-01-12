package com.my.hr;

import java.util.ArrayList;
import java.util.List;

import com.my.hr.dao.LaborerDao;
import com.my.hr.dao.LaborerDaoImpl;
import com.my.hr.domain.Laborer;
import com.my.hr.presentation.LaborerIo;
import com.my.hr.service.LaborerServcieImpl;
import com.my.hr.service.LaborerService;

public class Main {
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<>();
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		LaborerService laborerService = new LaborerServcieImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();		
	}
}
