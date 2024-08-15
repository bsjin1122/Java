package creational.abstractFactory;

public class MacCheckbox implements Checkbox{
	@Override
	public void paint() {
		System.out.println("Rendering a checkbox in Mac style.");
	}
}
