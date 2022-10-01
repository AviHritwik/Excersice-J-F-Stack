package sort;


public class Bubblesort {
	public void bubbleSort(int[] arr) {
		int len=arr.length;
		for(int i=0;i<len-1;i++) {
			for(int j=0;j<len-1;j++) {
				if( arr[j] > arr[j+1] ) {
					Integer temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
