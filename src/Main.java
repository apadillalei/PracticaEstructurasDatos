import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SistemaTickets sistema = new SistemaTickets();

        int opcion;

        do {

            System.out.println("\n=== SISTEMA DE TICKETS ===");
            System.out.println("1. Menu Usuario");
            System.out.println("2. Menu Administrador");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {

                case 1:

                    int opcionUsuario;

                    do {

                        System.out.println("\n--- Menu Usuario ---");
                        System.out.println("1. Crear Ticket");
                        System.out.println("2. Buscar Ticket Resuelto");
                        System.out.println("3. Volver");
                        System.out.print("Seleccione una opcion: ");

                        opcionUsuario = Integer.parseInt(br.readLine());

                        switch (opcionUsuario) {

                            case 1:

                                System.out.print("Nombre completo: ");
                                String nombre = br.readLine();

                                System.out.print("Descripcion del problema: ");
                                String descripcion = br.readLine();

                                sistema.crearTicket(nombre, descripcion);

                                break;

                            case 2:

                                System.out.print("Ingrese id del ticket: ");
                                int id = Integer.parseInt(br.readLine());

                                sistema.buscarTicket(id);

                                break;
                        }

                    } while (opcionUsuario != 3);

                    break;

                case 2:

                    int opcionAdmin;

                    do {

                        System.out.println("\n--- Menu Administrador ---");
                        System.out.println("1. Ver ticket al frente");
                        System.out.println("2. Resolver ticket");
                        System.out.println("3. Volver");
                        System.out.print("Seleccione una opcion: ");

                        opcionAdmin = Integer.parseInt(br.readLine());

                        switch (opcionAdmin) {

                            case 1:
                                sistema.verTicketFrente();
                                break;

                            case 2:
                                sistema.resolverTicket();
                                break;
                        }

                    } while (opcionAdmin != 3);

                    break;

            }

        } while (opcion != 3);

        System.out.println("Programa finalizado.");
    }
}