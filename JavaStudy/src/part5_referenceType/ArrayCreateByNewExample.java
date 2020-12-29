package part5_referenceType;

public class ArrayCreateByNewExample {

	// new 연산자로 배열 생성 - 타입 [] 변수 = new 탸입[길이];
	// 타입 [] 변수 = null;
	// 변수 = new 타입[길이];
	// => new 연산자로 배열을 처음 생송할 경우 배열은 자동적으로 기본값으로 초기화됨. 기본타입 (정수)-0/ (실수)-0.0/
	// (논리)-false/ 참조타입 - null

	public static void main(String[] args) {

		int[] arr1 = new int[3]; // 변수 [인덱스] = 값; - 이 값을 인덱스에 넣겠다. / 길이가 3인 arr1
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]); // arr1 은 int 타입으로 기본값은 0
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		double[] arr2 = new double[3]; // 길이가 3인 arr2
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]); // arr2 은 double 타입으로 기본값은 0.0
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		String[] arr3 = new String[3]; // 길이가 3인 arr3
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]); // arr3 은 String 타입으로 기본값은 null
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
