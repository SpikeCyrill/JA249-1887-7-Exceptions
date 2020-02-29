import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //throwUnchecked();

        try {
            FileInputStream fio = new FileInputStream("txt.xtx");
            FileReader fr = new FileReader("txt.txt");
        } catch( FileNotFoundException e) {

        }

        recursion(10);

        try {
            System.out.println("try begins");
            throwChecked();
            throwChecked2();
            System.out.println("try done");
        } catch (Exception e) {
            System.out.println("catch done");
        } finally {
            System.out.println("finally done");
        }

    }

    public static void throwUnchecked() {
        throw new NullPointerException();
    }

    public static void throwChecked() throws SQLException {
        //Получить доступ к базе данных и прочитать данные.
        throw new SQLException();
    }

    public static void throwChecked2() throws IOException {
        //Получить доступ к базе данных и прочитать данные.
        throw new IOException();
    }

    public static int recursion(int a) {
        a += recursion(a);
        return a;
    }

}
