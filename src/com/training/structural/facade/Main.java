package com.training.structural.facade;

import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    Facade.saveNumberToFile(1, "test.txt");
  }

}
