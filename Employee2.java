public class Employee {
    
    
        int eid ;
        String ename;
        double salary;
        //constructors
         Employee (int eid,String ename)
         {
            this.eid=eid;
            this.ename=ename;
         }
         //getters
         int getEid()
         {
            return this.eid;
         }

         String getEname()
         {
            return this.ename;
         }

         double getSalary()
         {
            return this.salary;
         }
        //utility method
        void calSalary()
        {

        }


}

class DailyWagesEmp extends Employee  
{
 	//data members
	double numOfDays;
	double dailyWages;
	
	//constructor
	DailyWagesEmp(int eid,String ename, double nomOfDays,double dailyWages)
	{
		super(eid,ename);
      this.numOfDays =numOfDays;
      this.dailyWages=dailyWages;
	}
   void calSalary()
   {
      //calculate and assign salary
	salary=numOfDays*dailyWages;
   }
}
class EmployeeInh 
{
   public static void main(String[] args) {
         DailyWagesEmp d1 = new DailyWagesEmp(101, "rahul", 12, 890);
         d1.calSalary();
         System.out.println("Name: "+d1.getEname()+ "Salary"+ d1.getSalary());


      }
}

class EmployeeItem
{
	static int DA = 144;
	static int HRA = 30;
	static int TA = 1600;


}



