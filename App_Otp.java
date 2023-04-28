import java.util.*;

public class App_Otp {

	public static void main(String[] args) {
		
		int length = 6;
		
		System.out.print("Your OTP is: ");
		System.out.println(getOTP(length));
	}
	
	static char[] getOTP(int length)
	{
		char otp[] = new char[length];
		
		String numbers = "456789";
		
		Random rndm_method = new Random();
		
		for(int i=0; i<length; i++)
		{
			otp[i] = numbers.charAt(rndm_method.nextInt(length));
		}
		return otp;
	}

}
