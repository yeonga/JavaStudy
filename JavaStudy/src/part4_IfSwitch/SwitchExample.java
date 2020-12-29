package part4_IfSwitch;

public class SwitchExample {
	
	// Switch는 if와 달리, 변수가 어떤 값을 갖느냐에 따라 실행문이 달라짐 / if는 조건식이 true일 때만 실행 
	// 따라서 if 문보다 Switch문이 훨씬 코드가 간결함 

	public static void main (String[] args) {
		int num = (int) (Math.random() * 6) +1;		// 1 : 시작 번
		
		
		switch(num) {
		case 1:
			System.out.println("1번이 왔습니다.");
			break;			//break 가 없다면 다음 case가 연달아 실행되는데, 이 때는 case 값과 상관없이 실행
		case 2:
			System.out.println("2번이 왔습니다.");
			break;
		case 3:
			System.out.println("3번이 왔습니다.");
			break;
		case 4:
			System.out.println("4번이 왔습니다.");
			break;
		case 5:
			System.out.println("5번이 왔습니다.");
			break;
		default:
			System.out.println("6번이 왔습니다.");
			break;
		}
	}
	
}
