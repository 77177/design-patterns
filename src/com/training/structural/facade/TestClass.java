package com.training.structural.facade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

  public static void saveNumberToFile(int number, String filename) throws IOException {
    Path path = Paths.get(filename);

    List<String> numbers = Stream.of(number).map(String::valueOf).collect(Collectors.toList());

    Files.write(path,numbers);
  }

}
