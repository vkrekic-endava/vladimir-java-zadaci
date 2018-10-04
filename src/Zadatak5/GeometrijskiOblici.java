package Zadatak5;

/**
 * ZADATAK5: Kreirati projekat Geometrijske slike na sledeći način:
 * •	Apstraktna klasa Geometrijska Slika
 * •	Tri osnovne klase Krug, Kvadrat, Trougao
 * •	Izvedene klase Elipsa, Pravougaonik i Nejednakostranicni Trougao
 * •	Klase imaju preklopnjenu metodu toString() u kojoj se ispisuju obim i povrsina
 * •	Svaka klasa treba da sadrži po 3 konstruktora
 * •	Klasa Trougao definiše jednakostranični Trougao
 * •	Obim elipse se racuna aπ(9-√35)/2 , a povrsina abπ
 * Napraviti Main klasu i u njoj kreirati instance klase Geometrijska slika i napraviti
 * objekte svih osnovnih i izvedenih klasa sa proizvoljnim argumentima.
 * Ispisati String reprezentaciju objekata – toString()
 *
 * @author Vladimir.Krekic
 */
class GeometrijskiOblici {

    public static void main(String[] args) {
        GeometrijskaSlika kr = new Krug(5);
        System.out.println(kr);

        GeometrijskaSlika el = new Elipsa(4, 7);
        System.out.println(el);

        GeometrijskaSlika tr = new Trougao(6);
        System.out.println(tr);

        GeometrijskaSlika ntr = new NejednakostranicniTrougao(11, 7, 5);
        System.out.println(ntr);

        GeometrijskaSlika kv = new Kvadrat(10);
        System.out.println(kv);

        GeometrijskaSlika pr = new Pravougaonik(11, 7);
        System.out.println(pr);
    }


}
