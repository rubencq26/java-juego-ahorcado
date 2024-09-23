public class Moro extends Persona{

    private String arma;

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public Moro(String nombre,String apellido, Integer edad ,String arma){
        super(nombre, apellido, edad);
        this.arma = arma;
    }

    @Override
    public void usarArma(){
        System.out.println(super.getNombre() + " mato a una persona con su "+ arma);
    }

}
