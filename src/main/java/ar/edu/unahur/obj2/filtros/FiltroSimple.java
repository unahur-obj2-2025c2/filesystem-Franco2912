public abstract class FiltroSimple implements Agrupable{
    protected MailRecord mail;

    public filtroSimple(MailRecord mail){
        this.mail = mail;
    }

    @override
    public Boolean aplicar(){
        return doAplicar();
    }

    public abstract Boolean doAplicar()
}
