public class Student {
   
   
    // properties 
    String surname;
    String firstname;
    char middleinitial;
    String dateOfbirth;
    String studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;


    public void sayMyStudentNumber() { 
        System.out.println ("This is student number" + studentNumber);  
  } 
  public void sayMyEmailAdress() { 
       System.out.println ( "This is my studentEmailAddress" + studentEmailAddress);
    
    
    }
    public void amIAwesome() {
        System.out.println ("i am awsome" + iAmAwesome);

    }
  }

