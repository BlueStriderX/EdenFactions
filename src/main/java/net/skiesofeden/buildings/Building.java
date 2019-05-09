package net.skiesofeden.buildings;

import java.util.UUID;
import org.bukkit.Location;
import com.massivecraft.factions.entity.Faction;
import net.skiesofeden.cities.City;

public class Building {

	public static UUID buildingUUID;
	public static City city;
	public static Faction faction;
	public static Location moduleLocation;
	
	public static UUID getBuildingUUID() {
		return buildingUUID;
	}
	
	public static City getCity() {
		return city;
	}
	
	public static Faction getFaction() {
		return faction;
	}
	
	public static Location getModuleLocation() {
		return moduleLocation;
	}
	
}
