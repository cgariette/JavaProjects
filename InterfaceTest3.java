interface Book{
	char type = 'C';
}
public class InterfaceTest3
{
	public static void main(String args []){
		System.out.println(new Book().type);
	}
}
