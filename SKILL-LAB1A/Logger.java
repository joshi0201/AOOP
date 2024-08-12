package Singleton;

public class Logger { 
	 private static Logger instance=null;
	 private Logger() {
	 }
	 public static Logger getinstance(){
		 if(instance==null) {
			 instance=new Logger();
		 }
		 return instance;
	 }
	 public void show(String message){
		 System.out.println("message"+message);
	 }
}
