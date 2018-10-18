import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		
		Scanner in = new Scanner(System.in);
		System.out.println("input name : ");
		name = in.next();
		
		Hello n = new Hello();
		n.setname(name);
		System.out.println(n.getname(name));

	}

}
