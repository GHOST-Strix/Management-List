
import java.util.*;

//todo battle royale feature (later)
//todo sortierung von liste
public class PersonManagement {
    private final List<Person> personList = new ArrayList<>();
    private final Scanner scanner;
    public PersonManagement(Scanner scanner) {
        this.scanner = scanner;
    }

    public void add() {
        int age = -1;

        System.out.print("Gib deinen Namen ein : ");
        String firstName = scanner.nextLine();
        System.out.print("Gib deinen Nachnamen ein :");
        String lastName = scanner.nextLine();

        System.out.println("Hallo " + firstName + " " + lastName);
        System.out.print("Gib deinen Alter :");


        boolean ageEntered = false;

        while (!ageEntered) {
            try {
                age = scanner.nextInt();
                ageEntered = true;
            } catch (InputMismatchException ex) {
                System.out.println("Du hast keine Zahl verwendet, versuche nochmal.");
                System.out.print("Gib deinen Alter :");
                scanner.nextLine();

            }
        }
        System.out.println("Danke");
        personList.add(new Person (firstName, lastName, age));
        System.out.println(personList.size() + " Person(en) gespeichert");
    }

    public void remove() {
        System.out.println("Wen möchtest du löschen?");
        int number = scanner.nextInt();
        personList.remove(number - 1);
    }

    public void list() {

      //  System.out.println(personList.size() + " Person(en):");
        System.out.printf("%s Person(en):\n", personList.size());
        System.out.printf("%s %-18s %-18s %-18s\n", "Index", "Vorname", "Nachname", "Alter");
        for (Person person : personList)
        System.out.printf("%-5s %s\n", personList.indexOf(person) + 1, person);
    }
   // public void battleRoyal() {
     //   System.out.println("not yet implemented");
   // }
}
