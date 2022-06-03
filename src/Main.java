
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonManagement personManagement = new PersonManagement(scanner);

        while (true) {
            System.out.println();
            System.out.println("Was möchtest du tun?");
            System.out.println("Du kannst: add/ remove/ list/ battle Royal");
            String action = scanner.nextLine();
            if (action.equals("add")){
                personManagement.add();
                scanner.nextLine();
            }
            if (action.equals("remove")){
                personManagement.remove();
            }
            if (action.equals("list")){
                personManagement.list();
            }
            /*if (action.equals("battle Royal")) {
                personManagement.battleRoyal();
            }*/
        }
    }
}
