class Mahasiswa {
    String Nama;
    String NIM;
    String Prodi;
    Integer umur;
    Double IPK;
}

public class App {
    public static void main(String[] args) throws Exception {

        Mahasiswa mhs_1 = new Mahasiswa();
        mhs_1.Nama = "haqqi";
        mhs_1.NIM = "23241115";
        mhs_1.Prodi = "Pendidikan Teknologi Informasi";
        mhs_1.umur = 19;
        mhs_1.IPK = 4.0;

        System.out.println("Nama : " + mhs_1.Nama);
        System.out.println("NIM : " + mhs_1.NIM);
        System.out.println("Prodi : " + mhs_1.Prodi);
        System.out.println("Umur : " + mhs_1.umur);
        System.out.println("IPK : " + mhs_1.IPK);
    }
}