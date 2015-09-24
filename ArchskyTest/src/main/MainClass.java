package main;

public class MainClass implements Runnable {
	
		public static void main(String[] args) {
			
			Animal Alrik = new Bird(2);
			Dog Ibrahim = new Dog();
			Animal Sebastian = new Shark(10);
			Talking[] show = new Talking[2];
			show[0] = (Talking)Alrik;
			show[1] = Ibrahim;
			
			String hej = "hej";
			
			System.out.println(Alrik.doStuff());
			for(Talking tmp : show){
				System.out.println(tmp.Talk());
			}
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
}
