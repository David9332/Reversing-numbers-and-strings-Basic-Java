 public class NumRecoursiceReverse {

    public static void main(String[] args) {
        int someNum = 22334455;
        recoursiveFunc(someNum);
    }

    public static void recoursiveFunc(int someNum) {
        if (someNum < 10) {
            System.out.print(someNum);
        } else {
            System.out.print(someNum % 10);
            recoursiveFunc(someNum / 10);
        }
    }
}
