import java.util.Iterator;
import java.util.TreeSet;

public class NumAvg 
{
	private TreeSet<Integer> numSet = new TreeSet<Integer>();

	void addNum(int num) {
		if(num%5!=0 && num%6!=0) {
			System.out.println("Adding "+num);
			numSet.add(num);
		}
		else {
			System.out.println("skipped "+num);
		}
	}

	public double calAvg() {
	
		double sum=0;
		Iterator<Integer> numIter = numSet.iterator();
		while(numIter.hasNext()) {
			int x = numIter.next();
			sum = sum + x;
		}
		double avg = sum / numSet.size();
		return avg;
	}
	
	public TreeSet<Integer> getNumSet() {
		return numSet;
	}

	public void setNumSet(TreeSet<Integer> numSet) {
		this.numSet = numSet;
	}
}
