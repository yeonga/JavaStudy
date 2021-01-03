package part_14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {		//BfferedReader는 readLine() 메소드를 제공함. 

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath()); // 문자 기반 입력 스트림 얻기
		BufferedReader br = new BufferedReader(reader); // BufferedReader 보조 스트림 연결

		while (true) {
			String data = br.readLine(); // 라인단위 문자열을 읽고 리턴
			if (data == null)		// readLine()을 3 번 실행하고, 더 이상 읽을 라인이 없을 때 readLine()은 null을 리턴함 
				break; // 파일 끝에 도달했을 경우, 반복문 빠져나오기
			System.out.println(data);
		}
		br.close(); // 입력 스트림 닫기

	}

}
