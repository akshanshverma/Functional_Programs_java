import java.util.Scanner;

public class StringRp {

	public static void main(String[] args) {
		String t = "Hello <<UserName>>, How are you?";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String nm = sc.next();
		String newS = t.replaceAll("<<UserName>>", nm);
		System.out.println(newS);
		sc.close();
	}
}
