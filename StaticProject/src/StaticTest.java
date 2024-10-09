
public class StaticTest {
	public static void main(String[] args) {
		
			Kite.printKiteCount();
			
			Kite kite1 = new Kite("Red", 100, "Vishhal");
			Kite kite2 = new Kite("Green", 200, "Preksha");
			Kite kite3 = new Kite("Blue:", 300, "Sakshi");
			
			Kite.printKiteCount();
			
			Kite kite4 = new Kite("Cyan", 150, "Janhvi");
			Kite kite5 = new Kite("Pink", 130, "Minal");
			
			Kite.printKiteCount();
			
			kite3.fly();
			kite5.fly();

			kite2.kiteFight(kite3,kite4);
			
			Kite.printKiteCount();

	}
}





class Kite
{
	private String color;
	private int length;
	private String owner;
	
	private static int kiteCount; //SHARED COPY ACROSS ALL THE OBJECTS OF THIS CLASS
	
	void kiteFight(Kite x , Kite y) 
	{
		System.out.println(owner+" started kite fight with "+x.owner+ " and "+y.owner);
		double val = Math.random()%10; // 0 to 1 
		if(val > 0.90 && val<0.95) {
			kiteCount--;
		}
		else if(val > 0.70 && val<0.75) {
			kiteCount=kiteCount-2;
		}
		else if(val > 0.40 && val<0.50) {
			kiteCount=kiteCount-3;
		}
		
		
	}
	
	//TO ACCESS TEH OTHER STATIC MEMBERS
	public  static void printKiteCount()
	{
		System.out.println("Kites in the SKY : "+kiteCount);
	}
	
	
	//initialize the data [ fields ]
	Kite(String col, int len, String own) {
		//System.out.println("Kite created...");
		color = col; //local variables
		length = len;
		owner = own;
		++kiteCount;
	}
	Kite(String col, int len) {
		color = col; //local variables
		length = len;
		owner = "Narendra Modi";
	}
	
	Kite(int len, String own) {
		color = "BLACK"; //default
		length = len;
		owner = own;
	}
	
	void fly() {
		System.out.println(owner+" is flying a "+color+" color kite of length "+length+" meters");
	}
	
}
