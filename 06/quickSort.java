import java.util.*;
public class quickSort{

    public static String name() {
	return "daniel.kodsi";
    }

    public static void swap(int[] List, int a, int b) {
	int temp = List[a];
	List[a] = List[b];
	List[b] = temp;
    }

    public static int partition(int[] List, int start, int end) {
	Random r = new Random();
	int pivotIndex = r.nextInt(end - start + 1) + start;
	int pivot = List[pivotIndex];
	int count = start;
	int end2 = end;
	swap(List,end2,pivotindex);
	
	for(int i = count; i < end; i++) {
	    if(List[end2] > List[i]){
		swap(L,count,i);
		count++;
	    }
	}
	swap(List,end2,count);
	return count;
    }

    public static void quickSortHelper(int[] List, int start, int end) {
    	if (start >= end)	
		return;
	int pivotIndex = partition(List,start,end);
	System.out.println(pivotIndex);
	quickSortHeper(List, start, pivotIndex);
	quickSortHelper(List, pivotindex + 1, end);
    }

    public static void quickSort(int[] List) {
	quickSortHelper(List, 0, List.length-1);
    }

    public static void main(String[] args) {
	int[] List = new int[5];
	Random r = new Random();
	for (int i = 0; i < List.length; i++)
	    List[i] = 0;
	System.out.println(Arrays.toString(List));
	quickSort(List);
	System.out.println(Arrays.toString(List));
    }
}
