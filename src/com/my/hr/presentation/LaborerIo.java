package com.my.hr.presentation;

import java.time.LocalDate;
import java.util.List;

import com.my.hr.domain.Laborer;
import com.my.hr.service.LaborerService;

public class LaborerIo {
	private static final int EXIT = 0;
	private LaborerService laborerService;
	
	public LaborerIo(LaborerService laborerService) {
		this.laborerService = laborerService;
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
						laborer.getRegDate());
		}
	}
	
	private void addLaborer() {
		String laborerName = "";
		LocalDate regDate = null;
		boolean isGood = false;
		
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
		
		regDate = Console.inDate("입사일을 입력하세요.");
		laborerService.addLaborer(new Laborer(laborerName, regDate));
	}
	
	private void fixLaborer() {
		List<Laborer> laborers = laborerService.getLaborer();
		int laborerId = 0;
		int num = 0;
		String laborerName = "";
		LocalDate regDate = null;
		boolean isGood = false;
		
		do {
			laborerId = Console.inNum("수정할 노동자의 ID를 입력하세요.");
			if(laborerId == 0) {
				Console.info("취소되었습니다.");
				return;
			}
			num = Laborer.getLaborerInexFromId(laborers, laborerId);
			if(num != -1) isGood = true;
			if(!isGood)
				Console.err("ID가 적절하지 않습니다.");
		}while(!isGood);
		
		laborerName = Console.inStr("새 노동자명을 입력하세요.");
		regDate = Console.inDate("새 입사일을 입력하세요.");
		
		laborerService.fixLaborer(laborerName, laborerId, regDate);
	}
	
	private void delLaborer() {
		List<Laborer> laborers = laborerService.getLaborer();
		int laborerId = 0;
		int num = 0;
		boolean isGood = false;
		
		do {
			laborerId = Console.inNum("삭제할 노동자의 ID를 입력하세요.");
			if(laborerId ==0) {
				Console.info("취소되었습니다.");
				return;
			}
			num = Laborer.getLaborerInexFromId(laborers, laborerId);
			if(num != -1) isGood = true;
			if(!isGood)
				Console.err("ID가 적절하지 않습니다.");
		} while(!isGood);
		
		laborerService.delLaborer(laborerId);
	}
	
	public void play() {
		int choice = 0;
		
		do {	 
			Console.info("1.목록 2.추가 3.수정 4.삭제 0.종료");
			choice = Console.inNum("메뉴를 선택하세요.");
			switch(Action.valueOf(choice)) {
			case EXIT -> Console.info("END");
			case LIST -> listLaborer();
			case ADD -> addLaborer();
			case FIX -> fixLaborer();
			case DEL -> delLaborer();
			default ->Console.err("메뉴가 아닙니다.");
			}
		} while(choice == EXIT);	//수정
	}	
}
