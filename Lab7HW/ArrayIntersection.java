// Loops through two arrays to find common elements

public class ArrayIntersection{
	final static int[] FRIEND_LIST_ONE = {5, 3, 1, 4};
	final static int[] FRIEND_LIST_TWO = {6, 10, 3, 7, 5};

	static String commonFriends = "";
	static int commonFriendsCount = 0;

	public static void main(String[] args){
		// Loop through the first friend list to get friend IDs
		for(int i = 0; i < FRIEND_LIST_ONE.length; i++){
			int friendID = FRIEND_LIST_ONE[i];
			// If the friend ID is in the second list
			if(hasFriendIDInList(friendID, FRIEND_LIST_TWO)){

				// Initialization of our string
				if(commonFriends == ""){
					commonFriends = String.valueOf(friendID);
				}else{
					commonFriends += " " + friendID;
				}
				commonFriendsCount++;
			}
		}

		// If we have common friends, show them
		if(commonFriendsCount > 0){
			System.out.println("Here are the common friend IDs found: " + commonFriends);
			System.out.println("Total common elements: " + commonFriendsCount);
		}else{
			System.out.println("No common friends");
		}
	}

	// Checks if friend list contains a friend ID, returns true if the case
	public static Boolean hasFriendIDInList(int friendID, int[] friendList){
		// Loop through
		for(int i = 0; i < friendList.length; i++){
			// If the ID is a match, we gucci
			if(friendID == friendList[i])
				return true;
		}
		return false;
	}
}