package e_sixth_lesson.taskTwo;

import java.util.Arrays;

public class Main {
    public static void main(String[] arg) {
        Employee[] arr = {
                new SalariedEmployee("Vlad", "1", " Abc123", 8, 50),
                new ContractEmployee("Vitalii", "2", 3000, "B012"),
                new SalariedEmployee("Artem", "3", " Abc456", 6, 23),
                new SalariedEmployee("Kolya", "4", "SDF121", 5.2, 52.5),
                new ContractEmployee("Dima", "5", 2990, "C031"),
                new ContractEmployee("Roman", "6", 3010, "A021"),
        };
        printEmployee(arr);
        System.out.println("");
        printEmployee(getDescendingSequence(arr));

    }
    public static Employee[] getDescendingSequence(Employee[] arr){
        Employee temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i].calculatePay() < arr[j].calculatePay()){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                 }
            }
        }
        return arr;
    }
    public static void printEmployee(Employee[] arr){
        for(Employee e : arr){
            System.out.println(e.getDescription());
        }
    }
}
