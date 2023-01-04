package ch06.ex07.case02;

public sealed class Dog extends Pet permits Puppy {

}


//sealed 클래스에서는 permits이 항상 잇어야한다.