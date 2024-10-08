
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human("Jack");
		
		Water water = new Water(100, "Mineral Water");
		
		Sugar sugar = new Sugar("Organic","Brown",50);
		
		Milk milk = new Milk("Gir Cow","OffWhite",100);
		
		Ginger ginger = new Ginger("GratedGinger",10);
		
		TeaPowder teaPowder = new TeaPowder("WaghBakri", "CTC", 50);
		
		Tea t = human.cook(water, milk, teaPowder, sugar, ginger);
		
		System.out.println("t "+t);
	
		
//		human.showHuman();
//		human.think();
//		String someValue = human.cook("water","sugar","milk","ginger");
//		System.out.println("Jack got "+someValue);
		
		
	}

}

class Water
{
	private int quantity;
	private String type;
	
	public Water(int quantity, String type) {
		super();
		this.quantity = quantity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Water [quantity=" + quantity + ", type=" + type + "]";
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
class TeaPowder
{
	String brand;// 
	String type;
	int quantity;
	public TeaPowder(String brand, String type, int quantity) {
		super();
		this.brand = brand;
		this.type = type;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "TeaPowder [brand=" + brand + ", type=" + type + ", quantity=" + quantity + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
class Sugar
{
	private String type;
	private String color;
	private int quantity;
	public Sugar(String type, String color, int quantity) {
		super();
		this.type = type;
		this.color = color;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Sugar [type=" + type + ", color=" + color + ", quantity=" + quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

class Milk
{
	private String type; //source
	private String color;
	private int quantity;
	public Milk(String type, String color, int quantity) {
		super();
		this.type = type;
		this.color = color;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Milk [type=" + type + ", color=" + color + ", quantity=" + quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

class Tea
{
	private String type;
	private float temperature;
	private int quantity;
	public Tea(String type, float temperature, int quantity) {
		super();
		this.type = type;
		this.temperature = temperature;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Tea [type=" + type + ", temperature=" + temperature + ", quantity=" + quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

class Ginger // data + ctor +set/get + toString
{
	String type; //grated / dried powder
	int quantity;
	public Ginger(String type, int quantity) {
		super();
		this.type = type;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Ginger [type=" + type + ", quantity=" + quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

class Heart
{
	void beating() {
		System.out.println("Heart is beating...");
	}
}
class Liver {
	void makeBlood() {
		System.out.println("Making blood....");
	}
}

class Human
{
	private String name;
	Heart myHeart = new Heart(); //hasA
	Liver liver = new Liver(); //hasA
	
	Human(String name) {
		this.name = name;
	}
	void showHuman() {
		System.out.println("Human  : "+name);
		myHeart.beating();
		liver.makeBlood();
	}
	void think() {
		System.out.println("Human is thinking....");
	}
	
	String cook(String  s1, String s2, String s3, String s4) {
		System.out.println(name+" is cooking.... "+s1+ " with "+s2+ " with "+s3+" with "+s4);
		return "tea";
	}
	Tea cook(Water w, Milk m, TeaPowder tp, Sugar s, Ginger g) {
		System.out.println(name+" is making tea from "+tp.getBrand()+"'s tea");
		System.out.println("milk of type "+m.getType());
		System.out.println("sugar is of type "+s.getType()+ " and color "+s.getColor());
		Tea tea = new Tea(g.getType(), 100, m.getQuantity()+w.getQuantity());
		
		return tea;
	}
}


