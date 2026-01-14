abstract class User{ 
 public void displayUserType() {
   System.out.println("User type selected");
}
   abstract void showMessage();
}

class AdminUser extends User{ 
    void showMessage(){
       System.out.println("Welcome, Admin!"); 
    }
   }
class GuestUser extends User{
   void showMessage(){
      System.out.println("Welcome, Guest!");
   }

}
class UserTest{
 public static void main(String[] args) {
   User admin = new AdminUser();
   User guest = new GuestUser();
   admin.displayUserType();
   admin.showMessage();
   guest.displayUserType();
   guest.showMessage();

 }
}