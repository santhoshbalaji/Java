import java.io.CharArrayReader;
import java.io.IOException;
class UsingChararrayreader{
    // Read,Mark,Reset Method used
    public static void main(String args[]){
        // CharArrayReader R = null;
        try{
            // create new chararrayreader.
            char [] array = {'a','b','c','d','e','f'};
            CharArrayReader R = new CharArrayReader(array);
            //  R.close();
            // if the close method is closed here the following c(char)omands will not be executed..
            // R.read() will read a single character from the passed array
            System.out.println((char)R.read());
            System.out.println((char)R.read());
            // R.mark(0);
            // R.mark will mark the upcoming character
            System.out.println("mark is invoked");
            System.out.println((char)R.read());
            System.out.println((char)R.read());
            R.reset();
            // R.reset will reset the stream
            System.out.println("reset is invoked");
            System.out.println((char)R.read());
            System.out.println((char)R.read());
            System.out.println((char)R.read());
        }
        catch(IOException e){
            System.out.println("system.is already closed");
        }
    }
    
}
// skip method used here.
class Skip{
    public static void main(String args[]){
        CharArrayReader R = null;
        char [] array = {'A','B','C','D','E'};
         try{
            R = new CharArrayReader(array);
            int value = 0;
            while((value = R.read()) != -1){
                // converting integer  into char. 
                char c = (char) value;
                System.out.print(c + " : ");
                // here we are using skip method.to skip characters.
                 long l = R.skip(1);
                 System.out.println("Skipped characters :" +l);
            }
            while((value = R.read()) != -1){
                // converting integer  into char. 
                char c = (char) value;
                System.out.print(c + " : ");
                // here we are using skip method.to skip characters.
                // long l = R.skip(1);
                // System.out.println("Skipped characters :" +l);
            }
         }
         catch(IOException e){
            e.printStackTrace();
            // System.out.println("system.is already closed");
        }
    }
}
// Ready() used here.
class Ready{
    public static void main(String args[]){
        CharArrayReader R = null;
        char [] array = new char[] {'1','2','3','4'};
         try{
            R = new CharArrayReader(array);
            int value = 0;
            while(R.ready()){
                System.out.println(R.read());
            }
            // R.close();
            // // check the file or stream is ready.
            // boolean isready = R.ready();
            // System.out.println("  is the stream is Ready : " +isready);
         }
         catch(IOException e){
            e.printStackTrace();
            // System.out.println("system.is already closed");
        }
    }
}
class Read{
    public static void main(String args[]){
        char r[] = {'a','b','c','d','e','f'};
        char[]b1=new char[r.length];
        try{
            CharArrayReader reader  = new CharArrayReader(r);
            int j = reader.read(b1,0,2);
            for(int i = 0; i < b1.length; i++){

                System.out.println(b1[i]);
            }
        }

        catch(IOException e){
            e.printStackTrace();
        }
    }
}
