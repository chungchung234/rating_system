package Main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        loop:while (true){
            System.out.println("Menu \n1.Add\n2.Delete\n3.Search\n4.Modify\n5.All_data\n7.Exit");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    Restaurant.add();
                    break;
                case 2:
                    Restaurant.delete();
                    break;
                case 3:
                    Restaurant.search();
                    break;
                case 4:
                    Restaurant.modify();
                    break;
                case 5:
                    Restaurant.all_data();
                    break;
                case 7:
                    scanner.close();
                    break loop;
            }

        }
    }
}
