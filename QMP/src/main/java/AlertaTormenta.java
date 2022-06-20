import java.util.List;

public class AlertaTormenta implements InteresadosAlClima {
  NotificationService notificationService;

  @Override
  public void notificar(List<AlertaClimatica> alertaClimaticas) {
    if(alertaClimaticas.contains(AlertaClimatica.LLUVIA)) {
      notificationService.notify("No te olvides el paraguas al salir de casa");
    }
  }
}
