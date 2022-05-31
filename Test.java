package Calculator;


public class Test {

	public static void main (String args[]) {
		
		StratejiImpl ekle= new StratejiImpl(new Toplama());
		
		System.out.println(" "+ekle.operasyonImpl(10,5));
		
        StratejiImpl ekle1= new StratejiImpl(new Cikarma());
		
		System.out.println(" "+ekle1.operasyonImpl(10,5));
		
        StratejiImpl ekle2= new StratejiImpl(new Bolme());
		
		System.out.println(" "+ekle2.operasyonImpl(10,5));
		
        StratejiImpl ekle3= new StratejiImpl(new Carpma());
		
		System.out.println(" "+ekle3.operasyonImpl(10,5));
		
		
		
		
	}
}
