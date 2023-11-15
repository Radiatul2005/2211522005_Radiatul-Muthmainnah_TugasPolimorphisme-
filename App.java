import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);


        // Polimorfisme
        Member Reguler1 = new MemberReguler();
        Member Silver1 = new MemberSilver();
        Member Gold1 = new MemberGold();
        Member Platinum1 = new MemberPlatinum();

        MemberSilver pelanggaSilver = new MemberSilver();
        MemberGold pelangganGold = new MemberGold();
        MemberPlatinum pelangganPlatinum = new MemberPlatinum();

        //Reguler Member
        System.out.print("Total Belanja Member Reguler: Rp.");
        int belanjaReguler = scanner.nextInt();
        int totalBayarReguler = Reguler1.hitungTotalBayar(belanjaReguler);
        System.out.println("Total bayar Member Reguler: Rp. " + totalBayarReguler);

        //Silver Member
        System.out.print("\nMasukkan total belanja Member Silver: Rp.");
        int belanjaSilver = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Silver (Dalam Meter):  ");
        Double jarakSilver = scanner.nextDouble();
        int totalBayarSilver = Silver1.hitungTotalBayar(belanjaSilver);
        double jarakTujuanSilver = pelanggaSilver.hitungOngkir(jarakSilver);
        System.out.println("Total bayar Member Silver: Rp. " + totalBayarSilver);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuanSilver);

        // Member Gold
        System.out.print("\nMasukkan total belanja Member Gold: Rp.");
        int belanjaGold = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Gold (Dalam Meter): ");
        Double jarakGold = scanner.nextDouble();
        int totalBayarGold = Gold1.hitungTotalBayar(belanjaGold);
        double jarakTujuanGold = pelangganGold.hitungOngkir(jarakGold);
        double cicilanGold = totalBayarGold /12;
        System.out.println("Total bayar Member Gold: Rp." + totalBayarGold);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuanGold);
        System.out.println("Cicilan Per Bulan: Rp. " + cicilanGold + "/bulan");

        // Member Platinum
        System.out.print("\nMasukkan total belanja Member Platinum:Rp. ");
        int belanjaPlatinum = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Platinum (Dalam Meter): ");
        Double jarakPlatinum = scanner.nextDouble();
        int totalBayar4 = Platinum1.hitungTotalBayar(belanjaPlatinum);
        double jarakTujuanPlatinum = pelangganPlatinum.hitungOngkir(jarakPlatinum);
        double cicilanPlatinum = totalBayar4 /12;
        System.out.print("Masukkan jumlah deposit untuk Member Platinum: Rp.");
        int depositPlatinum = scanner.nextInt();
        int saldoPlatinum = pelangganPlatinum.deposit(depositPlatinum);
        System.out.println("Total bayar Member Platinum:Rp. " + totalBayar4);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuanPlatinum);
        System.out.println("Cicilan Per Bulan: Rp. " + cicilanPlatinum + "/bulan");
        System.out.println("Saldo Member Platinum setelah deposit:Rp. " + saldoPlatinum);

        
        scanner.close();

}
}
