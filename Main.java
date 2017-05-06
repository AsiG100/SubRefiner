import java.io.File;

public class Main {
	public static void main(String[] args){
	File folder = new File("C:\\Users\\USER\\Downloads");
	File[] listOfFiles = folder.listFiles();

	    for (int i = 0; i < listOfFiles.length; i++) {
	      if(listOfFiles[i].getPath().contains("-heb")||listOfFiles[i].getName().contains("-eng")){
	    	  listOfFiles[i].renameTo(new File(listOfFiles[i].getPath().substring(0,listOfFiles[i].getPath().length()-8)+".srt"));
	      }

	    }
}}
