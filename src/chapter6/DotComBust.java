package chapter6;

import chapter5.DotCom;
import chapter5.GameHelper;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList= new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель потопить 3 \"сайта\".");
        System.out.println("...");
        System.out.println("Попытайтесь потопить их за минимальное количестпо ходов.");

        for (DotCom dotComToSet : dotComsList) {

        }
    }
}
