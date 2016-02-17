public class Triangle {

	public void printOneAsterisk () {
		System.out.println("*");
	}

	public void drawHorizontalLine(String length) {
		int n = Integer.parseInt(length);
		while (n > 0) {
			System.out.print("*");
			n--;
		}
		System.out.println("");
	}

	public void drawVerticalLine(String length) {
		int n = Integer.parseInt(length);
		while (n > 0) {
			System.out.println("*");
			n--;
		}
	}

	public void drawRightTriangle(String height) {
		int n = Integer.parseInt(height);
		int j = n + 1;
		while (n > 0) {
			for(int m = 0; m < j - n; m++) {
				System.out.print("*");
			}
			n--;
			System.out.println("");
		}
	}
}