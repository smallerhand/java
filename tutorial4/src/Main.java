
public class Main {
	final static int SECOND = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minute = SECOND / 60;
		int second = SECOND % 60;
		System.out.println(minute + "분" + second + "초");
		int a = 10;
		System.out.println("현재의 a는"+a+"입니다");
		a++;
		System.out.println("현재의 a는"+a+"입니다");
		System.out.println("현재의 a는"+ ++a +"입니다");
		System.out.println("현재의 a는"+ a++ +"입니다");
		System.out.println("현재의 a는"+a+"입니다");
		
	}

}


