import java.time.LocalDate;

public class Ticket implements Comparable<Ticket> {

    public static int cantidad = 0;

    private int id;
    private String descripcion;
    private String nombreCompleto;
    private LocalDate fechaCreacion;
    private LocalDate fechaResolucion;

    public Ticket(String descripcion, String nombreCompleto) {
        cantidad++;
        this.id = cantidad;
        this.descripcion = descripcion;
        this.nombreCompleto = nombreCompleto;
        this.fechaCreacion = LocalDate.now();
        this.fechaResolucion = null;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void resolver() {
        this.fechaResolucion = LocalDate.now();
    }

    @Override
    public int compareTo(Ticket otro) {
        return this.id - otro.id;
    }

    @Override
    public String toString() {
        return "Ticket #" + id +
                "\nUsuario: " + nombreCompleto +
                "\nDescripcion: " + descripcion +
                "\nFecha Creacion: " + fechaCreacion +
                "\nFecha Resolucion: " + fechaResolucion;
    }
}