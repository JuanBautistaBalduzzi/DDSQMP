import java.util.List;

public class CambioSugerenciaPorAlerta implements InteresadosAlClima {

  CondicionesClimaticas condicionesClimaticas;

  @Override
  public void notificar(List<AlertaClimatica> alertaClimaticas) {
    Usuarios.getInstance().SugerirAtuendo(condicionesClimaticas);
  }
}
