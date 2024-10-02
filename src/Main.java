import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Actualizar calificación");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Mostrar calificación de un estudiante");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Calificación: ");
                    int calificacion = scanner.nextInt();
                    gestion.agregarEstudiante(nombre, calificacion);
                    break;
                case 2:
                    gestion.mostrarEstudiantes();
                    break;
                case 3:
                    System.out.print("Nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    System.out.print("Nueva calificación: ");
                    int nuevaCalificacion = scanner.nextInt();
                    gestion.actualizarCalificacion(nombre, nuevaCalificacion);
                    break;
                case 4:
                    System.out.print("Nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    gestion.eliminarEstudiante(nombre);
                    break;
                case 5:
                    System.out.print("Nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    gestion.mostrarCalificacion(nombre);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
    }
