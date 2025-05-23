package ex_03_Literals;
// character literals -
public class Lab_Literals_P6_Char_Literal {
    public static void main(String[] args) {


        // Chars - Store
        char c1 = 'A';
        // char c2 = "A"; // String - bunch of char(multiple chars)
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space also stored
        // everything under single quotes is stored as character


        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PramodDutta");
        System.out.println("Pramod" + new_line + "Dutta");
        System.out.println("Pramod" + tab_line +  "Dutta");
        System.out.println("Pramod"+ back_space +  "Dutta");
        System.out.println("Pramod" + carriage_return + "Dutta");

        System.out.println("-----------------------------");

        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65
        // UNICODE (india, jap, china) - Rupees - ₹
        char ruppes = '₹';
        System.out.println("pramod has "+ruppes+10);
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        char c11  = '\u1F60';


    }
}
