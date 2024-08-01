import java.util.*;
public class Token_String2{
    public static void main(String[] args) {
        StringTokenizer st=new StringTokenizer("my,name,is,Adi");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken(","));
        }
    }
}

