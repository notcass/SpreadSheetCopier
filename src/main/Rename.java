package main;


import java.io.File;


@SuppressWarnings("ALL")
public class Rename {
    private int fullYear;
    private int year;
    private File rootFolder;
    private File[] monthFolders;



    public Rename(String rootFolder, int fullYear) {

        this.rootFolder = new File(rootFolder + "\\Audit");
        this.monthFolders = this.rootFolder.listFiles();

        // Validation of year
        if (fullYear > 9999 || fullYear < 1000) {
            this.fullYear = 1000;
        } else {
            this.fullYear = fullYear;

            // Getting last 2 digits of the year for use later
            String fullYearToString = String.valueOf(this.fullYear);
            int startInd = fullYearToString.length() - 2;
            String fullYearToStringYear = fullYearToString.substring(startInd);
            this.year = Integer.parseInt(fullYearToStringYear);
        }

    }


    public void testThings() {
//        System.out.println(rootFolder);
//        System.out.println("There are " + monthFolders.length + " folders in root folder.");
//
//        System.out.println(monthFolders[0].toString().length());
//        System.out.println(monthFolders[0].toString());


        rootFolder.renameTo(new File(rootFolder.toString() + " " + fullYear));
    }



    public void main() {

        for(int i = 0; i < monthFolders.length ; i++) {
            this.monthFolders = this.rootFolder.listFiles();
            File[] days = monthFolders[i].listFiles();



            // JANUARY
            if(monthFolders[i].toString().contains("JAN")) {
                String monthName = "JAN\\";
                String monthNum = "01-";
                if(monthFolders[i].toString().contains("1")) {
                    monthName = "1 JAN\\";
                }


                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }

            // FEBRUARY
            if (monthFolders[i].toString().contains("FEB")) {
                String monthName = "FEB\\";
                String monthNum = "02-";

                if(monthFolders[i].toString().contains("2")) {
                    monthName = "2 FEB\\";

                }


                for (int j = 0; j < days.length; j++) {
                    if (j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // MARCH
            if (monthFolders[i].toString().contains("MAR")) {
                String monthName = "MAR\\";
                String monthNum = "03-";

                if(monthFolders[i].toString().contains("3")) {
                    monthName = "3 MAR\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // APRIL
            if (monthFolders[i].toString().contains("APR")) {
                String monthName = "APR\\";
                String monthNum = "04-";

                if(monthFolders[i].toString().contains("4")) {
                    monthName = "4 APR\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // MAY
            if (monthFolders[i].toString().contains("MAY")) {
                String monthName = "MAY\\";
                String monthNum = "05-";

                if(monthFolders[i].toString().contains("5")) {
                    monthName = "5 MAY\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // JUNE
            if (monthFolders[i].toString().contains("JUN")) {
                String monthName = "JUN\\";
                String monthNum = "06-";

                if(monthFolders[i].toString().contains("6")) {
                    monthName = "6 JUN\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }



            // JULY
            if (monthFolders[i].toString().contains("JUL")) {
                String monthName = "JUL\\";
                String monthNum = "07-";

                if(monthFolders[i].toString().contains("7")) {
                    monthName = "7 JUL\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // AUGUST
            if (monthFolders[i].toString().contains("AUG")) {
                String monthName = "AUG\\";
                String monthNum = "08-";

                if(monthFolders[i].toString().contains("8")) {
                    monthName = "8 AUG\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // SEPTEMBER
            if (monthFolders[i].toString().contains("SEP")) {
                String monthName = "SEP\\";
                String monthNum = "09-";

                if(monthFolders[i].toString().contains("9")) {
                    monthName = "9 SEP\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // OCTOBER
            if (monthFolders[i].toString().contains("OCT")) {
                String monthName = "OCT\\";
                String monthNum = "10-";

                if(monthFolders[i].toString().contains("10")) {
                    monthName = "10 OCT\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // NOVEMBER
            if (monthFolders[i].toString().contains("NOV")) {
                String monthName = "NOV\\";
                String monthNum = "11-";

                if(monthFolders[i].toString().contains("11")) {
                    monthName = "11 NOV\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }


            }


            // DECEMBER
            if (monthFolders[i].toString().contains("DEC")) {
                String monthName = "DEC\\";
                String monthNum = "12-";

                if(monthFolders[i].toString().contains("12")) {
                    monthName = "12 DEC\\";
                }

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + monthNum + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }




        }



    }


}
