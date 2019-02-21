package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		int num = 0;	//초기값 저장
		int max = 0;	//최대값 저장
		int a=0, b=0;	//인덱스 저장
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j=i+1; j < arr.length; j++) {
				num = arr[i] * arr[j];
				if(num > max) {
					max = num;
					a = i;
					b = j;
				}
				
			}//for end
			
		}//for end
		System.out.println("["+arr[a]+","+arr[b]+"]");
	}
}
