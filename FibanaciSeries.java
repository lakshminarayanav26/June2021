package LearnOops;

public class FibanaciSeries {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21,34
		
		int first = 0;
		int second = 1;
		
		System.out.println(first);
		System.out.println(second);
		
		int count = 0;
		
		for (int i = 1; i <=8; i++) {
			
			count = first+second;
			System.out.println(count);
			
			first = second;// assigning value in second to first means, now first = 1;
			second = count;// assigning value in count to second means, now second = 1;
			
			//next iteration count = first+second, means 1+1=2; in count = value is 2;
			// then first = 1; and second = 2; first+second=3;
			
		}

	}

}
