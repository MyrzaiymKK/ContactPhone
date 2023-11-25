import Contact.Contacts;

import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Phone phone= new Phone("Iphone","11pro","mika");
        Contacts contact = new Contacts();
        Contacts contacts1 = new Contacts(500500514,"Mika");
        Contacts contacts2 = new Contacts(500500500,"Kanat");
        Contacts contacts3 = new Contacts(702700900,"Ailin");
        Contacts contacts4 = new Contacts(990900900,"Janna");
        Contacts contacts5 = new Contacts(702368101,"Adem");
        Contacts[] contacts = {contacts1,contacts2,contacts3,contacts4,contacts5};

    boolean n = true;
    while(n){
        System.out.println("""
                1.Turn on
                2.Call
                3.All contacts
                4.Search
                5.Turn off
                """);
        switch (new Scanner(System.in).nextLine()){
            case "1" -> {
                phone.turn();
            }
            case "2" -> {
                contact.call(contacts);
            }
            case "3" -> {
                System.out.println(Arrays.toString(contacts));
            }
            case "4" -> {
                contact.calll(contacts);
            }
            case "5" ->{
                n = false;
            }
        }
    }

    }
}