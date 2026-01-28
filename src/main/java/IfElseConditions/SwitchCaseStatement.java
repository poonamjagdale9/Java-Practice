package IfElseConditions;

public class SwitchCaseStatement {
    public static void main(String args[]){
        int weekday =6;

        switch (weekday){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursaday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default:System.out.println("Invalid number");

        }

        String dayname= "Sunday";
        switch (dayname){
            case "Sunday": System.out.println("1 day of the week"); break;
            case "Monday": System.out.println("2 day of the week"); break;
            case "Tuesday": System.out.println("3 day of the week"); break;
            case "Wednesday": System.out.println("4 day of the week"); break;
            case "Thursday": System.out.println("5 day of the week"); break;
            case "Friday": System.out.println("6 day of the week"); break;
            case "Saturday": System.out.println("7 day of the week"); break;
            default: System.out.println("Invalid day");

        }
    }
    // largest of 2 number (if condition or ternary operator
    //smallest of 3 numbers (if else)
    // print week number based on week name




}
