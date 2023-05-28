package badhon.mathode;

public class Methodes {
    public void getInfo(String name, String section, String id, int successCode) {

        System.out.println("My name is: " + name);
        System.out.println("My Section is: " + section);
        System.out.println("My id is: " + id);

        if (successCode == 1) {
            sendMeForIntern(name, "10000", 5.6, 1);
        } else {
            sendMeForPractice();
        }

    }

    private void sendMeForPractice() {
        System.out.println("Please practice more and more");
    }

    public void sendMeForIntern(String name, String salary, double duration, int successCode) {
        System.out.println("My name is: " + name);
        System.out.println("My salary is: " + salary);
        System.out.println("My Intern time is : " + duration + "Month");

        if (successCode == 1) {
            getJob(name, salary, 5);
        } else {
            sendMeForPractice();
        }

    }

    private void getJob(String name, String salary, double duration) {

        int salaryInt = Integer.parseInt(salary);
        int totalSalary = salaryInt + 20000;

        System.out.println("My name is : " + name);
        System.out.println("My Salary is: " + totalSalary);
        System.out.println("Job Time is: " + duration + "Years");

    }


}
