package com.my.hr.presentation;

public enum Job {
	EXIT("종료"), LIST("목록"), ADD("추가"), FIX("수정"), DEL("삭제");
	
	
	private String label;
	
	private Job(String label) {
		this.label = label;
	}
	
	public static int length() {
		return values().length;
	}
	
	public static Job valueof(int ordinal) {
		return values()[ordinal];
	}
	
	public static String labels() {
		Job[] jobs = values();
		String labels = "";
		String last = "";
		
		for(Job job: jobs) {
			if(job.ordinal() == 0) last = job.ordinal() + "." + job.label;
			else labels += job.ordinal() + "." + job.label + ", ";
		}
		labels += last;
		
		return labels;
	} 	//soft코딩이기 때문에 여기에는 수정되는 부분만 추가해주면 된다.
}

//tradeoff 하나를 선택하고 하나는 포기하는것.