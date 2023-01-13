package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;
import com.my.hr.service.LaborerService;

public class LaborerIo {
	private LaborerService laborerService;
	
	public LaborerIo(LaborerService laborerService) {
		this.laborerService = laborerService;
	}
	
	public void play() {
		int choice = 0;
		
		do {
			Console.info("1.목록 2.추가 3.수정 4.삭제 0.종료");
			choice = Console.inNum("메뉴를 선택하세요.");
			switch(choice) {
			case Code.LIST -> listLaborer();
			case Code.ADD -> addLaborer();
			case Code.FIX -> fixLaborer();
			case Code.DEL -> delLaborer();
			case Code.EXIT -> {break;}
			default -> Console.err("메뉴가 아닙니다.");			
			}
		}while(choice != Code.EXIT);
	}

	private void delLaborer() {
		List<Laborer> laborers = laborerService.getLaborer();
		int laborerId = 0;
		int index = 0;
		boolean isGood = false;
		
		do {
			laborerId = Console.inNum("삭제할 노동자의 ID를 입력하세요.");
			if(laborerId == 0) {
				Console.info("취소되었습니다.");
				return;
			}
			index = Laborer.getLaborerIndexFromId(laborers, laborerId);
			if(index != -1) isGood = true;
			if(!isGood)
				Console.err("ID가 적절하지 않습니다.");
		} while(!isGood);
		
		laborerService.delLaborer(laborerId);
	}

	private void fixLaborer() {
		List<Laborer> laborers = laborerService.getLaborer();
		int laborerId = 0;
		int index = 0;
		String laborerName = "";
		LocalDate hireDate = null;
		boolean isGood = false;
		
		do {
			laborerId = Console.inNum("수정할 노동자의 ID를 입력하세요.");
			if(laborerId == 0) {
				Console.info("취소되었습니다.");
				return;
			}
			index = Laborer.getLaborerIndexFromId(laborers, laborerId);
			if(index != -1) isGood = true;
			if(!isGood)
				Console.err("ID가 적절하지 않습니다.");
		} while(!isGood);
		
		laborerName = Console.inStr("새 노동자명을 입력하세요.");
		hireDate = Console.inDate("입사일을 입력하세요.");
		
		laborerService.fixLaborer(laborerId, laborerName, hireDate);
	}

	private void addLaborer() {
		String laborerName = "";
		LocalDate hireDate = null;
		boolean isGood =false;		
		
		do {
			laborerName = Console.inStr("노동자명을 입력하세요.");
			if(laborerName.equals("0")) {
				Console.info("취소되었습니다.");
				return;
			}
			isGood = laborerName.length() <= 5;
			if(!isGood)
				Console.err("5자 이하로 입력하세요.");
		} while(!isGood);
		
		hireDate = Console.inDate("입사일을 입력하세요.");
		laborerService.addLaborer(new  Laborer(laborerName,  hireDate));
	}

	private void listLaborer() {
		List<Laborer> laborers = laborerService.getLaborer();
		if(laborers.size() == 0) Console.info("노동자가 없습니다.");
		else {
			Console.info("노동자ID 노동자명 입사일");
			for(Laborer laborer: laborers)
				System.out.printf("%8d %5s %s\n",
						laborer.getLaborerId(),
						laborer.getLaborerName(),
						laborer.getHireDate());
		}
	}


}