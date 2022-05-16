package j03_연산;

public class Operation01 {

	public static void main(String[] args) {

		int num = 10;
		num = num + 1;
		System.out.println(num++);//후반영 : 출력 후 더함
		System.out.println(num--);//후반영
		System.out.println(++num);//선반영 : 더해진 후 출력
		System.out.println(--num);//선반영
		
	}

}
