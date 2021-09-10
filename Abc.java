public class Abc
{
	public static void main(String args[])
	{
		String[] a1 = {"abc","efg","zxc"};
		String[] b1 = {"abf","ade","urv"};
	    	int[]  count = new int[a1.length];
	    	String[] common = new String[a1.length]
		int k = 0;
		boolean b = false;

		System.out.println("a1  b1 common bool");
	        for(int h = 0; h<a1.length; h++)
	        {
		    for (int i = 0;i<3;i++)
		    {	
		    	for(int j = 0; j<3;j++)
		    	{
		    		if(a1[h].charAt(i) == b1[h].charAt(j))
		    		{	
										    
                            		System.out.println(a1[h]+" "+b1[h]+" "+a1[h].charAt(i)+ "   Yes"); 
		               		count[h]++;						           
		    	        }
			 		
	      	    	}    	    		  	       
	            }
	    	    if(count[h] == 0) 
		    {
			System.out.println(a1[h]+" "+b1[h]+"     NO");
		    }			
	    }
	}    
}
