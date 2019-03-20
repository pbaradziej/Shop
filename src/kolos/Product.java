
package kolos;

public class Product {

    String nazwa;
    double cena;

    Product() {
    }

    Product(String nazwa, double cena) {
        if (nazwa != null && nazwa != "") {
        this.nazwa = nazwa;
        } else {
            throw new IllegalArgumentException("Produkt nie moze byc nullem");
        }
        if (cena > 0) {
            this.cena = cena;
        } else {
            throw new IllegalArgumentException("Cena nie moze byc 0,ani ujemna");
        }
    }

    String getNazwa() {
        return nazwa;
    }

    double getCena() {
        return cena;
    }

}
