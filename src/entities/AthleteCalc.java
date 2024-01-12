package entities;

import java.util.ArrayList;
import java.util.List;

public class AthleteCalc extends Athlete {
    private static final List<Athlete> ATHLETE_LIST = new ArrayList<>();

    public AthleteCalc(String name, char gender, Double height, Double weight) {
        super(name, gender, height, weight);
    }

    public AthleteCalc() {

    }

    public double middleWeight (){
        int qnt = 0;
        int allWeight = 0;
        for(Athlete c : ATHLETE_LIST) {
            qnt++;
            allWeight += getWeight();
        }
        return (double) allWeight / qnt;
    }

    public String higher(){
        double higher = 0;
        for(Athlete c : ATHLETE_LIST) {
            higher = c.getHeight();
            String higherName = c.getName();

            if (c.getHeight() > higher) {
                return c.getName();
            }
            else {
                return higherName;
            }
        }
        return null;
    }
    public double menPercentage(){
        int qnt = 0;
        int mans = 0;

        for(Athlete c : ATHLETE_LIST) {
            qnt++;
            if (c.getGender() == 'M') {
                mans += 1;
            }
        }
        return ((double) mans / qnt) * 100;
    }

    public static int qntWomen(){
        int women = 0;
        for(Athlete c : ATHLETE_LIST) {
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
    @Override
    public String toString(){
        return "Peso médio dos atletas: " +
                String.format("%.2f", middleWeight()) + "\n" +
                "Atleta mais alto: " +
                higher() + "\n" +
                "Porcentagem de homens: " +
                String.format("%.2f%%", menPercentage()) + "\n";
    }

}
