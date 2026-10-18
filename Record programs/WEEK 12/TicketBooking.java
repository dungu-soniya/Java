
package recordprograms;

class TicketCounter
{
    private int seats = 10;

    public synchronized void bookTicket(String name, int count)
    {
        System.out.println(name + " requested " + count + " tickets.");

        if (count <= seats)
        {
            seats = seats - count;

            System.out.println("Booking successful for " + name);
            System.out.println("Tickets booked: " + count);
            System.out.println("Seats remaining: " + seats);
        }
        else
        {
            System.out.println("Booking failed for " + name);
            System.out.println("Not enough seats available.");
        }
    }
}

class Customer extends Thread
{
    TicketCounter counter;
    int tickets;

    Customer(TicketCounter counter, String name, int tickets)
    {
        super(name);
        this.counter = counter;
        this.tickets = tickets;
    }

    public void run()
    {
        counter.bookTicket(getName(), tickets);
    }
}

public class TicketBooking
{
    public static void main(String[] args) throws InterruptedException
    {
        TicketCounter counter = new TicketCounter();

        Customer c1 = new Customer(counter, "Ravi", 4);
        Customer c2 = new Customer(counter, "Priya", 3);
        Customer c3 = new Customer(counter, "Rahul", 5);

        c1.start();
        c2.start();
        c3.start();

        c1.join();
        c2.join();
        c3.join();

        System.out.println("Ticket booking completed.");
    }
}
