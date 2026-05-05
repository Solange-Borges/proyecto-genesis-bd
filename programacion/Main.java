import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RecursoDAO dao = new RecursoDAO();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver recursos");
            System.out.println("2. Añadir recurso");
            System.out.println("3. Buscar por edad");
            System.out.println("0. Salir");

            String entrada = sc.nextLine();
            opcion = Integer.parseInt(entrada);

            switch (opcion) {

                case 1:
                    dao.mostrarRecursos();
                    break;

                case 2:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Edad: ");
                    String edad = sc.nextLine();

                    Recurso r = new Recurso(titulo, edad);
                    dao.insertarRecurso(r);
                    break;

                case 3:
                    System.out.print("Edad a buscar: ");
                    String edadBuscar = sc.nextLine();
                    dao.buscarPorEdad(edadBuscar);
                    break;
            }

        } while (opcion != 0);
    }
}
