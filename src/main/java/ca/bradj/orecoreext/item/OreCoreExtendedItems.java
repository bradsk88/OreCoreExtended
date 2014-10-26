package ca.bradj.orecoreext.item;

import net.minecraft.item.Item;

import com.google.common.base.Optional;

import ca.bradj.orecoreext.item.aluminum.AluminumClump;
import ca.bradj.orecoreext.item.aluminum.AluminumCrystal;
import ca.bradj.orecoreext.item.aluminum.AluminumDirtyDust;
import ca.bradj.orecoreext.item.aluminum.AluminumExt;
import ca.bradj.orecoreext.item.aluminum.AluminumShard;
import ca.bradj.orecoreext.item.brass.BrassClump;
import ca.bradj.orecoreext.item.brass.BrassCrystal;
import ca.bradj.orecoreext.item.brass.BrassDirtyDust;
import ca.bradj.orecoreext.item.brass.BrassExt;
import ca.bradj.orecoreext.item.brass.BrassShard;
import ca.bradj.orecoreext.item.bronze.BronzeClump;
import ca.bradj.orecoreext.item.bronze.BronzeCrystal;
import ca.bradj.orecoreext.item.bronze.BronzeDirtyDust;
import ca.bradj.orecoreext.item.bronze.BronzeExt;
import ca.bradj.orecoreext.item.bronze.BronzeShard;
import ca.bradj.orecoreext.item.copper.CopperClump;
import ca.bradj.orecoreext.item.copper.CopperCrystal;
import ca.bradj.orecoreext.item.copper.CopperDirtyDust;
import ca.bradj.orecoreext.item.copper.CopperExt;
import ca.bradj.orecoreext.item.copper.CopperShard;
import ca.bradj.orecoreext.item.copper.carb.Copper2CarbonateExt;
import ca.bradj.orecoreext.item.diamond.Diamond;
import ca.bradj.orecoreext.item.diamond.DiamondDirtyDust;
import ca.bradj.orecoreext.item.diamond.DiamondDust;
import ca.bradj.orecoreext.item.diamond.DiamondIngot;
import ca.bradj.orecoreext.item.diamond.DiamondNugget;
import ca.bradj.orecoreext.item.gold.GoldClump;
import ca.bradj.orecoreext.item.gold.GoldCrystal;
import ca.bradj.orecoreext.item.gold.GoldDirtyDust;
import ca.bradj.orecoreext.item.gold.GoldExt;
import ca.bradj.orecoreext.item.gold.GoldShard;
import ca.bradj.orecoreext.item.iron.IronClump;
import ca.bradj.orecoreext.item.iron.IronCrystal;
import ca.bradj.orecoreext.item.iron.IronDirtyDust;
import ca.bradj.orecoreext.item.iron.IronExt;
import ca.bradj.orecoreext.item.iron.IronShard;
import ca.bradj.orecoreext.item.lead.LeadClump;
import ca.bradj.orecoreext.item.lead.LeadCrystal;
import ca.bradj.orecoreext.item.lead.LeadDirtyDust;
import ca.bradj.orecoreext.item.lead.LeadExt;
import ca.bradj.orecoreext.item.lead.LeadShard;
import ca.bradj.orecoreext.item.manganese.ManganeseClump;
import ca.bradj.orecoreext.item.manganese.ManganeseCrystal;
import ca.bradj.orecoreext.item.manganese.ManganeseDirtyDust;
import ca.bradj.orecoreext.item.manganese.ManganeseExt;
import ca.bradj.orecoreext.item.manganese.ManganeseShard;
import ca.bradj.orecoreext.item.nickel.NickelClump;
import ca.bradj.orecoreext.item.nickel.NickelCrystal;
import ca.bradj.orecoreext.item.nickel.NickelDirtyDust;
import ca.bradj.orecoreext.item.nickel.NickelExt;
import ca.bradj.orecoreext.item.nickel.NickelShard;
import ca.bradj.orecoreext.item.obsidian.Obsidian;
import ca.bradj.orecoreext.item.obsidian.ObsidianClump;
import ca.bradj.orecoreext.item.obsidian.ObsidianCrystal;
import ca.bradj.orecoreext.item.obsidian.ObsidianDirtyDust;
import ca.bradj.orecoreext.item.obsidian.ObsidianDust;
import ca.bradj.orecoreext.item.obsidian.ObsidianIngot;
import ca.bradj.orecoreext.item.obsidian.ObsidianNugget;
import ca.bradj.orecoreext.item.obsidian.ObsidianShard;
import ca.bradj.orecoreext.item.osmium.OsmiumClump;
import ca.bradj.orecoreext.item.osmium.OsmiumCrystal;
import ca.bradj.orecoreext.item.osmium.OsmiumDirtyDust;
import ca.bradj.orecoreext.item.osmium.OsmiumExt;
import ca.bradj.orecoreext.item.osmium.OsmiumShard;
import ca.bradj.orecoreext.item.silver.SilverClump;
import ca.bradj.orecoreext.item.silver.SilverCrystal;
import ca.bradj.orecoreext.item.silver.SilverDirtyDust;
import ca.bradj.orecoreext.item.silver.SilverExt;
import ca.bradj.orecoreext.item.silver.SilverShard;
import ca.bradj.orecoreext.item.steel.SteelClump;
import ca.bradj.orecoreext.item.steel.SteelCrystal;
import ca.bradj.orecoreext.item.steel.SteelDirtyDust;
import ca.bradj.orecoreext.item.steel.SteelExt;
import ca.bradj.orecoreext.item.steel.SteelShard;
import ca.bradj.orecoreext.item.tin.TinClump;
import ca.bradj.orecoreext.item.tin.TinCrystal;
import ca.bradj.orecoreext.item.tin.TinDirtyDust;
import ca.bradj.orecoreext.item.tin.TinExt;
import ca.bradj.orecoreext.item.tin.TinShard;
import ca.bradj.orecoreext.item.zinc.ZincClump;
import ca.bradj.orecoreext.item.zinc.ZincCrystal;
import ca.bradj.orecoreext.item.zinc.ZincDirtyDust;
import ca.bradj.orecoreext.item.zinc.ZincExt;
import ca.bradj.orecoreext.item.zinc.ZincShard;

