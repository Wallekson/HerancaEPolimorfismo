package application;

import entities.Company;
import entities.Individual;
import entities.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        List<Tax> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
               if (healthExpenditures > 0){
                   healthExpenditures = healthExpenditures / 2;
               }
                list.add(new Individual(name,annualIncome,healthExpenditures));
            }
            if (ch == 'c'){
                System.out.print("Number of employees: ");
                int numberEmployees =sc.nextInt();

                list.add(new Company(name,annualIncome,numberEmployees));
            }

        }
    }
}
