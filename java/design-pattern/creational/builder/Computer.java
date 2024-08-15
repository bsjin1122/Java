package creational.builder;
/** 빌더 패턴 : 복잡한 객체의 생성 과정을 단순화하고,
 * 객체 내부 표현을 변경하지 않으면서도 객체를 만들 수 있게 해준다.
 */
public class Computer {
	// 필수 파라미터
	private String HDD;
	private String RAM;

	// 선택 파라미터
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	// Getter와 Setter 메서드 (일반적으로는 빌더 패턴 사용 시 Setter 메서드를 사용하지 않음)
	public String getHDD() {
		return HDD;
	}

	public void setHDD(String HDD) {
		this.HDD = HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String RAM) {
		this.RAM = RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
		isGraphicsCardEnabled = graphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(boolean bluetoothEnabled) {
		isBluetoothEnabled = bluetoothEnabled;
	}

	// Computer 객체 생성자: ComputerBuilder 객체를 인자로 받아 필수 및 선택 파라미터들을 초기화
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	// Builder 클래스: Computer 객체를 단계별로 생성하는 역할을 담당
	public static class ComputerBuilder{
		private String HDD;
		private String RAM;

		// 선택 파라미터 (초기값은 false)
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		// 필수 파라미터를 받아 초기화하는 생성자
		public ComputerBuilder(String HDD, String RAM) {
			this.HDD = HDD;
			this.RAM = RAM;
		}


		// 선택 파라미터를 설정하는 메서드 - 그래픽 카드 옵션
		// 메서드 체이닝을 위해 'return this' 사용
		public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
			isGraphicsCardEnabled = graphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
			isBluetoothEnabled = bluetoothEnabled;
			return this; // 메서드 체이닝을 가능하게 하는 중요한 부분
			// 이 메서드는 isBluetoothEnabled 필드를 설정한 후,
			// 현재의 ComputerBuilder 객체 (this)를 반환합니다.
			// 이렇게 하면 다음과 같이 여러 메서드를 체이닝할 수 있습니다
			// (.setGraphics~ 등 연속적으로 호출)
		}

		// Computer 객체를 최종적으로 생성하는 메서드
		// 설정된 모든 필수 및 선택 파라미터를 사용하여 새로운 Computer 객체를 생성하고 반환
		public Computer build(){
			return new Computer(this);
		}

	}





}
