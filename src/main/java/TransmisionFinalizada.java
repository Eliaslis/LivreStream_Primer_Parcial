import java.time.LocalDateTime;

public class TransmisionFinalizada extends Transmision{
    private int maxCantEspectadores;
    LocalDateTime fechaHoraFin;

    public TransmisionFinalizada(int maxCantEspectadores, LocalDateTime fechaHoraFin) {
        this.maxCantEspectadores = maxCantEspectadores;
        this.fechaHoraFin = fechaHoraFin;
    }
}
