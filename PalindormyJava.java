
package palindormyjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindormyJava {
   
    public static void main(String[] args) throws FileNotFoundException {
        
        File palindromy = new File("palindromy.txt");
        
        Scanner odczytPliku = new Scanner(palindromy);
        
        System.out.println(palindromy.getAbsolutePath());
       
             
        for (int i = 0; i < 13; i++)
       {   
        String input = odczytPliku.nextLine();
 
        StringBuilder input1 = new StringBuilder();

        input1.append(input);
 
        input1.reverse();
        
        if(input1.toString().equals(input)) 
        {
            System.out.println(input);
        } 
        else 
        {    
            
        }
    }
   
    
    }
   
}
