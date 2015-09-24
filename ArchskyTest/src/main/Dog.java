package main;

public class Dog extends Animal implements Talking{

	public Dog (){
		super();
		
	}
	public Dog(int weight, int age) {
		this.setAge(age);
		this.setWeight(2* weight);
	}

	public String doStuff(){
		
		return "Woof woof";
	}
	@Override
	public String Talk() {
		return "Barking";
	}
}
