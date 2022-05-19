import static java.util.Objects.requireNonNull;


public class Prenda {
  private TipoPrenda tipoPrenda;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private Trama trama;
  private Integer temperatura;

  Prenda(TipoPrenda tipoPrenda, Color colorPrimario, Material material,
         Color colorSecundario, Trama trama,Integer temperatura) {
    this.tipoPrenda = requireNonNull(tipoPrenda, "El tipo de prenda no puede ser nulo");
    this.colorPrimario = requireNonNull(colorPrimario, "La prenda debe tener un color primario");
    this.material = requireNonNull(material, "La prenda debe tener un material");
    this.colorSecundario = colorSecundario;
    this.trama = trama != null ? trama : Trama.LISA;
    this.temperatura=temperatura;
  }

  public boolean tieneColorSecundario() {
    return this.colorSecundario != null;
  }

  public boolean aptaSegunTemperatura(Integer temperaturaActual) {
    return this.temperatura < temperaturaActual;
  }

  public TipoPrenda getTipoPrenda() {
    return tipoPrenda;
  }


  public Enum<Categoria> categoria() {
    return this.tipoPrenda.getCategoria();
  }
}
