
public class ObjectTalks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl a = new Girl("Shweta");
		a.gossip("Riya").talk("Julie").makeTea();
		
		
		a.makeTea();
		
		
	}

}
class Girl
{
	String name;
	Girl(String name) {
		this.name = name;
	}
	Girl gossip(String anotherName) {
		System.out.println(name +" is gossiping with "+anotherName);
		Girl anotherGirl= new Girl(anotherName);
		return anotherGirl;
	}
	Girl talk(String g) {
		System.out.println(name+" talking with "+g);
		Girl x = new Girl(g);
		return x;
	}
	void makeTea() {
		System.out.println(name+" is making tea");
	}
}