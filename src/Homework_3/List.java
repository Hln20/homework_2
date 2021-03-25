package Homework_3;

import java.util.*;

public class List {

   public static void main(String[] args) {
      ArrayList<String> animals = new ArrayList<>();

      animals.add("Cat");
      animals.add("Dog");
      animals.add("Mouse");
      animals.add("Horse");
      animals.add("Tiger");
      animals.add("Lion");
      animals.add("Monkey");
      animals.add("Cat");
      animals.add("Rabbit");
      animals.add("Sheep");
      animals.add("Deer");
      animals.add("Tiger");
      animals.add("Lion");
      animals.add("Bear");
      animals.add("Cat");
      System.out.println(animals);

      Set<String> uniqueList = new HashSet<>(animals);
      System.out.println(uniqueList);


      for (int i = 0; animals.size() != 0;) {
         String unique = animals.get(i);
         int count = 0;
         Iterator <String> iterator = animals.iterator();
         while (iterator.hasNext()) {
            if (unique.equals(iterator.next())) {
               iterator.remove();
               count++;
            }
         }

         System.out.println(unique + ": " + count);

      }
   }
}
