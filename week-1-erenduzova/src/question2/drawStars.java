package question2;

public class drawStars {

	public static void main(String[] args) {

		// Height value for shapes
		int height = 5;

		// Call methods with height as input
		leftShape(height);
		rightShape(height);

	}

	// Method for Left Shape
	public static void leftShape(int height) {
		// sol
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	// Method for Right Shape
	public static void rightShape(int height) {

		for (int i = 1; i <= height; i++) {
			for (int j = height; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
