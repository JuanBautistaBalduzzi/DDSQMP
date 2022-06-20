import java.util.ArrayList;
import java.util.List;

public class Usuarios {

  private List<Usuario> usuarios;
  private static final Usuarios instance = new Usuarios();

  private Usuarios() {
    this.usuarios = new ArrayList<Usuario>();
  }

  public static Usuarios getInstance() {
    return instance;
  }

  public void añadirUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }

  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }

  public void SugerirAtuendo(CondicionesClimaticas condicionesClimaticas) {
    usuarios.forEach(usuario -> usuario.generarSugerencia(condicionesClimaticas));
  }
}
