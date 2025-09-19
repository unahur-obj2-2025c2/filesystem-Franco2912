package ar.edu.unahur.obj2.mail;

public class Tamano extends FiltroSimple{
    private Agrupable mail;
    private Integer valMin;

    public Tamano(MailRecord mail, Integer valMin){
        super(mail);
        this.valMin = valMin;
    }

    @override

    public Boolean doAplicar(){
        return mail.tamano() >= valMin;
    }
}
