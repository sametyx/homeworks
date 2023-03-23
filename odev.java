class odev{
	public static void main(String args[]){
	
		System.out.println("Please enter 3 number: ");
		
		java.util.Scanner number = new java.util.Scanner (System.in);
		
		int firstNumber = number.nextInt();
		int secondNumber = number.nextInt(); 
		int thirdNumber = number.nextInt();
		
		System.out.printf("Biggest number is: %d%n",findBigNumber(firstNumber,secondNumber,thirdNumber));
		
		
		
	}
	
	public static int findBigNumber(int x, int y, int z){
		
		if(x>y&&x>z) return x;
		else if(y>x&&y>z) return y;
		else return z;
		
	}



}
