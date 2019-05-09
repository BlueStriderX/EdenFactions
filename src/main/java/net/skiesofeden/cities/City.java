package net.skiesofeden.cities;

import java.util.UUID;
import org.bukkit.Location;
import com.massivecraft.factions.entity.Faction;

public class City {
	
	public static String cityName;
	public static UUID cityUUID;
	public static Faction ownerFaction;
	public static Faction controllingFaction;
	public static Location coreBlockLocation;
	public static int radiusSize;
	public static CityType cityType;
	public static boolean capital;
	public static int victoryPoints;
	
	public static UUID generateCityUUID() {
		cityUUID = UUID.randomUUID();
		return cityUUID;
	}
	
	public static UUID getCityUUID() {
		return cityUUID;
	}
	
	public static Faction getOwnerFaction() {
		return ownerFaction;
	}
	
	public static Faction getControllingFaction() {
		return controllingFaction;
	}
	
	public static void setOwnerFaction(Faction faction) {
		ownerFaction = faction;
	}
	
	public static void setControllingFaction(Faction faction) {
		controllingFaction = faction;
	}
	
	public static Location getCoreBlockLocation() {
		return coreBlockLocation;
	}
	
	public static int getRadiusSize() {
		return radiusSize;
	}
	
	public static CityType getCityType() {
		return cityType;
	}
	
	public static void setCityType(CityType type) {
		cityType = type;
	}
	
	public static boolean getCapital() {
		return capital;
	}
	
	public static void setCaptial() {
		capital = true;
	}
	
	public static int getVictoryPoints() {
		return victoryPoints;
	}
	
	public static void setVictoryPoints(int vp) {
		victoryPoints = vp;
	}
}