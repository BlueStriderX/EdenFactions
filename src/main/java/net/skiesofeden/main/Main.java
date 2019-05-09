package net.skiesofeden.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.bukkit.plugin.java.JavaPlugin;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.massivecraft.factions.entity.Faction;
import net.skiesofeden.cities.City;
import net.skiesofeden.province.Province;

public class Main extends JavaPlugin {

public static Multimap<Faction, City> cities = ArrayListMultimap.create();

private static BufferedImage provincesImage;
	
private static Main plugin;
  public String NAME = "EdenFactions";
  public String VERSION = "0.1";
  public String AUTHOR = "SOEDevTeam";
  
  public String pluginfile = NAME + "v" + VERSION;

  
  @Override
  public void onEnable() {
	  plugin = this;
	  
	  getCommand("provinceclaim").setExecutor(new Province());
  }
  
  public static BufferedImage getProvincesImage() {
	  try {
		provincesImage = ImageIO.read(plugin.getClass().getClassLoader().getResourceAsStream("provinces.png"));
		return provincesImage;
	} catch (IOException e) {
		e.printStackTrace();
	}
	  return provincesImage;
  }
}