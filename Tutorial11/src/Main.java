
public class Main {
	public static int factorial(int number) {
		if(number == 1)
			return 1;
		else
			return number * factorial(number - 1);
		
	}
	public static void main(String[] args) {
		System.out.println("10팩토리얼은 " + factorial(10));
		// TODO Auto-generated method stub

	}

}
