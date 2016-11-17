package fcu.iecs.oop;

public class Hello {

	public static void main(String[] args) {
		
		String lyrics="Let it go! Let it go! Cannot hold it back anymore";
		lyrics.replaceAll("it","her");
		lyrics.replaceAll("Cannot","Can't");
		System.out.println(lyrics);
		
		
	}

}
