import java.util.List;

public class Sugeridor {
  private CondicionesClimaticas condicionesClimaticas;
  private List<Prenda> guardarropa;

  Sugeridor(CondicionesClimaticas condicionesClimaticas, List<Prenda> guardarropa) {
    this.condicionesClimaticas = condicionesClimaticas;
    this.guardarropa = guardarropa;
  }
  public Atuendo sugerirAtuendo() {
    Prenda prendaSuperior = guardarropa.stream()
        .filter(prenda -> prenda.categoria().equals(Categoria.PARTE_SUPERIOR))
        .filter(prenda -> prenda.aptaSegunTemperatura(condicionesClimaticas.getTemperatura()))
        .findFirst().get();
    Prenda prendaInferior = guardarropa.stream()
        .filter(prenda -> prenda.categoria().equals(Categoria.PARTE_INFERIOR))
        .filter(prenda -> prenda.aptaSegunTemperatura(condicionesClimaticas.getTemperatura()))
        .findFirst().get();

    Prenda prendaCalzado = guardarropa.stream()
        .filter(prenda -> prenda.categoria().equals(Categoria.CALZADO))
        .filter(prenda -> prenda.aptaSegunTemperatura(condicionesClimaticas.getTemperatura()))
        .findFirst().get();

    Prenda prendaAccesorio = guardarropa.stream()
        .filter(prenda -> prenda.categoria().equals(Categoria.ACCESORIO))
        .filter(prenda -> prenda.aptaSegunTemperatura(condicionesClimaticas.getTemperatura()))
        .findFirst().get();

    return new Atuendo(prendaSuperior, prendaInferior, prendaAccesorio, prendaCalzado);
  }
}
