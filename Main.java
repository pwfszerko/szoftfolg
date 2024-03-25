public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Helyes paraméterezés: java Main Kolcsonzok.csv Kolcsonzesek.csv");
            return;
        }

        String kolcsonzokFile = args[0];
        String kolcsonzesekFile = args[1];

        int importedKolcsonzok = importKolcsonzok(kolcsonzokFile);
        System.out.println("Sikeresen importált sorok a Kolcsonzok.csv-ből: " + importedKolcsonzok);

        int importedKolcsonzesek = importKolcsonzesek(kolcsonzesekFile);
        System.out.println("Sikeresen importált sorok a Kolcsonzesek.csv-ből: " + importedKolcsonzesek);
    }

    private static int importKolcsonzok(String fileName) {
        return 0;
    }

    private static int importKolcsonzesek(String fileName) {
        return 0;
    }
}
 