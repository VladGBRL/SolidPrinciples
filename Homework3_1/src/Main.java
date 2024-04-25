//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        EcuatieGradulI ecuatie = new EcuatieGradulI(0, 0);
        ecuatie.rezolva("solutie_ecuatie.json");
    }
}