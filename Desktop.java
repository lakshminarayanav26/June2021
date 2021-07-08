package LearnOops;

public class Desktop implements HardWare, Software {

	

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("sftwar");
		
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hrdwr");
		
	}
	
public static void main(String[] args) {
		
		Desktop desk1 = new Desktop();
		desk1.softwareResources();
		desk1.hardwareResources();
		

	}

}
