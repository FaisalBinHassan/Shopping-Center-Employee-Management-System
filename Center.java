/*

    - -  Similar to LinkedLists class - -
 */
package ASSIGNMENTs.Assignment01;

import java.util.LinkedList;

public class Center {
    private String centerName;
    private int centerID;
    private Employee head;


    /////////////////////////// Setters / Getters /////////////////////////////////////////

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public int getCenterID() {
        return centerID;
    }

    public void setCenterID(int centerID) {
        this.centerID = centerID;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }



    /////////////////////////// Constructers /////////////////////////////////////////


    public Center() {
    }

    public Center(String centerName) {
        this.centerName = centerName;
    }

    public Center(String centerName, int centerID) {
        this.centerName = centerName;
        this.centerID = centerID;
    }

    public Center(String centerName, int centerID, Employee head) {
        this.centerName = centerName;
        this.centerID = centerID;
        this.head = head;
    }


    /////////////////////////// Add Employee /////////////////////////////////////////


    // Add employee
    public void addEmployee(int empID, String fname, String lName, String product) {
        if (!IsEmpty()) {
            Employee helpPtr = head;
            while (helpPtr.getNext() != null) {
                helpPtr = helpPtr.getNext();
            }
            helpPtr.setNext(new Employee(empID, fname, lName,product, helpPtr.getNext()));
        }
        else  {head = new Employee(empID, fname, lName,product, null);}
    }

    /*

    - Add employee by using the ready linkedlist class -

    public void a2ddEmployee(int empID, String fname, String lName, String product) {
        LinkedList<Employee> s = new LinkedList<>();
        s.add(new Employee(empID, fname, lName,product, null);
    }
    */

    // 2nd - Method to add employee.
    public void addEmployee(Employee employee){
        if(IsEmpty()){
            this.head = employee ;
            return;
        }
        Employee helptr = head;
        while(helptr.getNext() != null){
            helptr = helptr.getNext();
        }
        helptr.setNext(employee);
    }

    /////////////////////////// Check if the lists is empty or not /////////////////////////////////////////


    // Method for cheking the LLnode is empty or not.
    public boolean IsEmpty(){
        return head==null;
    }


    /////////////////////////// Search Employee within list /////////////////////////////////////////


    // Search employee by id
    public boolean searchEmployeeByID(int empID) {
        if (!IsEmpty()) {
            Employee helpPtr = head;
            while (helpPtr != null) {
                if (helpPtr.getEmpID() == empID) {
                    return true;
                }
                helpPtr = helpPtr.getNext();
            }
        }
        return false;
    }
    public Employee searchEmployeeByID_withReturn(int empID) {
        if (!IsEmpty()) {
            Employee helpPtr = head;
            while (helpPtr != null) {
                if (helpPtr.getEmpID() == empID) {
                    return helpPtr;
                }
                helpPtr = helpPtr.getNext();
            }
        }
        return null;
    }

    // 2nd - Method to search employee within list.
    public Employee searchByID(int empID){
        // Convert int id to String.
        String id = empID+"";
        // Check if LLnode is empty or not.
        if(IsEmpty()) {
            // If empty return null.
            return null;
        }
        // Student object for LLnode.
        Employee helptr = this.head;
        // Student object for retun student if found it.
        Employee employee = null;
        // Loop for if LLnode not equal null.
        while(helptr != null){
            // If  LLnode id equal to id.
            if(helptr.getEmpID() == empID){
                //Then student equal to this LLnode.
                employee = helptr;
            }
            // For got to next node.
            helptr = helptr.getNext();
        }
        // Return found student.
        return employee;
    }


    /////////////////////////// swap / delete  Employee /////////////////////////////////////////

    // Swap employee
    public void swapEmployees(int empID1, int EmpID2) {

    }

    // Delete employee
    public void deleteEmployeeByID(int empID) {
        if (!IsEmpty()) {
            Employee helpPtr2 = head;

            if (helpPtr2.getEmpID() == empID)
                helpPtr2 = helpPtr2.getNext();

            else {
                Employee helpPtr = head;
                while (helpPtr.getNext() != null) {
                    if (helpPtr.getNext().getEmpID() == empID) {
                        helpPtr.setNext(helpPtr.getNext().getNext());
                    }
                    helpPtr = helpPtr.getNext();
                }
            }
        }
    }


    /////////////////////////// Count number of Employee's /////////////////////////////////////////

    // Number of nodes
    public int numberOfEmployees() {
        int count = 0;
        if (!IsEmpty()) {
            Employee helpPtr = head;
            while (helpPtr != null) {
                count++;
                helpPtr = helpPtr.getNext();
            }
        }
        return count;
    }

    // 2nd - Method to count number of employee's within list.
    public int NumberOfemp(){
        int numEmp=0;
        Employee helpPtr = this.head;
        if(IsEmpty()){
            return numEmp;
        }
        while (helpPtr != null){
            numEmp++;
            helpPtr = helpPtr.getNext();
        }
        return numEmp;
    }


    /////////////////////////// replace Employee in list /////////////////////////////////////////

    // Replace employee
    public void replaceEmployee(int empIDOld, Employee newEmployee) {
        if (!IsEmpty()) {
            Employee oldEmployee = searchEmployeeByID_withReturn(empIDOld);

            if (oldEmployee != null && newEmployee != null) {
                Employee helpPtr = head;
                while (helpPtr != null) {
                    if (helpPtr == oldEmployee) {
                        helpPtr.setEmpID(newEmployee.getEmpID());
                        helpPtr.setFname(newEmployee.getFname());
                        helpPtr.setLname(newEmployee.getLname());
                    }
                    helpPtr = helpPtr.getNext();
                }
            }
        }
    }

}
