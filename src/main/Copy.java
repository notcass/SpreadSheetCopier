package main;


import java.io.*;
import java.nio.file.*;

public class Copy {
    private File rootFolder;

    public Copy(String rootFolder, int fullYear) {
        this.rootFolder = new File(rootFolder + "\\Audit");
    }

    // Make month folders at root location
     public void mkDirs() {
        Path jan = Paths.get(rootFolder + "\\1 JAN");
        Path feb = Paths.get(rootFolder + "\\2 FEB");
        Path mar = Paths.get(rootFolder + "\\3 MAR");
        Path apr = Paths.get(rootFolder + "\\4 APR");
        Path may = Paths.get(rootFolder + "\\5 MAY");
        Path jun = Paths.get(rootFolder + "\\6 JUN");
        Path jul = Paths.get(rootFolder + "\\7 JUL");
        Path aug = Paths.get(rootFolder + "\\8 AUG");
        Path sep = Paths.get(rootFolder + "\\9 SEP");
        Path oct = Paths.get(rootFolder + "\\10 OCT");
        Path nov = Paths.get(rootFolder + "\\11 NOV");
        Path dec = Paths.get(rootFolder + "\\12 DEC");


        try {
            Files.createDirectories(jan);
            Files.createDirectories(feb);
            Files.createDirectories(mar);
            Files.createDirectories(apr);
            Files.createDirectories(may);
            Files.createDirectories(jun);
            Files.createDirectories(jul);
            Files.createDirectories(aug);
            Files.createDirectories(sep);
            Files.createDirectories(oct);
            Files.createDirectories(nov);
            Files.createDirectories(dec);

        } catch(Exception e) {

        }


    }


    // Copy Files
    public void copyFiles() {

        /*

                PROBLEM (NOW FIXED):
          Program worked perfectly when running in IDE, but when exporting to a executable JAR
          the program wouldn't copy the Excel files, this is apparently a common problem with resources but
          the fix is very complicated and different for each case it seems. Something to do with
          Classloader or InputStream seems to be the answer





            ORIGINAL CODE
        Path template = Paths.get("src\\copier\\res\\template.xls");

            Fix attempt 2
        InputStream template = Main.class.getResourceAsStream("src\\copier\\res\\template.xls");

            Fix attempt 3
        InputStream template = getClass().getClassLoader().getResourceAsStream("src\\copier\\res\\template.xls");

            Fix attempt 4
        InputStream in = getClass().getResourceAsStream("src\\copier\\res\\template.xls");
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            Fix attempt 5
        getClass().getResourceAsStream("src\\copier\\res\\template.xls");

            Fix attempt 6
        Path template = Paths.get(getClass().getResourceAsStream("src\\copier\\res\\template.xls").toString());

        */

        try {


            InputStream template = getClass().getClassLoader().getResourceAsStream("template.xls");


            if(template != null) {


                for (int month = 1; month < 13; month++) {

                    for (int day = 1; day < 32; day++) {

                        // January
                        if (month == 1) {
                            Path location = Paths.get(rootFolder + "\\1 JAN\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // February
                        if (month == 2 && day < 29) {
                            Path location = Paths.get(rootFolder + "\\2 FEB\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // March
                        if (month == 3) {
                            Path location = Paths.get(rootFolder + "\\3 MAR\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // April
                        if (month == 4 && day < 31) {
                            Path location = Paths.get(rootFolder + "\\4 APR\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // May
                        if (month == 5) {
                            Path location = Paths.get(rootFolder + "\\5 MAY\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // June
                        if (month == 6 && day < 31) {
                            Path location = Paths.get(rootFolder + "\\6 JUN\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // July
                        if (month == 7) {
                            Path location = Paths.get(rootFolder + "\\7 JUL\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // August
                        if (month == 8) {
                            Path location = Paths.get(rootFolder + "\\8 AUG\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // September
                        if (month == 9 && day < 31) {
                            Path location = Paths.get(rootFolder + "\\9 SEP\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // October
                        if (month == 10) {
                            Path location = Paths.get(rootFolder + "\\10 OCT\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // November
                        if (month == 11) {
                            Path location = Paths.get(rootFolder + "\\11 NOV\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                        // December
                        if (month == 12) {
                            Path location = Paths.get(rootFolder + "\\12 DEC\\" + day + ".xls");
                            Files.copy(template, location, StandardCopyOption.REPLACE_EXISTING);
                        }

                    }

                }

            }

        } catch (Exception e) {

        }


    }


    // Rename Files


}
