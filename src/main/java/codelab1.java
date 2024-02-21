import  java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class codelab1 {

    public static void main(String[] args) {
        
        String nama;
        char kelamin;
        String ttl;

        //OBJEK DARI CLASS SCANNER
        Scanner input = new Scanner(System.in);
        //input nama
        System.out.print("Nama: ");
        nama = input.nextLine();
        //input Jenis Kelamin
        System.out.print("Masukkan Jenis Kelamin P/L: ");
        kelamin = input.next().charAt(0);
        input.nextLine();
        //input Tanggal lahir
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        ttl = input.next();

        LocalDate lahir = LocalDate.parse(ttl);
        LocalDate hariIni = LocalDate.now();

        //output tahun
        Period periode = Period.between(lahir, hariIni);
        int tahun = periode.getYears();
        int bulan = periode.getMonths();

        if (kelamin == 'P' || kelamin == 'p'){
            System.out.println("Nama  :"+nama);
            System.out.println("Jenis Kelamin : Perempuan");
            System.out.printf("tahun  :"+ tahun +" Tahun"+ bulan +" bulan");
        } else if (kelamin == 'L' || kelamin == 'l') {
            System.out.println("Nama :"+nama);
            System.out.println("Jenis Kelamin : Laki laki");
            System.out.printf("tahun :"+ tahun +" Tahun "+ bulan +" bulan");

        }

    }
}