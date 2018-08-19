package chapter5;

public class SimpleDotComDrive {
    public static void main(String[] args) {
        DotCom dotCom = new DotCom();
        int[] locations = {2, 3, 4};
        dotCom.setLocationCells(locations);
        String userGuess = "2";
        String result = dotCom.checkYourSelf(userGuess);
    }
}
