package chapter5;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom simpleDotCom = new DotCom();
        int randomNum = (int) Math.random() * 5;
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        simpleDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Введите число");
            String result = simpleDotCom.checkYourSelf(guess);
            numOfGuesses++;

            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}
