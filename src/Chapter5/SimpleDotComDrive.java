package Chapter5;

public class SimpleDotComDrive {
    public static void main(String[] args) {
        SimpleDotCom dotCom = new SimpleDotCom();
        int[] locations = {2, 3, 4};
        dotCom.setLocationCells(locations);
        String userGuess = "2";
        String result = dotCom.checkYourSelf(userGuess);
    }
}
