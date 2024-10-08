class Employee {
    // Data members - instance variables
    String firstname;
    String lastname;
    double monsal;

    Employee(String firstname, String lastname , double Monsal)

    {
                        this.firstname=firstname;
                        this.lastname=lastname;
                        this.monsal=monsal;

    }

public String getFirstname() {
    return firstname;
}

public String getLastname() {
    return lastname;
}

public double getMonsal() {
    return monsal;
}

public void setFirstname(String firstname) {
    this.firstname = firstname;
}

public void setLastname(String lastname) {
    this.lastname = lastname;
}

public void setmonsal(double monsal) {
    this.monsal = monsal > 0 ? monsal : 0.0;
}

Employee e1 = new Employee(firstname, lastname, monsal);
Employee e2 = new Employee(firstname, lastname, monsal);


}

class EmployeeTest 
{

    
}
