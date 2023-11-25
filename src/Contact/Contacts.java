package Contact;

import java.util.Scanner;

public class Contacts  {
    int phoneNumber;
    String name;

    public Contacts() {
    }

    public Contacts(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public void calll(Contacts[] contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pishite nomer: ");
        String number = scanner.nextLine();
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i].getName().equalsIgnoreCase(number)){
                System.out.println(contacts[i]);
            }
        }
    }





    public void call(Contacts[] contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pishite nomer: ");
        int number = scanner.nextInt();
        for (int i = 0; i < contacts.length; i++) {
            if(contacts[i].getPhoneNumber() == number){
                System.out.println(contacts[i]);
            }
        }
    }


    @Override
    public String toString() {
        return "Contacts{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
