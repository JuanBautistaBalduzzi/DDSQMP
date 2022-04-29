public class ColegioJohnson implements Colegio {
  @Override
  public Prenda prendaSuperior() {
    Borrador borradorChomba = new Borrador(TipoPrenda.CAMISA);
    borradorChomba.setMaterial(Material.ALGODON);
    borradorChomba.setColorPrimario(new Color(255, 255, 255));
    return borradorChomba.generarPrenda();
  }

  @Override
  public Prenda prendaInferior() {
    Borrador borradorPantalon = new Borrador(TipoPrenda.PANTALON);
    borradorPantalon.setMaterial(Material.SEDA);
    borradorPantalon.setColorPrimario(new Color(0, 0, 0));
    return borradorPantalon.generarPrenda();
  }

  @Override
  public Prenda calzado() {
    Borrador borradorCalzado = new Borrador(TipoPrenda.ZAPATO);
    borradorCalzado.setMaterial(Material.GOMA);
    borradorCalzado.setColorPrimario(new Color(0, 0, 0));
    return borradorCalzado.generarPrenda();
  }
}
