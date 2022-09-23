package corejava.collection.assignmentset2.question5.solution;
import corejava.collection.assignmentset2.question5.model.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestSalary {
    public Map<String, List<Employee>> processData(List<Employee> employeeList) {
        Map<String, List<Employee>> employeeMap = new HashMap<>();
        for (Employee employee : employeeList) {
            String departmentOfEmp = employee.getDepartment();
            if (employeeMap.containsKey(departmentOfEmp)) {
                List<Employee> empList = employeeMap.get(departmentOfEmp);
                empList.add(employee);
            } else {
                List<Employee> tempEmployeeList = new ArrayList<>();
                tempEmployeeList.add(employee);
                employeeMap.put(departmentOfEmp, tempEmployeeList);
            }
        }
        return employeeMap;
    }
    public void printEmployeeMap(Map<String, Employee> employeeMap) {
        for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            Employee employee = entry.getValue();
            System.out.println("Key: " + entry.getKey() + " " + "Value: " + employee);
        }
    }
    public Map<String, Employee> getHighestSalaryPaidEmployeeInEachDepartment(Map<String, List<Employee>> employeeMap) {
        Map<String, Employee> stringEmployeeMap = new HashMap<>();
        float maxValue = 0.0f;
        for (Map.Entry<String, List<Employee>> entry : employeeMap.entrySet()) {
            List<Employee> employeeList = entry.getValue();
            for (Employee employee : employeeList) {
                if (employee.getSalary() > maxValue) {
                    maxValue = employee.getSalary();
                    stringEmployeeMap.put(entry.getKey(), employee);
                }
            }
            maxValue = 0.0f;
        }
        return stringEmployeeMap;
    }

}
