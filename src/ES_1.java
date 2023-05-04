
public class ES_1 {

	public static void main(String[] args) {
		System.out.println(stringaPariDispari("ciaoz"));
		System.out.println(annoBisestile(2020));
	}

	static String stringaPariDispari(String str) {
		return str.length() %2 == 0 ? "pari": "dispari";
	}
	static Boolean annoBisestile(int anno) {
		if (anno %4 == 0 || anno %100 == 0 && anno %400 == 0 ) {
			return true;
		}else {
			return false;
		}
	}
}
