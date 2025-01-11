import models.Employee;
import models.Student;
import models.Person;
import java.util.ArrayList;
import java.util.Collections;
public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("Ержан", "Кенесов", "Менеджер", 300000));
        people.add(new Employee("Айдос", "Нургалиев", "Разработчик", 450000));
        people.add(new Student("Диас", "Жуманов", 3.9));
        people.add(new Student("Аружан", "Серикова", 2.5));
        people.add(new Student("Жанель", "Танирбергенова", 3.2));
        Collections.sort(people, (p1, p2) -> Double.compare(p2.getPaymentAmount(), p1.getPaymentAmount()));
        printData(people);
    }
    private static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " зарабатывает " + person.getPaymentAmount() + " тенге");
        }
    }
}

