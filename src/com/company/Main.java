package com.company;

import printer.BlackAndWhitePrinter;
import printer.ColorPrinter;
import printer.Printer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer();
        Printer cPrinter = new ColorPrinter();
        Printer bawPrinter = new BlackAndWhitePrinter();

        printer.print();
        cPrinter.print();
        bawPrinter.print();
    }
}
