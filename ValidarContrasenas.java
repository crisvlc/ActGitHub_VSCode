package examenes;

import java.util.Scanner;

public class ValidarContrasenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una contraseña: ");
        String contrasena = scanner.nextLine();

        if (validarContrasena(contrasena)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida.");
        }
    }

    // Función para validar la contraseña
    public static boolean validarContrasena(String contrasena) {
        // Validar la longitud de la contraseña (por ejemplo, mínimo 8 caracteres)
        if (contrasena.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return false;
        }

        // Validar la presencia de al menos una letra mayúscula
        if (!contieneMayuscula(contrasena)) {
            System.out.println("La contraseña debe contener al menos una letra mayúscula.");
            return false;
        }

        // Validar la presencia de al menos una letra minúscula
        if (!contieneMinuscula(contrasena)) {
            System.out.println("La contraseña debe contener al menos una letra minúscula.");
            return false;
        }

        // Validar la presencia de al menos un número
        if (!contieneNumero(contrasena)) {
            System.out.println("La contraseña debe contener al menos un número.");
            return false;
        }

        // Todos los criterios han sido cumplidos
        return true;
    }

    // Función para verificar la presencia de al menos una letra mayúscula
    private static boolean contieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Función para verificar la presencia de al menos una letra minúscula
    private static boolean contieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Función para verificar la presencia de al menos un número
    private static boolean contieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}