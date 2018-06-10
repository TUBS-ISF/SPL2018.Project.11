package administration;
import interfaces.IComparator;


public class Quicksort {
	private IComparator comparator;
	
	public Game[] sort(Game[] data, IComparator comparator) {
		this.comparator = comparator;
		return data = recQuicksort(data, 0, data.length - 1);
	}
	
	private Game[] recQuicksort(Game[] data, int left, int right) {
		if (right <= left) {
			return data;
		}
		
		int pivot = partition(data,left,right);
		recQuicksort(data, left, pivot - 1);
		recQuicksort(data, pivot + 1, right);
		return data;
	}
	
	private int partition(Game[] data, int left, int right) {
		int pivot = right;
		int i = left;
		int j = right;
		
		while (i < j) {
			while (comparator.compare(data[i], data[pivot]) <= 0 && i < right) {
				i++;
			}
			while (comparator.compare(data[j], data[pivot]) == 1 && j > left) {
				j--;
			}
			if(i < j) {
				Game temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		
		if(comparator.compare(data[i], data[pivot]) == 1) {
			Game temp = data[i];
			data[i] = data[pivot];
			data[pivot] = temp;
			pivot = i;
		}
		return pivot;
	}
	
}
