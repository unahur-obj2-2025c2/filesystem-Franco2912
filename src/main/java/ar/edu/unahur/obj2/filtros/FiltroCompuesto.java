public class FiltroCompuesto implements Agrupable{
    private List<Agrupable> filtros = new ArrayList<>();
    
    public FiltroCompuesto(List<Agrupable> filtros){
        this.filtros = filtros;
    }

    @override
    public Boolean aplicar(){
        return filtros.stream().allMatch(a -> a.aplicar());
    }
}
