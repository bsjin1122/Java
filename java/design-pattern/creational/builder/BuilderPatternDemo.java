package creational.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
			.setBluetoothEnabled(true)
			.setBluetoothEnabled(true)
			.build();

		System.out.println("HDD: " + comp.getHDD());
		System.out.println("RAM: " + comp.getRAM());
		System.out.println("Graphics Card Enabled: " + comp.isGraphicsCardEnabled());
		System.out.println("Bluetooth Enabled: " + comp.isBluetoothEnabled());
	}
}
