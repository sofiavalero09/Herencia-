public class precio{
    public static void main (String[]args){
        heladeria p1=new crema ("crema");
        heladeria p2=new paleta("paleta");

        p1.precioHelado();
        p2.precioHelado();

        System.out.println(p1.info());
        System.out.println(p2.info());
    }

}
