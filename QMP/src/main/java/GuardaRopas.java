import java.util.ArrayList;
import java.util.List;

public class GuardaRopas {

  private List<Prenda> prendas;
  private List<SolicitudDeModificacion> solicitudesPendientes;
  private List<SolicitudDeModificacion> solicitudesAceptadas;

  GuardaRopas(List<Prenda> prendas) {
    this.prendas = prendas;
  }

  public void agregarPrenda(Prenda prenda) {
    prendas.add(prenda);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public void aceptarSolicitud(SolicitudDeModificacion solicitudDeModificacion) {
    solicitudesPendientes.remove(solicitudDeModificacion);
    solicitudDeModificacion.aceptar(this);
    solicitudesAceptadas.add(solicitudDeModificacion);
  }

  public void rechazarSolicitud(SolicitudDeModificacion solicitudDeModificacion) {
    solicitudesPendientes.remove(solicitudDeModificacion);
  }

  public void cancelarSolicitud(SolicitudDeModificacion solicitudDeModificacion) {
    solicitudesAceptadas.remove(solicitudDeModificacion);
    solicitudDeModificacion.cancelar(this);
    solicitudesPendientes.add(solicitudDeModificacion);
  }



}
