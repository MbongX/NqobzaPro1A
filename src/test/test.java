package test;

import java.util.Scanner;

public class test {
    //fields
    int choice, choice2, taskNum, taskID, numOfTask;
    String taskName, taskDescription, taskStatus;
    Scanner input = new Scanner(System.in);
    Scanner uInput = new Scanner(System.in);

    //Construct
    //get the number of tasks to be added upon initial execution of the program
    public test() {
        System.out.println("Hii");
    }

    public static void main(String[] args) {
        int counter = 0;
        Scanner counter2 = new Scanner(System.in);
        test obj = new test();


        do {
            obj.menu(); //Prints the menu
            if (obj.choice == 1) {
                System.out.println("How many tasks do you wish to add ? ");
                counter = counter2.nextInt();
                obj.validate(counter);

            }
        }
        while (obj.choice != 3);


    }

    //methods
    void menu() {

        System.out.println("===================================================");
        System.out.println("=======================Menu========================");
        System.out.println("===================================================");
        System.out.println("[1] \t Add tasks");
        System.out.println("[2] \t Show Report");
        System.out.println("[3] \t Exit");
        System.out.println("===================================================");
        System.out.print("Choose an option to continue : ");
        choice = input.nextInt();
        System.out.println("===================================================");

    }

    void statusMenu() {
        System.out.println("===================================================");
        System.out.println("=================Task Status Menu==================");
        System.out.println("===================================================");
        System.out.println("[1] \t To DO");
        System.out.println("[2] \t Doing");
        System.out.println("[3] \t Done");
        System.out.println("===================================================");
        System.out.print("Selected the Task Status from the above menu: ");
        choice2 = input.nextInt(); //2
        //int sum2 = 4*4;
    }

    void validate() {

        do {
            if (!((choice == 3) || (choice == 2) || (choice == 1))) {

                do {
                    System.out.println("-=:Invalid input, Please try again:=-");
                    menu();
                }
                while (!((choice == 3) || (choice == 2) || (choice == 1)));

            }
            if ((choice == 3) || (choice == 2) || (choice == 1)) {
                //================Beginning of huge if====================
                if (choice == 1) {
                    System.out.println("===================================================");
                    System.out.println("How many tasks do you wish to add ? ");
                    numOfTask = input.nextInt();
                    System.out.println("===================================================\n");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    //==============Beginning of huge for loop=======================

                    for (int i = 0; i < numOfTask; i++) {
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Task Name : ");
                        taskName = input.next();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Task Number : ");
                        taskNum = input.nextInt();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Task Description : ");
                        taskDescription = uInput.nextLine();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

                        String countTDetail = taskDescription.strip();
                        //trim down excess whitespaces
                        countTDetail.trim();
                        //Removing the white spaces in between the strings
                        String noSpace_CTD = countTDetail.replaceAll("\\s", ""); // "\\s" -> represent a single line of space

                        int taskDescription_len = noSpace_CTD.length();
                        System.out.println("Total character in Task Description : " + taskDescription_len);
                        //validating
                        // if (taskDescription_len < 50) {
                        //     System.out.println("it works--- Please correct this output");
                        // }
                        if ((taskDescription_len > 50)) {
                            do {
                                System.out.println("Please enter a task description of less than 50 characters");
                                System.out.print("Task Description : ");
                                taskDescription = uInput.nextLine();
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                                countTDetail = taskDescription.strip();
                                //trim down excess whitespaces
                                countTDetail.trim();
                                //Removing the white spaces in between the strings
                                noSpace_CTD = countTDetail.replaceAll("\\s", ""); // "\\s" -> represent a single line of space
                                taskDescription_len = noSpace_CTD.length();
                                System.out.println(taskDescription_len);
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                            }
                            while ((taskDescription_len > 50));
                        } else {
                            System.out.println("Task captured successfully");
                            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        }
                        //Dev Details
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("-=:Developer Details:=-");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Developer Name : ");
                        String devFirstName = uInput.next();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Developer Surname : ");
                        String devLastName = uInput.next();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        //TaskID
                        //System.out.println("###################################################");
                        String taskID = taskName.substring(0, 1).concat(":") + taskNum + ":" + (devFirstName.substring(devFirstName.length() - 3)); //
                        taskID = taskID.toUpperCase();
                        // System.out.println("###################################################");
                        //Hours
                        int Duration = 0;
                        Scanner Nqo = new Scanner(System.in);

                        System.out.println("Please enter N.o hours You would like to use:");
                        Duration = Nqo.nextInt();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("Your entered  :" + Duration + "hrs");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        //Task Status
                        statusMenu();
                        //choice = input.nextInt(); //2
                        if (!((choice2 == 1) || (choice2 == 2) || (choice2 == 3))) {
                            do {
                                System.out.println("Invalid entry, please try again");
                                statusMenu();
                            }
                            while (!((choice2 == 1) || (choice2 == 2) || (choice2 == 3)));
                        }
                        if (((choice2 == 1) || (choice2 == 2) || (choice2 == 3))) {
                            if (choice2 == 1) {
                                taskStatus = "To Do";
                                System.out.println("[Task Status]: " + taskStatus);
                                System.out.println("===================================================");
                            }
                            if (choice2 == 2) {
                                taskStatus = "Doing";
                                System.out.println("[Task Status]: " + taskStatus);
                                System.out.println("===================================================");
                            }
                            if (choice2 == 3) {
                                taskStatus = "Done";
                                System.out.println("[Task Status]: " + taskStatus);
                                System.out.println("===================================================");
                            }
                        }
                    }
                }//====================End of huge if===================
            }//==================End of for loop

        }
        while (choice != 3);
    }

