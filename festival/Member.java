package festival;

import java.util.Random;

public class Member {
	Random rn = new Random();
	enum PositionInBand {BARABANIST, KITARIST, BASIST, PIANIST, VOKAL};
	private String name;
	private PositionInBand position;
	
	Member(String name){
		this.name = name;
		this.position = PositionInBand.values()[new Random().nextInt(PositionInBand.values().length)];
							//RANDOM POSITION
	}
	
	boolean ImVocal(){
		if(this.position == PositionInBand.VOKAL){
			return true;
		}
		return false;
	}

	public PositionInBand getPosition() {
		return position;
	}
	
}
