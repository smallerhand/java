
public class Main {
	final static int N = 30;
	public static void main(String[] args) {
		int score = 95;
		if(score >= 90)
		{
			System.out.println("A+ 입니다");
		}
		else if(score >= 80)
		{
			System.out.println("B+ 입니다");
		}
		else if(score >= 70)
		{
			System.out.println("C+ 입니다");
		}
		else
		{
			System.out.println("B+ 입니다");
		}
		String a = "Man";
		int b = 0;
		if(a.equals("Man"))
		{
			System.out.println("남자입니다");
		}
		else
		{
			System.out.println("남자가 아닙니다");
		}
		if(b == 3)
		{
			System.out.println("b는 3입니다");
		}
		else
		{
			System.out.println("3이 아닙니다");
		}
		if(a.equalsIgnoreCase("man")&&b==0)
		{
			System.out.println("참입니다");
		}
		else
		{
			System.out.println("거짓입니다");
		}
		int k = 1, sum = 0;
		while(k <= 1000)
		{
			sum += k++;
		}
		System.out.println("1부터 1000까지의 합은 "+ sum +"입니다");
		for(int i = N; i > 0; i--)
		{
			for(int j = i; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
