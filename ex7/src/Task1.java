import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ST<String, Double> grades = new ST<String, Double>();
        grades.put("A", 4.0);
        grades.put("A-", 3.67);
        grades.put("B+", 3.33);
        grades.put("B",  3.0);
        grades.put("B-", 2.67);
        grades.put("C+", 2.33);
        grades.put("C", 2.0);
        grades.put("C-", 1.67);
        grades.put("D+", 1.33);
        grades.put("D", 1.0);
        grades.put("FX", 0.0);
        grades.put("F", 0.0);
        grades.put("FC", 0.0);

        String[] listOfGrades = in.nextLine().toUpperCase().split("\\s+");
        double total = 0.0;
        for (String grade : listOfGrades) {
            double value = grades.get(grade);
            total += value;
        }
        double gpa = total / listOfGrades.length;
        System.out.println("GPA = " + gpa);
    }
}
