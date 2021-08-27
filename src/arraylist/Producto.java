
package arraylist;


public class Producto implements Comparable<Producto>{
    private String nombre; 
    private int cantidad; 

//constructor de la clase producto

public Producto(String s, int i) { 
nombre = s; 
cantidad = i; 
  }

//método de la clase object
public String toString(){ 
return ("Nombre: "+nombre+" Cantidad: "+cantidad); 
} 

public void setNombre(String nombre) { 
        this.nombre = nombre;
}

//métodos de encapsulamiento
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int compareTo(Producto o) {
        if(o.getCantidad()<cantidad){
        return -1;
        }else{
            if(o.getCantidad() < cantidad){
            return 0;
            }else{
            return 1;
            }
        }
    }

}
