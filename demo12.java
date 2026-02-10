import java.util.Arrays;
class demo{
	public static void main(String[] args) {
		int [] a1 ={1,2,3,4,0,0,0,0};
		int [] a2 ={5,6,7,8};

		for(int i = a1.length-1,j=a2.length-1;i>=0;i--,j--){
			if(a1[i] == 0 ){
				a1[i] = a2[j];
			}

				
		} 

		System.out.println(Arrays.toString(a1));
	}
}