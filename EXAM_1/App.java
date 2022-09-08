public class App {
    public static void main(String args[])  {

     Student brix = new Student();
     // properties
     brix.surname = "Manzanero";
     brix.firstname = "Brix";
     brix.middleinitial = 'G';
     brix.dateOfbirth = "October 16 2000";
     brix.studentNumber = "2022 - 103256";
     brix.studentEmailAddress = "brixmanzanero16@gmail.com";
     brix.iAmAwesome = true; 

     brix.sayMyEmailAdress();
     brix.sayMyStudentNumber();
     brix.amIAwesome();
    
    } 
}
