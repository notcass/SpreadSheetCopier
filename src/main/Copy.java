package main;


import java.io.*;
import java.nio.file.*;

public class Copy {
    private File rootFolder;
    private final String fullYear;


    public Copy(String rootFolder, String fullYear) {
        this.rootFolder = new File(rootFolder + "\\Audit " + fullYear);
        this.fullYear = fullYear;
    }

    // Make month folders at root location
    void mkDirs() {
        Path jan = Paths.get(rootFolder + "\\1 JAN " + fullYear);
        Path feb = Paths.get(rootFolder + "\\2 FEB " + fullYear);
        Path mar = Paths.get(rootFolder + "\\3 MAR " + fullYear);
        Path apr = Paths.get(rootFolder + "\\4 APR " + fullYear);
        Path may = Paths.get(rootFolder + "\\5 MAY " + fullYear);
        Path jun = Paths.get(rootFolder + "\\6 JUN " + fullYear);
        Path jul = Paths.get(rootFolder + "\\7 JUL " + fullYear);
        Path aug = Paths.get(rootFolder + "\\8 AUG " + fullYear);
        Path sep = Paths.get(rootFolder + "\\9 SEP " + fullYear);
        Path oct = Paths.get(rootFolder + "\\10 OCT " + fullYear);
        Path nov = Paths.get(rootFolder + "\\11 NOV " + fullYear);
        Path dec = Paths.get(rootFolder + "\\12 DEC " + fullYear);


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


    void copyFiles() {

        try {

            InputStream template = getClass().getClassLoader().getResourceAsStream("template.xls");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            org.apache.commons.io.IOUtils.copy(template, baos);
            byte[] bytes = baos.toByteArray();



            for(int month = 1; month < 13; month++) {

                for(int day = 1; day < 32; day++) {

                    // January
                    if(month == 1) {
                        Path location = Paths.get(rootFolder + "\\1 JAN " + fullYear + "\\"+ day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // February
                    if(month == 2 && day < 29) {
                        Path location = Paths.get(rootFolder + "\\2 FEB " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // March
                    if(month == 3) {
                        Path location = Paths.get(rootFolder + "\\3 MAR " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // April
                    if(month == 4 && day < 31) {
                        Path location = Paths.get(rootFolder + "\\4 APR " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // May
                    if(month == 5) {
                        Path location = Paths.get(rootFolder + "\\5 MAY " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // June
                    if(month == 6 && day < 31) {
                        Path location = Paths.get(rootFolder + "\\6 JUN " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // July
                    if(month == 7) {
                        Path location = Paths.get(rootFolder + "\\7 JUL " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // August
                    if(month == 8) {
                        Path location = Paths.get(rootFolder + "\\8 AUG " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // September
                    if(month == 9 && day < 31) {
                        Path location = Paths.get(rootFolder + "\\9 SEP " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // October
                    if(month == 10) {
                        Path location = Paths.get(rootFolder + "\\10 OCT " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // November
                    if(month == 11) {
                        Path location = Paths.get(rootFolder + "\\11 NOV " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }

                    // December
                    if(month == 12) {
                        Path location = Paths.get(rootFolder + "\\12 DEC " + fullYear + "\\"  + day + ".xls");
                        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                        Files.copy(bais, location, StandardCopyOption.REPLACE_EXISTING);
                    }


                }


            }



        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
