package Giris;
import java.util.Scanner;
public class TaksimetreHesabi {
    public static  void main(String[] args){


        Scanner input=new Scanner(System.in);

        System.out.print("Gidilen metreyi giriniz : ");
        double gidilenKm = input.nextDouble();

        double kmbasiUcret=2.20;
        double toplamUcret=10+gidilenKm*kmbasiUcret;

        if(toplamUcret<20){
            System.out.print("Ödenecek tutar: 20 TL");
        }
        else {
            System.out.print("Ödenecek tutar :"+toplamUcret);
        }


    }
}
