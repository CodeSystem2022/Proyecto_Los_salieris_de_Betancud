package ProyectoJava;


import java.util.List;

public class Validators {

    /*
    Verifica si "input" no esta vacia, si contiene valores numericos pertenecientes a "allowedValues"
    y retorna el valor logico correspondiente
        @param input: cadena de texto no vacio
        @param allowedValues: lista de valores permitidos
    */
    public static Boolean isNotNumber(String input, List<String> notAllowedValues) {
        if (input.length() < 1) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            if (notAllowedValues.contains(input.substring(i, i+1))) {
                return false;
            }
        }
        return true;
    }


    /*
    Verifica si "input" se repite en "countryList" y retorna el valor logico correspondiente
        @param input: cadena de texto no vacio
        @param countryList: arreglo de caracteres
        @param currentIndex: posicion en la que se encuentra el puntero de "lista" actualmente
    */
    public static Boolean isRepeated(String input, List<String> countryList) {
        if (countryList.contains(input)) {
            return true;
        }
        return  false;
    }

}
