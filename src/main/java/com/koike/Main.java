package com.koike;

import java.util.ArrayList;
import java.util.List;

import static javax.management.Query.or;

public class Main {
    public static void main(String[] args) {
        BoxingData boxing1 = new BoxingData("寺地拳四朗", "ライトフライ級", 6);
        BoxingData boxing2 = new BoxingData("山中慎介", "バンダム級", 12);
        BoxingData boxing3 = new BoxingData("長谷川穂積", "バンダム級", 11);
        BoxingData boxing4 = new BoxingData("畑山隆則", "スーパーフェザー級", 1);
        BoxingData boxing5 = new BoxingData("辰吉丈一郎", "バンダム級", 3);
        BoxingData boxing6 = new BoxingData("井上拓真", "バンダム級", 0);

        List<BoxingData> boxingList = new ArrayList<>();
        boxingList.add(boxing1);
        boxingList.add(boxing2);
        boxingList.add(boxing3);
        boxingList.add(boxing4);
        boxingList.add(boxing5);
        boxingList.add(boxing6);

        for (BoxingData boxing : boxingList) {
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





