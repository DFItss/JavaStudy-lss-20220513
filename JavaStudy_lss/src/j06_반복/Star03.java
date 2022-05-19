package j06_반복;

public class Star03 {

	public static void main(String[] args) {
		
		/* 
		 * 숙제3>
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********      
		 */
		
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<(2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
