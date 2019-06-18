package hfdp.ch01;

import sun.util.resources.uk.CalendarData_uk;

public class MiniDuckSimulator {

    public static void main(String[] args) {

    	// Simulate Mallard Duck
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		// Simulate Model Rocket-Powered Duck
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
    }
}
