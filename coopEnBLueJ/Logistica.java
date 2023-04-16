
/**
 * Clase Producto que contiene las caracteristicas necesarias de cada producto para que pueda ser gestionado en la cooperativa.
 * 
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Logistica extends Coste
{
    // instance variables - replace the example below with your own
    private int distanciaKm;
    private  boolean esPerecedero;
    private String tipoLogistica;
    private double pesoPedido;
    public double precioArticulo;
    private int tramos;

    /**
     * Constructor for objects of class Logistica
     */
    public Logistica()
    {
        // initialise instance variables
        super(distanciaKm, esPerecedero, precioArticulo, pesoPedido);
         this.distanciaKm = distanciaKm;
         this.esPerecedero = esPerecedero;
         this.pesoPedido = pesoPedido;
    }
    
     public int getDistancia()
    {
        return  this.distanciaKm;
        
    }
     public void setDistancia(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
     public boolean getPerecedero()
    {
        return  this.esPerecedero;
        
    }
     public void setEsPerecedero(boolean esPerecedero) {
        this.esPerecedero = esPerecedero;
    }
    
     public String Transportar(){
         return "";
        
    }
         // public static int getTramos()
    // {
        // tramos = distanciaKm / 50;
        // return  this.tramos;
    // }
    // @Override
    // public  double CalcularCosteLogistica(){
         // return 0;
        
    // }
    
}