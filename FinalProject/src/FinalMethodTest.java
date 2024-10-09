
public class FinalMethodTest {
	public static void main(String[] args) {
		//Type mismatch: cannot convert from WebBasedGraphicalChess to Chess
		Chess chess = new WebBasedGraphicalChess(); //
		chess.moveMyKnight();
		//The method moveMyKnight() is undefined for the type Chess
	}
}
final class Chess // <--math developed by : Vanshika
{
	 void moveKnight() // L shape ie 2.5 steps
	{
		System.out.println("Chess : Moving Knight in L Shape...2.5 steps...");
	}
	 void moveKing() {
		 System.out.println("Moving king 1 step anywhere to move ");
	 }
	//..
	//.. 
}
//The type GraphicalChess cannot subclass the final class Chess
class GraphicalChess  //developed by Preksha : graphic code
{//Cannot override the final method from Chess
	void moveMyKnight()
	{
		//super.moveKnight(); //invoke the super class logic : math logic
		System.out.println("GraphicalChess : moving knight in L shape on graphical board...");
	}
	 void moveKing() {
		 System.out.println("Moving king 1 step anywhere to move on graphic board ");
	 }
}


class WebBasedGraphicalChess //extends GraphicalChess //developed by Jack : web based code
{
	void moveMyKnight()
	{
		//super.moveKnight(); //invoke the super class logic : math logic
		System.out.println("WebBasedGraphicalChess : Adding network socket...thread....etc....");
		System.out.println("WebBasedGraphicalChess : moving knight in L shape anywhere on graphical board..inside browser....");
	}
	 void moveKing() {
		 System.out.println("Moving king N step anywhere to move ");
	 }
}








