import java.util.Scanner;
class Employee{
    double salary;
    int id;
}
class Developer extends Employee{
    int bonus;
}
class Company extends Developer{
    String name;
}
class TestInheritance{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Company c=new Company();
        System.out.print("Enter username:");
        c.name=sc.nextLine();
        System.out.print("Enter ID:");
        c.id=sc.nextInt();
        System.out.print("Enter Salary:");
        c.salary=sc.nextInt();
        System.out.print("Enter Bonus:");
        c.bonus=sc.nextInt();
        System.out.println("Employee name:"+c.name);
        System.out.println("Employee ID:"+c.id);
        System.out.println("Employee Salary:"+c.salary);
        System.out.println("Employee Bonus:"+c.bonus);
        sc.close();
     }
}
