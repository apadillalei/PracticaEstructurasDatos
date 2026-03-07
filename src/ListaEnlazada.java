public class ListaEnlazada {

    private Nodo cabeza;

    public void agregar(Ticket ticket) {
        Nodo nuevo = new Nodo(ticket);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public Ticket buscar(int id) {

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.dato.getId() == id) {
                return actual.dato;
            }

            actual = actual.siguiente;
        }

        return null;
    }
}