public class OreCoreExtendedItems {

	public static AluminumClump aluminumClump;
	public static AluminumCrystal aluminumCrystal;
	public static AluminumShard aluminumShard;

	public static BrassClump brassClump;
	public static BrassCrystal brassCrystal;
	public static BrassShard brassShard;

	public static BronzeClump bronzeClump;
	public static BronzeCrystal bronzeCrystal;
	public static BronzeShard bronzeShard;

	public static CopperClump copperClump;
	public static CopperCrystal copperCrystal;
	public static CopperShard copperShard;

	public static GoldClump goldClump;
	public static GoldCrystal goldCrystal;
	public static GoldShard goldShard;

	public static IronClump ironClump;
	public static IronCrystal ironCrystal;
	public static IronShard ironShard;

	public static ManganeseClump manganeseClump;
	public static ManganeseCrystal manganeseCrystal;
	public static ManganeseShard manganeseShard;

	public static NickelClump nickelClump;
	public static NickelCrystal nickelCrystal;
	public static NickelShard nickelShard;

	public static ObsidianClump obsidianClump;
	public static ObsidianCrystal obsidianCrystal;
	public static ObsidianShard obsidianShard;

	public static OsmiumClump osmiumClump;
	public static OsmiumCrystal osmiumCrystal;
	public static OsmiumShard osmiumShard;

	public static SilverClump silverClump;
	public static SilverCrystal silverCrystal;
	public static SilverShard silverShard;

	public static SteelClump steelClump;
	public static SteelCrystal steelCrystal;
	public static SteelShard steelShard;

	public static TinClump tinClump;
	public static TinCrystal tinCrystal;
	public static TinShard tinShard;

	public static ZincClump zincClump;
	public static ZincCrystal zincCrystal;
	public static ZincShard zincShard;

	public static AluminumDirtyDust aluminumDirtyDust;
	public static BrassDirtyDust brassDirtyDust;
	public static BronzeDirtyDust bronzeDirtyDust;
	public static CopperDirtyDust copperDirtyDust;
	public static GoldDirtyDust goldDirtyDust;
	public static IronDirtyDust ironDirtyDust;
	public static ManganeseDirtyDust manganeseDirtyDust;
	public static NickelDirtyDust nickelDirtyDust;
	public static OsmiumDirtyDust osmiumDirtyDust;
	public static SilverDirtyDust silverDirtyDust;
	public static SteelDirtyDust steelDirtyDust;
	public static TinDirtyDust tinDirtyDust;
	public static ZincDirtyDust zincDirtyDust;

	public static DiamondDust diamondDust;
	public static DiamondNugget diamondNugget;
	public static DiamondIngot diamondIngot;
	public static DiamondDirtyDust diamondDirtyDust;

	public static ObsidianDust obsidianDust;
	public static ObsidianNugget obsidianNugget;
	public static ObsidianIngot obsidianIngot;
	public static ObsidianDirtyDust obsidianDirtyDust;

	public static LeadClump leadClump;
	public static LeadCrystal leadCrystal;
	public static LeadShard leadShard;
	public static LeadDirtyDust leadDirtyDust;

	public static final void init() {
		AluminumExt.init();
		BrassExt.init();
		BronzeExt.init();
		CopperExt.init();
		Copper2CarbonateExt.init();
		Diamond.init();
		GoldExt.init();
		IronExt.init();
		LeadExt.init();
		ManganeseExt.init();
		NickelExt.init();
		OsmiumExt.init();
		Obsidian.init();
		SilverExt.init();
		SteelExt.init();
		TinExt.init();
		ZincExt.init();
	}

