package OOP;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("******************** DUOTECH BANK ACCOUNT MANAGEMENT APPLICATION ********************");
        System.out.println("-------------------------------------------------------------------------------------");

        // application logic here
        Scanner dora = new Scanner(System.in);
        String str;
        do {
            System.out.println("Please enter the name of the file to load: ");
            String file = dora.nextLine();
            int list=scan.nextInt();
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("All the information has been loaded and account are being generated..");
            System.out.println("-------------------------------------------------------------------------------------");
            for (int i=0;i<list;i++)
                System.out.println("Here's the list of bank accounts that have been created: "+(i+1));
            System.out.println("-------------------------------------------------------------------------------------");
            scan.nextLine();
            List<String[]> result = Utility.readFromCSV(file);
            String[] name2 = result.get(1);
            String name = "";
            String ssn = "";
            String accountType = "";
            double balance;
            name = name2[0];
            ssn = name2[1];
            accountType = name2[2];
            balance = Double.parseDouble(name2[3]);

            if (accountType.equals("Checking")) {
                Checking checking = new Checking(name, ssn, balance);
                System.out.println(checking.showInfo());
            }
            if (accountType.equals("Savings")) {
                Savings savings = new Savings(name, ssn, balance);
                System.out.println(savings.showInfo());
            }
//            System.out.println(name);
//            System.out.println(ssn);
//            System.out.println(accountType);
//            System.out.println(balance);
            System.out.println("Would you like to load another file (y/n): ");
            str = dora.nextLine();
        } while (!str.equalsIgnoreCase("No"));

    }
}