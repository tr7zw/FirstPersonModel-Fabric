package de.tr7zw.firstperson.config;

import de.tr7zw.firstperson.features.Back;
import de.tr7zw.firstperson.features.Boots;
import de.tr7zw.firstperson.features.Chest;
import de.tr7zw.firstperson.features.Hat;
import de.tr7zw.firstperson.features.Head;

public class CosmeticSettings {

	public Hat hat = Hat.VANILLA;
	public Head head = Head.VANILLA;
	public Chest chest = Chest.VANILLA;
	public Boots boots = Boots.VANILLA;
	public Back back = Back.VANILLA;
	
	public int playerSize = 100;
	public boolean modifyCameraHeight = false;
	
	
	public SyncSnapshot createSnapshot() {
		return new SyncSnapshot(this);
	}
	
	public static class SyncSnapshot{
		public int height;
		public int chest;
		public int boots;
		public int head;
		public int back;
		public int hat;
		public SyncSnapshot(CosmeticSettings config) {
			height = config.playerSize;
			chest = config.chest.getId();
			boots = config.boots.getId();
			head = config.head.getId();
			back = config.back.getId();
			hat = config.hat.getId();
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + back;
			result = prime * result + boots;
			result = prime * result + chest;
			result = prime * result + hat;
			result = prime * result + head;
			result = prime * result + height;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			SyncSnapshot other = (SyncSnapshot) obj;
			if (back != other.back)
				return false;
			if (boots != other.boots)
				return false;
			if (chest != other.chest)
				return false;
			if (hat != other.hat)
				return false;
			if (head != other.head)
				return false;
			if (height != other.height)
				return false;
			return true;
		}
	}
	
}