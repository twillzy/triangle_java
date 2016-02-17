public class TriangleTestDrive {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.printOneAsterisk();

		Helper helper = new Helper();
		String length = helper.getUserInput("Enter the length of the horizontal line: ");
		triangle.drawHorizontalLine(length);

		length = helper.getUserInput("Enter the length of the vertical line: ");
		triangle.drawVerticalLine(length);

		String height = helper.getUserInput("Enter the height of the right triangle: ");
		triangle.drawRightTriangle(height);
	}
}