package cinePk;

public class MainCine {

	public static void main(String[] args) {
		Cine cine = new Cine(4,"Terror en el instituto",10);
           System.out.println(cine);
           
           Cine cinesa=new Cine(3);
           cinesa.venderEntrada();
           System.out.println(cinesa);
           cinesa.getAforo();
           cinesa.devolverEntrada();
           System.out.println(cinesa);
           
	}

}
