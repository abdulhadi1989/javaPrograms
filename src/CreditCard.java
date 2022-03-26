import java.util.Date;

//Class names are nouns in upper camelcase
public class CreditCard {

	
	public final int VISA = 9001;
	
	//variables names are short but meaningful in lower camel case
	public String accountName;
	public String cardNumber;
	public Date expDate;
	
	// methods should be verbs, in lower camel case
	public double getCharges() {
		return 0.0;
	}
	
	public void disputeCharge(String chargeId,float amount) {
		
	}
}
