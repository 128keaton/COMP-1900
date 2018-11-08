// 2 1 1 Arrays and methods
public class ArrayMethods3b {
	// Complete this method, which should compute and return the lowest
	//  grade in the grades array.
	public static double lowest(double[] grades) {
		double lowestGrade = grades[0];

		for(int i = 0; i < grades.length; i++){
			if(grades[i] < lowestGrade){
				lowestGrade = grades[i];
			}
		}

		return lowestGrade;
	}

	public static void main(String[] args){
		double[] grades = {90.0, 80.0, 100.0};
		System.out.println(lowest(grades));

		double[] moreGrades = {65.0, 75.0, 85.0};
		System.out.println(lowest(moreGrades));
	}
}
