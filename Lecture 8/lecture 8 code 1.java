public class L8C1 {
    int employeeId;
    int salary;
    String dept;
    L8C1(int empid, int sal, String d){
        employeeId = empid;
        salary = sal;
        dept = d;
    }
    public static void main(String[] args){
        L8C1 james = new L8C1(101,30000,"testing");
        L8C1 amy = new L8C1(102,50000,"engineering");

        System.out.println(james.employeeId+"salary"+"james.salary"+"Dept"+james.dept);
        System.out.println(amy.employeeId+"salary"+"amy.salary"+"Dept"+amy.dept);
    }
}