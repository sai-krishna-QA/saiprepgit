package Default;

public class Child_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Firstclassjava ob = new Firstclassjava();
		
		ob.Modal = "tata punch icng";
		ob.color = " tropical mist";
		ob.Company = "tata";
		ob.milage = 25.2;
		ob.wheels = 4;
		ob.Modal = "accomplished";
		
		ob.startcar();
		ob.stopcar();
		ob.carDetails();
		
		System.out.println("=================================================================");
		
		Firstclassjava bj = new Firstclassjava();

		bj.Modal = "swift desire base ";
		bj.color = " white";
		bj.Company = "suziki";
		bj.milage = 15.5;
		bj.wheels = 4;
		ob.Modal = "Base";

		
		bj.startcar();
		bj.stopcar();
		bj.carDetails();

	}

}
