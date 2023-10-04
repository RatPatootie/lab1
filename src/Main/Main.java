package Main;

import Customer.Customer;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[7];
        customers[0] = new Customer(0, "Piko", "Pit", "Piterichtic", "lviv/lviv region/Ukraine", 1234123412341234L, 100);
        customers[1] = new Customer(1, "Pito", "John", "Piradichtic", "lviv/lviv region/Ukraine", 1234512345123451L, -100);
        customers[2] = new Customer(2, "Piro", "Pit", "Pirorichtic", "Kyiv/Kyiv region/Ukraine", 1234561234561234L, 400);
        customers[3] = new Customer(3, "Tiko", "Alex", "Titerichtic", "lviv/lviv region/Ukraine", 1234123412341232L, -200);
        customers[4] = new Customer(4, "Riko", "Pit", "Riterichtic", "Kyiv/Kyiv region/Ukraine", 1234123412341233L, 600);
        customers[5] = new Customer(5, "Biko", "Jimmy", "Biterichtic", "lviv/lviv region/Ukraine", 1234123412341235L, -500);
        customers[6] = new Customer(6, "Liko", "Elliot", "Literichtic", "lviv/lviv region/Ukraine", 1234123412341239L, 300);

        System.out.println("масив всіх об'єктів");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println();
        System.out.println("вивід користувачів з певним ім'ям");

        findCustomerByName(customers, "Pit");
        System.out.println();
        System.out.println("вивід користувачів номер кредитної картки яких знаходиться в заданому інтервалі");
        findCustomersCardInRange(customers, 1234000000000000L, 1234400000000000L);
        System.out.println();
        System.out.println("користувачі з відємним рахунком");
        System.out.println("Кількість користувачів з відємним значенням рахунку : " + findCustomersAmount(customers));


    }

    public static void findCustomerByName(Customer[] customers, String name) {
        for (Customer customer : customers)
            if (customer.getFirstname().equals(name)) {
                System.out.println(customer);
            }
        for (int i = 0; i <= customers.length; i++) {
            if (customers[i].getFirstname().equals(name)) {
                System.out.println(customers[i]);

            }
        }
    }

    public static void findCustomersCardInRange(Customer[] customers, long min, long max) {
        for (Customer customer : customers) {
            long cardNum = customer.getCardNum();
            if (cardNum >= min && cardNum <= max) {
                System.out.println(customer);
            }

        }
    }

    public static int findCustomersAmount(Customer[] customers) {
        int i = 0;
        for (Customer customer : customers) {
            if (customer.getAmount() < 0) {
                System.out.println(customer);
                i++;
            }
        }
        return i;


    }
}