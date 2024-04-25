import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class EcuatieGradulI {
    private double a;
    private double b;

    public EcuatieGradulI(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void rezolva(String fileName) {
        JSONObject solution = new JSONObject();

        if (a == 0) {
            if (b == 0) {
                solution.put("status", "infinit");
                solution.put("soluție", "Orice valoare pentru x");
            } else {
                solution.put("status", "imposibil");
                solution.put("soluție", "Nicio soluție");
            }
        } else {
            double x = -b / a;
            solution.put("status", "unic");
            solution.put("soluție", x);
        }

        try (FileWriter file = new FileWriter(fileName)) {
            file.write(solution.toString());
            System.out.println("Soluția a fost salvată în " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}