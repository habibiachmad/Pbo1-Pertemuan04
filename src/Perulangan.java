public class Perulangan {
    public static void main(String[] args) {
       int isiGalon = 1;
       int penuh = 10000;
        System.out.println("Isi Galon Sekarang : " + isiGalon + "ml");
        System.out.println("Isi Galon Ketika Penuh :" + penuh + "ml");

        for (isiGalon = 0; isiGalon <= penuh ;isiGalon++){
            System.out.println("Sedang Mengisi gelass..");
            System.out.println("Isi Galon Sekarang : " + isiGalon + "ml");
        }
        System.out.println("Finale: Isi Galon Sekarang : " + isiGalon + "ml");
    }
    }
