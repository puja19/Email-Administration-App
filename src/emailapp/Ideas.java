package emailapp;

public class Ideas {

	public static void main(String[] args) {

		int height = 8; // Adjust height as needed
		int width = 5;

		// Top of the dustbin
		for (int i = 0; i < width; i++) {
			System.out.print("/");
		}
		System.out.println("\\");

		// Body of the dustbin
		for (int i = 0; i < height; i++) {
			System.out.print("|");
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}

		// Bottom of the dustbin
		for (int i = 0; i < width; i++) {
			System.out.print("_");
		}
		System.out.println();
	}

}
