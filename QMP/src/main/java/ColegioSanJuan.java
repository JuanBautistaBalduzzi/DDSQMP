public class ColegioSanJuan implements Colegio {
  @Override
  public Prenda prendaSuperior() {
    Borrador borradorChomba = new Borrador(TipoPrenda.CHOMBA);
    borradorChomba.setMaterial(Material.PIQUE);
    borradorChomba.setColorPrimario(new Color(0, 255, 0));
    return borradorChomba.generarPrenda();
  }

  @Override
  public Prenda prendaInferior() {
    Borrador borradorPantalon = new Borrador(TipoPrenda.PANTALON);
    borradorPantalon.setMaterial(Material.ACETATO);
    borradorPantalon.setColorPrimario(new Color(128, 128, 128));
    return borradorPantalon.generarPrenda();
  }

  @Override
  public Prenda calzado() {
    Borrador borradorCalzado = new Borrador(TipoPrenda.ZAPATILLA);
    borradorCalzado.setMaterial(Material.GOMA);
    borradorCalzado.setColorPrimario(new Color(255, 255, 255));
    return borradorCalzado.generarPrenda();
  }
}
