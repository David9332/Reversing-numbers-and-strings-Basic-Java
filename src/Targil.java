public class Targil {
    public static void main(String[] args) {
        String myString = "a b c d e f g";
        reverse(myString);
    }

    public static void reverse(String myString) {
        char letters[] = new char[myString.length()];
//        int arr[] = new int[5];
        int pointer = 0;
        for (int i = myString.length() - 1; i >= 0; i -= 1) {
            letters[i] = myString.charAt(pointer);
            pointer+=1;
        }

        for ( int i=0 ; i <= letters.length-1 ; i+=1){
            System.out.print(letters[i])
        }
    }

}
