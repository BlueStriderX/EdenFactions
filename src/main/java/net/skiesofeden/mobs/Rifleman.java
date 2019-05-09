package net.skiesofeden.mobs;

import org.bukkit.Location;
import com.gmail.scyntrus.fmob.FactionMob;
import com.gmail.scyntrus.ifactions.Faction;
import com.gmail.scyntrus.ifactions.FactionsManager;
import net.minecraft.server.v1_12_R1.EntityLiving;

public class Rifleman {
	
	/**
	public Faction faction = null;
	public String factionName = "";
	public Location spawnLoc = null;
	public double locX;
	public double locY;
	public double locZ;
	public EntityLiving target = null;

	@Override
	public Faction getFaction() {
		this.setFaction(FactionsManager.getFactionByName(this.factionName));
		return faction;
	}

	@Override
	public Location getSpawn() {
		return spawnLoc;
	}

	@Override
	public double getlocX() {
		return locX;
	}

	@Override
	public double getlocY() {
		return locY;
	}

	@Override
	public double getlocZ() {
		return locZ;
	}

	@Override
	public void updateMob() {
		setFaction(faction);
		if(faction == null || faction.isNone()) {
			setFaction(FactionsManager.getFactionByName(factionName));
			if (faction == null || faction.isNone()) {
				forceDie();
				return;
			}
		}

		if (target != null && target.isAlive()) {
			setTarget(target);
		} else {
			findTarget();
		}
	}

	@Override
	public String getTypeName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getEnabled() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPowerCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMoneyCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPoiX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPoiY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPoiZ() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCommand(Command var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Command getCommand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPoi(double var1, double var3, double var5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityCreature getEntity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFactionName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearAttackedBy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Material getDrops() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean softAgro(EntityLiving var1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void findTarget() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFaction(Faction var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forceDie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTarget(EntityLiving var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EntityLiving findCloserTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocalizedName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAttackAll(boolean var1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getAttackAll() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateNameTag() {
		// TODO Auto-generated method stub
		
	}
	*/

}
