package part3_IncrementDecrementOperators;

public class IncreaseDecreaseOperatorExample {

	public static void main (String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------");
		x++;		//x=11
		++x;		//x=12
		System.out.println("x= " +x);
		
		System.out.println("------------------------");
		y--;		//y=9
		--y;		//y=8
		System.out.println("y= " +y);
		
		
		System.out.println("------------------------");
		z = x++;		//z=12 (++ 연산 하기 전의 값)
		System.out.println("z= " +z);	//z=12
		System.out.println("x= " +x);	//x=13 (z연산 후 ++ 해준 값)
		
		System.out.println("------------------------");
		z = ++x;		//z=14 (x의 값 13에 ++을 해준 값)
		System.out.println("z= " + z);	//z=14
		System.out.println("x= " + x);	//x=14
		
		System.out.println("------------------------");
		z = ++x + y++;		//z= 15 + 8 = 23
		System.out.println("z= " + z);	//z=34
		System.out.println("x= " + x);	//x=15 (++연산 먼저)
		System.out.println("y= " + y);	//y=9	(z값 구하고 난 후 ++ 연산 해준 값)
	}
	
}
