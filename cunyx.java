import java.io.*;

public class cunyx {

   public static void main(String[] args) throws IOExecption {
      if(args.length == 0) {
         String command = "";
      	 while(command != quit) {
            Scanner scanner = new Scanner(System.in);
      	    System.out.print("chmd6633> ");
            String input = scanner.next();
        	         
         	 	 
            if (commLineArgsLength(args) < 512) {
               ProcessBuilder pb = new ProcessBuilder(args[0]);
       	       pb.directory(new java.io.File("/home/"));
       	       Process process = pb.start();	
       	       System.out.println("Process: " + args[0] + " started.");	   
           	      
       	       InputStream is = process.getInputStream();
               InputStreamReader isr = new InputStreamReader(is);
               BufferedReader br = new BufferedReader(isr);
      	   
               String line;
               while (line = br.readLine() != null) {
                  System.out.println(line);
               }
               br.close();
      	    }  
      	 }//end while
      } else if(args.length == 1) {

      } else {
	      System.err.println("More than one argument is not allowed!");
      }
   }  
	
   public static int commLineArgsLength(String[] args) {
       int count = 0;
          for(int i = 0; i < args.length; i++) {    
	     for(int j = 0; j < args[i].length(); j++) {
	        count++;
	     }
	  }
	  return count;
   }
}

