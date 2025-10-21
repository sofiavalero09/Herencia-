public class heladeria {
    protected String tipoHelado;
    protected int precio;

    public heladeria (String tipoHelado){
        this.tipoHelado= tipoHelado;
        this.precio=0;
    } 
    public void precioHelado(){
        precio+=4000;

    public String info(){
        return "El helado de"+tipoHelado+"cuesta :"+precio;
    }

    }
}
