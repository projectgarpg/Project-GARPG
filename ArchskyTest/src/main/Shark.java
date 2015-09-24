package main;

public class Shark extends Animal {
      
	private int Depth;
	
	public Shark(int Depth){
		super();
		this.Depth = Depth;
		
	}
	public Shark(int weight,int age){
		this.setAge(age);
		this.setWeight(weight);
	}
	
	public String doStuff(){
		return "blurp blurp";
	}
	
	
}
