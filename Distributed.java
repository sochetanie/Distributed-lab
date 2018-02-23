import java.util.*;
import java.io.*;

public class Distributed {
	public static void main(String[] a) {
	String nums;
	int n1, n2, n3, n4, sum;
		
		Scanner keybord = new Scanner(System.in);
		System.out.println("Please enter 4 integers:");

		try {
			BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
			nums = buffer.readLine();

			String[] arr = nums.trim().split(" ");
			
			n1 = Integer.parseInt(arr[0]);
			n2 = Integer.parseInt(arr[1]);
			n3 = Integer.parseInt(arr[2]);
			n4 = Integer.parseInt(arr[3]);
			
			sum = ((n1+n2)*(n3+n4));
			
			System.out.println("( "+n1+" + "+n2+" ) X ( "+n3+" + "+n4+" ) == "+(n1+n2)+" X "+(n3+n4)+" == "+sum);
			
			System.out.println( n1+"X"+n3+" + "+n1+"X"+n4+" + "+n2+"X"+n3+" + "+n2+"X"+n4+" == "+(n1*n3)+" + "+(n1*n4)+" + "+(n2*n3)+" + "+(n2*n4)+" == "+sum );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

//Otput
//(·3·+·4·)·X·(·5·+·6·)·==·7·X·11·==·77?
//3X5·+·3X6·+·4X5·+·4X6·==·15·+·18·+·20·+·24·==·77?