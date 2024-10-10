
public class StringBufferBuilderPerformanceTest {

	
    public static void main(String[] args){  
        
//    	for(int i=1;i<1000;i++) {
//    		long startTime = System.currentTimeMillis();   
//    		System.out.println("startTime : "+startTime);
//    	}
        
        long startTime = System.currentTimeMillis();  


        //wont allow multiple threads - TubeWell
        StringBuffer sb = new StringBuffer("Java");  
        

        for (int i=0; i<1000000; i++){  
            sb.append("Cap Gemini");  
        }
        
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
       
        startTime = System.currentTimeMillis();  
      
        //Multiple threads are allowed - OpenWell
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<1000000; i++){  
            sb2.append("Cap Gemini");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    
    }  
}  