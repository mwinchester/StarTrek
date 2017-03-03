package com.example;
import java.util.Scanner;

public class SelfDestruct {
     public static void main (String args[])
     {
         String officerIdentity1, officerIdentity2, officerIdentity3, officerIdentity4,destructSequence1,
                 destructSequence2, destructSequence3, destructSequence4;
         String officer1 = "kirk";
         String officer2 = "mccoy";
         String officer3 = "spock";
         String officer4 = "kirk";
         String code1 = "tribble";
         String code2 = "klingon";
         String code3 = "ferengi";
         String code4 = "enterprise";
         boolean selfDestruct = false;
         Scanner user_input = new Scanner(System.in);

         System.out.println("Enter the officer name:  ");
         officerIdentity1 = user_input.next();
         if(officerIdentity1.equalsIgnoreCase(officer1))
         {
             System.out.println("That is an acceptable officer. ");
             System.out.println("Enter the code for " + officerIdentity1 + ":   ");
             destructSequence1 = user_input.next();
             if(destructSequence1.equalsIgnoreCase(code1))
             {
                 System.out.println("That is accepted. ");
                 System.out.println("Enter the officer name:  ");
                 officerIdentity2 = user_input.next();
                 if(officerIdentity2.equalsIgnoreCase(officer2)) {
                     System.out.println("That is an acceptable officer. ");
                     System.out.println("Enter the code for " + officerIdentity2 + ":   ");
                     destructSequence2 = user_input.next();
                     if (destructSequence2.equalsIgnoreCase(code2)) {
                         System.out.println("That is accepted. ");
                         System.out.println("Enter the officer name:  ");
                         officerIdentity3 = user_input.next();

                         if (officerIdentity3.equalsIgnoreCase(officer3)) {
                             System.out.println("That is an acceptable officer. ");
                             System.out.println("Enter the code for " + officerIdentity3 + ":   ");
                             destructSequence3 = user_input.next();
                             if (destructSequence3.equalsIgnoreCase(code3)) {
                                 System.out.println("That is accepted. ");
                                 System.out.println("Enter the officer name to begin final countdown:  ");
                                 officerIdentity4 = user_input.next();
                                 if(officerIdentity4.equalsIgnoreCase(officer4)) {
                                     System.out.println("That is an acceptable officer. ");
                                     System.out.println("Enter the code for " + officerIdentity4 + " to begin final count down:   ");
                                     destructSequence4 = user_input.next();
                                     if (destructSequence4.equalsIgnoreCase(code4)) {
                                         System.out.println("That is accepted. ");
                                         selfDestruct = true;
                                     }
                                 }
                             }
                         }
                     }
                 }
             }

         }
         if (selfDestruct) {
             System.out.println("3  2   1   BOOOOM!!!");
         }
         else{
             System.out.println("You are not authorized to do this. ");
         }
     }
}
