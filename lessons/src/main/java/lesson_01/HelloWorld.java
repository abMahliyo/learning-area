package lesson_01;

public class HelloWorld {

    static String randomString = "Starting to print";

    static final double PI = 3.1415929;

    public static void main(String[] args) {
        System.out.println("Hello World");

        int integerOne = 22;
        int integerTwo = integerOne + 1;
        // integerTwo =
        //    integerOne
        //    + 3
        System.out.println(integerTwo);

        // Primitive Types
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2147483647;
        long bigLong = 9223372036854775807L;
        float bigFloat = 3.14F;
        double bigDouble =  3.1234567890D;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;
        char randomChar = 65;
        char anotherChar = 'A';
        System.out.println(randomChar);

        // chars also contain escaped characters
        char backSpace = '\b';
        char formFeed = '\f';
        char lineFeed = '\n';
        char carriageReturn = '\r';
        char horizontalTab = '\t';
        char doubleQuote = '\"';
        char singleQuote = '\'';
        char backSlash = '\\';

        String randomStr = "I'm just a random";
        String anotherString = "string";

        String combinedString = randomStr + ' ' + anotherString;
        System.out.println(combinedString);

        // convert any other type to a string
        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigShort);
        String intString = Integer.toString(bigInt);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);
        String charString = Character.toString(randomChar);
        System.out.println(charString);

        // char is a primitive data type
        // System.out.println(randomChar.getClass());

        // string is an object
        System.out.println(charString.getClass());

        double aDoubleValue = 3.1456789;
        int doubleToInt = (int) aDoubleValue;
        System.out.println(doubleToInt);

        // (float) & (boolean) & (char) don't work

        // parseInt - convert a string into an integer
        int stringToInt = Integer.parseInt(intString);

        // parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean

    }
}
