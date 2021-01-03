package part_14;

import java.io.FileReader;
import java.io.Reader;

public class Character_ReadExample {

	public static void main(String[] args) throws Exception {

		// 데이터 출발지를 test4.txt로 하는 문자 기반 파일 입력 스트림 생성
		Reader reader = new FileReader("/Users/phiyeonga/desktop/test4.txt");

		while (true) {
			int data = reader.read(); // 한 문자씩 읽기
			if (data == -1)
				break; // 파일 끝에 도달했을 경우
			System.out.println("test 4 : " + (char)data);
		}
		reader.close(); // 입력 스트림을 닫음

		// ------------------------------------------------------------------------

		// 데이터 출발지를 test5.txt로 하는 문자 기반 파일 입력 스트림 생성
		Reader reader2 = new FileReader("/Users/phiyeonga/desktop/test5.txt");

		char[] buffer = new char[100]; // 길이 100인 배열 생성

		while (true) {
			int readCharNum = reader2.read(buffer); // 배열 길이만큼 읽기
			if (readCharNum == -1)
				break; // 파일 끝에 도달했을 경우
			for (int i = 0; i < readCharNum; i++) {
				System.out.println("test 5 : " + buffer[i]); // 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
			}
		}
		reader2.close();

		// ------------------------------------------------------------------------

		// 데이터 출발지를 test6.txt로 하는 문자 기반 파일 입력 스트림 생성
		Reader reader3 = new FileReader("/Users/phiyeonga/desktop/test6.txt");

		char[] buffer2 = new char[5];

		int readCharNum2 = reader3.read(buffer2, 2, 3); // 입력 스트림으로부터 3개의 문자를 읽고 buffer[2]. buffer[3], buffer[4] 에 각 각 저장.
		if (readCharNum2 != -1) { // 읽은 문자가 있다면
			for (int i = 0; i < buffer2.length; i++) {
				System.out.println("test 6 : " + buffer2[i]); // 배열 전체를 읽고 출력
			}
		}
		reader3.close();
	}

}
