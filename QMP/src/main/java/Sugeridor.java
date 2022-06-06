import java.util.List;

public class Sugeridor {
  private CondicionesClimaticas condicionesClimaticas;
  private GuardaRopas guardarropa;

  Sugeridor(CondicionesClimaticas condicionesClimaticas, GuardaRopas guardarropa) {
    this.condicionesClimaticas = condicionesClimaticas;
    this.guardarropa = guardarropa;
  }

  public Atuendo sugerirAtuendo() {
    Prenda prendaSuperior = guardarropa.getPrendas()
        .stream()
        .filter(prenda -> prenda.categoria().equals(Categoria.PARTE_SUPERIOR))
        .filter(prenda -> prenda.aptaSegunTemperatura(condicionesClimaticas.getTemperatura()))
        .findAny().get();
    Prenda prendaInferior = guardarropa.getPrendas()
        .stream()
        .filter(prenda -> prenda.categoria().equals(Categoria.PARTE_INFERIOR))
        .filter(prenda -> prenda.aptaSegunTemperatura(condicionesClimaticas.getTemperatura()))
        .findAny().get();

    Prenda prendaCalzado = guardarropa.getPrendas()
        .stream()
        .filter(prenda -> prenda.categoria().equals(Categoria.CALZADO))
        .filter(prenda -> prenda.aptaSegunTemperatura(condicionesClimaticas.getTemperatura()))
        .findAny().get();

    Prenda prendaAccesorio = guardarropa.getPrendas()
        .stream()
        .filter(prenda -> prenda.categoria().equals(Categoria.ACCESORIO))
        .filter(prenda -> prenda.aptaSegunTemperatura(condicionesClimaticas.getTemperatura()))
        .findAny().get();

    return new Atuendo(prendaSuperior, prendaInferior, prendaAccesorio, prendaCalzado);
  }
}
