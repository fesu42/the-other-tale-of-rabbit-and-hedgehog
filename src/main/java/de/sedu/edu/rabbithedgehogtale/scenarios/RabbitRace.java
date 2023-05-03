package de.sedu.edu.rabbithedgehogtale.scenarios;

import de.sedu.edu.rabbithedgehogtale.actors.Rabbit;

public class RabbitRace {

	public void start() {
		Rabbit youngRabbit = new Rabbit(1);
		Rabbit middleAgeRabbit = new Rabbit(3);
		Rabbit oldRabbit = new Rabbit(5);

		int steps = 5;
		while (steps-- > 0) {
			youngRabbit.move();
			middleAgeRabbit.move();
			oldRabbit.move();
		}

		System.out.println(youngRabbit);
		System.out.println(middleAgeRabbit);
		System.out.println(oldRabbit);
	}

}
