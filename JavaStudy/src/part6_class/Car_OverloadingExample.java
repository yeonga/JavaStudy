package part6_class;

public class Car_OverloadingExample {

	public static void main(String[] args) {
		
		Car_Overloading car1 = new Car_Overloading();	//생성자 선택1
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car_Overloading car2 = new Car_Overloading("자가용");	//생성자 선택2
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car_Overloading car3 = new Car_Overloading("자가용", "빨강");	//생성자 선택3
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car_Overloading car4 = new Car_Overloading("택시", "검정", 200);	//생성자 선택4
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);		
	}
}
