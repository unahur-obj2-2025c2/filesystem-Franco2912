public class Impresor {
    private Agrupable agrupable;

    public Agrupable getAgrupable(){
        return agrupable;
    }

    public void setAgrupable(Agrupable agrupable){
        this.agrupable = agrupable;
    }

    public void mostrar(){
        agrupable.mostrar(0);
    }
}
