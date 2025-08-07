import java.time.LocalDateTime;

public class Mensaje {
    private PersonaRegistrada espectador;
    private  String contenido;
    private LocalDateTime fechaHora;

    public Mensaje(LocalDateTime fechaHora, String contenido, PersonaRegistrada espectador) {
        this.fechaHora = fechaHora;
        this.contenido = contenido;
        this.espectador = espectador;
    }
}
