public class QuiteDePrenda implements SolicitudDeModificacion {

  private Prenda prendaAQuitar;

  @Override
  public void aceptar(GuardaRopas guardaRopas) {
    guardaRopas.getPrendas().remove(prendaAQuitar);
  }

  @Override
  public void rechazar(GuardaRopas guardaRopas) {
    return;
  }

  @Override
  public void cancelar(GuardaRopas guardaRopas) {
    guardaRopas.getPrendas().add(prendaAQuitar);
  }
}
