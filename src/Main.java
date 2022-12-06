import ProyectoJava.Controllers;
import ProyectoJava.Generators;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Controllers controller = new Controllers();
        List<String> countryList = new ArrayList(32);

        List<String> valuesNotAllowed = Generators.getValuesNotAllowed();
        List<String> groupList = Generators.getGroupList();

        System.out.println("Ingrese las selecciones clasificadas: ");

        controller.fillCountryList(countryList, valuesNotAllowed);
        controller.drawGroups(countryList, groupList);

        controller.showGroups(groupList);
    }
}