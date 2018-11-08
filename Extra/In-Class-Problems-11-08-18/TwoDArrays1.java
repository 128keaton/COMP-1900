// 2 1 1 2D array syntax
public class TwoDArrays1 {
	// Write a method that prints a visual representation of a maze.
	// The maze is represented as a 2D array of integers, where 0 is
	//  an open space and 1 is a wall.  The method should print a .
	//  for open spaces and a capital X for walls.  Also print a |
	//  at the beginning and end of each row.
	public static void printMaze(int[][] data) {
		for(int outer = 0; outer < data.length; outer++){
			System.out.print("|");
			for(int inner = 0; inner < data[outer].length; inner++){
				if(data[outer][inner] == 0){
					System.out.print(".");
				}else if(data[outer][inner] == 1){
					System.out.print("X");
				}
			}
			System.out.println("|");
		}
	}

	// Running the main method should print this:
	// |.XXX|
	// |..X.|
	// |X.X.|
	// |....|
	public static void main(String[] args) {
		int[][] data = {	{0, 1, 1, 1},
							{0, 0, 1, 0},
							{1, 0, 1, 0},
							{0, 0, 0, 0}	};

		printMaze(data);
	}
}
