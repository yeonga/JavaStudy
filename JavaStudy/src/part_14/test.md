## 입출력 스트림 

<h4> 💡 입출력 스트림 </h4>

<ul>
	<li> 자바에서 데이터는 스트림(시냇물의 흐름)을 통해 입출력 된다. </li>
</ul>


<ul>
	<li> 입출력 스트림의 종류  
		<ul> 
			<li> 바이트(byte) 기반 스트림 : 그림, 멀티미디어 등의 바이너리 데이터를 읽고 출력할 때 사용 (.jpg/.png/.mp3/.mp4 ...) </li>
				<ul>
					<li> 입력 스트림 - 최상위 클래스 : InputStream / 하위 클래스 : XXXInputStream -> ex) FileInputStream </li>
					<li> 출력 스트림 - 최상의 클래스 : OutputStream / 하위 클래스 : XXXOutputStream -> ex) FileOutputStream </li>
				</ul>
			<li> 문자(character) 기반 스트림 : 문자 데이터를 읽고 출력할 때 사용 (.txt/.html/.xml ...) </li>
				<ul>
					<li> 입력 스트림 - 최상위 클래스 : Reader / 하위 클래스 : XXXReader -> ex) FileReader </li>
					<li> 출력 스트림 - 최상위 클래스 : Writer / 하위 클래스 : XXXWriter -> ex) FileWriter </li>
				</ul>
			<li> 🌟 하나의 스트림으로 입력과 출력이 동시에 불가능하다 🌟</li>
		</ul>
	</li>
</ul>

<h4> 💡 보조 스트림 </h4>

<ul>
	<li> 보조 스트림 : 다른 스트림과 연결이 되어 여러 가지 편리한 기능을 제공해주는 스트림 (자체적으로 입출력을 수행할 수 없음)  </li>
	<li> 문자 변환, 입출력 성능 향상, 기본 타입 입출력 등의 기능을 제공 </li>
</ul>


<ul>
	<li> 보조 스트림 연결 
		<ul> 
			<li> 보조 스트림 변수 = new 보조 스트림 (연결 스트림 - 생성자의 매개값 (주 스트림)</li>
			<li> 보조 스트림을 연속적으로 연결할 수 있음			
				<ul>
					<li> ➡️ 주 입력 스트림 - 보조 스트림 1 - 보조 스트림 2 - 프로그램 -> 보조 스트림 2 - 보조 스트림1 - 주 입력 스트림 ➡️  </li>
					<li> ex) InputStream is = XXX; </li>
					<li> InputStreamReader reader = new InputStreaReader(is); </li>
					<li> BufferedReader br = new BufferedReader(reader); </li>
				</ul>
			</li>
		</ul>
	</li>
</ul>
<ul>
	<li> 🔄 문자 변환 보조 스트림
		<ul>
			<li> Writer writer = new OutputStreamWriter (바이트 기반 출력 스트림) </li>
			<li> Reader reader = new InputStreamReader (바이트 기반 입력 스트림) </li>
		</ul>
	</li>
</ul>
<ul>
	<li> ⭐ 성능 향상 보조 스트림 ⭐
		<ul>
			<li> 프로그램이 입출력 소스와 직접 작업하지 않고 중간에 메모리 버퍼(buffer)와 작업함으로써 실행 성능을 향상시킬 수 있음 </li>
			<li> 예) 프로그램은 직접 하드디스크에 데이터를 보내지 않고 메모리 버퍼에 데이터를 보냄으로써 쓰기 속도가 향상됨 </li>
			<li> buffer는 데이터가 쌓이기를 기다렸다가 꽉 차게 되면 데이터를 한꺼번에 하드 디스크로 보냄으로써 출력 횟수를 줄여줌 
				<ul> 출력 스트림과 연결되어 추가적인 내부 버퍼를 제공
					<li> BufferedOutputStream bos = new BufferedOutputStream (바이트 기반 출력 스트림) </li>
					<li> BufferedWriter bw = new BufferedWriter (문자 기반 출력 스트림) </li>
				</ul>
				<ul> 생성자의 매개값으로 준 입력 스트림과 연결되어 추가적인 내부 버퍼를 제공함 
					<li> BufferedInputStream bis = new BufferedInputStream (바이트 기반 입력 스트림) </li>
					<li> BufferedReader br = new BufferedReader(문자 기반 입력 스트림) </li> 
					<li> readLine() : Enter 키 이전의 모든 문자열을 읽고 리턴함 (한 행을 왕창 읽음 / 한 문자 X)</li>
				</ul>
			</li>
		</ul>
	</li>
</ul>
<ul>
	<li>
		<ul> 객체 입출력 보조 스트림 
			<li> ObjectOutputStream : 객체를 직렬화 하는 역할을 함  </li>
			<li> ObjectInputStream : 객체를 역직렬화 하는 역할을 함 </li>
			<li> 직렬화 : 객체를 바이트 배열로 만드는 것 </li>
			<li> 역직렬화 : 바이트 배열을 다시 객체로 복원하는 것 </li>
			<li> ObjectOutputStream oos = new ObjectOutputStream(바이트 기반 출력 스트림) </li>
			<li> ObjectInputStream ois = new ObjectInputStream(바이트 기반 입력 스트림) </li>
			<li> oos.writeObject(객체);➡️  객체를 직렬화해서 출력 스트림으로 보냄 </li>
			<li> ⚠️ 자바는 모든 객체를 직렬화 하지 않음 (java.io.Serializable 인터페이스를 구현한 객체만 직렬화 가능함) </li>
		</ul>
	</li>
</ul>
