package creational.prototype;

// 프로토타입
// Shape 클래스: 프로토타입 패턴에서 사용되는 추상 클래스입니다.
// 객체 복제를 위한 clone 메서드와 객체의 고유 ID 및 타입을 관리하는 메서드를 제공합니다.
abstract class Shape implements Cloneable{
	private String id;
	protected String type;
	abstract void draw();// draw: 서브클래스에서 구현해야 하는 추상 메서드.

	public String getId() {
		return id;
	} // getId: Shape 객체의 ID를 반환합니다.

	public void setId(String id) {
		this.id = id;
	}// setId: Shape 객체의 ID를 설정합니다.

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// clone: 객체를 복제하는 메서드. Cloneable 인터페이스를 구현하여 복제 기능을 제공합니다.
	public Object clone(){
		Object clone = null;
		try{
			clone = super.clone();
		}catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}
}
