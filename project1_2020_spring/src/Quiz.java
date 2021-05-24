public class Quiz {
    private String name;
    private java.util.ArrayList questions;

    public Quiz() {

    }
    public void setName(String name) {
        this.name = name;
    }
    //public String getName() {

    //}
    public void addQuestion(Question question) {

    }
    //public static Quiz loadFromFile(String file) {

    //}
    //public String toString() {

    //}
    public void start() {

    }
    public static Quiz loadFromFile(String filename) throws InvalidQuizFormatException {
        Quiz quiz = new Quiz();
        quiz.setName(filename.replace(".txt", ""));
        return quiz;
    }
}
