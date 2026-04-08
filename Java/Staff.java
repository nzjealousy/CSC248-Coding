
import java.util.ArrayList;

public class Staff {

    public static void main(String[] args) {
        ArrayList<Staff> staffList = new ArrayList<Staff>();
        //ArrayList staffList = new ArrayList();
        Staff st = new Staff();
        staffList.add(st);
        Staff st1 = (Staff) staffList.get(0);
    }
}
