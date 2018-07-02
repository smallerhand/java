
public class Main2 {

	public static void main(String[] args) {
		int[] array = new int[10000];
		for(int i = 0; i<10000; i++) {
			array[i]=(int)(Math.random()*10000+1);
		}
		
		int sum = 0;
		for(int i = 0; i<100;i++) {
			sum+=array[i];
		}
		System.out.println("평균 :" +sum/100);

	}

}
