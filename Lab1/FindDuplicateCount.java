
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		int i, j, count;
		
		for (i = 0; i < arr.length; i++){
			count = 0;
			for (j = i + 1; j < arr.length; j++){
				if (arr[i] == arr[j]){
				count++;
					}
				}
			if (count == 0){
				System.out.println("No duplicates with value " + arr[i] + " beyond Index " + i);
			}
			else if (count == 1){
				System.out.println("There is only " + count + " more occurence of value " + arr[i] + " starting at index " + i);
			}
			else{
				System.out.println("There are " + count + " more occurence of value " + arr[i] + " starting at index " + i);
			}
			}
		}
	}