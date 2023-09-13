import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main (String[]args){
        double tutar, kdvOranı1=0.18, kdvOrani2=0.08,kdvTutarı,kdvliTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("ücret tutarını giriniz: ");
        tutar=input.nextDouble();

        if(tutar>1000){
            System.out.println("Girilen Tutar: "+tutar);
            System.out.println("Kdv Oranı: "+(tutar*kdvOrani2));
            System.out.println("Kdvli Tutar: "+(tutar+(tutar*kdvOrani2)));
        }
        else{
            System.out.println("Girilen Tutar: "+tutar);
            System.out.println("Kdv Oranı: "+(tutar*kdvOranı1));
            System.out.println("Kdvli Tutar: "+(tutar+(tutar*kdvOranı1)));

        }

    }
}
