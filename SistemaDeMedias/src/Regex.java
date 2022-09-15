
public class Regex {
	public static boolean matchesOnlyText(String text) {
	    return text.matches("[^\\d]+");
	}
	public static boolean matchesOnlyNumbers(String text) {
	    return text.matches("^[0-9]+$");
	}
}
