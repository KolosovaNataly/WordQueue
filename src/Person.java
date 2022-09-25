public class Person {
    private String name;
    private String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    public int alreadyRide() {
        if (tickets > 0) {
            return this.tickets--;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getTickets() {
        return tickets;

    }

    public void setTickets (int tickets){
        this.tickets = tickets;

    }
}
