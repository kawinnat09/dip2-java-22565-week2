public class Main {

    public static void main(String[] args) {
        byte i = 10;
        short j = 100;
        int k = 1000;
        float f = 500.50f;
        double d = 100000;
        long l = 10000;

        char letter = 'a';
        boolean b = true;

        int number;
        float fval = 32.35f;
        number = (int)fval;

        int number2;
        double dval = 32.35f;
        number2 = (int)dval;

        System.out.println("Primitive Data Type!" );
        System.out.println("1.Numeric Data Type");
        System.out.print("byte i = " + i + " ");
        System.out.print("short j =" + j + " ");
        System.out.print("int k = " + k + " ");
        System.out.print("float f = " + f + " ");
        System.out.print("double d = " + d + " ");
        System.out.print("long l = " + l + " ");

        System.out.print("2.non-Numeric Data Type");
        System.out.print("char letter = " + letter + " ");
        System.out.print("boolean b = " + b + " ");

        System.out.println("3.Type Conversion (int<=float)");
        System.out.print("(int)fval = " + number + " ");
        System.out.print("(int)dval = " + number2);
    }
}