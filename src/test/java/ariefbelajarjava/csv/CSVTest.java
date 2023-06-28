package ariefbelajarjava.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;

public class CSVTest {

    @Test
    void createCSV() throws IOException {
        StringWriter writer = new StringWriter();

        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printRecord("Arief","Hermawan",80);
        printer.printRecord("Hilmi","Muharrom",86);
        printer.flush();

        String csv = writer.getBuffer().toString();
        System.out.println(csv);
    }
}
