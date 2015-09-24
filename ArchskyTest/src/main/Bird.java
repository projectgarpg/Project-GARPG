package main;

public class Bird extends Animal implements Talking{

	private int Altitude;
	
	public Bird(int Altitude){
		super();
		this.Altitude = Altitude;
	}

	public Bird(int Altitude, int weight, int age){
		super(weight, age);
		this.Altitude = Altitude;
	}

	public String doStuff(){
		return "Tweet tweet";
	}
	
	public String fly(){
		return "Flying";
	}

	public int getAltitude() {
		return Altitude;
	}

	public void setAltitude(int altitude) {
		Altitude = altitude;
	}

	@Override
	public String Talk() {
		// TODO Auto-generated method stub
		return "Tweeting";
	}
}

