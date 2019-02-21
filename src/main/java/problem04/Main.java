package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		 
		int arr[] = {11,12,11,11,12,11,12,11,12,12,11,12,11,12,12,11,12,11,12, 11};
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = r.nextInt(4)+1;
		int count = 0;
		
		System.out.println("스페이스나 엔터를 눌러주세요");
		String response = scan.nextLine();
		if(response.isEmpty()) {
			if(arr[num]==12) {
				
			}
			
		}
		
		
		 
		
		 
	}
	  
}
