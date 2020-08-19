package main;


import java.io.File;


public class Renamer {
    private final int fullYear;
    private String year;
    private final File rootFolder;
    private File[] monthFolders;



    public Renamer(String rootFolder, int fullYear) {

        this.rootFolder = new File(rootFolder + "\\Audit " + fullYear);
        this.monthFolders = this.rootFolder.listFiles();

        // Validation of year
        if (fullYear > 9999 || fullYear < 1000) {
            this.fullYear = 1000;
        } else {
            this.fullYear = fullYear;

            // Getting last 2 digits of the year for use later
            String fullYearToString = String.valueOf(this.fullYear);
            int startInd = fullYearToString.length() - 2;
            this.year = fullYearToString.substring(startInd);

        }

    }


    public void main() {

        for(int i = 0; i < monthFolders.length ; i++) {
            this.monthFolders = this.rootFolder.listFiles();
            File[] days = monthFolders[i].listFiles();
            String monthName;



            // JANUARY
            if(monthFolders[i].toString().contains("JAN")) {
                monthName = "1 JAN " + fullYear + "\\01-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }

            // FEBRUARY
            if (monthFolders[i].toString().contains("FEB")) {
                monthName = "2 FEB " + fullYear + "\\02-";

                for (int j = 0; j < days.length; j++) {
                    if (j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // MARCH
            if (monthFolders[i].toString().contains("MAR")) {
                monthName = "3 MAR " + fullYear + "\\03-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // APRIL
            if (monthFolders[i].toString().contains("APR")) {
                monthName = "4 APR " + fullYear + "\\04-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // MAY
            if (monthFolders[i].toString().contains("MAY")) {
                monthName = "5 MAY " + fullYear + "\\05-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // JUNE
            if (monthFolders[i].toString().contains("JUN")) {
                monthName = "6 JUN " + fullYear + "\\06-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }



            // JULY
            if (monthFolders[i].toString().contains("JUL")) {
                monthName = "7 JUL " + fullYear + "\\07-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // AUGUST
            if (monthFolders[i].toString().contains("AUG")) {
                monthName = "8 AUG " + fullYear + "\\08-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // SEPTEMBER
            if (monthFolders[i].toString().contains("SEP")) {
                monthName = "9 SEP " + fullYear + "\\09-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // OCTOBER
            if (monthFolders[i].toString().contains("OCT")) {
                monthName = "10 OCT " + fullYear + "\\10-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }


            // NOVEMBER
            if (monthFolders[i].toString().contains("NOV")) {
                monthName = "11 NOV " + fullYear + "\\11-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }


            }


            // DECEMBER
            if (monthFolders[i].toString().contains("DEC")) {
                monthName = "12 DEC " + fullYear + "\\12-";

                for (int j = 0; j < days.length; j++) {
                    if(j < 9) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + "0" + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));
                    } else if (j < 40) {
                        days[j].renameTo(new File(rootFolder + "\\" + monthName + (j + 1) + "-" + year + " DAILY WINGATE JE  V052218.xls"));

                    }

                }

            }




        }

    }


}
