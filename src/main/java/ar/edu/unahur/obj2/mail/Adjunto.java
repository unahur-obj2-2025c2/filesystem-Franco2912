public class Adjunto extends FiltroSimple{

    @override
    public Boolean doAplicar(){
        return mail.getAdjunto.contains(texto);
    } 
}
