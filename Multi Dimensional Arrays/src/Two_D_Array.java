
public class Two_D_Array {

	public static void main(String[] args) {
		char[][] letters = {{'P', 'H','?', '$'},
				            {'D', 'F','&', 'b'},
				            {'7','+','K', 'M'}
				
		                    };
		
		System.out.println("Size of first dimension: " + letters.length);
		System.out.println("Size of first dimension: " + 
		      letters[1].length);
		
		for(int x = 0; x < letters.length; x++) {
			for(int y = 0;  y < letters[x].length; y++) {
				System.out.print(letters[x][y] + " ");
			}
			System.out.println();
		}
	}

}
