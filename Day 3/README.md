The BufferReader is much faster than Scanner

But if you want scanner you can try the following

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileLineByLineUsingScanner {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("sample.txt"));

			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
```

BufferReader Implementation

```
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLineUsingBufferedReader {

	public static void main(String[] args) {
		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader("sample.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
```

```
\\ Beginning
output.substring(1)

\\ Beginning and Ending
output.substring(1,2)

System.out.printf("$ %,.2f", total);

for (char c: string.toCharArray()){
    if (Character.isDigit(c)){
        number += String.valueOf(c);
    }
}

string.toCharArray()

Character.isDigit(c)

number.equals("")
```