package ar.edu.unahur.obj2.carpetas;

public class Carpeta implements Agrupable{
    private List<Agrupable> agrupables = new ArrayList<>();
    private String nombre;

    public Carpeta(String nombre){
        this.nombre = nombre
    }

    public void agregar(Agrupable agrupable){
        agrupables.add(agrupable);
    }

    @override
    public void mostar(Integer identacion){
        System.out.println("".repeat(identacion) + nombre);
        agrupables.forEach();
    }
}
