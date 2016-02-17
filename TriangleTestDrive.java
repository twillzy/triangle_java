public class TriangleTestDrive {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		triangle.printOneAsterisk();

		TriangleHelper triangleHelper = new TriangleHelper();
		String length = triangleHelper.getUserInput("Enter the length of the horizontal line: ");
		triangle.drawHorizontalLine(length);

		length = triangleHelper.getUserInput("Enter the length of the vertical line: ");
		triangle.drawVerticalLine(length);
		
		String height = triangleHelper.getUserInput("Enter the height of the right triangle: ");
		triangle.drawRightTriangle(height);
	}
}