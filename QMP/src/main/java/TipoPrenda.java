import static java.util.Objects.requireNonNull;

public class TipoPrenda {
    public String nombre;

    public Enum<Categoria> getCategoria() {
        return categoria;
    }

    public Enum<Categoria> categoria;
    TipoPrenda(String nombre,Enum<Categoria>categoria){
        this.nombre=requireNonNull(nombre,"El nombre del tipo de prenda no debe ser nulo");
        this.categoria=requireNonNull(categoria,"La categoria del tipo de prenda no debe ser nula");
    }
}
