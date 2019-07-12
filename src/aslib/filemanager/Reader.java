package aslib.filemanager;

import aslib.exceptions.FileNotFoundException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

/**
 * <p> Contains the function to read a file content. </p>
 *
 * @author Adriano Siqueira
 * @version 2019-05-04
 * @since 6.1
 */
public class Reader {
    private File file;

    /**
     * <p> Creates an instance of {@link Reader} class. </p>
     *
     * <p> It is necessary to call {@code setFile} method, otherwise a {@link NullPointerException}
     * will be thrown. </p>
     */
    public Reader() {
    }

    /**
     * <p> Creates an instance of {@link Reader} class. </p>
     *
     * @param file File to be read.
     */
    public Reader(File file) {
        setFile(file);
    }

    /**
     * <p> Creates an instance of {@link Reader} class. </p>
     *
     * @param path It will be parsed to file, that will be read.
     */
    public Reader(Path path) {
        setFile(path);
    }

    /**
     * <p> Reads the file and extracts its content. </p>
     *
     * @return The content of the file in string format.
     * @throws NullPointerException  If file is null.
     * @throws FileNotFoundException If file does not exists.
     * @throws IOException           If a problem occurs when reading the file.
     */
    public String read() throws NullPointerException, FileNotFoundException, IOException {
        if (file == null)
            throw new NullPointerException("File can not be null");
        else if (!file.exists())
            throw new FileNotFoundException("File does not exists.");

        StringBuilder builder = new StringBuilder();
        String line;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((line = reader.readLine()) != null)
            builder.append(line)
                    .append(System.lineSeparator());

        return builder.toString();
    }

    /**
     * @return File used int the read function.
     */
    public File getFile() {
        return file;
    }

    /**
     * @param file File to be read.
     */
    public void setFile(File file) {
        this.file = file;
    }

    /**
     * @param path File to be read.
     */
    public void setFile(Path path) {
        this.file = path.toFile();
    }
}