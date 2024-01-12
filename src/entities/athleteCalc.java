package entities;

import java.util.ArrayList;
import java.util.List;

public class athleteCalc extends athlete{
    private List<athlete> athleteList = new ArrayList<>();

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

    public double higher(){
        double higher = 0;

        for(athlete c : athleteList) {
            if (c.getHeight() > higher) {
                higher = c.getHeight();
            }
        }
        return higher;
    }



}
