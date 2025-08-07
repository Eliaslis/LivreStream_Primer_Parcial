import java.time.LocalDateTime;
import java.util.List;

public class Canal {
    private boolean enVivo;
    private TransmisionEnCurso transmisionActual;
    private List<TransmisionFinalizada> transmisionesPasadas;
    private List<MuestraDeApoyo> muestrasDeApoyo;
    private List<PersonaRegistrada> suscriptores;

    public void iniciarTransmision(String titulo, List<Categoria> categorias) {
        if(enVivo) {
            detenerTransmision();
        }
        transmisionActual = new TransmisionEnCurso(titulo);
        categorias.forEach(categoria -> asignarCategoria(transmisionActual, categoria));
        enVivo = true;
    }

    public void detenerTransmision() {
        TransmisionFinalizada transmision = new TransmisionFinalizada(transmisionActual.getParticipantes().size(), LocalDateTime.now());
        transmisionesPasadas.add(transmision);
        enVivo = false;
    }

    public void asignarCategoria(Transmision transmision, Categoria categoria) {
        transmision.aniadirCategoria(categoria);
    }

    public TransmisionEnCurso getTransmisionActual() {
        return transmisionActual;
    }

    public List<TransmisionFinalizada> listarTransmisionesPasadas() {
        return transmisionesPasadas;
    }

    public List<PersonaRegistrada> getSuscriptores() {
        return suscriptores;
    }

    public List<MuestraDeApoyo> getMuestrasDeApoyo() {
        return muestrasDeApoyo;
    }

    public void recibirApoyo(MuestraDeApoyo muestra) {
        muestrasDeApoyo.add(muestra);
    }

    public void suscripcion(PersonaRegistrada usuario) {
        suscriptores.add(usuario);
    }
}
