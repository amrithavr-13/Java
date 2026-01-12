class code1{
    public static void main(String[] args) {
    	
        int numberBooks=3;
        int pricePerBook=275;
        int disc=10;
        double totalAmount=pricePerBook*numberBooks;
        double discount=disc/100.0;
        double bill=totalAmount-(totalAmount*discount);
        System.out.println("bill amount is:"+bill);
    }
}