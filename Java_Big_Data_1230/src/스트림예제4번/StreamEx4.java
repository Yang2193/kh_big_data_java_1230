package 스트림예제4번;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamEx4 {
    public static void main(String[] args) throws IOException {

        //파일 내용을 소스로 하는 스트림.
        Path path = Paths.get("Java_Big_Data_1230/src/스트림예제4번/test.txt");
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(e->System.out.println(e));
        System.out.println();

    }
}
