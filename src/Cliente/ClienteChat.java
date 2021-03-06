package Cliente;

import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Clase con el main de un cliente del chat. Establece la conexion y crea la
 * ventana y la clase de control.
 */
public class ClienteChat {
    /**
     * Socket con el servidor del chat
     */
    private Socket socket;

    /**
     * PantallaCliente con la ventana del cliente
     */
    private PantallaCliente pantallaCliente;

    /**
     * Crea la ventana, establece la conexi�n e instancia al controlador.
     */
    public ClienteChat(String xDireccionSocket, int xPuerto) {
        try {
            this.socket = new Socket(xDireccionSocket, xPuerto);
            this.pantallaCliente = new PantallaCliente();
            ControlCliente control = new ControlCliente(socket, pantallaCliente);
        } catch (Exception e) { 
            e.printStackTrace();
        }
    }
}
