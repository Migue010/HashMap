import java.util.HashMap;

public class GestionEstudiantes {

    private HashMap<String, Estudiante> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new HashMap<>();
    }

    // Añadir estudiante
    public void agregarEstudiante(String nombre, int calificacion) {
        Estudiante estudiante = new Estudiante(nombre, calificacion);
        estudiantes.put(nombre, estudiante);
        System.out.println("Estudiante agregado: " + nombre);
    }

    // Mostrar todos los estudiantes
    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : estudiantes.values()) {
                System.out.println(estudiante);
            }
        }
    }

    // Actualizar calificación de un estudiante
    public void actualizarCalificacion(String nombre, int nuevaCalificacion) {
        Estudiante estudiante = estudiantes.get(nombre);
        if (estudiante != null) {
            estudiante.setCalificacion(nuevaCalificacion);
            System.out.println("Calificación actualizada para " + nombre);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Eliminar estudiante
    public void eliminarEstudiante(String nombre) {
        if (estudiantes.containsKey(nombre)) {
            estudiantes.remove(nombre);
            System.out.println("Estudiante eliminado: " + nombre);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    // Mostrar calificación de un estudiante específico
    public void mostrarCalificacion(String nombre) {
        Estudiante estudiante = estudiantes.get(nombre);
        if (estudiante != null) {
            System.out.println(estudiante);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

}
