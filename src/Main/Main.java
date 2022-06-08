package Main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        loop:while (true){
            System.out.println("Menu\t\t\t\tDescription" +
                    "\n1.Add\t\t\t\tAdd Your Favorite Restaurant" +
                    "\n2.Delete\t\t\tDelete Restaurant From Data" +
                    "\n3.Search\t\t\tSearch Restaurant Info To Name" +
                    "\n4.Modify\t\t\tModify Restaurant Info" +
                    "\n5.All_data\t\t\tAll Restaurant Info Sort By Rating" +
                    "\n6.Pick_Me_One\t\tPick Random Restaurant" +
                    "\n7.Exit");
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
                case 6:
                    Restaurant.pick_Me_One();
                case 7:
                    scanner.close();
                    System.out.println("Thank You~!");
                    break loop;
            }

        }
    }
}
