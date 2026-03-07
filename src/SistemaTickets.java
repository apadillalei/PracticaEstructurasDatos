import java.util.PriorityQueue;

public class SistemaTickets {

    PriorityQueue<Ticket> ticketsPendientes = new PriorityQueue<>();
    ListaEnlazada ticketsResueltos = new ListaEnlazada();

    public void crearTicket(String nombre, String descripcion) {

        Ticket ticket = new Ticket(descripcion, nombre);
        ticketsPendientes.add(ticket);

        System.out.println("Ticket creado con id " + ticket.getId());
    }

    public void verTicketFrente() {

        if (ticketsPendientes.isEmpty()) {
            System.out.println("No hay tickets pendientes.");
            return;
        }

        Ticket ticket = ticketsPendientes.peek();

        System.out.println("\nTicket al frente:");
        System.out.println(ticket);
    }

    public void resolverTicket() {

        if (ticketsPendientes.isEmpty()) {
            System.out.println("No hay tickets para resolver.");
            return;
        }

        Ticket ticket = ticketsPendientes.poll();

        ticket.resolver();

        ticketsResueltos.agregar(ticket);

        System.out.println("Ticket resuelto:");
        System.out.println(ticket);
    }

    public void buscarTicket(int id) {

        Ticket ticket = ticketsResueltos.buscar(id);

        if (ticket != null) {
            System.out.println("Ticket encontrado:");
            System.out.println(ticket);
        } else {
            System.out.println("El ticket esta pendiente o no existe.");
        }
    }
}