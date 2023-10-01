
public class bank_account {
		
		int acc_no;
		double balance;
		String acc_holder;
		
		public String Getacc_holder()
		{
			return acc_holder;
		}
		public void Setname(String acc_holder)
		{
			this.acc_holder=acc_holder;
		}
		public int Get_accno()
		{
			return Get_accno();
		}
		public void Setacc_no(int acc_no) 
		{
		this.acc_no=acc_no;	
		}
	    public double Getbalance()
	    {
	    	return balance;
	    }
	    public void Setbalance(double balance)
	    {
	    	this.balance=balance;
	    }
	    void Addmoney(double amount)
	    {
	    	this.balance=balance+amount;
	    }
	    void Withdrawmoney(double amount)
	    {
	    	this.balance=balance-amount;
	    }
	    
	    void accDetails()
	    {
	    System.out.println("name: "+acc_holder+"\naccno: "+acc_no+ "\nbalance: "+balance);
	    }
		public static void main(String[] args) {
			
	          bank_account b1=new bank_account ();
	          b1.Setacc_no(007);
	          b1.Setname("Anish");
	          b1.Setbalance(50000);
	          b1.accDetails();

	          b1.Addmoney(1000);
	          b1.accDetails();
	          b1.Withdrawmoney(10000);
	          b1.accDetails();
	          
	}
}

	
