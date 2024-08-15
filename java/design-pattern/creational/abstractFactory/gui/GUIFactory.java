package creational.abstractFactory.gui;

import creational.abstractFactory.Button;
import creational.abstractFactory.Checkbox;

public interface GUIFactory {
	Button createButton();
	Checkbox createCheckbox();
}
