package com.ford.collections;

import java.io.*;
import java.util.*;

public class EmployeeClass {
    String employeeId;
    String employeeName;
    String department;
    String managerId;
    int grossSalary;
    int experience;

    public boolean createSortedEmployeesFile() throws IOException {
        File sortedEmployeesFile = new File("C:\\Users\\lenovo\\Downloads\\SortedEmployees.csv");
        boolean result = sortedEmployeesFile.createNewFile();
        return result;
    }

    public boolean checkFileExistence() {
        File sortedEmployeesFile = new File("C:\\Users\\lenovo\\Downloads\\SortedEmployees.csv");
        boolean result = sortedEmployeesFile.canExecute();
        return result;
    }

    public String toString(EmployeeClass employee) {
        return "EmployeeClass{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", managerId='" + managerId + '\'' +
                ", grossSalary=" + grossSalary +
                ", experience=" + experience +
                '}';
    }

    public void printInformation() throws FileNotFoundException {
        EmployeeClass employeeClass = new EmployeeClass();
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Downloads\\Employees.csv"));
            while ((line = reader.readLine()) != null) {
                String[] employee = line.split(",");
                //System.out.println(employeeClass.toString(employeeClass));
                System.out.println("employee ID:" + employee[0] + "\tname:" + employee[1] +
                        "\nDepartment:" + employee[2] + "\tManager:" + employee[3] +
                        "\nSalary:" + employee[4] + "\tExp:" + employee[5] + "\n\n");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getManager(String name) {
        //ArrayList<String>[] content = new ArrayList[10];
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Downloads\\Employees.csv"));
            String line = "";
            while ((line = reader.readLine()) != null) {
//                content.add(line.split(","));
//                Iterator<String[]> itr = content.iterator();
//                System.out.println(content.get(0));
//                while(itr.hasNext()){
//                    System.out.println(itr.next() + " ");
//                }
                String[] values = line.split(",");
//                for (int index = 0; index < content.size(); index++) {
//                    if (content.get(index).equals(name)) {
//                        return content.get(3);
//                    }
//                }
                //System.out.println(content.get(0));
                if (values[1].equals(name)) {
                    return values[3];
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void sortEmployeesBasedOnColumnName(int sortColumn) throws IOException {
        String csvFile = "C:\\Users\\lenovo\\Downloads\\Employees.csv";
        String line = "";
        FileWriter writer = new FileWriter("C:\\Users\\lenovo\\Downloads\\SortedEmployees.csv");
        List<List<String>> employeeList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                employeeList.add(Arrays.asList(line.split(",")));
            }
            employeeList.sort(new Comparator<List<String>>() {
                @Override
                public int compare(List<String> o1, List<String> o2) {
                    return o1.get(sortColumn).compareTo(o2.get(sortColumn));
                }
            });
            System.out.println(employeeList);
            //FileWriter writer = new FileWriter("C:\\Users\\lenovo\\Downloads\\SortedEmployees.csv");


        } catch (IOException e) {
            e.printStackTrace();
        }
//        for (List<String> data: employeeList) {
//            writer.append(String.join(","),employeeList);
//        }

    }

    public Object sumOfSalaryForDepartment(String dept) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Downloads\\Employees.csv"));
            String line = "";
            int i;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (values[2].equals(dept)) {
                    i = Integer.parseInt(values[4]);
                    //System.out.println(i);
                    sum+=i;
                }
            }
            return sum;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void changeManager(String name) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Downloads\\Employees.csv"));
            String line = "";
            //FileWriter writer = new FileWriter("C:\\Users\\lenovo\\Downloads\\Employees1.csv");
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (values[1].equals(name)) {
                    values[3] = "Gupta";
                    //writer.write(values[3]);
                    System.out.println(values[3]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
