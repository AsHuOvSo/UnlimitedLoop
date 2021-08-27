import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int firstNum, secondNum, res;
            Scanner input = new Scanner(System.in);

            firstNum = Begin();
            secondNum = StepTwo();
            res = Average(firstNum, secondNum);
            do {
                firstNum = res;
                secondNum = Continue();
                res = Average(firstNum, secondNum);
                if(input.next() == "q" || input.next() == "Q") {
                    break;
                }
            } while(!(input.next().equals("q") || input.next().equals("Q")));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int Begin() {
        int firstNum = 0;
        Scanner input = new Scanner(System.in);
        while (firstNum == 0) {
            System.out.print("Welcome! Please enter a number: ");
            if (input.hasNextInt()) {
                firstNum = input.nextInt();
            }
            else if(input.next().equals("q") || input.next().equals("Q")) {
                System.out.println("System finished.");
                System.exit(0);
            }
            else {
                System.out.println("Error! Wrong input!");
            }
        }
        return firstNum;
    }

    public static int StepTwo() {
        int secondNum = 0;
        Scanner input = new Scanner(System.in);
        while(secondNum == 0) {
            System.out.print("Please enter a second number: ");
            if (input.hasNextInt()) {
                secondNum = input.nextInt();
            }
            else if(input.next().equals("q") || input.next().equals("Q")) {
                System.out.println("System finished.");
                System.exit(0);
            }
            else {
                System.out.println("Error! Wrong input!");
            }
        }
        return secondNum;
    }

    public static int Continue() {
        int continueNumber = 0;
        Scanner input = new Scanner(System.in);
        while(continueNumber == 0) {
            System.out.print("Please enter another number: ");
            if (input.hasNextInt()) {
                continueNumber = input.nextInt();
            }
            else if(input.next().equals("q") || input.next().equals("Q")) {
                System.out.println("System finished.");
                System.exit(0);
            }
            else {
                System.out.println("Error! Wrong input!");
            }
        }
        return continueNumber;
    }

    public static int Average(int numbOne, int numbTwo) {
        int res;
        Loop loopOne = new Loop();
        res = loopOne.findAverage(numbOne, numbTwo);
        System.out.println("The average of " + numbOne + " and " + numbTwo + " is " + res);
        return res;
    }

}
