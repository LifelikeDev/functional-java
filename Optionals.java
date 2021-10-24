package functionalInterfaces;

import java.util.Optional;

public class Optionals {
   // Java Optionals

   public static void main (String[] args) {
       // Passing a value you're certain is not null
       Object cannotBeNull = Optional.of("some value here").orElseGet(() -> "default value");
//       Object value = Optional.ofNullable("some value here").orElseGet(() -> "default value");

       // Passing a value which can be null
//       Object canBeNull= Optional.ofNullable("null").orElseGet(() -> "default value");
//       Object canBeNull= Optional.empty().orElseGet(() -> "default value");

//       System.out.println(canBeNull);  
       System.out.println(cannotBeNull);
   }



}
