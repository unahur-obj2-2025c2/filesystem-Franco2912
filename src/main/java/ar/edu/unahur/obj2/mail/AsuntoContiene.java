public class AsuntoContiene extends FiltroSimple{
    private String texto;

    @override
    public Boolean doAplicar(){
        return mail.asunto().contains(texto);
    }
}
