package net.skiesofeden.province;

import java.util.ArrayList;
import java.util.Set;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.massivecraft.factions.entity.Faction;
import com.massivecraft.factions.entity.MPlayer;
import com.massivecraft.massivecore.collections.MassiveSet;
import com.massivecraft.massivecore.ps.PS;
import net.skiesofeden.cities.City;
import net.skiesofeden.main.Main;

public class Province implements CommandExecutor {
	
	public static Continent continent;
	public static String provinceID;
	public static String provinceName;
	public static Faction provinceController;
	public static Faction provinceOwner;
	public static Faction[] factionClaims;
	public static City[] cities;
	public static Chunk[] chunks;
		
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("skiesofeden.provinceclaim")) {
				Location location = player.getLocation();
				Chunk chunk = location.getChunk();
				MPlayer mplayer = MPlayer.get(player);
				Faction faction = mplayer.getFaction();
				claimProvince(player, faction);
			}
		}
		return false;
	}
	
	private Set<PS> claimProvince(Player player, Faction faction) {
		final PS chunk = PS.valueOf(player.getLocation()).getChunk(true);
		final Set<PS> chunks = new MassiveSet<>();
		chunks.add(chunk);
		
		ArrayList<Chunk> provinceChunks = getProvinceChunks(player.getLocation().getChunk());
		Set<PS> expansion = new MassiveSet<>();
		for(Chunk provinceChunk : provinceChunks) {
			PS provinceChunkPS = PS.valueOf(provinceChunk);
			expansion.add(provinceChunkPS);
		}
		chunks.addAll(expansion);
		return chunks;
	}

	private ArrayList<Chunk> getProvinceChunks(Chunk chunk) {		
		ArrayList<Chunk> chunks = new ArrayList<Chunk>();
		int chunkx = chunk.getX();
		int chunkz = chunk.getZ();
		World world = chunk.getWorld();
		
		for (int y = 0; y < Main.getProvincesImage().getHeight(); y++) {
		    for (int x = 0; x < Main.getProvincesImage().getWidth(); x++) {
		    	int rgbData = Main.getProvincesImage().getRGB(x, y);
		    	if(rgbData == Main.getProvincesImage().getRGB(chunkx, chunkz)) {
		    		Chunk c = world.getChunkAt(x, y);
		    		chunks.add(c);
		    	}
		    }
		}
		return chunks;
	}
}