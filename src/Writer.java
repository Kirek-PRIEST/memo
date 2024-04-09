import java.io.FileWriter;

public class Writer {
    public void toWriteNewFile(String[] data) throws RuntimeException {
        try(FileWriter fileWriter = new FileWriter(data[0].toLowerCase() + ".txt")) {
            String userData = data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5];
            fileWriter.write(userData + "\n");

            System.out.println("Данные успешно записаны в файл " + data[0] + ".txt");

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void toExistingFile(String[] data) throws RuntimeException {
        try(FileWriter fileWriter = new FileWriter(data[0] + ".txt", true)) {

            String userData = data[0] + " " + data[1] + " " + data[2] + " " + data[3] + " " + data[4] + " " + data[5];
            fileWriter.append(userData).append("\n");
            fileWriter.close();

            System.out.println("Данные успешно записаны в файл " + data[0] + ".txt");

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}