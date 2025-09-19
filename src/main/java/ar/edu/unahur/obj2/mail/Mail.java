package ar.edu.unahur.obj2.mail;

public class Mail {

    private String from;
    private String to;
    private String asunto;
    private Integer tamano;
    private Boolean adjunto;
    private FiltroDefault filtro;

    public Mail(String from, String to, String Asunto, Integer tamano, Boolean adjunto){
        this.from = from;
        this.to = to;
        this.asunto = asunto;
        this.tamano = tamano;
        this.adjunto = adjunto;

    }
    /*Agregar los getter, setter y constructor */

    public boolean filtrate(){
        return filtro.aplicar();
    }
}
