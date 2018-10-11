public class MoneyCast{
	static int years = 65;
	static double rate = 0.06;
	static double balance = 350741.86;
	static double contribution = 0;

	public static void main(String[] args){
		System.out.printf("%5s%15s%15s%15s\n", "Year", "Interest", "Contribution", "End Balance");
		int y = 48;
		while (y <= years){
			double interest = rate*balance;
			balance += interest + contribution;
			System.out.printf("%5d%15.2f%15.2f%15.2f\n", y, interest, contribution, balance);
			y++;
		}
	}	
}