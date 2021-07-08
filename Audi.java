package LearnOops;

public class Audi extends Car {
	
public void SeatBelt() {
		
	System.out.println("Put Seat belt");
	}

public void GodStatue() {
	
	System.out.println("Keep Statue");
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Audi Veh = new Audi();
	Veh.AirBag();
	Veh.AirCondition();
	Veh.Break();
	Veh.Gear();
	Veh.GodStatue();
	Veh.SeatBelt();

}

}
