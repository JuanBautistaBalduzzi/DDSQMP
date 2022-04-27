import static java.util.Objects.requireNonNull;


public class Prenda {
  private TipoPrenda tipoPrenda;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private Trama trama;

  Prenda(TipoPrenda tipoPrenda, Color colorPrimario, Material material, Color colorSecundario, Trama trama) {
    this.tipoPrenda = requireNonNull(tipoPrenda, "El tipo de prenda no puede ser nulo");
    this.colorPrimario = requireNonNull(colorPrimario, "La prenda debe tener un color primario");
    this.material = requireNonNull(material, "La prenda debe tener un material");
    this.colorSecundario = colorSecundario;
    this.trama = trama != null ? trama : Trama.LISA;
  }

  public boolean tieneColorSecundario() {
    return this.colorSecundario != null;
  }

  public String categoria() {
    return this.tipoPrenda.getCategoria().name();
  }
}
