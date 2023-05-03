package de.sedu.edu.rabbithedgehogtale.scenarios;

import de.sedu.edu.rabbithedgehogtale.actors.Hedgehog;
import de.sedu.edu.rabbithedgehogtale.actors.Rabbit;

public class TheOtherTaleOfRabbitAndHedgehog {

	private static final int TARGET_X = 200;

	private final Rabbit rabbit;
	private final Hedgehog hedgehog;

	/**
	 * once upon a time, there were a rabbit and a hedgehog
	 */
	public TheOtherTaleOfRabbitAndHedgehog() {
		rabbit = new Rabbit(3); // FIXME when is the rabbit too old to win the race?
		hedgehog = new Hedgehog(3);
	}

	/**
	 * tell the story
	 */
	public void start() {
		whenLifeIsBoringDoARace();
		getTheWinner();
	}

	/**
	 * life was boring, so rabbit and hedgehog did a race
	 */
	private void whenLifeIsBoringDoARace() {
		while (!someoneInTarget(rabbit, hedgehog)) {
			rabbit.act();
			hedgehog.act();
			System.out.println(rabbit);
			System.out.println(hedgehog);
		}
	}

	// TODO add java doc
	private boolean someoneInTarget(Rabbit rabbit, Hedgehog hedgehog) {
		return rabbit.getX() > TARGET_X || hedgehog.getX() > TARGET_X;
	}

	/**
	 * one of them won the race
	 */
	private void getTheWinner() {
		if (rabbit.getX() > hedgehog.getX()) {
			System.out.println("Fast rabbit won the race");
		} else if (rabbit.getX() == hedgehog.getX()) {
			System.out.println("Rabbit and hedgehog go head to head");
		} else {
			System.out.println("Lucky Hedgehog won the race");
		}
	}
}
