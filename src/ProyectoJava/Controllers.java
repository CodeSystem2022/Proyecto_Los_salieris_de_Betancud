package ProyectoJava;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Controllers {

    /*
        Pide por consola el ingreso del nombre del pais del seleccionado de futbol
            @param countryList: Lista de caracteres vacio
            @param valuesNotAllowed: Lista de elementos que van del 0 al 9
    */
    public void fillCountryList(List<String> countryList, List<String> valuesNotAllowed) {
        Scanner scanner = new Scanner(System.in);
        Boolean validInput;

        for (int i = 0; i < 32; i++) {
            validInput = false;
            System.out.print(">> ");
            String input = scanner.nextLine().toString();

            // Evalua la entrada del usuario
            while (validInput == false) {
                if (Validators.isNotNumber(input, valuesNotAllowed) == false) {
                    System.out.print("Ingrese una seleccion valida: ");
                    input = scanner.nextLine().toString();
                } else if (i > 0 && Validators.isRepeated(input, countryList)) {
                    System.out.print("Este pais ya se encuentra registrado, ingrese otra: ");
                    input = scanner.nextLine().toString();
                } else {
                    countryList.add(i, input);
                    validInput = true;
                }
            }
        }
        scanner.close();
    }


    /*
        Toma elementos de "countryList" y los copia en una posicion aleatoria de "groupsList", conformando los grupos
         de seleccionados
            @param countryList: Lista de caracteres con 32 seleccionados ingresados previamente
            @param groupsList: Lista de caracteres cuyos elementos estan destinados al nombre de un seleccionado
    */
    public void drawGroups(List<String> countryList, List<String> groupsList) {
        Random random = new Random();

        for (int i = 0; i < 32; i++) {
            Integer index = random.nextInt(groupsList.size());

            // Verifica que la posicion asignada no este ocupada
            while (groupsList.get(index) != "") {
                index = random.nextInt(groupsList.size());
            }
            groupsList.set(index, countryList.get(i));
        }
    }

    /*
        Muestra por consola los grupos sorteados
            @param countryGroups: Lista de caracteres cuyos elementos contienen el nombre de un seleccionado
    */
    public void showGroups(List<String> countryGroups) throws InterruptedException {
        Integer groupNumber = 1;
        System.out.println("");
        System.out.println("  Grupo " + groupNumber);
        System.out.println("____________");
        for (int e = 0; e < 32; e++) {
            if (e != 0 & e%4 == 0) {
                groupNumber++;
                System.out.println("____________");
                System.out.println("");
                System.out.println("  Grupo " + groupNumber);
                System.out.println("____________");
            }
            System.out.println(" " + countryGroups.get(e));
            Thread.sleep(1000);
        }
        System.out.println("");
    }
}
