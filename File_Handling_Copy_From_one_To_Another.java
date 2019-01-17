package practicetime;
import java.io.*;
public class File_Handling_Copy_From_one_To_Another
{
	 public static void main(String[] args) 
	    {
	           File infile = new File("infile.txt");
	           File outfile = new File("Outfile.txt");
	           FileReader fr=null;
	           FileWriter fw=null;

	           try{
	                fr = new FileReader(infile);
	                fw = new FileWriter(outfile);

	               int ch=0;
	               //FileReader Class which is subclass of InputSteamReader//InputStreamReader class converts Strings or character data//into Byte which are in form of integers. //so ch is of int typewhile((ch=fr.read())!=-1){      //-1 indicates end-of-file (eof)
	                   fw.write(ch);
	               }

	            catch(IOException e)
	            {
	                  System.out.println(e);
	                  System.exit(-1);
	            }
	            finally{
	                 try{
	                       fr.close();
	                       fw.close();
	                 }
	                 catch(IOException e){}
	            }

	    }

}
