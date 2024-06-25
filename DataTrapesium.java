public class DataTrapesium {
    public double Alas;
    public double AlasBawah;
    public double Tinggi;

    public double luas() {
        return 0.5 * (Alas + AlasBawah) * Tinggi;
    }
    public double keliling() {
        double sisi1 = Math.sqrt(Math.pow((Alas - AlasBawah) / 2, 2) + Math.pow(Tinggi, 2));
        double keliling = Alas + AlasBawah + 2 * sisi1;
        return keliling;
    }
}