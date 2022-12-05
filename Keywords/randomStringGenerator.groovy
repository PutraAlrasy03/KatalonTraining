import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil

public class randomStringGenerator {

	@Keyword(keywordObject='Sign Up')
	public String generateRandomUsername(int strLength) {
		String s1 ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmneopqrstuvwxyz0123456789"
		Random rand = new Random()
		StringBuilder sb = new StringBuilder()
		for (int j =1; j<= strLength; j ++) {
			sb.append(s1.charAt(rand.nextInt(s1.length())))
		}

		return sb
	}
	@Keyword(keywordObject='Registered Account')
	public void print(String username) {
		System.out.println(username+"is registered!");
		KeywordUtil.logInfo(username+ "is registered");
	}
}
