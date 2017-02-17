package festival;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rn = new Random();
		int [] time = {8, 0};
		Festival festival = new Festival("Summer festival" , time);
		String [] names = {"Group1", "Group2", "Group3", "Group4", "Group5", "Group6",
								"Group7", "Group8", "Group9", "Group10", "Group11", "Group12"};
		String [] members = {"Pesho", "Gosho", "Bob", "Kala", "Gancho", "Sasho", "Tisho", "Hris", 
							"Kris", "Dido", "Misho", "Risho", "Toni", "Miro", "Lubo", "Deko", "Mimo"};
		String [] songNames = {"Song1", "Song2", "Song3", "Song4", "Song5", "Song6", "Song7"};
		String [] songLyrics = {"Lyrics1", "Lyrics2", "Lyrics3", "Lyrics4", "Lyrics5", "Lyrics6",
								"Lyrics7"};
		
		for (int i = 0; i< names.length; i++){
			Group a = new Group(names[rn.nextInt(names.length)]);
			for(int j = 0; j<= rn.nextInt(2)+3 ; j++){
				Member c = new Member(members[rn.nextInt(members.length)]);
				//a.addmember(c);
				//don't now why it dosn't work
			}
			for(int j = 0; j<=rn.nextInt(5); j++){
				Song b = new Song (songNames[rn.nextInt(songNames.length)], songLyrics[rn.nextInt(songLyrics.length)], rn.nextInt(3)+3);
				a.addSong(b);
			}
			festival.addGroup(a);
		}
		
		System.out.println("Greatings to all..... let the show begin");
		

		
		System.out.println("Some fireworks and stuff");
		
	}
}
