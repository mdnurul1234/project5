package house;

public class TestHouse {

	public static void main(String[] args) {
		House myhouse = new House();
		
		//String houseName = myhouse.getHouseName();
	//	System.out.println("houseName");
		
		//myhouse.houseName=("Gren House");
		
		myhouse.watchGame();
		
		int result = myhouse.addition(10,15);
		System.out.println(result);
		
		
		Office pnt = new Office();
		pnt.officeLocation();
		
		House yourHouse = new House();
		yourHouse.watchGame();

	}

}
