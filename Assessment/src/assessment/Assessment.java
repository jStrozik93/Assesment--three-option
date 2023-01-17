/*
Description:
* Log in administrator and give three options;
* The first option generate staff name;
* The second option calculate factorial given by administrator;
* The third option exit the program;
 */
package assessment;
import java.util.Scanner; // add the package related with scanner
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Name: Joanna Strozik
Location: Home
Date: 02/10/2020
Version: Version 1.0
Notes: n/a
*/
 class Assessment {
static String admin(String admin){return admin;}

    private static String admin() {
        String admin="Joanna";
    return admin;}
    
 
  public void name(){
     
     //String admin="Joanna";
     
     
     Scanner myObj = new Scanner(System.in); // ask the user to enter the administrator name
     System.out.print("Please enter administrator name: ");
     String adminName= myObj.nextLine(); //if statement to check the right name
     if (adminName.equals(Assessment.admin())){ 
         System.out.println("Welcome "+Assessment.admin()+ "!");
       }
     else{
         System.out.print("Access denied. Wrong administrator name. ");
         System.exit(0);
        
     }
}

    public static void main(String[] args) {
    
        
     new Assessment().name();
     
      while(true){ 
     
       System.out.println("Please select one of the options. (1-3) ");
     Scanner myObj=new Scanner(System.in);
int option = myObj.nextInt();//initialize integer for options



     switch(option){   //switch statement with three options
         case 1:
          System.out.println(Assessment.admin()+", this is option 1.");
          String staffName, surname;
          Scanner in= new Scanner(System.in);
          System.out.print("Please write the first name: ");
          staffName= in.nextLine();// user input the first name
             //System.out.println(staffName.charAt(0));
             System.out.print("Please write the second name: ");
          surname= in.nextLine();// user input the first name
             //System.out.println(surname.charAt(3));
             System.out.println(staffName.charAt(0)+surname);
          
          
          
          break;
         case 2:
        System.out.println(Assessment.admin()+", this is option 2. ");
         Scanner sc= new Scanner(System.in);
         System.out.print("Please write the number to calculate the factorial: ");
         var num=sc.nextInt(); //user`s input
         var factor=1; //initialize variable
         if (num<0){
         System.out.println("Error. It cannot be negative number.");}
         else{
                for (var i = 1; i <= num; i++) {
            factor = factor *i;} //calculate the factorial
         for (int j = num; j >= 1; j--) {
          System.out.print(j + "*"); //display decreasing numbers 
         }
     System.out.println("=" +factor);     
         }
          break;

        case 3:
         System.out.println(Assessment.admin()+", this is option 3.\nWhich ends the program.\nGoodbye "+ Assessment.admin()+".");
          System.exit(0);
        
         break;
          default:
                    System.out.println("Invalid choice.");
                    break;
                    
                    }

     }
}}

     
     
             



    

   
     
