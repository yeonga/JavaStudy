package part6_class;

public class Car_Overloading_This {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car_Overloading_This() {

	}

	Car_Overloading_This(String model) { // 호출
		this(model, "은색", 250);
	}

	Car_Overloading_This(String model, String color) { // 호출
		this(model, color, 250);
	}

	Car_Overloading_This(String model, String color, int maxSpeed) {
		this.model = model; // 공통 실행 코드
		this.color = color;// 공통 실행 코드
		this.maxSpeed = maxSpeed;// 공통 실행 코드
	}
}
