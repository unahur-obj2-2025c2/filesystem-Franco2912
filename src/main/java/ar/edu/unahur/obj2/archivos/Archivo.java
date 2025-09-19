package ar.edu.unahur.obj2.archivos;

public class Archivo implements Agrupable {
    private String nombre;
    private String extension;
    private Double tamano;

    public Archivo(String nombre, String extension){
        this.nombre = nombre;
        this.extension = extension;
    }

    @override
    public void mostar(Integer identacion){
        System.out.println("".repeat(identacion) + nombre + "." + extension);
    }
}
