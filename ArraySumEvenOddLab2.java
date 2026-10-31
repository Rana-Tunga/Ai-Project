// Name = Hamza Azam && Roll No = 241400085
public class  ArraySumEvenOddLab2{
	public static void main(String[] args){

		int[] arry={3,2,12,15,17,22,25,26,28};

		


		sumEvenOdd(arry);
	
	}

	public static void sumEvenOdd(int[] arry){
		int evenSum=0;
		int  oddNumber=0;

		for(int i=0; i<arry.length;i++){

			if(arry[i]%2==0){

				evenSum+=arry[i];

			}  

			else{

				oddNumber+=arry[i];
			}
			System.out.println("THE SUM IS "+evenSum);

			System.out.println("THE ODD IS "+oddNumber);
			




		}

		
	} 


}



