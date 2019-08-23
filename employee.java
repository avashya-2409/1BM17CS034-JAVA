import java.util.*;
class employee
{
     String employeid;
     String empname;
     int basicsalary,DA,GS,incometax,netsalary;
     public void read()
     {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the employee id");
        employeid=scan.next();
        System.out.println("Enter the employee name");
        empname=scan.next();
        System.out.println("Enter the basic salary of an employee");
        basicsalary=scan.nextInt();
        calculate();
     }
     public void calculate()  
     {
        DA=(75/100)*basicsalary;
        GS=basicsalary+DA+HRA;
        incometax=(30/100)*GS;
        netsalary=basic+DA-incometax;
     }
     public void display()
     {
System.out.println("Employeeid  :  "+employeid+"n"+"Employename  :  "+empname+"n"+"Employee basic salary  :  "+DA+"n"+"GS  :  "+GS+"n"+"Incometax  :  "+incometax+"n"+"netsalary  :  "+netsalary);
}
 
}
class main
{
public static void main(String args[])
{
employee employeobj=new employee();
employeobj.read(); 
employeobj.display(); 
}
}