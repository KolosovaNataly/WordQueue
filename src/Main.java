import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queueAttraction = new LinkedList<>(generateClients());

        while (!queueAttraction.isEmpty()) {
            Person currentPerson = queueAttraction.poll();

            int tickets = currentPerson.getTickets();

            if (tickets>0){
                System.out.println(currentPerson.getName() + "  " + currentPerson.getSurname() + " прокатился \n");

                currentPerson.setTickets(-- tickets);
                queueAttraction.offer(currentPerson);

            }
        }
        System.out.println("Билеты закончились!");
    }

    public static List<Person> generateClients() {
        List<Person> visitors = new LinkedList<>(List.of(
                new Person("Oleg", "Ivanov", 2),
                new Person("Natasha", "Sidorova", 1),
                new Person("Anatolii", "Popov", 3),
                new Person("Ira", "Kim", 2),
                new Person("Masha", "Sokolova", 1)
        ));
        return visitors;
    }
}