
/**
 * Lab activity of class GenericStaff .
 *
 * @author (Nicholas)
 * @version (8/6/2024)
 */
import java.util.ArrayList;

public class GenericStaff {

    public static void main(String[] args) {
        ArrayList staffList = new ArrayList();
        Staff st = new Staff("Abu", "11222", "Finance");
        staffList.add(st);
        Staff st1 = (Staff) staffList.get(0);
    }
}
