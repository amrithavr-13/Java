class Testarray {
   public static void main(String args[]) {
      int [] numbers = {10,54,88,95,89};
      for(int x : numbers ) {
         if( x >=90) {
            System.out.println("Excellent");
         }
         else if(x>=75 && x<=89){
            System.out.println("Good");
         }
         else if(x>=50 && x<=70){
            System.out.println("Average");
         }
         else{
            System.out.println("Fail");
         }
      }
   }
}