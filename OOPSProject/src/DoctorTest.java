
public class DoctorTest {

	public static void main(String[] args) {
		HeartSurgeon hs = new HeartSurgeon();

		if(hs instanceof Doctor) {
			System.out.println("Yes, it is a doctor...too....");
		}
		else {
			System.out.println("Nope, hs is not a doctor...");
		}
	System.out.println("---------");
		if(hs instanceof Surgeon) {
			System.out.println("Yes, it is a surgeon...too....");
		}
		else {
			System.out.println("Nope, hs is not a surgeon...");
		}
	System.out.println("---------");
		if(hs instanceof HeartSurgeon) {
			System.out.println("Yes, it is a heart surgeon...too....");
		}
		else {
			System.out.println("Nope, hs is not a heart surgeon...");
		}	
	}

}
