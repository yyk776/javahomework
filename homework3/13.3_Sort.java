package homework;
import java.util.ArrayList;

public class Sort {
    ArrayList<Number> list = new ArrayList<Number>();
    public static ArrayList<Number> sort(ArrayList<Number> list) {
        if (list.size() == 0 || list == null)
            return list;
        for (int i = list.size()-1; i >= 0; i--) { 
            for (int j = 0; j < i; j++) {
                if (list.get(j).doubleValue() > list.get(j+1).doubleValue()) {
                    int index = j;
                    Number m = list.get(j);
                    list.set(index, list.get(j+1));
                    list.set(j+1, m);
                }
            }
        }
        return list;
    }  
}

