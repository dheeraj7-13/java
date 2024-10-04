
public class Account {
    //data members are also called as instance variable 
    int acNo;
    String acName;
    double acBal;
    //constructor - three arguments
    Account(int acNo,String acName, double acBal) {
        
        this.acNo=acNo;
        this.acName=acName;
        this.acBal=acBal;
    }
    //define getters and setters; 
      int getAcNo()
    {
        return this.acNo;
    }
    void setAcNo(int acNo)
    {
        this.acNo=acNo;
    }

    String getAcName()
    {
        return this.acName;
    }

    double getAcBal(){
        return this.acBal;
    }
    void setAcBal(double acBal)
    {
        this.acBal=acBal;
    }
}

class AccountTest{
    public static void main ( String[] args )
    {
        Account a1 = new Account(101,"ABC",2000);
        Account a2 = new Account(102,"PQR",3000);
        //first object
        
        
        

        System.out.println("Account information");        
        print(a1);
        print(a2);


        // System.out.println("Ac No:"+a1.getAcNo());        
        // System.out.println("Ac Name:"+a1.getAcName());        
        // System.out.println("Ac Balance:"+a1.getAcBal());        

 }

  static void print (Account temp)
	    {
      
		        System.out.println("Ac No:"+temp.getAcNo());        
		        System.out.println("Ac Name:"+temp.getAcName());        
		        System.out.println("Ac Balance:"+temp.getAcBal());        
            }

    
}
