import java.io.*;
public class AddTwoNo {
    public static void main(String args[]) throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        System.out.println("Enter the value of a=");
        a = Integer.parseInt(rd.readLine());
        System.out.println("Enter the value of b=");
        b = Integer.parseInt(rd.readLine());
        c = a+b;
        System.out.println("add =  "+c);
    }
    
}

