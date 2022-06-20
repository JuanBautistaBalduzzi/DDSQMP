import java.util.List;

public class AlertaGranizo implements InteresadosAlClima {
  NotificationService notificationService;

  @Override
  public void notificar(List<AlertaClimatica> alertaClimaticas) {
    if (alertaClimaticas.contains(AlertaClimatica.GRANIZO)) {
      notificationService.notify("No salgas con el auto que la naturaleza te lo apedrea");
    }
  }
}
