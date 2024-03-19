package com.koike;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boxer boxing1 = new Boxer("寺地拳四朗", "ライトフライ級", 6);
        Boxer boxing2 = new Boxer("山中慎介", "バンダム級", 12);
        Boxer boxing3 = new Boxer("長谷川穂積", "バンダム級", 11);
        Boxer boxing4 = new Boxer("畑山隆則", "スーパーフェザー級", 1);
        Boxer boxing5 = new Boxer("辰吉丈一郎", "バンダム級", 3);
        Boxer boxing6 = new Boxer("井上拓真", "バンダム級", 0);

        List<Boxer> boxingList = new ArrayList<>();
        boxingList.add(boxing1);
        boxingList.add(boxing2);
        boxingList.add(boxing3);
        boxingList.add(boxing4);
        boxingList.add(boxing5);
        boxingList.add(boxing6);

        for (Boxer boxing : boxingList) {
            switch (boxing.getWeight()) {
                case "ライトフライ級":
                    System.out.println(boxing.getName() + "は、超軽量級です");
                    break;
                case "スーパーフェザー級":
                    System.out.println(boxing.getName() + "は、軽量量級です");
                    break;
                case "バンダム級":
                    switch (boxing.getDefense()) {
                        case 0:
                            System.out.println(boxing.getName() + "は、新王者になったばかりです");
                            break;
                        case 3:
                            System.out.println(boxing.getName() + "は、なにわのジョーです");
                            break;
                        case 11:
                            System.out.println(boxing.getName() + "は、スーパー王者です");
                            break;
                        case 12:
                            System.out.println(boxing.getName() + "は、スーパー王者です");
                            break;
                    }
            }
        }
    }
}





