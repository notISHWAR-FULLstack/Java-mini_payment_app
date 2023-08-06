package DEBITCARD;

public interface DebitCard {
	long get_debitCardNumber();
	byte get_cvv();
	String get_holderName();
	boolean get_active();
	char get_gender();
	void printAll();
	//void set_debitCardNumber(long number);#illegal access error
}
