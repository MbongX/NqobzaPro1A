package nqobza;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author NQOBILE
 */



    public class Login2 {
    public Login2() //Constructor
    {}
    public class Base
    {

    }
    public class Temp extends Base
    {

    }



    public static void main(String[] args) {
        //fields
        final int UsernamePassword_Uppecasel = 1;//declaration of the final number for upper letter 1 upper case needed for password
        final int UsernamePassword_Lowercase = 3;//declaration of the final number for lower case letter for lower case as 3 lower case will be needed in the password
        final int UsernamePassword_SpecialCharacter_ = 1;
        final int Users_password = 8;
        final int num_digits = 1;//declaration for num digits as 1 number or digit will be needed for password if you enter more than one it will give you not entered proper digits
        int upperCount = 0; //the integer for upper count is set to 0 for your characters
        int lowerCount = 0; //the integer for lower count is set to 0 for your characters
        int digitCount = 0; //the integer for digit count is set to 0 for your characters
        int letterCount = 0; // the integer for letter count is set to 0 for your characters
        int Pasword_SpecialCharacterset = 0;
        int Option1 = 1, Option2 = 2, Option3 = 3, Selection, TaskNum, Option,Exit,
                Selection_user,TaskNum2, ToDo = 0, Doing = 0, Done = 0, TaskNum1 = 0, LastLetter,Time;
        String TaskName, User_TaskDescription,First2_Name,new_LastLetter,input,Name,Last_name,User_name;
        Scanner Nq = new Scanner(System.in); //my Scanner class for user input is set to Nq in declaration

        System.out.print("Hello please enter your new Username:");//System.out print is  to print and greet the user to enter thier user_name

         User_name = Nq.nextLine();// User is prompted to enter their User name as a string

        System.out.print("Hello please enter your First_Name:");
         Name = Nq.nextLine();
        System.out.print("Please enter your Last_Name:");
         Last_name = Nq.nextLine();
        User_name.contains("_");

        //Verify class


        if (User_name.length() <= 5 && User_name.contains("_")) {  // if statement is what i used to set the user names name lenght to be equals to 5 or less
            System.out.println("User_Name captured:\n" + User_name); //when the user enters the right amount of letters it will say the name has be captured and shows the user name
            //this checks that has the user entered a underscore in the user


        } else if (User_name.length() >= 5 && User_name.contains("_"))//otherwise if the user names name length is more than 5 letters
            System.out.println("Username has no underscore .Could not Caputer User_name:");// then the console will print to the user could not be able to capture user name
        else System.out.println("Sorry username could not be captured and has no underscore");
        {  //this checks that has the user entered a underscore in the user

            {//these are curly braces to keep if statements in their own code block

                System.out.println("Hello user please enter your password:\n");//User is then asked to then enter their password
                 input = Nq.nextLine();//the user then is promted to enter the password

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
        //Task 2
        if (upperCount >= UsernamePassword_Uppecasel && lowerCount >= UsernamePassword_Lowercase && num_digits >= digitCount && Pasword_SpecialCharacterset >= 1)//the if statement operator will compare the upper case to the upper count, the lower case to lower count and digits to digit count iff the are greater or equls to\nthe assigned operator then


        System.out.println("---------------------------------------------------");
        System.out.println("Welcome to EasyKasnban");
        System.out.println("Please enter TaskName:");
        TaskName = Nq.nextLine();
        System.out.println("---------------------------------------------------");
        {
            System.out.println("TASKNAME:");
            TaskName = Nq.nextLine();
        }

        System.out.println("\n" + "Please choose one of the following features from a numeric menu:");


        Scanner UserOption = new Scanner(System.in);

        System.out.println("Please enter task number:");
        TaskNum1 = UserOption.nextInt();
        System.out.println("---------------------------------------------------");
        for (int i = 0; i > TaskNum1; i++) {
            System.out.println("TaskNum:" + TaskNum1);

        }

        System.out.println("---------------------------------------------------");
        System.out.println("Select your option: ");

        System.out.println("Otpion 1)Show Report");
        System.out.println("Option 2)This option is still in development");
        System.out.println("Option 3)Quit ");
        System.out.println("---------------------------------------------------");
        System.out.println("Your slected option is: ");
        Selection = UserOption.nextInt();
        System.out.println("---------------------------------------------------");

        while (Selection == 1) {
            System.out.println("Option 1)Add tasks");
            System.out.println("---------------------------------------------------");
            System.out.println("How many tasks would you like to add:");

            TaskNum = UserOption.nextInt();
            System.out.println("---------------------------------------------------");
            for (int i = 0; i < TaskNum; i++) {
                System.out.println("TASK:");
                TaskNum = UserOption.nextInt();
            }
            System.out.println("---------------------------------------------------");

            System.out.println("Please enter your task description not more than 50 Cahraters:");
            User_TaskDescription = Nq.next();
            if (User_TaskDescription.length() < 50) {
                System.out.println("Task Successfully captured");
                System.out.println("---------------------------------------------------");
                System.out.println("Please select task statuses:\nToDo.1) \nDoing.2) \nDone.3) ");
                ToDo = Done;
                Done = Doing;
                if (ToDo == 1)
                    System.out.println("---------------------------------------------------");
                System.out.println("ToDo.1:");
                ToDo = UserOption.nextInt();
                System.out.println("---------------------------------------------------");
                if (Doing == 2) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Doing.2:");
                    Doing = UserOption.nextInt();
                    System.out.println("---------------------------------------------------");
                }
                if (Done == 3) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Done.3:");
                    Done = UserOption.nextInt();
                    System.out.println("---------------------------------------------------");
                }
                System.out.println("Selected Status is:" + Doing + Done + ToDo);
                Random rand = new Random();
                 Time = rand.nextInt(11);
                System.out.println("DurationTime" + Time + "hrs");
                 First2_Name = Name;
                System.out.println(First2_Name.substring(0, 2));
                LastLetter = Last_name.length();
                 new_LastLetter = Last_name.substring(Last_name.length() - 3);
                System.out.println(new_LastLetter);
                System.out.println(First2_Name.substring(0, 2) + ":" + Time + ":" + new_LastLetter);
                if (User_TaskDescription.length() > 50) {
                    System.out.println("Please enter a description of less than 50 Characters");
                    System.out.println(User_name + Last_name);
                } else System.out.print("Exit:5");
                 Exit = UserOption.nextInt();
                break;


            }
        }
        {
            if (Selection == 2) {
                System.out.println("Option2:Show report" + "\n" + "Dear user this feature is still in development:" + "\nComing Soon");
            }
            if (Selection == 3) {
                System.out.println("Option3)\tQuit\nApplication closed\nGoodBye!!!!");

            }

        }
        while ((Option1 == 1) && Option1 <= 50) {
            Option1++;
            System.out.println(Option1);

        }

    }


}


