
package kolos;

public class Kolos {

    public static void main(String[] args) {
        Kosz kosz=new Kosz();
        
       
        kosz.dodaj(new Product("Jajka",3.23));
        kosz.dodaj(new Product("Szynka",3.23));
        kosz.dodaj(new Product("Masło",15.33));
        
        
        kosz.wyswietl();
        kosz.usuń("Masło");
        kosz.wyswietl();
        System.out.println("Suma: "+kosz.suma()+"zł");
        
    }
    
}
