import java.util.Scanner;

public class ES_1 {

	public static void main(String[] args) {
		System.out.println(stringaPariDispari("ciaoz"));
		System.out.println(annoBisestile(2020));
		System.out.println(numeroInLettere(4));
		countDown(3);
		testWhile();
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
	static String numeroInLettere(int num) {
		String[] intToString = new String[4];
		intToString[0] = "zero";
		intToString[1] = "uno";
		intToString[2] = "due";
		intToString[3] = "tre";
		
		switch(num) {
		  case 0,1,2,3:
			  return intToString[num];
		  default:
			  return "Not in range >= 0; <= 3";
		}
	}
	static void testWhile() {
		Scanner scanner = new Scanner (System.in);
	      
		while (true) {
			System.out.println("Enter a string or :q to quit");
			String str = scanner.nextLine();
			if(str.equals(":q")) break;			
			String[] splitString = str.split("");
			int i = 0;

			while( splitString.length > 0 && i < splitString.length)
			{
				
				//i + 1 == splitString.length ? System.out.print("\n") : System.out.print(splitString[i] + ",");  
				if (i + 1 == splitString.length) {
					System.out.print(splitString[i] + "\n");
				}else {
					System.out.print(splitString[i] + ",");
				}
			  
			  i++;
			}	
		}
	}
	static void countDown(int num) {
		for (int i = num; i >= 0 ; i--) {
			System.out.println(i);
		}
	}
}
