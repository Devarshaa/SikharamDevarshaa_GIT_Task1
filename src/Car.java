class Vehicle{}
class Scooter extends Vehicle{}
public class Car extends Vehicle{

	public static void main(String[] args) {
		Vehicle car=new Car();
		Scooter sco=new Scooter();
		System.out.println(car instanceof Car);
		System.out.println(sco instanceof Scooter);
	}

}
