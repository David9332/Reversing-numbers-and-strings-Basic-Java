public class Targil2 {
    public static void main(String[] args) {
        String myString = "Shit happens";
        System.out.print(recursiveFunc(myString));
    }

    public static String recursiveFunc(String myString) {

        if (myString == null || myString.length() < 2) {
            return myString;
        }

        return recursiveFunc(myString.substring(1)) + myString.charAt(0);
    }
}
