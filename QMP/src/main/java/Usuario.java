import java.util.List;

public class Usuario {
  private List<GuardaRopas> guardaRopas;
  private Atuendo sugerenciaDiaria;
  private String email;

  public void agregarGuardaropas(GuardaRopas guardaRopas) {
    this.guardaRopas.add(guardaRopas);
  }

  public void eliminarGuardaRopas(GuardaRopas guardaRopas) {
    this.guardaRopas.remove(guardaRopas);
  }

  public void generarSugerencia(CondicionesClimaticas condicionesClimaticas) {
    sugerenciaDiaria = new Sugeridor(
        condicionesClimaticas,
        this.guardaRopas.stream().findAny().get())
        .sugerirAtuendo();
  }

  public String getEmail() {
    return email;
  }

}
