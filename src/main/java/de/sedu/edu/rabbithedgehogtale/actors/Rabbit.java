package de.sedu.edu.rabbithedgehogtale.actors;

public class Rabbit extends Animal {

	private static final int SPEED = 100;

	public Rabbit(int age) {
		super("Rabbit", age);
	}

	@Override
	public int getMovingSpeed() {
		return SPEED / age;
	}

}
