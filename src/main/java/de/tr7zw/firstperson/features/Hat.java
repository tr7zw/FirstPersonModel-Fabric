package de.tr7zw.firstperson.features;

public enum Hat {
VANILLA(0)

;
	
	private int id;
	
	Hat(int id){
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Hat getChest(int id) {
		for(Hat c : values()) {
			if(c.id == id)return c;
		}
		return VANILLA;
	}

}