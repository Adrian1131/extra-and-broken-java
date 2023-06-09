
public class Three_D_Array {

	public static void main(String[] args) {
		char[][][] letters = new char[4][5][6];
		
		System.out.println("Size of 1st dimension: " + letters.length);
		System.out.println("Size of 2nd dimension: " + letters[1].length);
		System.out.println("Size of 3rd dimension: " + 
		letters[1][2].length);
		 int i = 0;
		 for(int x = 0; x < letters.length; x++ ) {
			for(int y = 0;  y < letters[x].length; y++) {
				for(int z = 0; z < letters[x][y].length; z++) {
					
					letters[x][y][z] = (char)(65 + i);
					i++;
				}
			}
				
		}
		 
		 for(int x = 0; x < letters.length; x++) {
				for(int y = 0;  y < letters[x].length; y++) {
					for(int z = 0; z < letters[x][y].length; z++) {
						System.out.println(letters[x][y][z] + " ");
					}
					System.out.println();
				}
					
			}
			
		}
	}