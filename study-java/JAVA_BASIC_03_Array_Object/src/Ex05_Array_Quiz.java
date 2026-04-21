import kr.or.kosa.Emp;

public class Ex05_Array_Quiz {

	public static void main(String[] args) {
		/*
		 1. 사원 3명을 만드세요.
		 1000, 홍길동
		 2000, 김유신
		 3000, 유관순  
		 
		 2. 개선된 for문으로 사번, 이름 모두 출력하세요.
 		
		 */
//		Emp	emp = new Emp(0, null);
//		p.empno
//		p.ename
		Emp[] emparr = new Emp[3];
		emparr[0] = new Emp(1000, "홍길동");
		emparr[1] = new Emp(2000, "김유신");
		emparr[2] = new Emp(3000, "유관순");
		
		for (int i = 0; i < emparr.length; i++) {
			emparr[i].empInfoPrint();
		}
		
		//////
		Emp[] emparr2 = new Emp[] {new Emp(1000, "홍길동"), new Emp(2000, "김유신"), new Emp(3000, "유관순")};
		Emp[] emparr3 = {new Emp(1000, "홍길동"), new Emp(2000, "김유신"), new Emp(3000, "유관순")};
		
		for(Emp emp: emparr3) {
			emp.empInfoPrint();
		}
	}

}
