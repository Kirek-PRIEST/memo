import java.io.FileWriter;
import java.util.Scanner;

public class Input {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: <Фамилия> <Имя> <Отчество> <дата_рождения> <номер_телефона (в формате 8xxxxxxxxxx)> " +
                "<пол (f - женский, m - мужской, o - другой>");
        String input = scanner.nextLine();
        Viewer viewer = new Viewer(input);
        viewer.dataWriter();


    }
}