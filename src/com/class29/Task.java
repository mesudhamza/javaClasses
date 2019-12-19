package com.class29;
//Create a class File that will have the following behaviors: open, edit, close. 
//Edit and close are implemented method while open is an abstract. 
//Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: 
//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

public abstract class Task {

	public  abstract void open();
	
	public void edit() {
		System.out.println("I am an implemented method");
	}
	
	public void close() {
		System.out.println("I am close method");
	}
	
}

class JavaFile extends Task {

	@Override
	public void open() {
		System.out.println("To open .java file we need notepad++ or sublime text to be installed");
		
	}
	
}

class WordFile extends Task {

	@Override
	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be installed");
		
	}
	
}

class PDFFile extends Task {

	@Override
	public void open() {
		System.out.println("To open .pdf file we need Adobe Acrobat to be installed");
		
	}
	
}





