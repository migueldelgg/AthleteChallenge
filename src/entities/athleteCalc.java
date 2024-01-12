package entities;

import java.util.ArrayList;
import java.util.List;

public class athleteCalc extends athlete{
    private static final List<athlete> athleteList = new ArrayList<>();

    public athleteCalc(String name, char gender, Double height, Double weight) {
        super(name, gender, height, weight);
    }

    public double middleWeight (){
        int qnt = 0;
        int allWeight = 0;
        for(athlete c : athleteList) {
            qnt++;
            allWeight += getWeight();
        }
        return (double) allWeight / qnt;
    }
    public double menPercentage(){
        int qnt = 0;
        int mans = 0;

        for(athlete c : athleteList) {
            qnt++;
            if (c.getGender() == 'M') {
                mans += 1;
            }
        }
        return ((double) mans / qnt) * 100;
    }

    public static int qntWomen(){
        int women = 0;
        for(athlete c : athleteList) {
            if (c.getGender() == 'F') {
                women += 1;
            }
        }
        return women;
    }

    public static String womenMsg() {
        if (qntWomen() == 0) {
            return "Não há mulheres na lista";
        }
        return String.valueOf(qntWomen());
    }



}
