package HW7;

import CW7.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test_Customer {
    public static Customer[] getCustomersInAlphabetic(Customer[] customers){
        Customer[] alphabeticCustomers = customers
                ;
        for (int i = 0; i < customers.length; i++)
        {
            for (int j = i + 1; j < customers.length; j++) {
                if (alphabeticCustomers[i].getName().compareTo(alphabeticCustomers[j].getName()) > 0)
                {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
            }
        }


        return alphabeticCustomers;
    }

    public static ArrayList<Customer> getCardNumberGreaterThan(Customer[] customers, long cardNumber){
        ArrayList<Customer> cardNumberGreaterThan = new ArrayList<>();

        for (Customer customer: customers) {
            if (customer.getCardNumber() > cardNumber)
                cardNumberGreaterThan.add(customer);
        }

        return cardNumberGreaterThan;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter amount of students: ");
        int amount = scn.nextInt();

        Customer[] customers = Customer.createCustomersArray(amount);
        System.out.println(Arrays.toString(getCustomersInAlphabetic(customers)));
        System.out.println(getCardNumberGreaterThan(customers, 5375_3424_2432_3228L));

    }
}
