package de.sedu.edu.rabbithedgehogtale.actors;

public abstract class Animal extends Actor {

	protected final String species;
	protected final int age;

	public Animal(String species, int age) {
		this.species = species;
		this.age = age;
	}

	@Override
	public void act() {
		move();
	}

	public void move() {
		int currentX = getX();
		setX(currentX + getMovingSpeed());
	}

	public abstract int getMovingSpeed();

	@Override
	public String toString() {
		return species + " (age: " + age + ") [x: " + getX() + "]";
	}

}
