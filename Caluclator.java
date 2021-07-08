package LearnOops;



public class Caluclator {
	
	public void add(int num1, int num2) {
		
		System.out.println(num1+num2);
	}
	
public void add(int num1, int num2, int num3) {
	System.out.println(num1+num2+num3);
		
	}


public void multiply(int num1, int num2) {
	
	System.out.println(num1*num2);
}

public void multiply(int num1, double num2) {
System.out.println(num1*num2);
	
}

public void sub(int num1, int num2) {
	
	System.out.println(num1-num2);
}

public void sub(double num1, double num2) {
System.out.println(num1-num2);
	
}

public void div(int num1, int num2) {
	
	System.out.println(num1/num2);
}

public void div(double num1, int num2) {
System.out.println(num1/num2);
	
}

	public static void main(String[] args) {
		
		Caluclator calc = new Caluclator();
		calc.add(12, 15);
		calc.sub(83, 13);
		calc.div(15, 3);
		calc.multiply(15, 3);
		
		calc.add(12, 15, 10);
		calc.sub(83.5, 13.2);
		calc.div(15.9, 3);
		calc.multiply(15, 3.2);
		
		

	}

}
