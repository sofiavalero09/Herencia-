public class crema extends heladeria{
    public crema(String tipoHelado){
        super(tipoHelado);
    }
    @Override 
    public void precioHelado(){
        precio +=3500;
    }

    @Override
    public String info(){
        return "El helado de"+tipoHelado+"cuesta :"+precio;
    }    
}
