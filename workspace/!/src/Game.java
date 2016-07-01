import java.util.Scanner;

public class Game{
	


	public static void main(String[] args){  
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println(count7(x));
	
	}
	
	static int count7(int x){
		int sum = 0;
		if(x == 0){
			return x;
		}
		else{
			if((x % 10) == 7)
				sum++;
			x = x/10;
			return sum + count7(x);
				
			
		}
	}
	
}