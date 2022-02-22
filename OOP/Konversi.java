import java.util.Scanner;

class Konversi {
    double celcius, reamur, fahrenheit, kelvin;
    String status;

    Konversi(double celcius) {
        this.celcius = celcius;
    }

    void setTemperature() {
        this.reamur = (4 * celcius) / 5;
        this.fahrenheit = (9 * celcius) / 5 + 32;
        this.kelvin = celcius + 273.15;
        if (celcius > 0 && celcius < 100) {
            this.status = "Air dalam keadaan Normal";
        } else if (celcius < 0) {
            this.status = "Air dalam keadaan Beku";
        } else {
            this.status = "Air dalam keadaan Mendidih";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Suhu dalam celcius : ");
        double x = sc.nextDouble();
        Konversi water = new Konversi(x);
        water.setTemperature();
        int user = getOption();
        while (user != 3) {
            switch (user) {
                case 1:
                    System.out.println("Reamur : " + water.reamur);
                    System.out.println("Fahrenheit : " + water.fahrenheit);
                    System.out.println("Kelvin : " + water.kelvin);
                    System.out.println(water.status);
                    break;
                case 2:
                    System.out.println("Input data");
                    System.out.print("Suhu dalam celcius : ");
                    x = sc.nextDouble();
                    water.celcius = x;
                    water.setTemperature();
                    break;
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar");
                    break;
            }
            if (user != 3) {
                user = getOption();
            }
        }

    }

    public static int getOption() {
        System.out.println("\nOpsi : ");
        System.out.println("===");
        System.out.println("1. Lihat Data Konversi");
        System.out.println("2. Edit Data Konversi");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
