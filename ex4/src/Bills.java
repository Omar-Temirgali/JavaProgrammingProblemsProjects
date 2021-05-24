import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Плата за электроэнергию - 16,53 тг/кВт*час");
        System.out.print("Введите снятие показаний ");
        double killowats = input.nextDouble();

        double haveToPay = killowats * 16.53;
        System.out.println("Вы должны оплатить " + (float)haveToPay + " тг за услуги электроэнергии" );

    }
}