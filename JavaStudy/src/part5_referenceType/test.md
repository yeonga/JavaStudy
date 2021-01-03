## 조건문

<h4> 💡 참조타입 - 배열 </h4>

<ul>
	<li> new 연산자로 배열 생성  
		<ul> 
			<li> new 연산자로 배열 생성 - 타입 [] 변수 = new 탸입[길이]; </li>
			<li> 타입 [] 변수 = null; </li>
			<li> 변수 = new 타입[길이]; </li>
			<li> => new 연산자로 배열을 처음 생성할 경우 배열은 자동적으로 기본값으로 초기화됨. 기본타입 (정수)-0/ (실수)-0.0</li>
			<li> (논리)-false/ 참조타입 - null </li>
		</ul>
	</li>
</ul>

<ul>
	<li> 배열 길이 
		<ul>
			<li> 배열에 저장할 수 있는 전체 항목의 개수 </li>
			<li> 배열 변수.length; </li>
			<li> 값을 절대 바꿀 수 없고 & 새로운 값을 추가하지도 못함 </li>
		</ul>
	</li>
</ul>

<ul>
	<li> 다차원 배열 - 배열 속의 배열 
		<ul>
			<li> 행과 열로 구성된 배열 = 2차원 배열 </li>
			<li> ex) int [][] scores = new int[2][3] </li>
			<li> => 길이가 3인 것을 2개 만든다 </li>
			<li> 타입 [][] 변수 = {{값1, 값2},{값3, 값4, 값5}, ... }; </li>
		</ul>
	</li>
</ul>

<ul>
	<li> 객체를 참조하는 배열
		<ul>
			<li> 기본타입 배열은 각 항목에 직접 값을 갖지만 / 참조타입 배열은 각 항목에 객체의 번지를 가지고 있음  </li>
			<li> 즉, String[] 배열은 String 객체를 참조하게 됨 </li>
		</ul>
	</li>
</ul>