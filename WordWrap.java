import java.util.Scanner;

public class WordWrap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxsize = in.nextInt();
        String input = "";
        int length = 0;
        boolean flag = true;
        int i = 0;
        while (true) {
            String string = in.nextLine();
            if (string.equals("Stop.")) {
                System.out.println(input);

                return;
            }
            if (string.equals("")) {

                if (length < maxsize) {
                    input += "\n";
                }
                input += "\r\n";
                flag = true;
                length = 0;
            }
            Scanner sc = new Scanner(string);

            while (sc.hasNext()) {
                String str = sc.next();

                length += str.length();
                if (length >= maxsize) {
                    if (str.length() > maxsize) {
                        if (flag == false)
                            input += "\n";
                        input += str;
                        input += "\n";
                        flag = true;
                        length = 0;
                    }
                    else {
                        input += "\n" + str;
                        length = str.length();
                    }

                }
                else {

                    if (flag) {
                        input += str;
                        flag = false;
                    } else {
                        input += " " + str;
                        length++;
                    }

                }

            }
        }

    }
}
/*Ran Cheng and Yiwei Han are parteners in this project. During our collaboration, Ran Cheng first brought up
how this program would look like. Then, Yiwei Han wrote the algorithm. After Yiwei Han finished the algorithm,
during the testing, Ran Cheng found out that when encounters the blank line, the algorithm just skipped
the blank line. Then, Yiwei Han correct this bug. However, after Yiwei Han fixed this bug, Ran Cheng also found out that
it still does not work on some of the compilers (but works on IDEA). Yiwei Han used \n, but \r\n should be used.
She fixed this bug, and the program is correct now. Then, Yiwei Han also found bug that when "Stop." is not on a single line,
it will also provide output. Ran Cheng and Yiwei Han together thinked some method, Ran Cheng offered several suggestions,
and Yiwei Han fixed the bug. After that, Ran Cheng first wrote the "readme", then sent to Yiwei Han.
Yiwei Han added something to the "readme" and the project is finished.
 */