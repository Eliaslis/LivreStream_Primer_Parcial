import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PersonaRegistrada {
    private String nickname;
    private Canal canal;

    public List<Mensaje> verMensajesDelChat() {
        return new ArrayList();
    }

    public List<Mensaje> verMensajesDelChat(TransmisionEnCurso transmision) {
        return transmision.getChat().getMensajes();
    }

    public void unirseA(TransmisionEnCurso transmision) {
        transmision.recibirEspectador(this);
    }

    public void enviarMensaje(String contenidoMensaje, TransmisionEnCurso transmision) {
        Mensaje mensaje = new Mensaje(LocalDateTime.now(), contenidoMensaje, this);
        transmision.getChat().recibirMensaje(mensaje);
    }

    public void suscribirseA(Canal canal) {
        canal.suscripcion(this);
    }

    public void darApoyoA(Canal canal, int valor) {
        if(valor > 0 && valor <= 10) {
            MuestraDeApoyo muestra = new MuestraDeApoyo(valor);
            canal.recibirApoyo(muestra);
        }
        else {
            throw new RuntimeException("El valor tiene que ser entre 1 y 10.");
        }
    }


}
