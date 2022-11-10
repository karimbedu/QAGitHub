package javaPractice;

public class DuplicateNumber {

	public static void main(String[] args) {
	
		//Initialize array   
        int [] arr = new int [] {15,8,10,22,11,22,15,10};   
          
        System.out.println("Duplicate numbers in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  

	}

}
