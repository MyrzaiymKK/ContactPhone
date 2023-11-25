import Contact.Contacts;

import java.util.Scanner;

public class Phone implements PhoneInterface {
    String brand;
    String name;
    String password;

    Contacts[] contacts;

    public Phone(String brand, String name, String password) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contacts[] getContacts() {
        return contacts;
    }

    public void setContacts(Contacts[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void turn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Turn on the phone!");
        String on = scanner.nextLine();
        if (on.equalsIgnoreCase("on")) {
            System.out.println("Hello!");
            System.out.println("Enter the password: ");
            String pass = scanner.nextLine();
            if (pass.equalsIgnoreCase(getPassword())) {
                System.out.println("Welcom!");
            }
        } else System.out.println("Turn on the phone: ");
    }

    @Override
    public Contacts call() {
        return null;
    }

}
