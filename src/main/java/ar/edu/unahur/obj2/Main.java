public class Main {

    public static void main(String[] args){
        MailRecord mail = new MailRecord("gerardo", "pablo", "muy importante", 250, true);

        Tamano tam = new Tamano(mail, 230);
        Adjunto adj = new Adjunto(mail);
        AsuntoContiene contiene = new Asuntocontiene(mail, "importante");
        
        FiltroCompuesto compuesto = new FiltroCompuesto(Arrays.asList(tam, adj, contiene));

        System.out.println(compuesto.aplicar())
    }
}
