public class Borrador {
  private TipoPrenda tipoPrenda;
  private Color colorPrimario;
  private Color colorSecundario;
  private Material material;
  private Trama trama;

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  public void setMaterial(Material material) {
    this.material = material;
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
        this.trama);
  }
}
