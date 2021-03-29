import java.util.ArrayList;
import java.util.Collections;

public class GnomeSort {
	
	public void sort(ArrayList<Student> sArray) {
		int pos = 0;
		while(pos < sArray.size()) {
			if(pos == 0 || sArray.get(pos).getNumber() >= sArray.get(pos-1).getNumber()) {
				pos++;
			}
			else {
				Collections.swap(sArray, pos, pos-1);
				pos--;
			}
		}
	}
}
