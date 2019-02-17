package house;

public class House {  //open body
	
	// declaring variables
	int houseNumber;
	String houseName;
	
	// public String houseName = new String("Green House");
	
	//public void GetHouseName() {
		//System.out.println();
	//}
	
	public String getHouseName() {
		//System.out.println("houseName");
		return houseName;
	}
	
	//declaring methods
	public void watchGame() {
		System.out.println("This is our house,we are watching soccer");
	}

	public int addition(int number1,int number2) {
		int total = number1 + number2;
		return total;
	}
} //close body
