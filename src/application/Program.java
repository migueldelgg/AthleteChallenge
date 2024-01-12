package application;

import entities.Athlete;
import entities.AthleteCalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas? ");
        int qnt = sc.nextInt();

        List<AthleteCalc> athletes = new ArrayList<>();

        for (int i = 0; i<qnt; i++) {
            System.out.println("Digite os dados do atleta numero "+ (i + 1)+ ":");

            System.out.print("Nome: ");
            String name = sc.next();

            System.out.print("Sexo: ");
            char gender = sc.next().charAt(0);
            if (gender != 'M' && gender != 'F') {
                System.out.print("Digite um gênero válido: ");
                gender = sc.next().charAt(0);
            }

            System.out.print("Altura (digite no formato m.cm): ");
            double height = sc.nextDouble();

            System.out.print("Peso: ");
            double weight = sc.nextDouble();

            athletes.add(new AthleteCalc(name, gender, height, weight));
            
            System.out.println();
        }

        System.out.println("RELATÓRIO: ");
        System.out.print("Peso médio dos atletas: ");
        
        sc.close();
    }
}
