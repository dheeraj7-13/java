public class Employee {

   int eid;
   String ename;
   double salary;

   // constructors
   Employee(int eid, String ename) {
      this.eid = eid;
      this.ename = ename;
   }

   // getters
   int getEid() {
      return this.eid;
   }

   String getEname() {
      return this.ename;
   }

   double getSalary() {
      return this.salary;
   }

   // utility method
   void calSalary() {

   }

}

class DailyWagesEmp extends Employee {
   // data members
   double numOfDays;
   double dailyWages;

   // constructor
   DailyWagesEmp(int eid, String ename, double nomOfDays, double dailyWages) {
      super(eid, ename);
      this.numOfDays = numOfDays;
      this.dailyWages = dailyWages;
   }

   void calSalary() {
      // calculate and assign salary
      salary = numOfDays * dailyWages;
   }
}

class EmployeeInh {
   public static void main(String[] args) {
      DailyWagesEmp d1 = new DailyWagesEmp(101, "rahul", 12, 890);
      PermanentEmp d2 = new PermanentEmp(102, "sahil", 50000);
      d1.calSalary();
      d2.calSalary();

      System.out.println("Name: " + d1.getEname() + "Salary" + d1.getSalary());
      System.out.println("Name: " + d2.getEname() + "Salary" + d2.getSalary());

   }
}

class PermanentEmp extends Employee {
   // static data
   static double DA = 144;
   static double HRA = 30;
   static double TA = 1600;
   static double PF = 12.5;

   // data member
   double basicSal;

   // constructor
   PermanentEmp(int eid, String ename, double basicSal) {
      super(eid, ename);
   }

   // override calSalary method
   void calSalary() {
      salary = basicSal + (basicSal * 1.64 + basicSal * .3 + TA) - (basicSal * 0.125);
   }

}
