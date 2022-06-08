package PROG5121_POE_Part2;

import java.util.Scanner;

public class St10166349_PROG5121_POE_Part2 {
    //fields
    int choice, choice2, taskNum, numOfTask = 0, duration = 0, autoTaskNumber = 0;
    String taskName, taskDescription, taskStatus, devFName, devLName, taskID;
    Scanner input = new Scanner(System.in);
    Scanner uInput = new Scanner(System.in);

    //Construct
    //get the number of tasks to be added upon initial execution of the program


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
            } while (!((choice2 == 1) || (choice2 == 2) || (choice2 == 3)));
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

    void taskDescription() {
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
            } while (!((choice == 3) || (choice == 2) || (choice == 1)));
        }
        if ((choice == 3) || (choice == 2) || (choice == 1)) {
            //================Beginning of huge if====================
            if (choice == 1) {

                System.out.println("===================================================\n");
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                //==============Beginning of huge for loop=======================
                for (int i = 0; i < lCounter; i++) {


                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print("Task Name : ");
                    taskName = input.next();
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    taskNum = autoTaskNumber;
                    //System.out.println("[Task Number] : "+autoTaskNumber); it works
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                    // autogenTaskNum(numOfTask);
                    // numOfTask++;
                    //Task Description
                    taskDescription();
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
                    autoTaskNumber++;
                }
            }//====================End of huge if===================
        }//==================End of for loop
    }

    public static void main(String[] args) {

        final int UsernamePassword_Uppecasel = 1;//declaration of the final number for upper letter 1 upper case needed for password
        final int UsernamePassword_Lowercase = 3;//declaration of the final number for lower case letter for lower case as 3 lower case will be needed in the password
        final int UsernamePassword_SpecialCharacter_ = 1;
        final int num_digits = 1;//declaration for num digits as 1 number or digit will be needed for password if you enter more than one it will give you not entered proper digits
        int upperCount = 0; //the integer for upper count is set to 0 for your characters
        int lowerCount = 0; //the integer for lower count is set to 0 for your characters
        int digitCount = 0; //the integer for digit count is set to 0 for your characters
        final int Users_password = 8;
        int letterCount = 0; // the integer for letter count is set to 0 for your characters
        int Pasword_SpecialCharacterset = 0;
        int Option1 = 1, Option2 = 2, Option3 = 3, Selection, TaskNum, Option, Selection_user, TaskNum2, ToDo = 0, Doing = 0, Done = 0, TaskNum1 = 0, LastLetter;
        String TaskName, User_TaskDescription;
        Scanner Nq = new Scanner(System.in); //my Scanner class for user input is set to Nq in declaration

        System.out.print("Hello please enter your new Username:");//System.out print is  to print and greet the user to enter thier user_name

        String User_name = Nq.nextLine();// User is prompted to enter their User name as a string

        System.out.print("Hello please enter your First_Name:");
        String Name = Nq.nextLine();
        System.out.print("Please enter your Last_Name:");
        String Last_name = Nq.nextLine();
        User_name.contains("_");

        if (User_name.length() <= 5 && User_name.contains("_")) {  // if statement is what i used to set the user names name lenght to be equals to 5 or less
            System.out.println("User_Name captured:\n" + User_name); //when the user enters the right amount of letters it will say the name has be captured and shows the user name
            //this checks that has the user entered a underscore in the user


        } else if (User_name.length() >= 5 && User_name.contains("_"))//otherwise if the user names name length is more than 5 letters
            System.out.println("Username has no underscore .Could not Caputer User_name:");// then the console will print to the user could not be able to capture user name
        else System.out.println("Sorry username could not be captured and has no underscore");
        {  //this checks that has the user entered a underscore in the user

            {//these are curly braces to keep if statements in their own code block

                System.out.println("Hello user please enter your password:\n");//User is then asked to then enter their password
                String input = Nq.nextLine();//the user then is promted to enter the password

                int InputUser_Len = input.length(); //inputLen is the declaration i made to promt the user to have a certain number of number characters
                //characthers in the for loop are then checked by the loop is the uppercase is les then input len then it will be incremented by 1
                for (int i = 0; i < InputUser_Len; i++) {
                    char ch_userchar = input.charAt(i); //this shows us that the user can input the characters one at a time
                    if (Character.isUpperCase(ch_userchar))
                        upperCount++;//the characters for the uppercase are increased by 1 if they are less then the input length
                    else if (Character.isLowerCase(ch_userchar))
                        lowerCount++;//if the  lower count is lower case it will be incremented by 1
                    else if (Character.isDigit(ch_userchar))
                        digitCount++;//if the digit count is  less than the input len then the digit will be  increased by 1
                    else if (!Character.isLetterOrDigit(ch_userchar)) {
                        Pasword_SpecialCharacterset++;
                    }

                }


                if (upperCount >= UsernamePassword_Uppecasel && lowerCount >= UsernamePassword_Lowercase && num_digits >= digitCount && Pasword_SpecialCharacterset >= 1)//the if statement operator will compare the upper case to the upper count, the lower case to lower count and digits to digit count iff the are greater or equls to\nthe assigned operator then

                    System.out.println("Password Successfully captured\nWelcome Great to See you: !!!\n" + Name + " " + Last_name);//we get system out print of password is valid and a welcome for the user

                else {
                    System.out.println("\n Login Failed!!!\nThe password did not have the following:");//otherwise if the uppercase,lower case or digits are not equal to the assigned operands then
                    if (upperCount < UsernamePassword_Uppecasel)//
                        System.out.println("UpperLetters");//you will be told the password has no 1 upper case character
                    else if (lowerCount < UsernamePassword_Lowercase)
                        System.out.println("LowerCase");// password has no 3 lower casse characters needed
                    if (digitCount < num_digits)
                        System.out.println("Digits");// password has no 1 digit if there is more than 2 digits the passord will be wrong one digits is needed
                    if (Pasword_SpecialCharacterset < UsernamePassword_SpecialCharacter_)
                        System.out.println("Special character");//user is shown that they should enter a special character in the password
                    System.out.print("1:upper case or 3:Lower case or digit:1");//requirements for the password to be valid 3 lowwer case and 1 number or digit needed
                    if (Users_password >= 8) {
                        System.out.println("Sorry Your Password should be between 1 and 8 characters long.\n Please try again");


                    }


                }
            }
        }
        if (upperCount >= UsernamePassword_Uppecasel && lowerCount >= UsernamePassword_Lowercase && num_digits >= digitCount && Pasword_SpecialCharacterset >= 1)//the if statement operator will compare the upper case to the upper count, the lower case to lower count and digits to digit count iff the are greater or equls to\nthe assigned operator then
            System.out.println("---------------------------------------------------");
        System.out.println("Welcome to EasyKasnban");

        System.out.println("---------------------------------------------------");
        {

            {
                int counter = 0;
                Scanner counter2 = new Scanner(System.in);
                St10166349_PROG5121_POE_Part2 obj = new St10166349_PROG5121_POE_Part2();


                //The task ID will be generated upon runtime when the user selects option 1 => to ADD TASKS
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
                } while (obj.choice != 3);
                if (obj.choice == 3) {
                    System.out.println("Exiting program...");
                    obj.terminate();
                }

            }


        }
    }
}