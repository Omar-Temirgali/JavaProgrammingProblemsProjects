import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) throws HexFormatException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String hex = in.nextLine();
        System.out.println("The decimal is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            if (!(ch >= 'A' && ch <= 'F') && !(ch >= '0' && ch <= '9')) {
                throw new HexFormatException("Characters must be hexadecimal symbols (0-9, A-F)");
            }
        }

        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }
}
