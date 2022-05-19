public class Atuendo {
  private Prenda prendaSuperior;
  private Prenda prendaInferior;
  private Prenda prendaCalzado;
  private Prenda prendaAccesorio;

  Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda prendaAccesorio, Prenda prendaCalzado) {
    this.prendaSuperior = prendaSuperior;
    this.prendaInferior = prendaInferior;
    this.prendaCalzado = prendaCalzado;
    this.prendaAccesorio = prendaAccesorio;
  }
}
