package ch06.ex04.case01;

public class Animal {
	private String animalName;
	
//	public Animal() {}  부모 class를 변경하지 않는다.
	
	public Animal(String animalName) {
		this.animalName = animalName;
	}
	
	public String getAnimalName() {
		return this.animalName;
	}
}
