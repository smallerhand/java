
public class Main2 {
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		if(number == 1)
		{
			return one;
		}
		else if (number == 2)
		{
			return two;
		}
		else
		{
			for(int i = 2; i< number; i++)
			{
				result = one + two;
				one = two;
				two = result;
			}
		}
			
		return result;
	}
	public static void main(String[] args) {
		System.out.println("피보나치 수열의 5번째 원수는 " + fibonacci(10) + " 입니다.");
	}

}
