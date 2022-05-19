import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

public class EstadoDelClimaAccu implements CondicionesClimaticas {
  private List<Map<String, Object>> climaGuardado;
  private LocalDate fechaDeExpiracion;
  private Integer tiempoDeExpiracion;
  private String ciudad;

  EstadoDelClimaAccu(String ciudad, Integer tiempoDeExpiracion) {
    this.ciudad = ciudad;
    this.tiempoDeExpiracion = tiempoDeExpiracion;
  }

  @Override
  public List<Map<String, Object>> getClima() {
    if (climaGuardado == null || this.expiroTiempo()) {
      this.climaGuardado = new AccuWeatherAPI().getWeather(ciudad);
      this.fechaDeExpiracion = LocalDate.now().plus(this.tiempoDeExpiracion, ChronoUnit.HOURS);
    }
    return this.climaGuardado;
  }

  @Override
  public Integer getTemperatura() {
    return (Integer) this.getClima().get(0).get("Temperature");
  }

  private boolean expiroTiempo() {
    return LocalDate.now().isAfter(this.fechaDeExpiracion);
  }
}
