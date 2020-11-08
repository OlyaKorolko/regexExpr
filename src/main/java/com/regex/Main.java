package com.regex;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "\\src\\rawData"))) {
            while (scan.hasNext()) {
                String line = scan.nextLine();
                if (checkIfValidIP(line)) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkIfValidIP(String line) {
        return line.matches("^((((0x[A-Fa-f\\d]{1,2}|25[0-5]|2[0-4]\\d|1?\\d{1,2}|0(37[0-7]|3[0-6][0-7]|" +
                "[0-2][0-7]{1,2}))\\.){3}(0x[A-Fa-f\\d]{1,2}|25[0-5]|2[0-4]\\d|1?\\d{1,2}|0(37[0-7]|3[0-6]\\d|" +
                "[0-2]\\d{1,2})))|0[0-3][0-7]{1,10}|0x[A-Fa-f\\d]{2,8}|(429496729[0-5]|42949672[0-8]\\d|" +
                "4294967[0-1]\\d\\d|429496[0-6]\\d{3}|42949[0-5]\\d{4}|4294[0-8]\\d{5}|429[0-3]\\d{6}|42[0-8]\\d{7}|" +
                "4[0-1]\\d{8}|[1-3]\\d{1,9}))$");
    }
}
