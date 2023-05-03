package de.sedu.edu.rabbithedgehogtale.actors;

public class Hedgehog extends Animal {

	public Hedgehog(int age) {
		super("Hedgehog", age);
	}

	@Override
	public int getMovingSpeed() {
		return 25;
	}
}
