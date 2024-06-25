import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HitungTrapesium {
    public static void main(String[] args) {

        String namaFile = "src/trapezoid.txt";

        List<DataTrapesium> tr = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                DataTrapesium t = new DataTrapesium();
                t.Alas = Double.parseDouble(row[0]);
                t.AlasBawah = Double.parseDouble(row[1]);
                t.Tinggi = Double.parseDouble(row[2]);

                tr.add(t);
            }
            for (DataTrapesium a : tr) {
                System.out.println("Luasnya adalah: " + a.luas());
            }

            for (DataTrapesium b : tr) {
                System.out.println("Kelilingnya adalah: " + b.keliling());
            }
            tr.sort(Comparator.comparingDouble(DataTrapesium::luas));

            for (DataTrapesium t : tr) {
                System.out.println(t.luas());
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
            String outputFile = "Src/output.txt";
            try{
                FileWriter fw = new FileWriter(outputFile);
                for(DataTrapesium t : tr){
                    fw.write(t.keliling()+ "\n");
                }
                fw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}