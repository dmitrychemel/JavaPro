package homework1;

public class Lesson2 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Project", "ivanivan@gmail.com", "+538573182",3000,35);
        employeeArray[1] = new Employee("Bogdanov Bogdan", "Manager", "bogdan@gmail.com", "+4123412",1570,24);
        employeeArray[2] = new Employee("Bosakov Vasya", "Senior Java ", "seniorvasya@gmail.com", "+341513451",6320,40);
        employeeArray[3] = new Employee("Old Ivan", "Elder", "oldivan@gmail.com", "+435134531",12000,55);
        employeeArray[4] = new Employee("Old Bogdan", "Elder", "oldbogdan@gmail.com", "+21343824122",11100,48);

        for (int i = 0; i < employeeArray.length; i++) {
            if(employeeArray[i].getAge() >40){
                System.out.println(employeeArray[i]);
            }

        }
    }
}
