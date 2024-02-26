package in.ashokit;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String encode = PasswordService.encode("india@123");
		System.out.println(encode);
		String decode = PasswordService.decode(encode);
		System.out.println(decode);
	}

}
