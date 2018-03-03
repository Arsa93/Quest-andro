
/**
 * Write a description of class burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burung extends aksiburung
{
    // Variabel burung
    String nama;
    int stamina;
    
    
    void terbang(){
        stamina--;
        System.out.println(nama+" sedang terbang..");
        System.out.println("Stamina berkurang");
        System.out.println("Stamina : "+stamina);
    }
    
    void makan(){
        System.out.println(nama+" sedang makan..");
        stamina++;
        System.out.println("Stamina bertambah");
        System.out.println("Stamina : "+stamina);
    
    }

}
