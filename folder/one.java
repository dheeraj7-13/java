create an ArrayList perform various operations on it
  import java.util.*;


public class ArrayListDemo {
	public static void main(String[] args) { // Create an ArrayList to store integers
		ArrayList<Integer> a1 = new ArrayList<>();
		// Add elements to the ArrayList
		a1.add(10);
		a1.add(20);
		a1.add(5);
		a1.add(15);
		// Print the ArrayList
		System.out.println("Original ArrayList: " + a1);

		// Get the size of the ArrayList
		int size = a1.size();
		System.out.println("Size of the ArrayList: " + size);

		// Access an element at a specific index
		int secondElement = a1.get(1);
		System.out.println("Second element: " + secondElement);

		// Modify an element at a specific index
		a1.set(2, 100);
		System.out.println("Modified ArrayList: " + a1);

		// Remove an element by index

		a1.remove(0);
		System.out.println("ArrayList after removing first element: " + a1);

		// Check if an element exists in the ArrayList
		boolean contains20 = a1.contains(20);
		System.out.println("Does the ArrayList contain 20? " + contains20);
		// Sort the ArrayList
		Collections.sort(a1);
		System.out.println("Sorted ArrayList: " + a1);

		// Clear the ArrayList
		a1.clear();
		System.out.println("ArrayList after clearing: " + a1);
	}
}


create employee class sort employee objects salary
  import java.util.*;

class Employee implements Comparator<Employee>
{
	int eid;
	String ename;
	double sal;
		
	Employee()
	{
		
	}

	Employee(int eid, String ename,double sal)
	{
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
	}

	int getEid()
	{
		return eid;
	}

	String getEname()
	{
		return ename;
	}		

	double getSal()
	{
		return sal;
	}

	public String toString()
	{
		return"{"+ eid+","+ename+","+sal+"}";
	}

	//override compare method
	public int compare(Employee e1, Employee e2)
	{
		return Double.compare(e1.getSal(),e2.getSal());
	}



}

class SortByName implements Comparator<Employee>
{
	//override compare method
	public int compare(Employee e1, Employee e2)
	{
		return e1.getEname().compareTo(e2.getEname());
	}	
}

class EmployeeSort
{
	public static void main(String [] args)
	{
		List<Integer> l1=new ArrayList<>();

		l1.add(10);
		l1.add(5);
		l1.add(8);
		l1.add(12);
		System.out.println("Before Sorting: "+l1);
		
		Collections.sort(l1);
		System.out.println("After Sorting: "+l1);

		List<Employee> emp=new ArrayList<>();
		
		emp.add(new Employee(1,"Vaibhav",3400));
		emp.add(new Employee(2,"Vani",3800));
		emp.add(new Employee(3,"Shruti",4000));
		emp.add(new Employee(4,"Devang",3600));

		System.out.println("Before Sorting: "+emp);

		Collections.sort(emp,new Employee());
		System.out.println("After Sorting: "+emp);

	}
}


create linked list and perform various operations on it

create hash set and perform set operations
