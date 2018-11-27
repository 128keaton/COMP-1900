// Analyzes an array containing player score data and prints out specs of different players, their scores, game averages, etc
public class StatsAnalyzer{

	// Returns the average points per game for a defined player 'p'
	public static double averagePPG(int[][] scores, int p){
		if(scores[p] != null){
			int[] scoresForPlayer = scores[p];
			double scoreSum = 0.0;
			// Loops thru the scores for a player and adds them together
			for(int i = 0; i < scoresForPlayer.length; i++){
				scoreSum += scoresForPlayer[i];
			}

			return Math.round((scoreSum / scoresForPlayer.length) * 100.0) / 100.0;
		}

		return 0.0;
	}

	// Returns a single game's total team score, game is given as 'g'
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

	// Returns the average team score for all games
	public static double averageGameScore(int[][] scores){
		int gameScore = 0;
		int innerCount = 0;

		// Loops through all of the scores, gets the length of all of the data, and adds all the scores together
		for(int outer = 0; outer < scores.length; outer++){
			for(int inner = 0; inner < scores[outer].length; inner++){
				gameScore += scores[outer][inner];
				innerCount = inner;
			}
		}

		return (gameScore / (innerCount + 1));
	}

	// Returns the player who scored the highest for a given game 'g'
	public static int singleGameTopScoringPlayer(int[][] scores, int g){
		int gameScoreToBeat = 0;
		int topScoringPlayerIndex = 0;

		for(int playerIndex = 0; playerIndex < scores.length; playerIndex++){
			int gameScore = scores[playerIndex][g];
			// Check if the game score is higher than the top score
			if(gameScore > gameScoreToBeat){
				gameScoreToBeat = gameScore;
				topScoringPlayerIndex = playerIndex;
			}
		}

		return topScoringPlayerIndex;
	}

	public static void main(String[] args){
		int[][] gameData = {
			{20, 27, 16, 23, 20, 27, 18},
			{8, 18, 14, 17, 9, 12, 0},
			{38, 19, 25, 22, 19, 25, 31},
			{17, 8, 11, 21, 15, 0, 9},
			{2, 1, 3, 0, 10, 2, 4},
		};

		System.out.println("Catherine the Great's average points per game: " + averagePPG(gameData, 2));
		System.out.println("Game 1's total combined points: " + singleGameScore(gameData, 0));
		System.out.println("All player's average score for all games: " + averageGameScore(gameData));
		System.out.println("Index of top scoring player in game 2: " + singleGameTopScoringPlayer(gameData, 2));
	}
}