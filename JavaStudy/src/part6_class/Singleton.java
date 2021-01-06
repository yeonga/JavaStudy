package part6_class;

public class Singleton {

	//정적 필드  - private를 붙여 외부에서 필드값을 변경하지 못하도록 막음 
	private static Singleton singleton = new Singleton();
	
	//생성자 
	private Singleton() {
		
	}
	
	//정적 메소드 - 외부에서 호출할 수 있는 정적 메소드인 getInstance()를 선언하고 정적 필드에서 참조하고 있는 자신의 객체를 리턴해줌 
	static Singleton getInstance() {
		return singleton;
	}
}
