public class konoha {
    public static void main(String[] args) {
        // Variabel umum
        String nama = "Subhan";
        int umur = 19;
        double tinggi = 160.3;
        char jenisKelamin = 'L'; // 'L' untuk laki-laki
        boolean belumMenikah = true;

        // Menampilkan nilai variabel ke layar
        System.out.println("Profil Subhan:");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");

        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Status Pernikahan: " + (belumMenikah ? "Belum Menikah" : "Sudah Menikah"));

 
        if (umur < 18) {
            System.out.println("Subhan adalah seorang remaja.");
        } else {
            System.out.println("Subhan adalah seorang dewasa.");
        }
    }
}
