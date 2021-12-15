package kalkulatorprosty;

import java.util.Scanner;

public class KalkulatorProsty {

    public static void main(String[] args) {

       int liczbaPierwsza;
       int liczbaDruga;
       int wynik;
       char znak;
       Scanner wejscie = new Scanner(System.in); 
       System.out.println("Podaj pierwszą liczbę:"); 
       liczbaPierwsza = wejscie.nextInt();
       System.out.println("Podaj drugą liczbę:");
       liczbaDruga = wejscie.nextInt();
 
       System.out.println("Dodawanie - wpisz +");
       System.out.println("Odejmowanie - wpisz -");
       System.out.println("Mnożenie - wpisz *");
       System.out.println("Dzielenie - wpisz /");
 
       znak = wejscie.next().charAt(0);
       switch(znak)
       {
           case '+' ->
           {
               wynik = liczbaPierwsza+liczbaDruga;
               System.out.println(liczbaPierwsza + "+" + liczbaDruga + "=" + wynik);
           }
           case '-' ->
           {
               wynik = liczbaPierwsza-liczbaDruga;
               System.out.println(liczbaPierwsza + "-" + liczbaDruga + "=" + wynik);
           }
           case '*' ->
           {
               wynik = liczbaPierwsza*liczbaDruga;
               System.out.println(liczbaPierwsza + "x" + liczbaDruga + "=" + wynik);
           }
           case '/' ->
           {
               if(liczbaDruga !=0 && liczbaPierwsza !=0)
               {
                   wynik = liczbaPierwsza / liczbaDruga;
                   System.out.println(liczbaPierwsza + ":" + liczbaDruga + "=" + wynik + " reszty: " +
                         liczbaPierwsza % liczbaDruga);
               }
               else
               {
                       
                   System.out.println("Nie wolno dzielić przez 0");
               }
           }
           
       }
 
    }
}
