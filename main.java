import java.util.Scanner;

class charspec {
    public static void main(String[] args) {
       
        
        String i="h4t@Rfs@^%#g*";
        for(int x=0;x<=i.length();x++)
        {
            char ch=i.charAt(x);
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            if (ch >= 65 && ch <= 90) {
                System.out.println(ch+"->It is an uppercase letter.");
            } else {
                System.out.println(ch+
                "->It is a lowercase letter.");
            }
        } else {
            if (ch >= 48 && ch <= 57) {
                System.out.println("It is a number.");
            } else {
                System.out.println(ch+"->It is a symbol.");
            }
        }
        // Use nextInt() to read an integer
        

        
        }
    }
}
