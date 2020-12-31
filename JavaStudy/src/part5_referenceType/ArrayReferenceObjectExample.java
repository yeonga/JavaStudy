package part5_referenceType;

public class ArrayReferenceObjectExample {
	
	// ----------객체를 참조하는 배열-------------
	// 기본타입 배열은 각 항목에 직접 값을 갖지만 / 참조타입 배열은 각 항목에 객체의 번지를 가지고 있음 
	// 즉, String[] 배열은 String 객체를 참조하게 됨 

	public static void main (String[] args) {
		
		String[] strArray = new String [3];
		strArray[0] = "JAVA";
		strArray[1] = "JAVA";
		strArray[2] = new String("JAVA");
		
		System.out.println(strArray[0] == strArray[1]);		// 0과 1은 문자열 & 번지수 같음 
		System.out.println(strArray[0] == strArray[2]);		// (0 & 1)과 2는 번지수가 다름 
		System.out.println(strArray[0].equals(strArray[2]) );	// .equals를 해주면 번지수가 아니라 문자열임.  문자열은 같음 
	}

}
