
public class StringLength {

    public static void main(String[] args) {

        String inp = "shubhamgupta";
        normalMethod(inp);
        // and without using Length Inbuilt Method.
        usingRecursion(inp);

    }

    public static void normalMethod(String inp) {

        int count = 0;

        // substring
        System.out.println(inp.substring(1));

        for (int i = 0; i < inp.length(); i++) {
            count += 1;
        }
        System.out.print("Length using normal method   : ");
        
        System.out.println(count);
    }
    
    public static void usingRecursion(String inp) {

        int count = getLength(inp);

        System.out.println("Length of the string using Recursion : " + count);
    }

    public static int getLength(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        } else {
            return 1 + getLength(str.substring(1));
        }
    }
}
