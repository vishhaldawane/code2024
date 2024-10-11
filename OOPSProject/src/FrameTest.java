import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		
		
		MyFrame frame1 = new MyFrame("CG1",500,300,100,100);
		MyFrame frame2 = new MyFrame("CG2",300,100,200,150);
		MyFrame frame3 = new MyFrame("CG3",700,400,300,300);
		MyFrame frame4 = new MyFrame("CG4",200,200,400,400);

		frame1.setVisible(true);
		frame2.setVisible(true);
		frame3.setVisible(true);
		frame4.setVisible(true);
		
	}
}

class MyFrame extends Frame
{
	
	MyFrame(String title, int h, int w, int x, int y)
	{
		setTitle(title);
		setSize(h, w);
		setLocation(x, y);
		setVisible(true);
	}
}