package sortingandsearching;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr[] = {1,9,5,19,3,34,26,22,97,53,47,41,39,38};
		int l = 0; //low index
		int h = arr.length-1;//high index
		mergeSort(arr, l,h);
		printArray(arr);

	}
	private static void mergeSort(int[] arr, int l,int h) {
		
		if(l<h) {
			int mid = l+(h-l)/2;
			mergeSort(arr, l,mid);
			mergeSort(arr, mid+1, h);
			merge(arr,l,mid,h);
		}
	}
	private static void merge(int[] arr, int low, int mid, int high) {
		
		int l = mid-low+1;
		int m = high-mid;
		int[] left = new int[l];
		int[] right = new int[m];
		
		
		for(int i =0;i<l;i++) {
			left[i]=arr[low+i];
		}
		
		for(int i= 0;i<m;i++) {
			right[i] = arr[mid+1+i];
		}
		
		int i=0; int j=0; int k=low;
		while(i<l && j<m) {
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] =right[j];
				j++;
			}
			k++;
		}
		while(i<l) {
			arr[k]=left[i];
			k++;
			i++;
		}
		while(j<m) {
			arr[k]=right[j];
			k++;
			j++;
		}
		
	}
	private static void printArray(int arr[]) {
		for(int i:arr)
			System.out.print(i+" ");
	}
}
