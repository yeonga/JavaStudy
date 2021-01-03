package part_14;

import java.io.FileInputStream;
import java.io.InputStream;
		
// 바이트 입력 스트림 
public class Byte_ReadExample {

	public static void main(String[] args) throws Exception {

		// 데이터 출발지를 test1.db 로 하는 바이트 기반 파일 입력 스트림을 생성
		InputStream is = new FileInputStream("/Users/phiyeonga/desktop/test1.db");

		while (true) {
			int data = is.read(); // 1byte씩 읽기
			if (data == -1)
				break; // 더 이상 스트림으로부터 바이트를 읽을 수 없다면 read() 메소드는 -1을 리턴하므로 -> 파일 끝에 도달했을 경우 멈추기
			System.out.println("tst1 : " + data);
		}
		is.close(); // 입력 스트림 닫기

		// ------------------------------------------------------------------------

		InputStream is1 = new FileInputStream("/Users/phiyeonga/desktop/test2.db");

		byte[] buffer = new byte[100]; // 길이 100인 배열 생성

		while (true) {
			int readByteNum = is1.read(buffer); // 배열 길이만큼 읽기
			if (readByteNum == -1)
				break; // 파일 끝에 도달했을 경우
			for (int i = 0; i < readByteNum; i++) {
				System.out.println("test2 : " + buffer[i]); // 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트를 출력
			}
		}

		is1.close();

		// ------------------------------------------------------------------------

		// 데이터 출발지를 test3.db로 하는 바이트 기반 파일 입력 스트림을 생성 
		InputStream is2 = new FileInputStream("/Users/phiyeonga/desktop/test3.db");

		byte[] buffer2 = new byte[5];

		int readByteNum2 = is2.read(buffer2, 2, 3); // 입력 스트림으로부터 3byte를 읽고 buffer[2],buffer[3]. buffer[4]에 각각 저장
		if (readByteNum2 != -1) { // 읽은 바이트가 있다면
			for (int i = 0; i < buffer2.length; i++) { // 배열 전체를 읽고 출력
				System.out.println("test3 : " + buffer2[i]);
			}
		}
		is2.close(); // 입력 스트림 닫음
	}

}
