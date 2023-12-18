package application;

import entities.ImportedProduct;
import entities.Product;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();


        for (int i = 1; i < n; i++){
            System.out.printf("Product #" + i + " data");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                price += customsFee;
                list.add(new ImportedProduct(name,price,customsFee));
            } else
                if (ch == 'u') {
                    System.out.print("Manufacture date (DD/MM/YYYY: ");

            }


        }



    }
}
