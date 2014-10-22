package ca.bradj.orecoreext.item;

import ca.bradj.orecoreext.item.aluminum.AluminumClump;
import ca.bradj.orecoreext.item.aluminum.AluminumCrystal;
import ca.bradj.orecoreext.item.aluminum.AluminumExt;
import ca.bradj.orecoreext.item.aluminum.AluminumShard;
import ca.bradj.orecoreext.item.brass.BrassClump;
import ca.bradj.orecoreext.item.brass.BrassCrystal;
import ca.bradj.orecoreext.item.brass.BrassExt;
import ca.bradj.orecoreext.item.brass.BrassShard;
import ca.bradj.orecoreext.item.bronze.BronzeClump;
import ca.bradj.orecoreext.item.bronze.BronzeCrystal;
import ca.bradj.orecoreext.item.bronze.BronzeExt;
import ca.bradj.orecoreext.item.bronze.BronzeShard;
import ca.bradj.orecoreext.item.copper.CopperClump;
import ca.bradj.orecoreext.item.copper.CopperCrystal;
import ca.bradj.orecoreext.item.copper.CopperExt;
import ca.bradj.orecoreext.item.copper.CopperShard;
import ca.bradj.orecoreext.item.copper.carb.Copper2CarbonateExt;
import ca.bradj.orecoreext.item.gold.GoldClump;
import ca.bradj.orecoreext.item.gold.GoldCrystal;
import ca.bradj.orecoreext.item.gold.GoldExt;
import ca.bradj.orecoreext.item.gold.GoldShard;
import ca.bradj.orecoreext.item.iron.IronClump;
import ca.bradj.orecoreext.item.iron.IronCrystal;
import ca.bradj.orecoreext.item.iron.IronExt;
import ca.bradj.orecoreext.item.iron.IronShard;
import ca.bradj.orecoreext.item.manganese.ManganeseClump;
import ca.bradj.orecoreext.item.manganese.ManganeseCrystal;
import ca.bradj.orecoreext.item.manganese.ManganeseExt;
import ca.bradj.orecoreext.item.manganese.ManganeseShard;
import ca.bradj.orecoreext.item.nickel.NickelClump;
import ca.bradj.orecoreext.item.nickel.NickelCrystal;
import ca.bradj.orecoreext.item.nickel.NickelExt;
import ca.bradj.orecoreext.item.nickel.NickelShard;
import ca.bradj.orecoreext.item.osmium.OsmiumClump;
import ca.bradj.orecoreext.item.osmium.OsmiumCrystal;
import ca.bradj.orecoreext.item.osmium.OsmiumExt;
import ca.bradj.orecoreext.item.osmium.OsmiumShard;
import ca.bradj.orecoreext.item.silver.SilverClump;
import ca.bradj.orecoreext.item.silver.SilverCrystal;
import ca.bradj.orecoreext.item.silver.SilverExt;
import ca.bradj.orecoreext.item.silver.SilverShard;
import ca.bradj.orecoreext.item.steel.SteelClump;
import ca.bradj.orecoreext.item.steel.SteelCrystal;
import ca.bradj.orecoreext.item.steel.SteelExt;
import ca.bradj.orecoreext.item.steel.SteelShard;
import ca.bradj.orecoreext.item.tin.TinClump;
import ca.bradj.orecoreext.item.tin.TinCrystal;
import ca.bradj.orecoreext.item.tin.TinExt;
import ca.bradj.orecoreext.item.tin.TinShard;
import ca.bradj.orecoreext.item.zinc.ZincClump;
import ca.bradj.orecoreext.item.zinc.ZincCrystal;
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

	public static final void init() {
		AluminumExt.init();
		BrassExt.init();
		BronzeExt.init();
		CopperExt.init();
		Copper2CarbonateExt.init();
		GoldExt.init();
		IronExt.init();
		ManganeseExt.init();
		NickelExt.init();
		OsmiumExt.init();
		SilverExt.init();
		SteelExt.init();
		TinExt.init();
		ZincExt.init();
	}
}
