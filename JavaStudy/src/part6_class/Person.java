package part6_class;

public class Person {

	final String nation = "Korea";	//final 필드 초기값 주는 방법 1. 필드 선언시 주는 방법 
	final String ssn;// 한 번 값이 저장되면 변경할 수 없도록 final 필드로 선언해줌 ( But, Person 객체가 생성될 때 부여되므로 초기값 미리 줄 수 없음)
	String name;
	
	public Person(String ssn, String name) {	// 2. 생성자에서 fianl 필드 초기값 주는 방법 
		this.ssn = ssn;
		this.name = name;
	}
}
