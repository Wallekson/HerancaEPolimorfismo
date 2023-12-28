package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();


        for (int i = 1; i < n; i++){
            System.out.printf("Product #" + i + " data");
            System.out.print("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            if (ch == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                price += customsFee;
                list.add(new ImportedProduct(name,price,customsFee));
            } else
                if (ch == 'u') {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Price: ");
                    Double price = sc.nextDouble();
                    System.out.print("Manufacture date (DD/MM/YYYY: ");
                    String manufacturedDate = sc.nextLine();
                    list.add(new UsedProduct(name,price, sdf.format(manufacturedDate)));


            }


        }



    }
}
