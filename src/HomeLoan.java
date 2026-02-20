
public class HomeLoan {
	String borrowerName;
	double loanAmount;
	int years;
	double totalRepay;
	static {
		System.out.println("Home loane Department Activated");
	}
	void main() {
		HomeLoan h1=new HomeLoan();
		h1.borrowerName="teja";
		h1.loanAmount=5000;
		h1.years=2;
		h1.calculateRepayment();
		h1.showDetails();
		HomeLoan h2=new HomeLoan();
		h2.borrowerName="Anjali";
		h2.loanAmount=1000;
		h2.years=4;
		h2.calculateRepayment();
		h2.showDetails();
		
	}
	void calculateRepayment() {
		totalRepay=loanAmount+(0.08*loanAmount*years);
	}
	void showDetails() {
		System.out.println("borrowerName:"+borrowerName);
		System.out.println("loanAmount"+loanAmount);
		System.out.println("years:"+years);
		System.out.println("totalrepay:"+totalRepay);
	}

}
