import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int i = sc.nextInt();
		i=i*100;
		System.out.println("입력된 정수는 " + i +"입니다");
		sc.close();
		File file = new File("input.txt");
		try {
			Scanner sc2 = new Scanner(file);
			while(sc2.hasNextInt())
			{
				System.out.println(sc2.nextInt()*100);
			}
			sc2.close();
		} catch (FileNotFoundException e) {
			System.out.println("오류 발생");
		}
		
	}

}
