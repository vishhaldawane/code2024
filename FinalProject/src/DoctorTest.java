class Hospital
{
	void checkup(Doctor x) //handle to Super can also point to its children
	{
		System.out.println("Hospital : checkup ...started..... ");
		x.diagnose(); //only invokes overridden tokens
		x.prescribe();
		x.chargeFees();
		//x.cut();
		System.out.println("Hospital : checkup over...");
		System.out.println("-----------------------");
	}
}
public class DoctorTest {
	public static void main(String[] args) {
		
		Doctor doctor = new Doctor();
		Surgeon surgeon = new Surgeon();
		HeartSurgeon heartSurgeon = new HeartSurgeon();
		
		Hospital hospital = new Hospital();
		hospital.checkup(doctor);
		hospital.checkup(surgeon);
		hospital.checkup(heartSurgeon);
		
		
	}
}

//vaidya

class Doctor //GP - MBBS
{
	void diagnose() //overridden
	{
		System.out.println("Doctor : diagnosing... EENTT ");
	}
	void prescribe() {
		System.out.println("Doctor : prescribing..... RGBWY pills ");
	}
	void chargeFees() {
		System.out.println("Doctor : Charging 500/- ");
	}
}



class Surgeon extends Doctor //GP - MBBS
{
	//overriding
	void diagnose() //redefined by the child here
	{
		
		System.out.println("Surgeon : diagnosing... CT Scan report ");
	}
	void prescribe() {
		System.out.println("Surgeon : prescribing.....special medicines... ");

	}
	void chargeFees() {
		System.out.println("Surgeon : Charging 3000/- ");
	}
	void cut() {
		System.out.println("Surgeon is cutting...");
	}
	void stitch() {
		System.out.println("Surgeon is stitching...");
	}
}


class HeartSurgeon extends Surgeon //GP - MBBS
{
	void diagnose()
	{
		System.out.println("HeartSurgeon : diagnosing... ECG Scan report ");
	}
	void prescribe() {
		System.out.println("HeartSurgeon : prescribing.....heart surgery... ");

	}
	void chargeFees() {
		System.out.println("HeartSurgeon : Charging 300000/- ");
	}
}



/*
Doctor doctor = new Doctor();
doctor.diagnose();
doctor.prescribe();
doctor.chargeFees();

System.out.println("-------------");

Surgeon surgeon = new Surgeon();
surgeon.diagnose();
surgeon.prescribe();
surgeon.chargeFees();

System.out.println("-------------");

HeartSurgeon heartSurgeon = new HeartSurgeon();
heartSurgeon.diagnose();
heartSurgeon.prescribe();
heartSurgeon.chargeFees();
*/


