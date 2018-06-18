
public class Main3 {
	public static int fibonacci(int number) {
		if(number == 1)
		{
			return 1;
		}
		else if (number == 2)
		{
			return 1;
		}
		else
		{
			return fibonacci(number-2) + fibonacci(number-1); 
		}
			
	}
	public static void main(String[] args) {
		System.out.println("피보나치 수열의 5번째 원수는 " + fibonacci(15) + " 입니다.");
	}

}
