import static java.util.Objects.requireNonNull;

public class Borrador {
  private TipoPrenda tipoPrenda;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private Trama trama;
  private Integer temperatura;

  public Borrador(TipoPrenda tipoPrenda) {
    this.tipoPrenda=tipoPrenda;
  }

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setTemperatura(Integer temperatura) {
    this.temperatura = temperatura;
  }

  public void setMaterial(Material material) {

    this.material = requireNonNull(material, "La prenda debe tener un material");
  }

  public void setColorPrimario(Color colorPrimario) {

    this.colorPrimario = requireNonNull(colorPrimario,
        "La prenda debe tener al menos un color primario");
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public Prenda generarPrenda() {
    return new Prenda(
        this.tipoPrenda,
        this.colorPrimario,
        this.material,
        this.colorSecundario,
        this.trama,
        this.temperatura);
  }
}
