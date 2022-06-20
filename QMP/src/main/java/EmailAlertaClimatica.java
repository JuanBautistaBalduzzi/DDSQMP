import java.util.List;
import java.util.stream.Collectors;

public class EmailAlertaClimatica implements InteresadosAlClima {
  private MailSender mailSender;

  @Override
  public void notificar(List<AlertaClimatica> alertaClimaticas) {
    String mensaje = "Nueva Alerta Climatica" + alertaClimaticas.stream().map(alerta -> alerta.toString()).collect(Collectors.joining());
    Usuarios.getInstance().getUsuarios().forEach(user -> mailSender.send(user.getEmail(), mensaje));
  }
}
