package Homework_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.add("Ковальчук", "892612345450");
        phonebook.add("Усманов", "892612000000");
        phonebook.add("Дерипаска", "892612545454");
        phonebook.add("Ротенберг", "8926656125");
        phonebook.add("Володин", "89263213214");
        phonebook.add("Ротенберг", "892654644");


        phonebook.get("Иванов");

    }


    Map<String, String> phonebook = new HashMap<>();


    public void add(String lastname, String phoneNumber) {
        phonebook.put(phoneNumber, lastname);


    }


    public void get(String lastname) {
        ArrayList<Object> result = new ArrayList<>();
        for (Map.Entry entry : phonebook.entrySet()) {
            if (lastname.equals(entry.getValue())) {
                result.add(entry.getKey());
                System.out.println(entry.getKey());
            }
            if (result.isEmpty()) {

                System.out.println("Абонента с указанной фамилией нет в телефонном справочнике");
                break;
            }


        }
    }
}






