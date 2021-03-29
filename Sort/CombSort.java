import java.util.ArrayList;
import java.util.Collections;

public class CombSort {

	public void sort(ArrayList<Student> sArray) {
		int gap = sArray.size();
		double shrink = 1.3;
		double floor;
		boolean sorted = false;
		
		while(sorted == false) {
			floor = gap / shrink;
			gap = (int)floor;
			if (gap <= 1) {
				gap = 1;
				sorted = true;
				
			}
			int i = 0;
			while(i+gap < sArray.size()) {
				if(sArray.get(i).getNumber() > sArray.get(i+gap).getNumber()) {
					Collections.swap(sArray, i, i+gap);
					sorted = false;
				}
				i++;
			}
		}
	}
}
