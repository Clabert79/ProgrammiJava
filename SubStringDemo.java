public class SubStringDemo{
	public static void main(String[] args){
		
		String a = "Java is great";
		System.out.println(a);

		String b = a.sustring(5);
		System.out.println(b);

		String c = a.sustring(5,7);
		System.out.println(c);

		String b = a.sustring(5,a.lenght());
		System.out.println(b);

	}
}