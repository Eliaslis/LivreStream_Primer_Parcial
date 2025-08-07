import java.time.LocalDateTime;
import java.util.List;

public class TransmisionEnCurso extends Transmision {
    private  Chat chat;
    private List<PersonaRegistrada> participantes;

    public TransmisionEnCurso(String titulo) {
        this.setTitulo(titulo);
        this.setFechaHoraInicio(LocalDateTime.now());
    }

    public void recibirEspectador(PersonaRegistrada espectador) {
        participantes.add(espectador);
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Chat getChat() {
        return chat;
    }

    public List<PersonaRegistrada> getParticipantes() {
        return participantes;
    }
}
