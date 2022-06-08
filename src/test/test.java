package test;

import java.util.Scanner;

public class test {
    //fields
    int choice, choice2, taskNum, numOfTask, duration = 0;
    ;
    String taskName, taskDescription, taskStatus, devFName, devLName, taskID;
    Scanner input = new Scanner(System.in);
    Scanner uInput = new Scanner(System.in);

    //Construct
    //get the number of tasks to be added upon initial execution of the program
    public test() {
        System.out.println("Hii");
    }

    //methods
    int terminate() {
        return 0;
    }

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

    void autogenTaskNum(int genValue) {
        taskNum = genValue;
    }

    void duration() {

        Scanner Nqo = new Scanner(System.in);
        //Duration
        System.out.println("Please enter N.o hours You would like to use:");
        duration = Nqo.nextInt();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Your entered  :" + duration + "hrs");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    void devDetails() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(":::::::::::::::::Developer Details:::::::::::::::::");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Developer Name : ");
        devFName = uInput.next();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Developer Surname : ");
        devLName = uInput.next();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    void taskID() {
        String div1, div3;
        int div2;
        div1 = (taskName.substring(0, 2)).concat(":");
        div2 = taskNum;
        div3 = devFName.substring(((devFName.length()) - 3));
        taskID = div1 + div2 + ":" + div3;

        /*taskID = taskName.substring(0, 1).concat(":") + taskNum + ":" + (devFirstName.substring((devFirstName.length() - 3))); //
        taskID = taskID.toUpperCase();*/
        //Debuggin reasons i'll print out the id
        System.out.println("[TaskID] : " + taskID.toUpperCase());
    }

    void taskStatus() {
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
                System.out.println("###################################################");
                System.out.println("############ TasK Successfully Recorded ###########");
                System.out.println("###################################################\n");
            }
            if (choice2 == 2) {
                taskStatus = "Doing";
                System.out.println("[Task Status]: " + taskStatus);
                System.out.println("===================================================");
                System.out.println("###################################################");
                System.out.println("############ TasK Successfully Recorded ###########");
                System.out.println("###################################################\n");
            }
            if (choice2 == 3) {
                taskStatus = "Done";
                System.out.println("[Task Status]: " + taskStatus);
                System.out.println("===================================================");
                System.out.println("###################################################");
                System.out.println("############ TasK Successfully Recorded ###########");
                System.out.println("###################################################\n");
            }
        }
    }

    void taskDecription() {
        System.out.print("Task Description : ");
        taskDescription = uInput.nextLine();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        String countTDetail = taskDescription.strip();
        //trim down excess whitespaces
        countTDetail.trim();
        //Removing the white spaces in between the strings
        String noSpace_CTD = countTDetail.replaceAll("\\s", ""); // "\\s" -> represent a single line of space

        int taskDescription_len = noSpace_CTD.length();
        //System.out.println("Total character in Task Description : " + taskDescription_len);
        //validating
        // if (taskDescription_len < 50) {
        //     System.out.println("it works--- Please correct this output");
        // }
        if ((taskDescription_len > 50) || (taskDescription_len == 0)) {
            if (taskDescription_len > 50) {
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
                    //System.out.println("Total character in Task Description : " + taskDescription_len);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                }

                while ((taskDescription_len > 50));
            } else if (taskDescription_len == 0) {
                do {
                    System.out.println("Task Description cannot be empty, Try again");
                    System.out.print("Task Description : ");
                    taskDescription = uInput.nextLine();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    countTDetail = taskDescription.strip();
                    //trim down excess whitespaces
                    countTDetail.trim();
                    //Removing the white spaces in between the strings
                    noSpace_CTD = countTDetail.replaceAll("\\s", ""); // "\\s" -> represent a single line of space
                    taskDescription_len = noSpace_CTD.length();
                    //System.out.println("Total character in Task Description : " + taskDescription_len);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                }

                while ((taskDescription_len == 0));
            }
        }

        if ((taskDescription_len > 0) && (taskDescription_len <= 50)) {
            System.out.println("Task captured successfully");
            //System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

    }

    /*
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
                        //Task Number Auto assigned but i'll do it later
                        System.out.print("Task Number : ");
                        taskNum = input.nextInt();
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        //Task Description
                        taskDecription();
                        //Dev Details
                        devDetails();
                        //TaskID
                        System.out.println("###################################################");
                        taskID();
                        System.out.println("###################################################");
                        //Hours
                        duration();
                        //Task Status
                        taskStatus();
                    }
                }//====================End of huge if===================
            }//==================End of for loop

        }
        while (choice != 3);
    }
*/
    void validate(int lCounter) {
        if (!((choice == 3) || (choice == 2) || (choice == 1))) {
            do {
                System.out.println("Invalid input, Please try again:");
                menu();
            }
            while (!((choice == 3) || (choice == 2) || (choice == 1)));
        }
        if ((choice == 3) || (choice == 2) || (choice == 1)) {
            //================Beginning of huge if====================
            if (choice == 1) {
                System.out.println("===================================================\n");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                //==============Beginning of huge for loop=======================
                for (int i = 0; i < lCounter; i++) {
                    //for(int y= 0;y>)
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print("Task Name : ");
                    taskName = input.next();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print("Task Number : ");
                    taskNum = input.nextInt();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    //Task Description
                    taskDecription();
                    //Dev Details
                    devDetails();
                    //TaskID
                    System.out.println("###################################################");
                    taskID();
                    System.out.println("###################################################");
                    //Duration(Hours)
                    duration();
                    //Task Status
                    taskStatus();
                }
            }//====================End of huge if===================
        }//==================End of for loop
    }

    public static void main(String[] args) {
        int counter = 0;
        Scanner counter2 = new Scanner(System.in);
        test obj = new test();


        //The task ID will be geenerated apon runtime when the user selects option 1 => to ADD TASKS
        for (int z = 0; z >= 0; ) {
            do {
                obj.menu(); //Prints the menu
                if (obj.choice == 1) {
                    System.out.print("How many tasks do you wish to add ? ");
                    counter = counter2.nextInt();
                    obj.validate(counter);
                }
                if (obj.choice == 2) {
                    System.out.println("Coming Soon");
                }
                if (obj.choice == 3) {
                    System.out.println("Closing program...");
                    for (int i = 3; i > 0; i--) {
                        System.out.print("..." + i + "\n\n\n\n");
                        if (i == 1) {
                            System.out.println("Bye...");
                            obj.terminate();
                        }
                    }
                }
            }
            while (obj.choice != 3);
        }

    }
}