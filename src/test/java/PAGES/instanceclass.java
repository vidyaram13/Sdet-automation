package PAGES;

public class instanceclass {

	public static void main(String[] args) {
		// object creation
	Car mycar = new Car();
    Car myowner = new Car();
    //
    //Accessing the attributes and methods
    mycar.color="red";
    mycar.model="suv";
    
    
    myowner.color="black";
    myowner.model="swift";
    
    mycar.accelerate();
    myowner.brake();
    
	}

}
