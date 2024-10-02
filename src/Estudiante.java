public class Estudiante {

    private String nombre;
    private int calificacion;

    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Calificación: " + calificacion;
    }
}



