import java.time.LocalDateTime;
import java.util.List;

public abstract class Transmision {
    private String titulo;
    LocalDateTime fechaHoraInicio;
    private List<Categoria> categorias;

    public String getTitulo() {
        return titulo;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }

    public void aniadirCategoria(Categoria categoria) {
        categorias.add(categoria);
    }
}
