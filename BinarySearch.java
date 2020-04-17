package sortingandsearching;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {8,9,10,19,20,23,29,35,37};
		
		int l=0;//low index
		int h=arr.length-1;//last index
		int element =9;
		System.out.println("Found element at index "+binarySearch(l,h,element,arr));
	}

	private static int binarySearch(int l, int h, int element, int[] arr) {
		
		if(l>h) {
			return -1;
		}
		int mid = l+(h-l)/2;
		System.out.println("Low "+l+" High "+h+" mid "+mid);
		if(arr[mid] == element) {
			return mid;
		}
		if(arr[mid]<element) {
			return binarySearch(mid,h,element,arr);
		}else {
			return binarySearch(l,mid,element,arr);
		}

	}
}
