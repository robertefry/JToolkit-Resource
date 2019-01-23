package rfry.jtoolkit.resource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A class for loading files.
 * @author Robert E Fry
 * @date 3 Dec 2018
 * @time 06:15:45
 *
 */
public final class FileLoader {

	/**
	 * Returns a list of each line in the file at a given directory.
	 * @param directory the directory structure
	 * @return a list of each line in the file at a given directory.
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static List<String> loadFile(String... directory) throws FileNotFoundException, IOException {
		final String fileSeparator = System.getProperty("file.separator");
		final List<String> lines = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(String.join(fileSeparator, directory)))) {
			for (String line; (line = reader.readLine()) != null;)
				lines.add(line);
		}
		return lines;
	}
	
}
