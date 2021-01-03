package part_14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

//문자 변환 보조 스트림 
public class ChracterConvertStreamExample {
	public static void main(String[] args) throws Exception {

		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}

	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("/Users/phiyeonga/desktop/test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str); // OutputStreamWriter 보조 스트림을 이용해서 문자 출력
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {
		// FileInputStream 에 InputStreamReader 보조 스트림을 연결
		FileInputStream fis = new FileInputStream("/Users/phiyeonga/desktop/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer); // InputStreamReader 보조 스트림을 이용해서 문자 입력
		reader.close();
		String data = new String(buffer, 0, readCharNum); // char 배열에서 읽은 수만큼 문자열로 변환
		return data;
	}

}
