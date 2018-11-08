public class ArrayMethods3a{
	public static double average(double[] grades){
		double sum = 0.0;

		for(int i = 0; i < grades.length; i++){
			sum += grades[i];
		}

		if(grades.length > 0){
			return (sum / grades.length);
		}
		
		return -1;
	}

	public static void main(String[] args){
		double[] g = {50.0, 75.0, 100.0};
		System.out.println(average(g));
	}
}