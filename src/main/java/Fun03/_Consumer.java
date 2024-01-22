package Fun03;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "345456");
        //Consumer Functional interface.
        //is like a void function.
        greetCustomerConsumer.accept(maria);
        generateNumber.accept(3);
        addAndMultiply.accept(2, 10);

        //Biconsumer

    }

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName +
            " your phone: " + customer.customerPhone);

    static Consumer<Integer> generateNumber = x -> System.out.println(x + 1);

    static BiConsumer<Integer, Integer> addAndMultiply = (x, y) -> System.out.println((x + 1) * y);


    static class Customer {
        private final String customerName;
        private final String customerPhone;

        public Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
