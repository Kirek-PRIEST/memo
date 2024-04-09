import java.io.File;

public class Viewer {
    private String input;

    public Viewer(String in) {
        this.input = in;
    }

    private String[] data(String in) {

        return in.split(" ");
    }

    public void dataWriter() {
        DataCecking dataCecking = new DataCecking();
        dataCecking.checkAll(data(input));
        Writer writer = new Writer();
        File file = new File(data(input)[0].toLowerCase() + ".txt");
        if (!file.exists()) {
            writer.toWriteNewFile(data(input));
        } else {
            System.out.println(2);
            writer.toExistingFile(data(input));
        }
    }


}
