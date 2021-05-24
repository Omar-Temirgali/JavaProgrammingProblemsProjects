import java.util.*;
public class Test extends Question {
	private String[] options;
	private int numOfOptions;
	private ArrayList<String> labels;

	public Test() {
		labels = new ArrayList<String>();
	} 
	public Test (String description, String answer) {
		super(description, answer);
		labels = new ArrayList<String>();
	}
	public void setOptions(String[] options) {
		this.options = options;
		this.numOfOptions = options.length;
		for (int i = (int)'A'; i < numOfOptions + (int)'A'; i++) 
			labels.add((char)i + "");
	}
	public String getOptionAt (int optionAt) {
		return options[optionAt];
	}
	public int getNumOfOptions() {
		return numOfOptions;
	}
	public String toString() {
		String str = getDescription() + "\n";
		for (int i = 0; i < numOfOptions; i++) 
			str += labels.get(i) + ") " + options[i] + "\n";
		return str + "------------------------";
	}
}