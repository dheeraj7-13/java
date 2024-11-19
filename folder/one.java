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
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
       
        LinkedList<String> l1 = new LinkedList<>();

        // Add elements to the LinkedList
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Cherry");
        l1.add("Mango");

        // Print the LinkedList
        System.out.println("Original LinkedList: " + l1);

        // Get the size of the LinkedList
        int size = l1.size();
        System.out.println("Size of the LinkedList: " + size);

	//Peed the element in Linked list
	System.out.println("Peek :" + l1.peek());

        // Access an element at a specific index
        String secondElement = l1.get(1);
        System.out.println("Second element: " + secondElement);

        // Modify an element at a specific index
        l1.set(2, "Kiwi");
        System.out.println("Modified LinkedList: " + l1);

        // Remove an element by index
        l1.remove(0);
        System.out.println("After Remove Operation: " + l1);

        // Check if an element exists in the LinkedList
        boolean containsCherry = l1.contains("Cherry");
        System.out.println("contain Cherry? " + containsCherry);

        // Add an element at the beginning
        l1.addFirst("Orange");
        System.out.println("LinkedList after adding at the beginning: " + l1);

        // Add an element at the end
        l1.addLast("Grape");
        System.out.println("LinkedList after adding  at the end: " + l1);

        // Remove the first element
        l1.removeFirst();
        System.out.println("LinkedList after removing the first element: " + l1);

        // Remove the last element
        l1.removeLast();
        System.out.println("LinkedList after removing the last element: " + l1);

        // Clear the LinkedList
        l1.clear();
        System.out.println("LinkedList after clearing: " + l1);

	
    }
}

create hash set and perform set operations
import java.util.*;


public class HashSetDemo {
    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();
        // Add elements to set1
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
	System.out.println("Set 1:"+set1);

	Set<Integer> set2 = new HashSet<>();
        // Add elements to set2
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);
	System.out.println("Set 2:"+set2);

        // Union 
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union of set 1 and set 2: " + union);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of set 1 and set 2: " + intersection);

        // Difference of set1 from set2
        Set<Integer> difference1 = new HashSet<>(set1);
        difference1.removeAll(set2);
        System.out.println("Difference of set 1 from set 2: " + difference1);

        // Difference of set2 from set1
        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.removeAll(set1);
        System.out.println("Difference of set 2 from set 1: " + difference2);
    }
}
