public class NumReverse {
    public static void main(String[] args) {
        int someNum = 22334455;
        while (someNum > 9) {
            System.out.print(someNum % 10);
            someNum = someNum / 10;
        }
        System.out.println(someNum);
    }


}
