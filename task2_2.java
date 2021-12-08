package HW7;

import CW7.Student;

import java.util.Scanner;

public class Customer {
    private final static Scanner scn = new Scanner(System.in);
    private final int id;
    private String name;
    private String surname;
    private String secondName;
    private String address;
    private long cardNumber;
    private long bankNumber;


    public Customer(int id, String name, String surname, String secondName, String address, long cardNumber, long bankNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getBankNumber() {
        return bankNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", bankNumber=" + bankNumber +
                '}';
    }

    public static Customer[] createCustomersArray(int amount){
        Customer[] customers = new Customer[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("Enter name: ");
            String name = scn.nextLine();
            System.out.print("Enter surname: ");
            String surname = scn.nextLine();
            System.out.print("Enter second name: ");
            String secondName = scn.nextLine();
            System.out.print("Enter address: ");
            String address = scn.nextLine();
            System.out.print("Enter card number: ");
            long cardNumber = scn.nextLong();
            System.out.print("Enter bank number: ");
            long bankNumber = scn.nextLong();

            Customer customer = new Customer(i, name, surname, secondName, address, cardNumber, bankNumber);
            customers[i] = customer;
        }

        return customers;
    }

}
