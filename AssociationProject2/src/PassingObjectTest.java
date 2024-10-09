//lEARNing Frequency = Saraswati - Goddess of Wisdom (applied knowledge)

//transitory - Person, Artist, GraphicDesigner, Magician
//stationary - Account, Pen, SketchPen, Table
public class PassingObjectTest {
	public static void main(String[] args) {
		//good better best
		
		Curd curd1 = new Curd("Thickest","Sour","Buffalow",500);
		Sugar sugar = new Sugar("Organic","Brown",150);
		Ice ice = new Ice("Bisleri","Cubes",1);
		
		System.out.println("density of curd1 "+curd1.getDensity());
		System.out.println("main : curd1 : "+curd1.hashCode());
		
		System.out.println(" -------- ");
		
		Chef chef = new Chef();
		//Lassi Chef.cook(Curd curd2, Sugar sugar, Ice ice)

		Lassi myLassi = chef.cook(curd1, sugar, ice);
		
		System.out.println("my lassi : "+myLassi);
		System.out.println(" -------- ");

		System.out.println(" back to main ");
		System.out.println("density of curd1 "+curd1.getDensity());
		
	}
}
class Chef extends Person //isA
{
	
			//usesA		usesA			usesA
	Lassi cook(Curd curd2, Sugar sugar, Ice ice)//curd2 = curd1
	{
		System.out.println("Chef is cooking something...");

		System.out.println("Chef is using Curd of "+curd2.getSource()+" milk");
		System.out.println("Chef is adding "+sugar.getType()+" sugar of "+sugar.getColor()+" color of quantity "+sugar.getQuantity()+" gms");
		System.out.println("Chef is also adding "+ice.getQuantity()+" "+ice.getShape()+" ice of "+ice.getSource()+" brand ");
		System.out.println("Blending started.....");
		
		int sweetLevel=0;
		
		if(
			(curd2.getQuantity()>=500 && curd2.getQuantity()<=600)	
				&& 
			(sugar.getQuantity() >=100 && sugar.getQuantity()<=150 )
		) {
			sweetLevel=8;
		}
		else if(
				(curd2.getQuantity()>=500 && curd2.getQuantity()<=600)	
						&& 
				(sugar.getQuantity() >=1 && sugar.getQuantity()<=10 )
			 )
		{
			sweetLevel=2;
		}

		Lassi lassiObj = new Lassi("Thicker",sweetLevel,600,5.0f);
		return lassiObj;
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

class Ice
{
	private String source;
	private String shape;
	private int quantity;
	
	
	
	public Ice(String source, String shape, int quantity) {
		super();
		this.source = source;
		this.shape = shape;
		this.quantity = quantity;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getShape() {
		return shape;
	}



	public void setShape(String shape) {
		this.shape = shape;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Ice [source=" + source + ", shape=" + shape + ", quantity=" + quantity + "]";
	} 
	
	
}
class Curd
{
	private String density;
	private String taste;
	private String source;
	private int quantity;
	
	public Curd(String density, String taste, String source, int quantity) {
		super();
		this.density = density;
		this.taste = taste;
		this.source = source;
		this.quantity = quantity;
	}

	public String getDensity() {
		return density;
	}

	public void setDensity(String density) {
		this.density = density;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Curd [density=" + density + ", taste=" + taste + ", source=" + source + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
class Lassi
{
	String density;
	int sweetLevel;
	int quantity;
	float temperature;
	public Lassi(String density, int sweetLevel, int quantity, float temperature) {
		super();
		this.density = density;
		this.sweetLevel = sweetLevel;
		this.quantity = quantity;
		this.temperature = temperature;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public int getSweetLevel() {
		return sweetLevel;
	}
	public void setSweetLevel(int sweetLevel) {
		this.sweetLevel = sweetLevel;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Lassi [density=" + density + ", sweetLevel=" + sweetLevel + ", quantity=" + quantity + ", temperature="
				+ temperature + "]";
	}

	
	
	
}


/*
 * 
 * 
 * 	
		
		Chef chef = new Chef();
		chef.cook(curd, sugar, ice);
 */




class Person
{
	
}

//TODO Auto-generated method stub

		//Lassi lassi = new Lassi("Thick",8,250,5.0f);
		
		//System.out.println("lassi is "+lassi);
		

