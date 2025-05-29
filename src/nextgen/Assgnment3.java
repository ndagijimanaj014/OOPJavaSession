package nextgen;

public class Assgnment3 {
	public int[] threeNumbers(int a,int b,int c) {
		int[] nums= {40,30,};
		int min=0;
		int max=0;
		for(int i=0;i<=nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
				System.out.println("the maximum numbers is:"+max);
				
			} else if(nums[i]<min) {
				min=nums[i];
				System.out.println("the minum numbers is:"+min);
				
			}
			
		}
		return nums;
		
	
	}
	
	public static void main(String[] args) {
		// T. Define two methods to print the maximum and the minimum number
		 //respectively among three numbers.
		Assgnment3 ass= new Assgnment3 ();
		int[] result = ass.threeNumbers(40,30,20);
		System.out.println(result.toString());
		
	}

}
