package de.sedu.edu.rabbithedgehogtale.actors;

public abstract class Actor {

	protected int x;

	public abstract void act();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
