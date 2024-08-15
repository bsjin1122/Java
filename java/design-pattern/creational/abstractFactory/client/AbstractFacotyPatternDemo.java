package creational.abstractFactory.client;

import creational.abstractFactory.Button;
import creational.abstractFactory.Checkbox;
import creational.abstractFactory.gui.GUIFactory;
import creational.abstractFactory.gui.WindowsFactory;

public class AbstractFacotyPatternDemo {
	public static void main(String[] args) {
		GUIFactory factory = new WindowsFactory();
		Button button = factory.createButton();
		Checkbox checkbox = factory.createCheckbox();

		button.paint();
		checkbox.paint();
	}
}
