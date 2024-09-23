public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, Integer edad){
        this.nombre = nombre;
        this.apellido = apellido; 
        this.edad = edad;
    }

    public void usarArma(){
        System.out.println(nombre +" no tiene armas que usar");
    }


}