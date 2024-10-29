
public class InstrumentTest {
	public static void main(String[] args) {
		
	}
}
interface Instrument
{
     void use();
}

abstract class MusicalInstrument implements Instrument
{
     abstract void play();
}
abstract class StringBasedMusicalInstrument extends 
               MusicalInstrument
{
	abstract void tuneStrings();
}
//The type Guitar must implement the inherited abstract method 
//StringBasedMusicalInstrument.tuneStrings()

//The type Guitar must implement the inherited abstract method 
//Instrument.use()

//The type Guitar must implement the inherited abstract method
//MusicalInstrument.play()

//implementation1
class Guitar extends StringBasedMusicalInstrument
{
	void tuneStrings() { }
	public void use() { }
	void play() {
		System.out.println("Plucking the strings of guitar....");
	}
	
}

//implementation2
class Violin extends StringBasedMusicalInstrument
{
	void tuneStrings() { }
	public void use() { }
	void play() { 
		System.out.println("Bowing the strings of violin....");
	}
	
}


//implementation3
class Sitar extends StringBasedMusicalInstrument
{
	void tuneStrings() { }
	public void use() { }
	void play() { 
		System.out.println("Plucking the strings of guitar....");
	}
	
}



