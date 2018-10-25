public class BasicArrays1{
	public static void main(String[] args){
		int[] x = {18, 90, 13, 283, 22};
		for(int i = (x.length - 1); i >= 0; i--){
			if(i == 0){
				System.out.println(x[i]);
			}else{
				System.out.print(x[i] + ", ");
			}
		}
	}
}