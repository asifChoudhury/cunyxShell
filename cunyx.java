import java.io.*;

public class cunyx {

	public static void main(String[] args) {
	   try {
	      ProcessBuilder pb = new ProcessBuilder(args[0]);
	      pb.directory(new java.io.File("/home/"));
	      Process process = pb.start();	
	      System.out.println("Process: " + args[0] + " started.");	   
	      
	      InputStream is = process.getInputStream();
              InputStreamReader isr = new InputStreamReader(is);
              BufferedReader br = new BufferedReader(isr);

              String line;
              while ( (line = br.readLine()) != null) {
                 System.out.println(line);
              }
              br.close();
	   } catch(IOException e) {
	      e.printStackTrace();
	   }
	
	   //ProcessBuilder pb2 = new ProcessBuilder(args[1]);
	   //Process process2 = pb2.start();	
	   //System.out.println("Process: " + args[1] + " started.");
	   	

           String commands = "";
	   if (commLineArgsLength(args) < 512) {
	      System.out.println(commLineArgsLength(args));
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

