public class HelloWorld { 
	public static void main(String[] args){
		String message = "Hello World.";
		String subMessage = "";

		sendConsoleMessage(message);

		if (args.length > 0){
			message = "Now, a compelling set of arguments:";

			sendConsoleMessage(message);

			for (String arg : args){
				subMessage += arg + ' ';

				String charBefore = getCharBefore(".", arg);
				sendConsoleMessage(charBefore);
				if (arg.indexOf('.') >= 0 && charBefore == " "){
					sendConsoleMessage(subMessage);
					subMessage = "";
				}
			}

			if (subMessage != "") {
				sendConsoleMessage(subMessage);
			}
		}
	}

	public static String getCharBefore(String character, String inString){
		if (inString.indexOf('.') >= 0){
			return Character.toString(inString.charAt(inString.indexOf(character) - 1));
		}
		return null;
	}

	public static void sendConsoleMessage(String args) {
		System.out.println(args);
	}
}