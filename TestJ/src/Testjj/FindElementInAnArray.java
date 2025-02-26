package Testjj;

public class FindElementInAnArray {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		
		int search_element = 50;
		boolean status=false;///this will be used to print if element not found 
		
		//for(int i=0; i<a.length;i++) //read array values
		//{
			//if(a[i]==search_element) //match array values
			//{
				//System.out.println("Found "+search_element);
			//	status=true; //change the status if element found
			//	break;
			//}
	//	}
		//if(status==false)//when element is not found this will run
		//{System.out.println("Found not "+search_element);
		//}
		
		
	/*
	 * for(int x:a)
	 * 
	 * { if(x==search_element) //match array values {
	 * System.out.println("Found "+search_element); status=true; //change the status
	 * if element found break; }
	 * 
	 * } if(status==false)//when element is not found this will run
	 * {System.out.println("Found not "+search_element); }
	 */
		//search repeated element in array
		
		int b[]= {10,20,30,20,30};
		int count=0;
		for(int value:b)
		{
			if(value==30)
			{
				count++;
				
			}
			
		}
		System.out.print("Found 30 "+count+" Times");
		
		
		
		
		
	}

	}

