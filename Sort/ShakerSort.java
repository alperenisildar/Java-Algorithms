import java.util.ArrayList;
import java.util.Collections;

public class ShakerSort {

	public void sort(ArrayList<Student> sArray) {
		
		boolean swapped;
		do {
			swapped = false;
			for(int i = 0; i < sArray.size()-2; i++) {
				if(sArray.get(i).getNumber() > sArray.get(i+1).getNumber()) {
					Collections.swap(sArray, i, i+1);
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
			swapped = false;
			for(int i = sArray.size()-2; i > 0; i--) {
				if(sArray.get(i).getNumber() > sArray.get(i+1).getNumber()) {
					Collections.swap(sArray, i, i+1);
					swapped = true;
				}
			}
		}
		while(swapped);
	}
	
}
