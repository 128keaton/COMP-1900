// 2 1 1 Arrays and methods
public class ArrayMethods3 {
	// Complete this method, which should compute and return the average
	//  grade in the grades array, *omitting the lowest grade*.
	// For example, if grades contains {90.0, 80.0, 100.0}, calling
	//  averageWithoutLowest(grades) should return (90.0 + 100.0) / 2 = 95.0
	public static double averageWithoutLowest(double[] grades) {
		double lowestGrade = grades[0];
		double gradeSum = 0.0;

		for(int i = 0; i < grades.length; i++){
			if(grades[i] < lowestGrade){
				lowestGrade = grades[i];
			}
			gradeSum += grades[i];
		}

		return ((gradeSum - lowestGrade) / (grades.length - 1));
	}

	public static void main(String[] args){
		double[] grades = {90.0, 80.0, 100.0};
		System.out.println(averageWithoutLowest(grades));

		double[] moreGrades = {65.0, 75.0, 85.0};
		System.out.println(averageWithoutLowest(moreGrades));
	}
}
