import java.util.Scanner;
public class CarlysEventPricesWithMetods {
    public static void main(String[] args) {
        System.out.println(invitati());
        motto();
    }

    public static int invitati() {
        int inv, a;
        System.out.print("Adaugati nr de invitati=  ");
        Scanner inputDevice = new Scanner(System.in);
        inv = inputDevice.nextInt();
        a = inv;
        pret(a);
        System.out.print(" \n Nr de invitati este =  "  ) ;
        boolean evenimentMare = inv >= 50;
        System.out.println("Este un eveniment mare? " + evenimentMare);
        return inv;
    }

    public static void motto() {
        System.out.println(" Carly’s makes the food that makes it a party.  \n ");
    }

    public static void pret(int x) {

        int p = x * 35;
        System.out.print("Pretul total este  " + p  ) ;
    }
}

