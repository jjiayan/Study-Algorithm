import kr.or.kosa.Tv;

public class Ex03_Ref_Method_Call {

	public static void main(String[] args) {
		// Tv 한대를 만드세요
		// 메모리에 올리세요 >> heap에 
		
		Tv lgTv = new Tv();
		lgTv.brandName = "LG";
		lgTv.infoPrint();
		
		lgTv.chUp();
		lgTv.chUp();
		lgTv.chUp();
		lgTv.chUp();
		lgTv.chUp();
		lgTv.infoPrint();
		lgTv.chDown();
		lgTv.infoPrint();
		
		Tv ssTv = new Tv();
		ssTv.brandName = "SS";
		ssTv.infoPrint();
	}

}
