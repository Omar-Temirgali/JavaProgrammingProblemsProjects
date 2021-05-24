public class chapter_1 {
    public static void main(String[] args) {
        //ex 1.1
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
        //ex 1.2
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        //ex 1.3
        System.out.println("    J     A     V     V     A");
        System.out.println("    J    A A     V   V     A A");
        System.out.println("J   J   AAAAA     V V     AAAAA");
        System.out.println(" J J   A     A     V     A     A");
        //ex 1.4
        System.out.println("a    a^2   a^3");
        System.out.println("1    1     1");
        System.out.println("2    4     8");
        System.out.println("3    9     27");
        System.out.println("4    16    64");
        //ex 1.5
        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
        //ex 1.6
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
        //ex 1.7
        System.out.println(4.0 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
        System.out.println(4.0 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
        //ex 1.8
        System.out.println(5.5 * 5.5 * 3.14);
        //ex 1.9
        System.out.println(4.5 * 7.9);
        //ex 1.10
        System.out.println((14.0 / 1.6) / (45.5 / 60));
        //ex 1.11
        int firstYear = 312032486 + (365 * 24 * 60 * 60)/7 - (365 * 24 * 60 * 60)/13 + (365 * 24 * 60 * 60)/45;
        int secondYear = firstYear + (365 * 24 * 60 * 60)/7 - (365 * 24 * 60 * 60)/13 + (365 * 24 * 60 * 60)/45;
        int thirdYear = secondYear +(365 * 24 * 60 * 60)/7 - (365 * 24 * 60 * 60)/13 + (365 * 24 * 60 * 60)/45;
        int fourthYear = thirdYear + (365 * 24 * 60 * 60)/7 - (365 * 24 * 60 * 60)/13 + (365 * 24 * 60 * 60)/45;
        int fifthYear = fourthYear + (365 * 24 * 60 * 60)/7 - (365 * 24 * 60 * 60)/13 + (365 * 24 * 60 * 60)/45;
        System.out.println("Current year: " + 312032486);
        System.out.println("First year: " + firstYear);
        System.out.println("Second year: " + secondYear);
        System.out.println("Third year: " + thirdYear);
        System.out.println("Fourth year: " + fourthYear);
        System.out.println("Fifth year: " + fifthYear);
        //ex 1.12
        System.out.println((24 * 1.6) / (1.0 + (40 + 35.0/60) /60 ));
        //ex 1.13
        System.out.println("x = " + ((44.5 * .55 - 50.2 * 5.9)/(3.4 * .55 - 50.2 * 2.1)));
        System.out.println("y = " + ((3.4 * 5.9 - 44.5 * 2.1)/(3.4 * .55 - 50.2 * 2.1)));
    }
}
