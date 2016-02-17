public class Diamond {

	public void isosceles(String height) {
		int n = Integer.parseInt(height);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void diamond(String height) {
		Diamond d = new Diamond();
		d.isosceles(height);
		int n = Integer.parseInt(height);
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * (n - 1) - 2 * i - 1; k++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public void diamondName(String height, String name) {
		int n = Integer.parseInt(height);
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println(name);

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * (n - 1) - 2 * i - 1; k++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}