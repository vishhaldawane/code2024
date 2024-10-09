
public class FinalMethodTest {
	public static void main(String[] args) {
		Chess chess = new WebBasedGraphicalChess(); //
		chess.moveKnight();
	}
}
class Chess // <--math developed by : Vanshika
{
	final void moveKnight() // L shape ie 2.5 steps
	{
		System.out.println("Chess : Moving Knight in L Shape...2.5 steps...");
	}
	//..
	//.. 
}

class GraphicalChess extends Chess //developed by Preksha : graphic code
{//Cannot override the final method from Chess
	void moveMyKnight()
	{
		super.moveKnight(); //invoke the super class logic : math logic
		System.out.println("GraphicalChess : moving knight in L shape on graphical board...");
	}
}


class WebBasedGraphicalChess extends GraphicalChess //developed by Jack : web based code
{
	void moveMyKnight()
	{
		super.moveKnight(); //invoke the super class logic : math logic
		System.out.println("WebBasedGraphicalChess : Adding network socket...thread....etc....");
		System.out.println("WebBasedGraphicalChess : moving knight in any shape anywhere on graphical board..inside browser....");
	}
}








