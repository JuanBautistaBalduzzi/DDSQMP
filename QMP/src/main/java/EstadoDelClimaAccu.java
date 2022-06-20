import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EstadoDelClimaAccu implements CondicionesClimaticas {
  private List<Map<String, Object>> climaGuardado;
  private AccuWeatherAPI accuWeatherAPI;
  private LocalDate fechaDeExpiracion;
  private Integer tiempoDeExpiracion;
  private String ciudad;

  EstadoDelClimaAccu(String ciudad, Integer tiempoDeExpiracion, AccuWeatherAPI accuWeatherAPI) {
    this.ciudad = ciudad;
    this.tiempoDeExpiracion = tiempoDeExpiracion;
    this.accuWeatherAPI = accuWeatherAPI;
  }

  @Override
  public List<Map<String, Object>> getClima() {
    if (climaGuardado == null || this.expiroTiempo()) {
      this.climaGuardado = accuWeatherAPI.getWeather(ciudad);
      this.fechaDeExpiracion = LocalDate.now().plus(this.tiempoDeExpiracion, ChronoUnit.HOURS);
    }
    return this.climaGuardado;
  }

  @Override
  public Integer getTemperatura() {
    return (Integer) this.getClima().get(0).get("Temperature");
  }

  @Override
  public List<AlertaClimatica> getAlertasActuales() {
    List<String> alertas = (List<String>) accuWeatherAPI.getAlertas(this.ciudad).get("CurrentAlerts");
    return alertas.stream().map(x -> AlertaClimatica.valueOf(x)).collect(Collectors.toList());
  }

  private boolean expiroTiempo() {
    return LocalDate.now().isAfter(this.fechaDeExpiracion);
  }
}
