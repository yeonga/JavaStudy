package part6_class;

public class Car_Overloading {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자1
	Car_Overloading() {
	}

	// 생성자2
	Car_Overloading(String model) {
		this.model = model;				// this.model - 필드 / =model - 매개변수 
	}

	// 생성자3
	Car_Overloading(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// 생성자4
	Car_Overloading(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
