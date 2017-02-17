package festival;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class Group {
	private String name;
	private ArrayList<Song> song;
	private ArrayList<Member> members;

	Group(String name){
		this.name = name;
		song = new ArrayList<>();
		members = new ArrayList<>();
	}
	
	void perform(){
		System.out.println("Now on stage is " + this.name + "Aploads!!!");
	}
	
	void addSong(Song a){
		song.add(a);
	}


	public ArrayList<Song> getSong() {
		return song;
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public String getName() {
		return name;
	}

	public void addmember(Member c) {
		this.members.add(c);
		
	}
	
}
