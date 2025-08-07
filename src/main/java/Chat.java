import java.util.List;

public class Chat {
    private List<Mensaje> mensajes;

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void recibirMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
    }
}
