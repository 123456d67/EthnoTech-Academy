class Employee{
    void status()
    {
        System.out.println("Employee Name:Lokesh");
        System.out.println("Employee id:23");
        System.out.println("Employee status:Full stack developer");
    } 
    void salary()
    {
        int sal=60000;
        System.out.println("Salary:"+sal);
    }
}
class Employee1 extends Employee{
    void status1()
    {
        System.out.println("Employee Nmae:Ram");
        System.out.println("Employee id:34");
        System.out.println("Employee status:Tester");
    }

     void salary1()
     
    {
        int sal=60000;
        System.out.println("Salary:"+sal);
    }
}
class Employee2 extends Employee1{
    void status2()
    {
        System.out.println("Employee Nmae:Deva");
        System.out.println("Employee id:42");
        System.out.println("Employee status:Data Analyst");
    }
     void salary2()
    {
        int sal=60000;
        System.out.println("Salary:"+sal);
    }
}
class Employee3 extends Employee2{
    void status3()
    {
        System.out.println("Employee Nmae:Ravan");
        System.out.println("Employee id:3");
        System.out.println("Employee status:Manager");
    }
     void salary3()
    {
        int sal=10000;
        System.out.println("Salary:"+sal);
    }
}
class Inheretance{
    public static void main(String[] args) {
        Employee3 e2=new Employee3();
        e2.status3();
        e2.salary3();
        e2.status1();
        e2.salary1();
        e2.status2();
        e2.salary2();
        e2.status();
        e2.salary();
    }
}
