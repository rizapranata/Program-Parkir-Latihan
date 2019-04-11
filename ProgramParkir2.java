import java.util.*;

public class ProgramParkir2{

    public static Scanner in = new Scanner(System.in);
    public static String platNomor = "",jenisKendaraan = "";
    public static int jamPertama=0,jamBerikut=0,lamaParkir=0,jamMasuk=0,jamKeluar=0,total = 0;

    public static void print(String input){
        System.out.print(input);
    }
    public static void println(String input){
        System.out.println(input);
    }

    public static int hitung( int jamPertama, int jamBerikut){
        lamaParkir = jamKeluar - jamMasuk;
        if(lamaParkir > 1){
            total = ((lamaParkir - 1) * jamBerikut) + jamPertama;
        }else{
            lamaParkir = 1;
            total = jamPertama;
        }
        return total;
    }
    
    public static void program(){
        lamaParkir = 0;
        print("\n");
        print("Plat Nomor : ");
        platNomor = in.next().toString();
        println("Jenis Kendaraan :\n" + "\t1->Mobil\n\t2->Motor");
        print("Pilih Kendaraan : ");
        jenisKendaraan = in.next();
        print("Jam Masuk : ");
        jamMasuk = in.nextInt();
        print("Jam Keluar : ");
        jamKeluar = in.nextInt();

        switch(jenisKendaraan){
            case "1":
                jenisKendaraan = "Mobil";
                hitung(5000,3000);
            break;
            case "2":
                jenisKendaraan = "Motor";
                hitung(3000,1500);
            break;
            default:
            //
            break;
        }
        println("----------------------------------------------------------------------------");
        println("Terimakasih sudah melakukan transaksi dengan rincian sebagai berikut");
        println("\tPlat Nomor : " + platNomor);
        println("\tJenis Kendaraan : " + jenisKendaraan);
        println("\tLama Parkir : " + lamaParkir);
        println("\tTotal Bayar : Rp." + total);
        println("Semoga layanan kami memuaskan.");
        println("----------------------------------------------------------------------------");

    }

    public static void main(String[] args){
        program();
        boolean run = true;
        while(run == true){
            print("Input Lagi? Y/N : ");
            String ask = in.next();
            if(ask.equalsIgnoreCase("Y")){
                program();
                run = true;
            }else{
                run = false;
            }
        }
        

    }

    
}