	public static Optional<Item> getCrystalByName(String name) {
		String nameToUse = name.toLowerCase().replace("crystal", "");
		if ("aluminum".equals(nameToUse)) {
			return Optional.of((Item) aluminumCrystal);
		}
		if ("brass".equals(nameToUse)) {
			return Optional.of((Item) brassCrystal);
		}
		if ("bronze".equals(nameToUse)) {
			return Optional.of((Item) bronzeCrystal);
		}
		if ("copper".equals(nameToUse)) {
			return Optional.of((Item) copperCrystal);
		}
		if ("gold".equals(nameToUse)) {
			return Optional.of((Item) goldCrystal);
		}
		if ("iron".equals(nameToUse)) {
			return Optional.of((Item) ironCrystal);
		}
		if ("lead".equals(nameToUse)) {
			return Optional.of((Item) leadCrystal);
		}
		if ("manganese".equals(nameToUse)) {
			return Optional.of((Item) manganeseCrystal);
		}
		if ("nickel".equals(nameToUse)) {
			return Optional.of((Item) nickelCrystal);
		}
		if ("obsidian".equals(nameToUse)) {
			return Optional.of((Item) obsidianCrystal);
		}
		if ("osmium".equals(nameToUse)) {
			return Optional.of((Item) osmiumCrystal);
		}
		if ("silver".equals(nameToUse)) {
			return Optional.of((Item) silverCrystal);
		}
		if ("steel".equals(nameToUse)) {
			return Optional.of((Item) steelCrystal);
		}
		if ("tin".equals(nameToUse)) {
			return Optional.of((Item) tinCrystal);
		}
		if ("zinc".equals(nameToUse)) {
			return Optional.of((Item) zincCrystal);
		}
		return Optional.absent();
	}

	public static Optional<Item> getClumpByName(String name) {
		String nameToUse = name.toLowerCase().replace("clump", "");
		if ("aluminum".equals(nameToUse)) {
			return Optional.of((Item) aluminumClump);
		}
		if ("brass".equals(nameToUse)) {
			return Optional.of((Item) brassClump);
		}
		if ("bronze".equals(nameToUse)) {
			return Optional.of((Item) bronzeClump);
		}
		if ("copper".equals(nameToUse)) {
			return Optional.of((Item) copperClump);
		}
		if ("gold".equals(nameToUse)) {
			return Optional.of((Item) goldClump);
		}
		if ("iron".equals(nameToUse)) {
			return Optional.of((Item) ironClump);
		}
		if ("lead".equals(nameToUse)) {
			return Optional.of((Item) leadClump);
		}
		if ("manganese".equals(nameToUse)) {
			return Optional.of((Item) manganeseClump);
		}
		if ("nickel".equals(nameToUse)) {
			return Optional.of((Item) nickelClump);
		}
		if ("obsidian".equals(nameToUse)) {
			return Optional.of((Item) obsidianClump);
		}
		if ("osmium".equals(nameToUse)) {
			return Optional.of((Item) osmiumClump);
		}
		if ("silver".equals(nameToUse)) {
			return Optional.of((Item) silverClump);
		}
		if ("steel".equals(nameToUse)) {
			return Optional.of((Item) steelClump);
		}
		if ("tin".equals(nameToUse)) {
			return Optional.of((Item) tinClump);
		}
		if ("zinc".equals(nameToUse)) {
			return Optional.of((Item) zincClump);
		}
		return Optional.absent();
	}
	
	public static Optional<Item> getShardByName(String name) {
		
		String nameToUse = name.toLowerCase().replace("shard", "");
		
		if ("aluminum".equals(nameToUse)) {
			return Optional.of((Item) aluminumShard);
		}
		if ("brass".equals(nameToUse)) {
			return Optional.of((Item) brassShard);
		}
		if ("bronze".equals(nameToUse)) {
			return Optional.of((Item) bronzeShard);
		}
		if ("copper".equals(nameToUse)) {
			return Optional.of((Item) copperShard);
		}
		if ("gold".equals(nameToUse)) {
			return Optional.of((Item) goldShard);
		}
		if ("iron".equals(nameToUse)) {
			return Optional.of((Item) ironShard);
		}
		if ("lead".equals(nameToUse)) {
			return Optional.of((Item) leadShard);
		}
		if ("manganese".equals(nameToUse)) {
			return Optional.of((Item) manganeseShard);
		}
		if ("nickel".equals(nameToUse)) {
			return Optional.of((Item) nickelShard);
		}
		if ("obsidian".equals(nameToUse)) {
			return Optional.of((Item) obsidianShard);
		}
		if ("osmium".equals(nameToUse)) {
			return Optional.of((Item) osmiumShard);
		}
		if ("silver".equals(nameToUse)) {
			return Optional.of((Item) silverShard);
		}
		if ("steel".equals(nameToUse)) {
			return Optional.of((Item) steelShard);
		}
		if ("tin".equals(nameToUse)) {
			return Optional.of((Item) tinShard);
		}
		if ("zinc".equals(nameToUse)) {
			return Optional.of((Item) zincShard);
		}
		return Optional.absent();
	}
}
