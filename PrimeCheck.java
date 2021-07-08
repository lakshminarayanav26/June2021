package LearnOops;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 20;
		
		int Count = 0;
		
		for (int i = 1; i <=input; i++) {
			
			if (input % i == 0) {
				
				Count++;
				
			}
			
		}if (Count == 2) {
			
			System.out.println("Given number is prime");
		
			
		}else {
			
			System.out.println("Given number is not a prime");
		}
		
		

	}

}
