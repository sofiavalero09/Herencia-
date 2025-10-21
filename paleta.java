public class paleta extends heladeria{
    public paleta(String tipoHelado){
        super(tipoHelado);
    }
    @Override 
    public void precioHelado(){
        precio +=2500;
    }

    @Override
    public String info(){
        return "El helado de"+tipoHelado+"cuesta :"+precio;
    }    
}
