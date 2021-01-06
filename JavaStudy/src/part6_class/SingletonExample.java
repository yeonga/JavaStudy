package part6_class;

public class SingletonExample {

	public static void main(String[] args) {

		/*	- 컴파일 에러
			Singleton obj1 = new Singleton();
			Singleton obj2 = new Singleton();
		 */

		// obj1, obj2 는 같은 객체 참조함 (= 같은 번지수 가짐)
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
