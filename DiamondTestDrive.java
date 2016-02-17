public class DiamondTestDrive {

	public static void main(String[] args) {
		Diamond diamond = new Diamond();
		Helper helper = new Helper();
		String height = helper.getUserInput("Enter the height of the isosceles triangle: ");
		diamond.isosceles(height);
		height = helper.getUserInput("Enter the height of the isosceles triangles in the diamond: ");
		diamond.diamond(height);
		height = helper.getUserInput("Enter the height of the isosceles triangles in the diamond: ");
		String name = helper.getUserInput("Enter your name: ");
		diamond.diamondName(height, name);
	}
}