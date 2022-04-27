public class Uniforme {

  private Prenda prendaInferior;
  private Prenda calzado;
  private Prenda prendaSuperior;

  Uniforme(Colegio colegio) {
    this.prendaSuperior = colegio.prendaSuperior();
    this.prendaInferior = colegio.prendaInferior();
    this.calzado = colegio.calzado();
  }
}
