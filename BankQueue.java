import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {
    public static void main(String[] args) {
        BankQueue queue = new BankQueue();
        queue.addCustomer("Khabib");


        System.out.println(queue.serveCustomer());
        System.out.println(queue.hasCustomers());

    }
    private Queue<String> queue;


    public BankQueue() {
        queue = new LinkedList<>();
    }


    public void addCustomer(String name) {
        queue.add(name);
    }


    public String serveCustomer() {
        return queue.poll();
    }


    public boolean hasCustomers() {
        return !queue.isEmpty();
    }


}

