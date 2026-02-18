import java.util.Random;

public class RandomOtpGenrator {

    // Method to generate OTP of given length
    public static String generateOTP(int length) {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int digit = random.nextInt(10); // 0 to 9
            otp.append(digit);
        }

        return otp.toString();
    }

    public static void main(String[] args) {
        int otpLength = 6; // Change if needed
        String otp = generateOTP(otpLength);

        System.out.println("Your OTP is: " + otp);
    }
}

