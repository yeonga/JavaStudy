package part_14;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 바이트출력 스트림 
public class Byte_WriteExample {

	public static void main(String[] srgs) throws Exception { // 예외 처리 안해주면 아래 os.write()에서 오류남.

		// 데이터 도착지를 test1.db 로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = new FileOutputStream("/Users/phiyeonga/desktop/test1.db"); // 맥북의 바탕화면에 생성해야하므로
																						// /Users/phiyeonga/desktop 적어줌
																						// 윈도일 경우 C:/Temp 적어주면 됨

		byte a = 10;
		byte b = 20;
		byte c = 30;

		// write(int b) 메소드 사용 -> 매개변수로 주어지는 int(4byte)에서 끝 1byte만 출력 스트림으로 보냄.
		os.write(a); // 1byte씩 출력
		os.write(b);
		os.write(c);

		// flush 가 제일 중요!!! -> 출력 스트림은 출력할 바이트를 바로 보내는 것이 아니라 내부 버퍼(저장소)에 우선 저장해둠!
		os.flush(); // write 메소드 사용하면 꼭! flush 써주기. - "비운다"의 의미, 출력 버퍼에 잔류하는 모든 바이트를 출력함.
		os.close(); // 더 이상 출력 안할 때 사용. 출력 스트림을 닫을 때 사용
		
		//------------------------------------------------------------------------

		// 데이터 도착지를 test2.db 로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os1 = new FileOutputStream("/Users/phiyeonga/desktop/test2.db");

		byte[] array = { 10, 20, 30 };

		os1.write(array); // 배열의 모든 바이트를 출력

		os1.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		os1.close(); // 출력 스트림 닫음
		
		//------------------------------------------------------------------------

		// 데이터 도착지를 test3.db 로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os2 = new FileOutputStream("/Users/phiyeonga/desktop/test3.db");

		byte[] array1 = { 10, 20, 30, 40, 50 };

		os2.write(array1, 1, 3); // 배열의 1번 인덱스부터 3개를 출력

		os2.flush();
		os2.close();

	}

}