    void validate(int lCounter) {

        do {
            if (!((choice == 3) || (choice == 2) || (choice == 1))) {

                do {
                    System.out.println("-=:Invalid input, Please try again:=-");
                    menu();
                }
                while (!((choice == 3) || (choice == 2) || (choice == 1)));

            }
            if ((choice == 3) || (choice == 2) || (choice == 1)) {
                //================Beginning of huge if====================
                if (choice == 1) {
                    // System.out.println("===================================================");
                    //  System.out.println("How many tasks do you wish to add ? ");
                    // numOfTask = input.nextInt();
                    System.out.println("===================================================\n");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    //==============Beginning of huge for loop=======================

                    for (int i = 0; i < lCounter; i++) {
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Task Name : ");
                        taskName = input.next();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Task Number : ");
                        taskNum = input.nextInt();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Task Description : ");
                        taskDescription = uInput.nextLine();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

                        String countTDetail = taskDescription.strip();
                        //trim down excess whitespaces
                        countTDetail.trim();
                        //Removing the white spaces in between the strings
                        String noSpace_CTD = countTDetail.replaceAll("\\s", ""); // "\\s" -> represent a single line of space

                        int taskDescription_len = noSpace_CTD.length();
                        System.out.println("Total character in Task Description : " + taskDescription_len);
                        //validating
                        // if (taskDescription_len < 50) {
                        //     System.out.println("it works--- Please correct this output");
                        // }
                        if ((taskDescription_len > 50)) {
                            do {
                                System.out.println("Please enter a task description of less than 50 characters");
                                System.out.print("Task Description : ");
                                taskDescription = uInput.nextLine();
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                                countTDetail = taskDescription.strip();
                                //trim down excess whitespaces
                                countTDetail.trim();
                                //Removing the white spaces in between the strings
                                noSpace_CTD = countTDetail.replaceAll("\\s", ""); // "\\s" -> represent a single line of space
                                taskDescription_len = noSpace_CTD.length();
                                System.out.println(taskDescription_len);
                                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                            }
                            while ((taskDescription_len > 50));
                        } else {
                            System.out.println("Task captured successfully");
                            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        }
                        //Dev Details
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("-=:Developer Details:=-");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Developer Name : ");
                        String devFirstName = uInput.next();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.print("Developer Surname : ");
                        String devLastName = uInput.next();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        //TaskID
                        //System.out.println("###################################################");
                        String taskID = taskName.substring(0, 1).concat(":") + taskNum + ":" + (devFirstName.substring(devFirstName.length() - 3)); //
                        taskID = taskID.toUpperCase();
                        // System.out.println("###################################################");
                        //Hours
                        int Duration = 0;
                        Scanner Nqo = new Scanner(System.in);

                        System.out.println("Please enter N.o hours You would like to use:");
                        Duration = Nqo.nextInt();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("Your entered  :" + Duration + "hrs");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        //Task Status
                        statusMenu();
                        //choice = input.nextInt(); //2
                        if (!((choice2 == 1) || (choice2 == 2) || (choice2 == 3))) {
                            do {
                                System.out.println("Invalid entry, please try again");
                                statusMenu();
                            }
                            while (!((choice2 == 1) || (choice2 == 2) || (choice2 == 3)));
                        }
                        if (((choice2 == 1) || (choice2 == 2) || (choice2 == 3))) {
                            if (choice2 == 1) {
                                taskStatus = "To Do";
                                System.out.println("[Task Status]: " + taskStatus);
                                System.out.println("===================================================");
                            }
                            if (choice2 == 2) {
                                taskStatus = "Doing";
                                System.out.println("[Task Status]: " + taskStatus);
                                System.out.println("===================================================");
                            }
                            if (choice2 == 3) {
                                taskStatus = "Done";
                                System.out.println("[Task Status]: " + taskStatus);
                                System.out.println("===================================================");
                            }
                        }
                    }
                }//====================End of huge if===================
            }//==================End of for loop

        }
        while (choice != 3);
    }
}