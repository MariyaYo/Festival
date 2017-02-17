package festival;

import java.util.HashMap;
import java.util.Map.Entry;

public class Festival {
	
	private String place;
	private int [] time = new int[2];
	private HashMap<String, Group> groups;
	
	Festival (String place, int [] time){
		this.place = place;
		this.time = time;
		this.groups = new HashMap<>();
		
		
	}
	void addGroup(Group a){
			groups.put(a.getName(), a);
	}
	
	void startPerforming(Group band){
		boolean withLyrics = false;
		for(int i =0; i< band.getMembers().size(); i++){
			Member a = (Member)band.getMembers().get(i);
			if (a.ImVocal()){
				withLyrics = true;
				break;
			}
		}
		for(Song a : band.getSong()){
			if(withLyrics){
				System.out.println( a.toString());
			}else{
				System.out.println(a.getTitle());
			}
			time [1] += a.getTime();
			if(time[1]>60){
				time[0]++;
				time[1] -=60;
			}		
		}
	}
	public HashMap<String, Group> getGroups() {
		return groups;
	}

}
