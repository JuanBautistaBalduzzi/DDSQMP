import java.util.List;
import java.util.Map;

public interface CondicionesClimaticas {

   List<Map<String, Object>> getClima();

   Integer getTemperatura();

  List<AlertaClimatica> getAlertasActuales();
}
