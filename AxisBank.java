package week3.day1;

public class AxisBank  extends Bankinfo{
	
	public void deposit() {
		System.out.println("Axis Bank deposit account");	//overriding the method deposit in axis bank
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bank = new AxisBank();
		bank.deposit();
	
	}

}	