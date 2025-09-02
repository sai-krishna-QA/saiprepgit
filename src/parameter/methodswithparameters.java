package parameter;

public class methodswithparameters{
	
		
		String company;
		String modal;
		String color;
		double milage;
		int wheels;
		
		public void initcar (String com,String mod,String col,double mil,int whe ) {
			
			 company = com;
			 modal = mod;
			 color = col;
			 milage = mil;
			wheels = whe;
		}
		
		public void startcar() {
			System.out.println("Car from "+company+" and model "+modal+" has started");
		}
		
		public void stopCar() {
			System.out.println("Car from "+company+" and modal "+modal+" has stopped");
		}
		
	}