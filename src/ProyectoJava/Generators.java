package ProyectoJava;

import java.util.ArrayList;
import java.util.List;

public class Generators {


    /*
        Crea la lista de valores permitidos para realizar validaciones
        Retorna una lista de 10 numeros que van del 0 al 9, transformados a String
    */
    public static List<String> getValuesNotAllowed() {
        List<String> valuesNotAllowed = new ArrayList(10);

        for (int i = 0; i < 10; i++) {
            valuesNotAllowed.add(Integer.toString(i));
        }
        return valuesNotAllowed;
    }


    public static List<String> getGroupList() {
        List<String> groupList = new ArrayList<>(32);

        for (int i = 0; i < 32; i++) {
            groupList.add("");
        }
        return groupList;
    }
}
