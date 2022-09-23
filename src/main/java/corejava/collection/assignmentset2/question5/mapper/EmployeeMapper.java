package corejava.collection.assignmentset2.question5.mapper;

import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question5.model.Employee;

public class EmployeeMapper {
    public static Employee map(final String data)throws RuntimeException {
        Employee employee;
        try {
            String[] arrData = data.split(",");
            Integer empId = Integer.parseInt(arrData[0]);
            String empName = arrData[1];
            String department = arrData[2];
            Float salary = Float.parseFloat(arrData[3].trim());
            employee = new Employee(empId, empName, department,salary);
        }catch (NumberFormatException numberFormatException){
            throw new RuntimeException(numberFormatException);
        }
        return employee;
    }
}
