import java.util.List;

public class Usuario {
  private List<GuardaRopas> guardaRopas;

  public void agregarGuardaropas(GuardaRopas guardaRopas) {
    this.guardaRopas.add(guardaRopas);
  }

  public void eliminarGuardaRopas(GuardaRopas guardaRopas) {
    this.guardaRopas.remove(guardaRopas);
  }

}
