package quiz2seg;


public class Quiz2seg {

    String nombre,departamento,descripcion,hora;
    int codigo;
    public Quiz2seg(int codigo ,String nombre, String departamento, String descripcion,String hora){
        this.codigo = codigo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.descripcion = descripcion;
        this.hora = hora;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public String getHora(){
        return hora;
    }
    
}
