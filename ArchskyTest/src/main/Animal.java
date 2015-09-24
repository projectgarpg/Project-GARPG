package main;

public class Animal {

	private int weight;
	private int age;

	public Animal(){
		weight = 5;
		age = 0;
	}
	
	public Animal(int weight, int age){
		this.weight = weight;
		this.age = age;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String doStuff(){
		return "Doing stuff";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
