package kalkulator.bmr;

import java.util.Scanner;

public class KalkulatorBMR {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int wzrost, waga, wiek,rodzajAktywnosci, celDiety, plec;
        int podstawoweBmrKobiety = 0;
        int podstawoweBmrMezczyzny = 0;
        System.out.println("Płeć (1-Kobieta, 2-Mężczyzna): ");
        plec = input.nextInt();
        System.out.println("Podaj swój wzrost (w cm): ");
        wzrost = input.nextInt();
        System.out.println("Podaj swoją wagę (w kg): ");
        waga = input.nextInt();
        System.out.println("Podaj swój wiek: ");
        wiek = input.nextInt();
        System.out.println("Wybierz rodzaj aktywności fizycznej (od 1 do 5): ");
        System.out.println("1 - Znikoma(Brak treningów, praca siedząca)");
        System.out.println("2 - Bardzo mała(Trening raz w tygodniu, praca lekka)");
        System.out.println("3 - Umiarkowana(2 treningi w tygodniu o średniej intensywności)");
        System.out.println("4 - Duża(3 treningi w tygodniu o dość ciężkiej intensywności)");
        System.out.println("5 - Duża(4 treningi w tygodniu o ciężkiej intensywności, praca fizyczna)");
        rodzajAktywnosci = input.nextInt();
        System.out.println("Podaj swój cel diety (od 1 do 3)");
        System.out.println("Chcę schudnąć");
        System.out.println("Chcę utrzymać wagę");
        System.out.println("Chcę przytyć");
        celDiety = input.nextInt();
        
        if(plec == 1){
            podstawoweBmrKobiety=655+(9*waga)+(2*wzrost)-(4*wiek);
        }
        else if(plec == 2){
            podstawoweBmrMezczyzny=66+(14*waga)+(5*wzrost)-(7*wiek);
        }
        
        switch (celDiety) {
            case 1:
                podstawoweBmrKobiety = podstawoweBmrKobiety - 300;
                break;
            case 2:
                podstawoweBmrKobiety = podstawoweBmrKobiety;
                break;
            case 3:
                podstawoweBmrKobiety = podstawoweBmrKobiety + 300;
                break;
            default:
                break;
        }
        
        switch (rodzajAktywnosci){
            case 1:
                podstawoweBmrKobiety = podstawoweBmrKobiety;
                break;
            case 2:
                podstawoweBmrKobiety = podstawoweBmrKobiety + 50;
                break;
            case 3:
                podstawoweBmrKobiety = podstawoweBmrKobiety + 100;
                break;
            case 4:
                podstawoweBmrKobiety = podstawoweBmrKobiety + 150;
                break;
            case 5:
                podstawoweBmrKobiety = podstawoweBmrKobiety + 200;
                break;
            default:
                break;
        }
        
        switch (celDiety) {
            case 1:
                podstawoweBmrMezczyzny = podstawoweBmrMezczyzny - 400;
                break;
            case 2:
                podstawoweBmrMezczyzny = podstawoweBmrMezczyzny;
                break;
            case 3:
                podstawoweBmrMezczyzny = podstawoweBmrMezczyzny + 450;
                break;
            default:
                break;
        }
        
        switch (rodzajAktywnosci){
            case 1:
                podstawoweBmrMezczyzny = podstawoweBmrMezczyzny;
                break;
            case 2:
                podstawoweBmrMezczyzny = podstawoweBmrMezczyzny + 100;
                break;
            case 3:
                podstawoweBmrMezczyzny = podstawoweBmrMezczyzny + 150;
                break;
            case 4:
                podstawoweBmrMezczyzny = podstawoweBmrMezczyzny + 200;
                break;
            case 5:
                podstawoweBmrMezczyzny = podstawoweBmrMezczyzny + 250;
                break;
            default:
                break;
        }
        if(plec == 1){
            System.out.println("Twoje dzienne zapotrzebowanie kaloryczne to: " + podstawoweBmrKobiety+" kcal");
        }
        else if(plec == 2){
            System.out.println("Twoje dzienne zapotrzebowanie kaloryczne to: " + podstawoweBmrMezczyzny+" kcal");
        }
    }
    
}
