public class FirstApp {
    public static void main(String[] args) {
       byte myByte = 127;
       short myShort = 32767;
       int myInt = 2147483647;
       long myLong = 9223372036854775807L;
       float myFloat = 22.4f;
       double myDouble = 11.2;
       char myChar = 'A';
       boolean myBool = true;
       String myString = "Somebody once told me";
       System.out.println(SimpleCalc(1,1,1,1));
       InRange(10, 10);
       System.out.println(myByte);
       System.out.println(myShort);
       System.out.println(myLong);
       System.out.println(myInt);
       System.out.println(myFloat);
       System.out.println(myChar);
       System.out.println(myBool);
       System.out.println(myString);
       System.out.println(myDouble);
    }
    public static float SimpleCalc(int a,int b,int c,int d){
        float result;
        result = a * (b + (c / d));
        return result;
    }
    public static void InRange(int a, int b){
        boolean isInRange = ((a + b) >= 10 && (a + b) <= 20);
        System.out.println(isInRange ? "Входит в диапазон" : "Не входит в диапазон");
        if ((a + b) >= 10 && (a + b) <= 20){
            System.out.println("Входит в диапазон");
        } else {
            System.out.println("Не входит в диапазон");
        }
    }
}
