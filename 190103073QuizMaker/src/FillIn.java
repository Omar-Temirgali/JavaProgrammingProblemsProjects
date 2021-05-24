public class FillIn extends Question {
	public FillIn() {

	}
	public FillIn(String description, String answer) {
		super(description, answer);
	}
	public String toString() {
		String description = getDescription().replace("{blank}", "______");
		return description + "\n------------------------";
	}
}