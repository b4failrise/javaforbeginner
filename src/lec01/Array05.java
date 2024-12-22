package lec01;

import java.util.ArrayList;

public class Array05 {
	public static void main(String[] args) {
		// 배열 : 첫번째 방식
		int[] arrA = new int[] {1, 2, 3, 4, 5};
		// 배열 : 두번째 방식
		int[] arrB = new int[5];
		arrB[0] = 1;
		arrB[1] = 2;
		arrB[2] = 3;
		arrB[3] = 4;
		arrB[4] = 5;
		System.out.println(arrB);
		
		// 컬렉션 프레임워크
		ArrayList<Integer> sampleIntList = new ArrayList<Integer>();
		sampleIntList.add(1);
		sampleIntList.add(2);
		System.out.println(sampleIntList);
	}
}
