package org.system;

public class Desktop extends Computer{
public void desktopSize() {
	int size = 24;
	System.out.println("Size: " + size + " inches");
}

public static void main(String[] args) {
	Desktop system = new Desktop();
	system.computerModel();
	system.desktopSize();
}
}
