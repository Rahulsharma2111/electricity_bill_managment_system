import java.util.Scanner;

public class bill_calculate {
    public static void main(String[] args) {
        System.out.println("====================== Bill Management System ======================");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select option which type of meter you have Commercial or Non-Commercial");
        System.out.println("1. Commercial Meter");
        System.out.println("2. Non-Commercial Meter");
        System.out.println();
        System.out.print("Select Option= ");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("------------ You select Commercial meter ------------");
                System.out.print("Enter Units= ");
                int comm_unit= sc.nextInt();
                commercial_meter comm=new commercial_meter(comm_unit);
                comm.unit_rate_cal();
                break;

            case 2:
                System.out.println("------------ You select Commercial meter ------------");
                System.out.print("Enter Units= ");
                int noncom_unit= sc.nextInt();
                non_commercial_meter nonCom=new non_commercial_meter(noncom_unit);
                nonCom.unit_rate_cal();
                break;

            default:
                System.out.println("Please enter correct choice");
                break;
        }
    }
}
