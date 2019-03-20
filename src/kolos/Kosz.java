package kolos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kosz {

    private List<Product> lista = new ArrayList();

    public void dodaj(Product product) {
            lista.add(product);  
    }

    public void usuń(String name) {
        for (Iterator<Product> it = lista.iterator(); it.hasNext();) {
            Product product = it.next();
            if (product.getNazwa().equals(name)) {
                it.remove();
                break;
            }
        }
    }

    public double suma() {
        double suma = 0;
        for (Product product : lista) {
            suma += product.getCena();
        }
        return suma;
    }

    public void wyswietl() {
        for (Product product : lista) {

            System.out.printf("Produkt: " + product.getNazwa() + ", cena: " + "%.2f", product.getCena());
            System.out.println("zł");

        }

    }
    //nazwa null, produkt niedodatni,cena 0
}
