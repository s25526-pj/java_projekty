
package buttelka;


public class Buttelka {
   private double ileLitrow;
    
    Buttelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }
    
    double getIleLitrow()
    {
        return ileLitrow;
    }
void wlej (double ilosc)
{
    this.ileLitrow += ilosc;
}
 boolean wylej(double ilosc)
 {
     if (ilosc < ileLitrow)
        this.ileLitrow -= ilosc;
     else
         return false;
     
     return true;
 }
 void przelej (double ilosc, Buttelka gdziePrzelac)
 {
        if (this.wylej(ilosc))
        {
        gdziePrzelac.wlej(ilosc);
        }
        else 
        System.out.println("za mało");
 }
    
    public static void main(String[] args) {
        
        Buttelka [] buttelka = new Buttelka[3];
        
        buttelka[0] = new Buttelka(5);
        buttelka[1] = new Buttelka(8);
        buttelka[2] = new Buttelka(10);
        
        buttelka [2].wlej(5);
        
        buttelka[0].przelej(2, buttelka[1]);
        
        
        
        System.out.println(buttelka[0].getIleLitrow());
        System.out.println(buttelka[1].getIleLitrow());
        System.out.println(buttelka[2].getIleLitrow());
    }
    
}
