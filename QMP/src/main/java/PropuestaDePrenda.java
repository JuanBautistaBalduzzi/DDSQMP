public class PropuestaDePrenda implements SolicitudDeModificacion {
  private Prenda prendaAAgregar;

  @Override
  public void aceptar(GuardaRopas guardaRopas) {
    guardaRopas.agregarPrenda(prendaAAgregar);
  }

  @Override
  public void rechazar(GuardaRopas guardaRopas) {
    return;
  }

  @Override
  public void cancelar(GuardaRopas guardaRopas) {
    guardaRopas.getPrendas().remove(prendaAAgregar);
  }
}
