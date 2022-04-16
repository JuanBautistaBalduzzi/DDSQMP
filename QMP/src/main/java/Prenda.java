import static java.util.Objects.requireNonNull;


public class Prenda { public TipoPrenda tipoPrenda;
   public  Color colorPrimario;
   public Color colorSecundario;
   public String material;

   Prenda(TipoPrenda tipoPrenda,Color colorPrimario, String material){
       this.tipoPrenda=requireNonNull(tipoPrenda,"El tipo de prenda no puede ser nulo");
       this.colorPrimario=requireNonNull(colorPrimario,"La prenda debe tener un color primario");
       this.material=requireNonNull(material,"La prenda debe tener un material");
   }
   public boolean tieneColorSecundario(){
       return this.colorSecundario != null;
   }
   public String categoria(){
       return this.tipoPrenda.getCategoria().name();
   }
}
