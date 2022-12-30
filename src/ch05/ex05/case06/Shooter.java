package ch05.ex05.case06;

public class Shooter {
	//과제: 총잡이가 총을 소지한다.
	private Gun gun;	//dependency
	
	public void fire() {
		gun.fire();
	}
	
	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
