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
        GeometrijskaSlika krug = new Krug(5);
        System.out.println(krug);

        GeometrijskaSlika elipsa = new Elipsa(4, 7);
        System.out.println(elipsa);

        GeometrijskaSlika trougao = new Trougao(6);
        System.out.println(trougao);

        GeometrijskaSlika nejednakostranicniTrougao = new NejednakostranicniTrougao(11, 7, 55);
        System.out.println(nejednakostranicniTrougao);

        GeometrijskaSlika nejednakostranicniTrougao2 = new NejednakostranicniTrougao(11,8,5);
        System.out.println(nejednakostranicniTrougao2);

        GeometrijskaSlika kvadrat = new Kvadrat(10);
        System.out.println(kvadrat);

        GeometrijskaSlika pravougaonik = new Pravougaonik(11, 7);
        System.out.println(pravougaonik);
    }


}
