import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double jamKerja;
        double tarifPerJam;
        double potonganPajak = 1; 
        double gajiBruto;
        double gajiBersih;

        System.out.println("Masukkan jumlah jam kerja: ");
        jamKerja = scanner.nextDouble();
        System.out.println("Masukkan tarif per jam: ");
        tarifPerJam = scanner.nextDouble();

        //Menghitung gaji bruto
        gajiBruto = jamKerja*tarifPerJam;

        //Menghitung potongan ajak (10% dari gaji bruto)
        potonganPajak =gajiBruto*0.10;
        
        //Menghitung gaji berih
        gajiBersih = gajiBruto - potonganPajak;

        // Menampilkan hasil
        System.out.println("Gaji bruto : Rp."+gajiBruto);
        System.out.println("Potongan Pajak (10%) : Rp."+potonganPajak);
        System.out.println("Gaji Bersih : Rp." + gajiBersih);
        
        // Menutup Scanner
        scanner.close();
    }
}
