import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {

		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		
//		arr[3] = arr [4];
//		arr[4] = arr [5];
//		arr[5] = arr [6];
		
		
		//살제되는 값을 기준으로 뒤에 있는 갑슬 한칸씩 땡기는 작업.
		//추후에 생성될 새 배열에 값을 그대로 디입할 때 편하게 대입하려고
		for (int i=3; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		//기존의 배열보다 크기가 하나 작은 세 배열 생성.
		int[] temp =new int[arr.length-1];
				for(int j=0; j<temp.length; j++) {
					temp[j] = arr[j];
					
				}
				
//				System.out.println(arr);
//				System.out.println(temp);
				
				arr = temp; //temp 배열의 주소값을 arr에게 넘긴다.
				temp = null; //주소값을 지워서 메모리에서 temp는 자동 소멸되게 됩니다.
		
		//원본 배열의 값을 새 배열에 인덱스 맞춰서 그대로 입히기.
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
