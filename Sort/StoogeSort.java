import java.util.ArrayList;
import java.util.Collections;

public class StoogeSort {
	
	public void sort(ArrayList<Student> sArray) {
		sort(sArray, 0, sArray.size()-1);
	}
			
	public static void sort(ArrayList<Student> sArray, int i, int j) {
		
		if(sArray.get(i).getNumber() > sArray.get(j).getNumber()) {
			Collections.swap(sArray, i, j);
		}
		if(j-i+1 > 2) {
			int t = (j-i+1) / 3;
			sort(sArray, i, j-t);
			sort(sArray, i+t, j);
			sort(sArray, i, j-t);
		}
	}
}
