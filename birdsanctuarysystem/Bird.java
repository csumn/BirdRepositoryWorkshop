package com.b1.birdsanctuarysystem;

import java.util.Objects;

public abstract class Bird {

	enum Color { RED, GREEN, WHITE, BLACK_WHITE, BLACK }

	String id;
	String name;
	Color color;

	void eats(){
		System.out.println(getClass().getSimpleName() + "eats");
	}

//	void fly() {
//		System.out.println(getClass().getSimpleName() + "fly");
//	}
//
//	void swim() {
//		System.out.println(getClass().getSimpleName() + "swim");
//	}

	@Override
	public String toString() {
		return "Bird [id = " + id + ", name = " + name + ", color = " + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}



	//	@Override
	//	public String toString() {
	//		return "Bird [id=" + id + ", name=" + name + ", color=" + color + "]";
	//	}
}
