package part6_class;

public class PersonExample {

	public static void main(String[] args) {
		
		//필드 
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
	//	p1.nation = "Canada"; -초기 값이 정해졌으므로 변경 안됌 
	//	p1.ssn = "234567-2345678"; - 변경 안됌 
		p1.name = "홍길순";
		System.out.println(p1.name);
		
	}
	
}
