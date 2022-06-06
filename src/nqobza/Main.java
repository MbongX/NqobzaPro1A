package nqobza;

import java.util.Scanner; //Scanner lib
import java.util.stream.IntStream;


public class Main
{

    //regClass
    public static class initMenu
    {
        //fields
        String username, password, firstname, lastname;
        IntStream verifyInput;
        int init;
        Scanner input = new Scanner(System.in);

        //constructor for the login menu pop immediately as the program runs
        public initMenu()
        {

            System.out.println("Are you an existing user or a new user (Please respond by selecting either \"1\" or \"2\"):");
            System.out.println("[1] --> Exisiting user");
            System.out.println("[2] --> New user");
            System.out.print("Your response: ");
            init = input.nextInt();

        }

        //Methods
        public void register() {


            System.out.println(init);
            if (init == 1)
            {

                // Existing User
                System.out.println("---------------------------------------------------");
                System.out.println("----------------Existing User Login----------------");
                System.out.println("---------------------------------------------------");



            }
            if (init == 2)
            {

                // New USer Registration
                System.out.println("---------------------------------------------------");
                System.out.println("---------------New User Registration---------------");
                System.out.println("---------------------------------------------------");

                System.out.print("Enter your username : ");
                username = input.nextLine();
                    if( (username.length() < 5) && !(username.contains("_")) && !(username.contains("0,1,2,3,4,5,6,7,8,9")) && !(username.contains(",!,@,#,$,%,&,*,_")) )
                    {
                        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
                        System.out.print("Enter your username : ");
                        username = input.nextLine();
                    }

            } else {
                if (!(init == 1) && !(init == 2)) {
                    do {
                        System.out.println("Invalid input");
                        System.out.print("Select \"1\" or \"2\" : ");
                        init = input.nextInt();

                    }
                    while (!(init == 1) && !(init == 2));

                }
            }

        }

        public static void main(String[] args) {
            // write your code here
            initMenu obj = new initMenu(); //instantiate the class
            //ClassName Objectname(any name of your giving) = new Classname;
            obj.register();


        }
    }
}
