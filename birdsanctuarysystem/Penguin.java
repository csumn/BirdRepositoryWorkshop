package com.b1.birdsanctuarysystem;

public class Penguin extends Bird implements Swimmable {
	public Penguin(String id) {
		this.id = id;
		name = "Penguin";
		color = Color.BLACK;
	}

	@Override
	public void swimmable() {
		System.out.println("Penguin can  swim");				
	}
//	@Override
//	void fly() {
//		System.out.println(getClass().getSimpleName() + " Cannot fly");
//	}
}
