package part_14;

import java.io.FileWriter;
import java.io.Writer;

public class Character_WriteExample {

	public static void main(String[] args) throws Exception {

		// 데이터 도착지를 test4.txt로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("/Users/phiyeonga/desktop/test4.txt");

		char a = 'A';
		char b = 'B';
		char c = 'C';

		writer.write(a); // 한 문자씩 출력
		writer.write(b);
		writer.write(c);

		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close(); // 출력 스트림을 닫음

		// ------------------------------------------------------------------------

		// 데이터 도착지를 test5.txt로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer2 = new FileWriter("/Users/phiyeonga/desktop/test5.txt");

		char[] array = { 'A', 'B', 'C' };

		writer2.write(array); // 배열의 모든 문자 출력

		writer2.flush();
		writer2.close();

		// ------------------------------------------------------------------------

		// 데이터 도착지를 test6.txt로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer3 = new FileWriter("/Users/phiyeonga/desktop/test6.txt");

		char[] array2 = { 'A', 'B', 'C', 'D', 'E' };

		writer3.write(array2, 1, 3); // 배열의 1번 인덱스부터 3개를 출력

		writer3.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
		writer3.close(); // 출력 스트림 닫음

		// ------------------------------------------------------------------------

		// 데이터 도착지를 test7.txt로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer4 = new FileWriter("/Users/phiyeonga/desktop/test7.txt");
		
		String str = "ABCDEFG";
		
		writer4.write(str);		// 문자열 전체를 출력
		
		writer4.flush(); 		//출력 버퍼에 잔류하는 모든 문자를 출력 
		writer4.close();		// 출력 스트림 닫음 
		
		// ------------------------------------------------------------------------

		// 데이터 도착지를 test8.txt로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer5 = new FileWriter("/Users/phiyeonga/desktop/test8.txt");
		
		String string = "ABCDEFG";
		
		writer5.write(string, 2, 3);		// 문자열 전체 중 인덱스 2번부터 3개만 출력 
		
		writer5.flush(); 		//출력 버퍼에 잔류하는 모든 문자를 출력 
		writer5.close();		// 출력 스트림 닫음 
	}

}
