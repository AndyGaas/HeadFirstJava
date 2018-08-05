package ChapterOne;

public class Shuffle1 {
    public static void main(String[] args) {    //1
        int x = 3;                              //2
        while (x > 0) {

            if (x > 2) {
                System.out.print("a");          //3
            }
            x = x - 1;                      //4
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
