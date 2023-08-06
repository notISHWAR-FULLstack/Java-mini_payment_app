package DEBITCARD;


public class DebitCards implements DebitCard{
	private long debitCardNumber;
	private byte cvv;
	private String holderName;
	private boolean active;
	private char gender;
	
	public final boolean status;
	
	public DebitCards(){
		this.status = true;
		System.out.println("Debit Card Started");
	}
	
	public DebitCards(String command) {
		this.status = false;
		switch(command.toLowerCase()) {
		case "develop":
			System.out.println("Development mode started");
			break;
		case "test":
			System.out.println("Testing environment started");
			break;
		default:
			System.out.println("Nothing happening WITH YOUR COMMAND => "+command);
			break;
		}
	}
	
	//##########################################################################################################################################################
	protected void set_debitCardNumber(long debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	
	protected void set_cvv(byte cvv) {
		this.cvv = cvv;
	}
	
	protected void set_holderName(String holderName) {
		this.holderName = holderName;
	}
	
	protected void set_active(boolean active) {
		this.active = active;
	}
	
	protected void set_gender(char gender) {
		this.gender = gender ;
	}
	//##########################################################################################################################################################
	
	public void printAll() {
		System.out.println("Status is => "+this.status);
		System.out.println("DebitCard number=>"+get_debitCardNumber()+"\nCVV=>"+get_cvv()+"\nCardHolderName=>"+get_holderName()+"\nActivity=>"+get_active()+"\nGender=>"+get_gender());
	}
	
	//##########################################################################################################################################################
	
	@Override
	public long get_debitCardNumber() {
		if(this.status == true)
			return this.debitCardNumber;
		return 0;
	}
	@Override
	public byte get_cvv() {
		if(this.status == true)
			return this.cvv;
		return 0;
	}
	@Override
	public String get_holderName() {
		if(this.status == true)
			return this.holderName;
		return null;
	}
	@Override
	public boolean get_active() {
		if(this.status == true) {
			return this.active;
		}
		return false;
	}
	@Override
	public char get_gender() {
		if(this.status == true)
			return this.gender;
		return 'O';
	}	
}
