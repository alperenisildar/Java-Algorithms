import java.util.ArrayList;
import java.util.Collections;

public class BitonicSort {
	
	private void compAndSwap(ArrayList<Student> sArray, int i, int j, int dire) {
		
		if((dire == 1 && sArray.get(i).getNumber() > sArray.get(j).getNumber()) || (dire == 0 && sArray.get(i).getNumber() < sArray.get(j).getNumber())) {
			Collections.swap(sArray, i, j);
		}
	}
	private void bitonicMerge(ArrayList<Student> sArray, int low, int cnt, int dire) {
		if(cnt > 1) {
			int k = cnt / 2;
			for(int i = low; i < low+k; i++) {
				compAndSwap(sArray, i, i+k, dire);
			}
			bitonicMerge(sArray, low, k, dire);
			bitonicMerge(sArray, low+k, k, dire);
		}
	}
	private void bitonicSort(ArrayList<Student> sArray, int low, int cnt, int dire) {
		if(cnt>1) {
			int k = cnt / 2;
			bitonicSort(sArray, low, k, 1);
			bitonicSort(sArray, low+k, k, 0);
			bitonicMerge(sArray, low, cnt, dire);
		}
	}
	public void sort(ArrayList<Student> sArray, int up) {
		bitonicSort(sArray, 0, sArray.size(), up);
	}
}
