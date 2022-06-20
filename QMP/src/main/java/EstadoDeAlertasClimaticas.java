import java.util.ArrayList;
import java.util.List;

public class EstadoDeAlertasClimaticas {
  private List<AlertaClimatica> alertasActuales = new ArrayList<>();
  private CondicionesClimaticas servicioClimatico;
  private List<InteresadosAlClima> intersadosAlClima;

  public void actualizarEstadoDeAlertasClimaticas() {
    alertasActuales = servicioClimatico.getAlertasActuales();
    intersadosAlClima.forEach(x -> x.notificar(alertasActuales));
  }
}
