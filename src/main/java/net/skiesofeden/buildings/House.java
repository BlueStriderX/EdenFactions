package net.skiesofeden.buildings;

import java.util.ArrayList;
import java.util.Random;
import org.bukkit.entity.EntityType;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;

public class House {

	public static void generateNPCs() {
		Random random = new Random();
		int min = 1;
		int max = 3;
		int number = random.nextInt(max - min + 1) + min;
		
		if(number == 1) {
			String npc1Name = generateRandomName();
			NPC resident1 = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, npc1Name);
			//resident1.spawn(npcLocation1);
		} else if(number == 2) {
			String npc1Name = generateRandomName();
			NPC resident1 = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, npc1Name);
			//resident1.spawn(npcLocation1);
			
			String npc2Name = generateRandomName();
			NPC resident2 = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, npc2Name);
			//resident2.spawn(npcLocation2);
		} else if(number == 3) {
			String npc1Name = generateRandomName();
			NPC resident1 = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, npc1Name);
			//resident1.spawn(npcLocation1);
		
			String npc2Name = generateRandomName();
			NPC resident2 = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, npc2Name);
			//resident2.spawn(npcLocation2);
			
			String npc3Name = generateRandomName();
			NPC resident3 = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER, npc3Name);
			//resident3.spawn(npcLocation3);
		}
	}
	
	public static String generateRandomName() {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Samantha");
		names.add("Sally");
		names.add("Gene");
		names.add("Garry");
		names.add("Sam");
		names.add("Arthur");
		names.add("Joe");
		names.add("John");
		names.add("Jack");
		names.add("Pete");
		names.add("Peter");
		names.add("Kenneth");
		names.add("Jason");
		names.add("Jackson");
		names.add("Steve");
		names.add("Alex");
		names.add("Alexander");
		names.add("Terry");
		names.add("Jerry");
		names.add("Harry");
		names.add("Harold");
		names.add("Johnathan");
		
		Random random = new Random(); 
        return names.get(random.nextInt(names.size())); 
	}
}
