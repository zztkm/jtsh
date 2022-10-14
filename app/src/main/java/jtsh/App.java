/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jtsh;

import java.lang.System;
import java.util.Scanner;
import java.nio.file.Paths;

public class App {
    String getUserName() {
        return System.getProperty("user.name");
    }

    String getCwd() {
        return Paths.get("").toAbsolutePath().toString();
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Hello " + app.getUserName());

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String cwd = app.getCwd();
                System.out.print(cwd + "> ");
                String line = scanner.nextLine();

                if (line == "exit") {
                    break;
                }
                if (line == "") {
                    continue;
                }
                CommandExecutor.execute(line, 10);
            }
        }


    }
}