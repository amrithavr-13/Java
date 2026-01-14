class Testarray {
   public static void main(String args[]) {
      int p=0,k=1;
      int [] numbers = {1,1,3,5,25};
      for(int x : numbers ) {
         if( x ==0) {
            System.out.println("Out of Stock");
            k=0;
            break;
         }
         else{
            p=p+x;
         }
         
      }
      if (k!=0){
        if(p<50){
            System.out.println("Low Stock");
        }
        else if(p>=50 && p<=100){
            System.out.println("Moderate Stock");
        }
        else{
            System.out.println("Good Stock");
        }
      }
   }
}