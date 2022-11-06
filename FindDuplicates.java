package imam.practice;

import java.util.HashMap;

public class FindMissingAndDuplicatesNumberInArray {
	public static void findDuplicatesMissing(int[] arr) {
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		for(int i=1;i<=arr.length;i++) {
			if(map.get(i)==null) {
				System.out.println("Missing number = "+i);
			}
			else if(map.get(i)==2) {
				System.out.println("Duplicates number = "+i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,3,4,5,6};
		findDuplicatesMissing(arr);

	}

}
