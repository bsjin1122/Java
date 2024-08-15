package creational.abstractFactory.gui;

import creational.abstractFactory.Button;
import creational.abstractFactory.Checkbox;
import creational.abstractFactory.WindowsButton;
import creational.abstractFactory.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}
