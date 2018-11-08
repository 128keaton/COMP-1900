public class StatsAnalyzer{
	public static double averagePPG(int[][] scores, int p){
		if(scores[p] != null){
			int[] scoresForPlayer = scores[p];
			double scoreSum = 0.0;

			for(int i = 0; i < scoresForPlayer.length; i++){
				scoreSum += scoresForPlayer[i];
			}
			return scoreSum / scoresForPlayer.length;
		}
		return 0.0;
	}

	public static int singleGameScore(int[][] scores, int g){
		int singleGameScore = 0;
		for(int outer = 0; outer < scores.length; outer++){
			for(int inner = 0; inner < scores[outer].length; inner++){
				// Check if the index equals the g integer (game column)
				if(inner == g){
					singleGameScore += scores[outer][inner];
				}
			}
		}
		return singleGameScore;
	}

	public static double averageGameScore(int[][] scores){
		int gameScore = 0;
		int innerCount = 0;

		for(int outer = 0; outer < scores.length; outer++){
			for(int inner = 0; inner < scores[outer].length; inner++){
				gameScore += scores[outer][inner];
				innerCount = inner;
			}
		}

		int totalDataLength = innerCount * scores.length;
		return (gameScore / totalDataLength);
	}

	public static int singleGameTopScoringPlayer(int[][] scores, int g){
		return 0;
	}

	public static void main(String[] args){
		int[][] gameData = {
			{20, 27, 16, 23, 20, 27, 18},
			{8, 18, 14, 17, 9, 12, 0},
			{38, 19, 25, 22, 19, 25, 31},
			{17, 8, 11, 21, 15, 0, 9},
			{2, 1, 3, 0, 10, 2, 4},
		};
		System.out.println("Tim the Enchanter's average points per game: " + averagePPG(gameData, 0));
		System.out.println("Game 1's total combined points: " + singleGameScore(gameData, 1));
		System.out.println("All player's average score for all games: " + averageGameScore(gameData));
	}
}