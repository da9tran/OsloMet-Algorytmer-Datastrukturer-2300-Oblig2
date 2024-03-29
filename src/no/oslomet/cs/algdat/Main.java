package no.oslomet.cs.algdat;

public class Main {
    public static void main(String[] args) {
        Liste<String> liste = new DobbeltLenketListe<>();
        System.out.println(liste.antall() + " " + liste.tom());

        String[] s = {"Ole", null, "Per", "Kari", null};
        Liste<String> liste2 = new DobbeltLenketListe<>(s);
        System.out.println(liste2.antall() + " " + liste2.tom());

        String[] s1 = {}, s2 = {"A"}, s3 = {null, "A", null, "B", null};
        DobbeltLenketListe<String> l1 = new DobbeltLenketListe<>(s1);
        DobbeltLenketListe<String> l2 = new DobbeltLenketListe<>(s2);
        DobbeltLenketListe<String> l3 = new DobbeltLenketListe<>(s3);

        System.out.println(l1.toString() + " " + l2.toString() + " " + l3.toString()
         + " " + l1.omvendtString() + " " + l2.omvendtString() + " " + l3.omvendtString());

        DobbeltLenketListe<Integer> liste3 = new DobbeltLenketListe<>();

        System.out.println(liste3.toString() + " " + liste3.omvendtString());

        for (int i = 1; i <= 3; i++){
            liste3.leggInn(i);
            System.out.println(liste3.toString() + " " + liste3.omvendtString());
        }

        Character[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',};
        DobbeltLenketListe<Character> liste4 = new DobbeltLenketListe<>(c);
        System.out.println(liste4.subliste(3,8));
        System.out.println(liste4.subliste(5,5));
        System.out.println(liste4.subliste(8, liste4.antall()));

        String[] navn = {"Lars", "Anders", "Bodil", "Kari", "Berit"};
        Liste<String> liste5 = new DobbeltLenketListe<>(navn);

        liste5.forEach(s4 -> System.out.print(s4 + " "));
        System.out.println();
        for (String s4 : liste5) System.out.print(s4 + " ");
    }
}
