package Calculator;

public class StratejiImpl {
	
	Strateji strateji;
	
	public StratejiImpl(Strateji strateji) {
		this.strateji=strateji;
	}
	
	public int operasyonImpl (int num1, int num2) {
		return strateji.operasyon(num1, num2);
	}

}
