package creational.abstractFactory.gui;

import creational.abstractFactory.Button;
import creational.abstractFactory.Checkbox;
import creational.abstractFactory.MacButton;
import creational.abstractFactory.MacCheckbox;

public class MacFactory implements GUIFactory{
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}
