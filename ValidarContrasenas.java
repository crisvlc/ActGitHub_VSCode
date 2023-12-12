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

        // Validar otros criterios según tus necesidades, por ejemplo, presencia de mayúsculas, minúsculas, números, etc.
        // En este ejemplo, solo se verifica la longitud.
        return true;
    }
}