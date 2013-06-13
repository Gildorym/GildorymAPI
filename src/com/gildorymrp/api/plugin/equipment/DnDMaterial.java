package com.gildorymrp.api.plugin.equipment;

import org.bukkit.Material;

/**
 * An enum containing D&D materials
 * @author Lucariatias
 *
 */
public enum DnDMaterial {
	
	//--- Trade goods, page 112 player's handbook 1 ---
	WHEAT("Wheat", 1, 1, ItemType.TRADE_GOOD, Material.WHEAT),
	FLOUR("Flour", 2, 1, ItemType.TRADE_GOOD, Material.SUGAR),
	CHICKEN("Chicken", 2, 1, ItemType.TRADE_GOOD, Material.MONSTER_EGG, (byte) 93),
	IRON("Iron", 10, 1, ItemType.TRADE_GOOD, Material.IRON_INGOT),
	TOBACCO("Tobacco", 50, 1, ItemType.TRADE_GOOD, Material.DEAD_BUSH),
	COPPER("Copper", 50, 1, ItemType.TRADE_GOOD, Material.GOLD_INGOT),
	CINNAMON("Cinnamon", 100, 1, ItemType.TRADE_GOOD, Material.STICK),
	GOAT("Goat", 100, 1, ItemType.TRADE_GOOD, Material.MONSTER_EGG, (byte) 91),
	GINGER("Ginger", 200, 1, ItemType.TRADE_GOOD, Material.SEEDS),
	PEPPER("Pepper", 200, 1, ItemType.TRADE_GOOD, Material.SULPHUR),
	SHEEP("Sheep", 200, 1, ItemType.TRADE_GOOD, Material.MONSTER_EGG, (byte) 91),
	PIG("Pig", 300, 1, ItemType.TRADE_GOOD, Material.MONSTER_EGG, (byte) 90),
	LINEN("Linen", 400, 1, ItemType.TRADE_GOOD, Material.WOOL),
	SALT("Salt", 500, 1, ItemType.TRADE_GOOD, Material.SUGAR),
	SILVER("Silver", 500, 1, ItemType.TRADE_GOOD, Material.IRON_INGOT),
	SILK("Silk", 1000, 1, ItemType.TRADE_GOOD, Material.WOOL),
	COW("Cow", 1000, 1, ItemType.TRADE_GOOD, Material.MONSTER_EGG, (byte) 92),
	SAFFRON("Saffron", 1500, 1, ItemType.TRADE_GOOD, Material.INK_SACK, (byte) 4),
	CLOVES("Cloves", 1500, 1, ItemType.TRADE_GOOD, Material.MELON_SEEDS),
	OX("Ox", 1500, 1, ItemType.TRADE_GOOD, Material.MONSTER_EGG, (byte) 92),
	GOLD("Gold", 5000, 1, ItemType.TRADE_GOOD, Material.GOLD_INGOT),
	PLATINUM("Platinum", 50000, 1, ItemType.TRADE_GOOD, Material.GOLD_INGOT),
	// --- Currency, page 112 player's handbook 1 ---
	COPPER_PIECE("Copper Piece", 1, 0, ItemType.COIN, Material.GOLD_NUGGET),
	SILVER_PIECE("Silver Piece", 10, 0, ItemType.COIN, Material.GOLD_NUGGET),
	GOLD_PIECE("Gold Piece", 100, 0, ItemType.COIN, Material.GOLD_NUGGET),
	PLATINUM_PIECE("Platinum Piece", 1000, 0, ItemType.COIN, Material.GOLD_NUGGET),
	// --- Weapons, page 116 player's handbook 1 ---
	// -- Simple --
	// - Unarmed -
	GAUNTLET("Gauntlet", 200, 1, "1d2", "1d3", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.CAULDRON_ITEM),
	// - Light melee -
	DAGGER("Dagger", 200, 1, "1d3", "1d4", 2, 10, new WeaponType[] {WeaponType.PIERCING, WeaponType.SLASHING}, Material.STONE_SWORD),
	PUNCHING_DAGGER("Punching Dagger", 200, 1, "1d3", "1d4", 3, 0, new WeaponType[] {WeaponType.PIERCING}, Material.STONE_SWORD),
	SPIKED_GAUNTLET("Spiked Gauntlet", 500, 1, "1d3", "1d4", 2, 0, new WeaponType[] {WeaponType.PIERCING}, Material.CAULDRON_ITEM),
	LIGHT_MACE("Light Mace", 500, 4, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.WOOD_SPADE),
	SICKLE("Sickle", 600, 2, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_HOE),
	// - One-handed melee -
	CLUB("Club", 0, 3, "1d4", "1d6", 2, 10, new WeaponType[] {WeaponType.BLUDGEONING}, Material.WOOD_SPADE),
	HEAVY_MACE("Heavy Mace", 1200, 8, "1d6", "1d8", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.IRON_SPADE),
	MORNINGSTAR("Morningstar", 800, 6, "1d6", "1d8", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING, WeaponType.PIERCING}, Material.IRON_SPADE),
	SHORTSPEAR("Shortspear", 100, 3, "1d4", "1d6", 2, 20, new WeaponType[] {WeaponType.PIERCING}, Material.STICK),
	// - Two-handed melee -
	LONGSPEAR("Longspear", 500, 9, "1d6", "1d8", 3, 0 , new WeaponType[] {WeaponType.PIERCING}, Material.STICK),
	QUARTERSTAFF("Quarterstaff", 0, 4, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.STICK),
	SPEAR("Spear", 200, 6, "1d6", "1d8", 3, 20, new WeaponType[] {WeaponType.PIERCING}, Material.STICK),
	// - Ranged -
	HEAVY_CROSSBOW("Heavy Crossbow", 5000, 8, "1d8", "1d10", 2, 120, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	CROSSBOW_BOLT("Crossbow Bolt", 10, 1, ItemType.AMMO, Material.ARROW),
	LIGHT_CROSSBOW("Light Crossbow", 3500, 4, "1d6", "1d8", 2, 80, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	DART("Dart", 50, 1, "1d3", "1d4", 2, 20, new WeaponType[] {WeaponType.PIERCING}, Material.ARROW),
	JAVELIN("Javelin", 100, 2, "1d4", "1d6", 2, 30, new WeaponType[] {WeaponType.PIERCING}, Material.STICK),
	SLING("Sling", 0, 0, "1d3", "1d4", 2, 50, new WeaponType[] {WeaponType.BLUDGEONING}, Material.WOOL),
	SLING_BULLET("Sling Bullet", 1, 5, ItemType.AMMO, Material.STONE_BUTTON),
	// -- Martial --
	// - Light melee -
	THROWING_AXE("Throwing Axe", 800, 2, "1d4", "1d6", 2, 10, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_AXE),
	LIGHT_HAMMER("Light Hammer", 100, 2, "1d3", "1d4", 2, 20, new WeaponType[] {WeaponType.BLUDGEONING}, Material.STONE_AXE),
	HANDAXE("Handaxe", 600, 3, "1d4", "1d6", 3, 0, new WeaponType[] {WeaponType.SLASHING}, Material.STONE_AXE),
	KUKRI("Kukri", 800, 2, "1d3", "1d4", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.STONE_SWORD),
	LIGHT_PICK("Light Pick", 400, 3, "1d3", "1d4", 4, 0, new WeaponType[] {WeaponType.PIERCING}, Material.STONE_PICKAXE),
	SAP("Sap", 100, 2, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.IRON_INGOT),
	LIGHT_WOODEN_SHIELD("Light Wooden Shield", 300, 5, "1d2", "1d3", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, 1, 0, -1, 5, 0, 0, Material.WOOD),
	LIGHT_STEEL_SHIELD("Light Steel Shield", 900, 6,  "1d2", "1d3", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, 1, 0, -1, 5, 0, 0, Material.IRON_BLOCK),
	SPIKED_PADDED_ARMOUR("Spiked Padded Armour", 5500, 20, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 1, 8, 0, 5, 30, 20, Material.LEATHER_CHESTPLATE),
	SPIKED_LEATHER_ARMOUR("Spiked Leather Armour", 6000, 25, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 2, 6, 0, 10, 30, 20, Material.LEATHER_CHESTPLATE),
	SPIKED_STUDDED_LEATHER_ARMOUR("Spiked Studded Leather Armour", 7500, 30, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 3, 5, -1, 15, 30, 20, Material.LEATHER_CHESTPLATE),
	SPIKED_CHAIN_SHIRT_ARMOUR("Spiked Chain Shirt Armour", 15000, 35, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 4, 4, -2, 20, 30, 20, Material.CHAINMAIL_CHESTPLATE),
	SPIKED_HIDE_ARMOUR("Spiked Hide Armour", 6500, 35, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 3, 4, -3, 20, 20, 15, Material.LEATHER_CHESTPLATE),
	SPIKED_SCALE_MAIL_ARMOUR("Spiked Scale Mail Armour", 10000, 40, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 4, 3, -4, 25, 20, 15, Material.CHAINMAIL_CHESTPLATE),
	SPIKED_CHAINMAIL_ARMOUR("Spiked Chainmail Armour", 20000, 50, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 5, 2, -5, 30, 20, 15, Material.CHAINMAIL_CHESTPLATE),
	SPIKED_BREASTPLATE_ARMOUR("Spiked Breastplate Armour", 25000, 40, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 5, 3, -4, 25, 20, 15, Material.IRON_CHESTPLATE),
	SPIKED_SPLINT_MAIL_ARMOUR("Spiked Splint Mail Armour", 25000, 55, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 6, 0, -7, 40, 20, 15, Material.CHAINMAIL_CHESTPLATE),
	SPIKED_BANDED_MAIL_ARMOUR("Spiked Banded Mail Armour", 30000, 45, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 6, 1, -6, 35, 20, 15, Material.CHAINMAIL_CHESTPLATE),
	SPIKED_HALF_PLATE_ARMOUR("Spiked Half-Plate Armour", 65000, 60, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 7, 0, -7, 40, 20, 15, Material.IRON_CHESTPLATE),
	SPIKED_FULL_PLATE_ARMOUR("Spiked Full Plate Armour", 155000, 60, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 8, 1, -6, 35, 20, 15, Material.IRON_CHESTPLATE),
	SPIKED_LIGHT_WOODEN_SHIELD("Spiked Light Wooden Shield", 1300, 10, "1d3", "1d4", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 1, 0, -1, 5, 0, 0, Material.WOOD),
	SPIKED_LIGHT_STEEL_SHIELD("Spiked Light Steel Shield", 1900, 11, "1d3", "1d4", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 1, 0, -1, 5, 0, 0, Material.IRON_BLOCK),
	SHORT_SWORD("Short Sword", 1000, 2, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, Material.STONE_SWORD),
	// - One-handed melee -
	BATTLEAXE("Battleaxe", 1000, 6, "1d6", "1d8", 3, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_AXE),
	FLAIL("Flail", 800, 5, "1d6", "1d8", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.STICK),
	LONGSWORD("Longsword", 1500, 4, "1d6", "1d8", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_SWORD),
	HEAVY_PICK("Heavy Pick", 800, 6, "1d4", "1d6", 4, 0, new WeaponType[] {WeaponType.PIERCING}, Material.IRON_PICKAXE),
	RAPIER("Rapier", 2000, 2, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, Material.IRON_SWORD),
	SCIMITAR("Scimitar", 1500, 4, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_HOE),
	SPIKED_HEAVY_WOODEN_SHIELD("Spiked Heavy Wooden Shield", 1700, 15, "1d3", "1d4", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 2, 0, -2, 15, 0, 0, Material.WOOD),
	SPIKED_HEAVY_STEEL_SHIELD("Spiked Heavy Steel Shield", 3000, 20, "1d3", "1d4", 2, 0, new WeaponType[] {WeaponType.PIERCING}, 2, 0, -2, 15, 0, 0, Material.IRON_BLOCK),
	TRIDENT("Trident", 1500, 4, "1d6", "1d8", 2, 10, new WeaponType[] {WeaponType.PIERCING}, Material.GOLD_HOE),
	WARHAMMER("Warhammer", 1200, 5, "1d6", "1d8", 3, 0, new WeaponType[] {WeaponType.PIERCING}, Material.IRON_AXE),
	// - Two-handed melee -
	FALCHION("Falchion", 7500, 8, "1d6", "2d4", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_SWORD),
	GLAIVE("Glaive", 800, 10, "1d8", "1d10", 3, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_SWORD),
	GREATAXE("Greataxe", 2000, 12, "1d10", "1d12", 3, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_AXE),
	GREATCLUB("Greatclub", 500, 8, "1d8", "1d10", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.WOOD_SPADE),
	HEAVY_FLAIL("Heavy Flail", 1500, 10, "1d8", "1d10", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.STICK),
	GREATSWORD("Greatsword", 5000, 8, "1d10", "2d6", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.DIAMOND_SWORD),
	GUISARME("Guisarme", 900, 12, "1d6", "2d4", 3, 0, new WeaponType[] {WeaponType.SLASHING}, Material.STICK),
	HALBERD("Halberd", 1000, 12, "1d8", "1d10", 3, 0, new WeaponType[] {WeaponType.PIERCING, WeaponType.SLASHING}, Material.IRON_AXE),
	LANCE("Lance", 1000, 10, "1d6", "1d8", 3, 0, new WeaponType[] {WeaponType.PIERCING}, Material.STICK),
	RANSEUR("Ranseur", 1000, 12, "1d6", "2d4", 3, 0, new WeaponType[] {WeaponType.PIERCING}, Material.STICK),
	SCYTHE("Scythe", 1800, 10, "1d6", "2d4", 4, 0, new WeaponType[] {WeaponType.PIERCING, WeaponType.SLASHING}, Material.IRON_HOE),
	// - Ranged -
	LONGBOW("Longbow", 7500, 3, "1d6", "1d8", 3, 100, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	COMPOSITE_LONGBOW("Composite Longbow", 10000, 3, "1d6", "1d8", 3, 110, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	SHORTBOW("Shortbow", 3000, 2, "1d4", "1d6", 3, 60, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	COMPOSITE_SHORTBOW("Composite Shortbow", 7500, 2, "1d4", "1d6", 3, 70, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	ARROW("Arrow", 5, 3, ItemType.AMMO, Material.ARROW),
	// -- Exotic --
	// - Light melee -
	KAMA("Kama", 200, 2, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_HOE),
	NUNCHAKU("Nunchaku", 200, 2, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.IRON_FENCE),
	SAI("Sai", 100, 1, "1d3", "1d4", 2, 10, new WeaponType[] {WeaponType.BLUDGEONING}, Material.IRON_SWORD),
	SIANGHAM("Siangham", 300, 1, "1d4", "1d6", 2, 0, new WeaponType[] {WeaponType.PIERCING}, Material.STONE_SWORD),
	// - One-handed melee -
	BASTARD_SWORD("Bastard Sword", 3500, 6, "1d8", "1d10", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.DIAMOND_SWORD),
	DWARVEN_WARAXE("Dwarven Waraxe", 3000, 8, "1d8", "1d10", 3, 0, new WeaponType[] {WeaponType.SLASHING}, Material.DIAMOND_AXE),
	WHIP("Whip", 100, 2, "1d2", "1d3", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.FISHING_ROD),
	// - Two-handed melee -
	ORC_DOUBLE_AXE("Orc Double Axe", 6000, 15, "1d6", "1d8", 3, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_AXE),
	SPIKED_CHAIN("Spiked Chain", 2500, 10, "1d6", "2d4", 2, 0, new WeaponType[] {WeaponType.PIERCING}, Material.IRON_FENCE),
	DIRE_FLAIL("Dire Flail", 9000, 10, "1d6", "1d8", 2, 0, new WeaponType[] {WeaponType.BLUDGEONING}, Material.STICK),
	GNOME_HOOKED_HAMMER("Gnome Hooked Hammer", 2000, 6, "1d6", "1d8", 3, 0, new WeaponType[] {WeaponType.BLUDGEONING, WeaponType.PIERCING}, Material.IRON_HOE),
	TWO_BLADED_SWORD("Two-bladed Sword", 10000, 10, "1d6", "1d8", 2, 0, new WeaponType[] {WeaponType.SLASHING}, Material.IRON_SWORD),
	DWARVEN_UGROSH("Dwarven Ugrosh", 5000, 12, "1d6", "1d8", 3, 0, new WeaponType[] {WeaponType.SLASHING, WeaponType.PIERCING}, Material.IRON_SWORD),
	// - Ranged -
	BOLAS("Bolas", 500, 2, "1d3", "1d4", 2, 10, new WeaponType[] {WeaponType.BLUDGEONING}, Material.STONE_BUTTON),
	HAND_CROSSBOW("Hand Crossbow", 10000, 2, "1d3", "1d4", 2, 30, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	REPEATING_HEAVY_CROSSBOW("Repeating Heavy Crossbow", 40000, 12, "1d8", "1d10", 2, 120, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	REPEATING_LIGHT_CROSSBOW("Repeating Light Crossbow", 25000, 6, "1d6", "1d8", 2, 80, new WeaponType[] {WeaponType.PIERCING}, Material.BOW),
	NET("Net", 2000, 6, "0d1", "0d1", 0, 10, new WeaponType[] {}, Material.SPONGE),
	SHURIKEN("Shuriken", 20, 2, "1d1", "1d2", 2, 10, new WeaponType[] {WeaponType.PIERCING}, Material.STONE_BUTTON),
	// --- Armour and shields, page 123 player's handbook 1 ---
	// - Light -
	PADDED_ARMOUR("Padded Armour", 500, 10, 1, 8, 0, 5, 30, 20, Material.LEATHER_CHESTPLATE),
	LEATHER_ARMOUR("Leather Armour", 1000, 15, 2, 6, 0, 10, 30, 20, Material.LEATHER_CHESTPLATE),
	STUDDED_LEATHER_ARMOUR("Studded Leather Armour", 2500, 20, 3, 5, -1, 15, 30, 20, Material.LEATHER_CHESTPLATE),
	CHAIN_SHIRT("Chain Shirt", 10000, 25, 4, 4, -2, 20, 30, 20, Material.CHAINMAIL_CHESTPLATE),
	// - Medium -
	HIDE_ARMOUR("Hide Armour", 1500, 25, 3, 4, -3, 20, 20, 15, Material.LEATHER_CHESTPLATE),
	SCALE_MAIL_ARMOUR("Scale Mail Armour", 5000, 30, 4, 3, -4, 25, 20, 15, Material.CHAINMAIL_CHESTPLATE),
	CHAINMAIL_ARMOUR("Chainmail Armour", 15000, 40, 5, 2, -5, 30, 20, 15, Material.CHAINMAIL_CHESTPLATE),
	BREASTPLATE("Breastplate", 20000, 30, 5, 3, -4, 25, 20, 15, Material.IRON_CHESTPLATE),
	// - Heavy -
	SPLINT_MAIL_ARMOUR("Splint Mail Armour", 20000, 45, 6, 0, -7, 40, 20, 15, Material.CHAINMAIL_CHESTPLATE),
	BANDED_MAIL_ARMOUR("Banded Mail Armour", 25000, 35, 6, 1, -6, 35, 20, 15, Material.CHAINMAIL_CHESTPLATE),
	HALF_PLATE_ARMOUR("Half-plate armour", 60000, 50, 7, 0, -7, 40, 20, 15, Material.IRON_CHESTPLATE),
	// - Shields -
	BUCKLER("Buckler", 1500, 5, 1, 0, -1, 5, 0, 0, Material.IRON_BLOCK),
	HEAVY_WOODEN_SHIELD("Heavy Wooden Shield", 700, 10, 2, 0, -2, 15, 0, 0, Material.WOOD),
	HEAVY_STEEL_SHIELD("Heavy Steel Shield", 2000, 15, 2, 0, -2, 15, 0, 0, Material.IRON_BLOCK),
	TOWER_SHIELD("Tower Shield", 3000, 45, 4, 2, -10, 50, 0, 0, Material.IRON_DOOR),
	// --- Goods and services, page 128 player's handbook 1 ---
	// - Adventuring gear -
	BACKPACK("Backpack", 200, 2, ItemType.GOOD, Material.WOOL, (byte) 12),
	BARREL("Barrel", 200, 30, ItemType.GOOD, Material.LOG),
	BASKET("Basket", 40, 1, ItemType.GOOD, Material.BOWL),
	BEDROLL("Bedroll", 10, 5, ItemType.GOOD, Material.BED),
	BELL("Bell", 100, 0, ItemType.GOOD, Material.BUCKET),
	WINTER_BLANKET("Winter Blanket", 50, 3, ItemType.GOOD, Material.WOOL),
	BLOCK_AND_TACKLE("Block and Tackle", 500, 5, ItemType.GOOD, Material.TRIPWIRE_HOOK),
	BOTTLE("Bottle", 200, 0, ItemType.GOOD, Material.GLASS_BOTTLE),
	WINE("Wine", 200, 0, ItemType.GOOD, Material.POTION, (byte) 8201),
	GLASS("Glass", 200, 0, ItemType.GOOD, Material.THIN_GLASS),
	BUCKET("Bucket", 50, 2, ItemType.GOOD, Material.BUCKET),
	CALTROPS("Caltrops", 100, 2, ItemType.GOOD, Material.IRON_FENCE),
	CANDLE("Candle", 1, 0, ItemType.GOOD, Material.TORCH),
	CANVAS("Canvas", 10, 1, ItemType.GOOD, Material.PAPER),
	CASE("Case", 100, 2, ItemType.GOOD, Material.THIN_GLASS),
	MAP("Map", 100, 2, ItemType.GOOD, Material.EMPTY_MAP),
	SCROLL("Scroll", 100, 2, ItemType.GOOD, Material.PAPER),
	CHAIN("Chain", 3000, 2, ItemType.GOOD, Material.RAILS),
	CHALK("Chalk", 1, 0, ItemType.GOOD, Material.QUARTZ),
	CHEST("Chest", 200, 25, ItemType.GOOD, Material.CHEST),
	CROWBAR("Crowbar", 200, 5, ItemType.GOOD, Material.IRON_HOE),
	FIREWOOD("Firewood", 1, 20, ItemType.GOOD, Material.STICK),
	FISHHOOK("Fishhook", 10, 0, ItemType.GOOD, Material.TRIPWIRE_HOOK),
	FISHING_NET("Fishing net", 400, 5, ItemType.GOOD, Material.WEB),
	FLASK("Flask", 3, 2, ItemType.GOOD, Material.GLASS_BOTTLE),
	FLINT_AND_STEEL("Flint and Steel", 100, 0, ItemType.GOOD, Material.FLINT_AND_STEEL),
	GRAPPLING_HOOK("Grappling Hook", 100, 4, ItemType.GOOD, Material.TRIPWIRE_HOOK),
	HAMMER("Hammer", 50, 2, ItemType.GOOD, Material.STONE_AXE),
	INK("Ink", 800, 0, ItemType.GOOD, Material.INK_SACK),
	INKPEN("Inkpen", 10, 0, ItemType.GOOD, Material.FEATHER),
	CLAY_JUG("Clay Jug", 3, 9, ItemType.GOOD, Material.FLOWER_POT_ITEM),
	LADDER("Ladder", 5, 20, ItemType.GOOD, Material.LADDER),
	COMMON_LAMP("Common Lamp", 10, 1, ItemType.GOOD, Material.REDSTONE_LAMP_ON),
	BULLSEYE_LANTERN("Bullseye Lantern", 1200, 3, ItemType.GOOD, Material.REDSTONE_LAMP_ON),
	HOODED_LANTERN("Hooded Lantern", 700, 2, ItemType.GOOD, Material.REDSTONE_LAMP_ON),
	VERY_SIMPLE_LOCK("Very Simple Lock", 2000, 1, ItemType.GOOD, Material.IRON_INGOT),
	AVERAGE_LOCK("Average Lock", 4000, 1, ItemType.GOOD, Material.IRON_INGOT),
	GOOD_LOCK("Good Lock", 8000, 1, ItemType.GOOD, Material.IRON_INGOT),
	AMAZING_LOCK("Amazing Lock", 15000, 1, ItemType.GOOD, Material.IRON_INGOT),
	MANACLES("Manacles", 1500, 2, ItemType.GOOD, Material.RAILS),
	MASTERWORK_MANACLES("Masterwork Manacles", 5000, 2, ItemType.GOOD, Material.RAILS),
	SMALL_STEEL_MIRROR("Small Steel Mirror", 1000, 1, ItemType.GOOD, Material.IRON_BLOCK),
	CLAY_MUG("Clay Mug", 2, 1, ItemType.GOOD, Material.FLOWER_POT_ITEM),
	OIL("Oil (1-pint flask)", 10, 1, ItemType.GOOD, Material.WATER_BUCKET),
	PAPER("Paper", 40, 0, ItemType.GOOD, Material.PAPER),
	PARCHMENT("Parchment", 20, 0, ItemType.GOOD, Material.PAPER),
	MINERS_PICK("Miner's pick", 300, 10, ItemType.GOOD, Material.IRON_PICKAXE),
	CLAY_PITCHER("Clay Pitcher", 2, 5, ItemType.GOOD, Material.FLOWER_POT_ITEM),
	PITON("Piton", 10, 1, ItemType.GOOD, Material.TRIPWIRE_HOOK),
	POLE("10-foot Pole", 20, 8, ItemType.GOOD, Material.STICK),
	IRON_POT("Iron Pot", 50, 10, ItemType.GOOD, Material.BUCKET),
	BELT_POUCH("Belt Pouch", 100, 1, ItemType.GOOD, Material.LEATHER),
	PORTABLE_RAM("Portable Ram", 1000, 20, ItemType.GOOD, Material.IRON_SPADE),
	TRAIL_RATIONS("Trail Rations", 50, 1, ItemType.GOOD, Material.BREAD),
	HEMPEN_ROPE("Hempen Rope (50 ft.)", 100, 10, ItemType.GOOD, Material.STRING),
	SILK_ROPE("Silk Rope (50 ft.)", 1000, 5, ItemType.GOOD, Material.STRING),
	SACK("Sack", 10, 1, ItemType.GOOD, Material.LEATHER),
	SEALING_WAX("Sealing Wax", 100, 1, ItemType.GOOD, Material.CLAY_BALL),
	SEWING_NEEDLE("Sewing Needle", 50, 0, ItemType.GOOD, Material.STICK),
	SIGNAL_WHISTLE("Signal Whistle", 80, 0, ItemType.GOOD, Material.WOOD),
	SIGNET_RING("Signet Ring", 500, 0, ItemType.GOOD, Material.EYE_OF_ENDER),
	SLEDGE("Sledge", 100, 10, ItemType.GOOD, Material.IRON_AXE),
	SOAP("Soap", 50, 1, ItemType.GOOD, Material.QUARTZ),
	SPADE("Spade", 200, 8, ItemType.GOOD, Material.WOOD_SPADE),
	SHOVEL("Shovel", 200, 8, ItemType.GOOD, Material.IRON_SPADE),
	SPYGLASS("Spyglass", 100000, 1, ItemType.GOOD, Material.LEVER),
	TENT("Tent", 1000, 20, ItemType.GOOD, Material.WOOL, (byte) 13),
	TORCH("Torch", 1, 1, ItemType.GOOD, Material.TORCH),
	VIAL("Vial", 100, 1, ItemType.GOOD, Material.GLASS_BOTTLE),
	POTION("Potion", 100, 1, ItemType.GOOD, Material.POTION),
	WATERSKIN("Waterskin", 100, 4, ItemType.GOOD, Material.LEATHER),
	WHETSTONE("Whetstone", 2, 1, ItemType.GOOD, Material.STONE),
	// - Special substances & items -
	ACID("Acid", 1000, 1, ItemType.GOOD, Material.POTION, (byte) 8196),
	ALCHEMISTS_FIRE("Alchemist's Fire", 2000, 1, ItemType.GOOD, Material.POTION, (byte) 16387),
	ANTITOXIN("Antitoxin", 5000, 0, ItemType.GOOD, Material.POTION, (byte) 8196),
	EVERBURNING_TORCH("Torch", 11000, 1, ItemType.GOOD, Material.TORCH),
	HOLY_WATER("Holy Water", 2500, 1, ItemType.GOOD, Material.POTION),
	SMOKESTICK("Smokestick", 1000, 1, ItemType.GOOD, Material.STICK),
	SUNROD("Sunrod", 200, 1, ItemType.GOOD, Material.BLAZE_ROD),
	TANGLEFOOT_BAG("Tanglefoot Bag", 5000, 4, ItemType.GOOD, Material.SLIME_BALL),
	THUNDERSTONE("Thunderstone", 3000, 1, ItemType.GOOD, Material.NETHER_STAR),
	TINDERTWIG("Tindertwig", 100, 1, ItemType.GOOD, Material.STICK),
	// - Tools and Skill Kits -
	ALCHEMISTS_LAB("Alchemist's Lab", 50000, 40, ItemType.GOOD, Material.GLASS_BOTTLE),
	ARTISANS_TOOLS("Artisan's Tools", 500, 5, ItemType.GOOD, Material.WORKBENCH),
	MASTERWORK_ARTISANS_TOOLS("Masterwork Artisan's Tools", 5500, 5, ItemType.GOOD, Material.WORKBENCH),
	CLIMBERS_KIT("Climber's Kit", 8000, 5, ItemType.GOOD, Material.LEATHER_BOOTS),
	DISGUISE_KIT("Disguise Kit", 5000, 8, ItemType.GOOD, Material.SKULL_ITEM, (byte) 3),
	HEALERS_KIT("Healer's Kit", 5000, 1, ItemType.GOOD, Material.POTION, (byte) 8193),
	HOLLY("Holly", 0, 0, ItemType.GOOD, Material.LEAVES, (byte) 1),
	MISTLETOE("Mistletoe", 0, 0, ItemType.GOOD, Material.LEAVES, (byte) 1),
	WOODEN_HOLY_SYMBOL("Wooden Holy Symbol", 100, 0, ItemType.GOOD, Material.WOOD_SWORD),
	SILVER_HOLY_SYMBOL("Silver Holy Symbol", 2500, 1, ItemType.GOOD, Material.IRON_SWORD),
	HOURGLASS("Hourglass", 2500, 1, ItemType.GOOD, Material.POTION, (byte) 8195),
	MAGNIFYING_GLASS("Magnifying Glass", 10000, 0, ItemType.GOOD, Material.GLASS),
	COMMON_MUSICAL_INSTRUMENT("Common Musical Instrument", 500, 3, ItemType.GOOD, Material.STICK),
	MASTERWORK_MUSICAL_INSTRUMENT("Masterwork Musical Instrument", 10000, 3, ItemType.GOOD, Material.WOOD_SPADE),
	MERCHANTS_SCALE("Merchant's Scale", 200, 1, ItemType.GOOD, Material.HOPPER),
	SPELL_COMPONENT_POUCH("Spell Component Pouch", 500, 2, ItemType.GOOD, Material.LEATHER),
	WIZARDS_SPELLBOOK("Wizard's Spellbook", 1500, 3, ItemType.GOOD, Material.BOOK_AND_QUILL),
	THIEVES_TOOLS("Thieve's Tools", 3000, 1, ItemType.GOOD, Material.TRIPWIRE_HOOK),
	MASTERWORK_THIEVES_TOOLS("Masterwork Thieve's Tools", 10000, 2, ItemType.GOOD, Material.TRIPWIRE_HOOK),
	MASTERWORK_TOOL("Masterwork Tool", 5000, 1, ItemType.GOOD, Material.IRON_PICKAXE),
	WATER_CLOCK("Water Clock", 100000, 200, ItemType.GOOD, Material.WATCH),
	// - Clothing -
	ARTISANS_OUTFIT("Artisan's Outfit", 100, 4, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	CLERICS_VESTEMENTS("Cleric's Vestements", 500, 6, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	COLD_WEATHER_OUTFIT("Cold Weather Outfit", 800, 7, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	COURTIERS_OUTFIT("Courtier's Outfit", 3000, 6, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	ENTERTAINERS_OUTFIT("Entertainer's Outfit", 300, 4, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	EXPLORERS_OUTFIT("Explorer's Outfit", 1000, 8, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	MONKS_OUTFIT("Monk's Outfit", 500, 2, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	NOBLES_OUTFIT("Noble's Outfit", 7500, 10, ItemType.GOOD, Material.IRON_CHESTPLATE),
	PEASANTS_OUTFIT("Peasant's Outfit", 10, 2, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	ROYAL_OUTFIT("Royal Outfit", 20000, 15, ItemType.GOOD, Material.GOLD_CHESTPLATE),
	SCHOLARS_OUTFIT("Scholar's Outfit", 500, 6, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	TRAVELERS_OUTFIT("Traveler's Outfit", 100, 5, ItemType.GOOD, Material.LEATHER_CHESTPLATE),
	// - Food, Drink and Lodging -
	ALE_GALLON("Gallon of Ale", 20, 8, ItemType.GOOD, Material.MILK_BUCKET),
	ALE_MUG("Mug of Ale", 4, 1, ItemType.GOOD, Material.MILK_BUCKET),
	BANQUET("Banquet", 1000, 0, ItemType.GOOD, Material.COOKED_CHICKEN),
	BREAD("Bread", 2, 1, ItemType.GOOD, Material.BREAD),
	CHEESE("Cheese", 10, 1, ItemType.GOOD, Material.SPONGE),
	GOOD_MEAL("Good Meal", 200, 0, ItemType.GOOD, Material.COOKED_BEEF),
	COMMON_MEAL("Common Meal", 50, 0, ItemType.GOOD, Material.COOKED_CHICKEN),
	POOR_MEAL("Poor Meal", 20, 0, ItemType.GOOD, Material.RAW_FISH),
	MEAT("Meat", 30, 1, ItemType.GOOD, Material.RAW_BEEF),
	COMMON_WINE("Common Wine", 20, 6, ItemType.GOOD, Material.POTION, (byte) 8201),
	FINE_WINE("Fine Wine", 1000, 2, ItemType.GOOD, Material.POTION, (byte) 8201),
	BIT_AND_BRIDLE("Bit and Bridle", 200, 1, ItemType.GOOD, Material.SADDLE),
	MOUNT_FEED("Mount Feed", 5, 10, ItemType.GOOD, Material.WHEAT),
	MILITARY_SADDLE("Military Saddle", 2000, 30, ItemType.GOOD, Material.SADDLE),
	PACK_SADDLE("Pack Saddle", 500, 15, ItemType.GOOD, Material.SADDLE),
	RIDING_SADDLE("Riding Saddle", 1000, 25, ItemType.GOOD, Material.SADDLE),
	EXOTIC_MILITARY_SADDLE("Exotic Military Saddle", 6000, 40, ItemType.GOOD, Material.SADDLE),
	EXOTIC_PACK_SADDLE("Exotic Pack Saddle", 1500, 20, ItemType.GOOD, Material.SADDLE),
	EXOTIC_RIDING_SADDLE("Exotic Riding Saddle", 3000, 30, ItemType.GOOD, Material.SADDLE),
	SADDLEBAGS("Saddlebags", 400, 8, ItemType.GOOD, Material.LEATHER),
	// - Transport -
	ROWBOAT("Rowboat", 5000, 100, ItemType.GOOD, Material.BOAT),
	OAR("Oar", 200, 10, ItemType.GOOD, Material.STICK),
	SLED("Sled", 2000, 300, ItemType.GOOD, Material.BOAT);
	
	private String name;
	private int cost;
	private int weight;
	private ItemType itemType;
	private Material minecraftType;
	private byte minecraftData;
	//Weapon-specific stuff
	private String damageSmall;
	private String damageMedium;
	private int critical;
	private int rangeIncrement;
	private WeaponType[] weaponTypes;
	//Armour-specific stuff
	private int armourBonus;
	private int dexBonus;
	private int armourCheckPenalty;
	private int arcaneSpellFailureChance;
	private int speed30ft;
	private int speed20ft;
	
	/**
	 * Gets a D&D material by name
	 * 
	 * @param name the name of the material
	 * @return the material
	 */
	public static DnDMaterial getByName(String name) {
		for (DnDMaterial material : DnDMaterial.values()) {
			if (material.getName().equalsIgnoreCase(name)) {
				return material;
			}
		}
		return null;
	}
	
	//For most materials
	private DnDMaterial(String name, int cost, int weight, ItemType itemType, Material minecraftType) {
		this(name, cost, weight, itemType, minecraftType, (byte) 0);
	}
	
	private DnDMaterial(String name, int cost, int weight, ItemType itemType, Material minecraftType, byte minecraftData) {
		this.name = name;
		this.cost = cost;
		this.weight = weight;
		this.itemType = itemType;
		this.minecraftType = minecraftType;
		this.minecraftData = minecraftData;
	}
	
	//For weapons
	private DnDMaterial(String name, int cost, int weight, String damageSmall, String damageMedium, int critical, int rangeIncrement, WeaponType[] weaponTypes, Material minecraftType) {
		this(name, cost, weight, damageSmall, damageMedium, critical, rangeIncrement, weaponTypes, minecraftType, (byte) 0);
	}
	
	private DnDMaterial(String name, int cost, int weight, String damageSmall, String damageMedium, int critical, int rangeIncrement, WeaponType[] weaponTypes, Material minecraftType, byte minecraftData) {
		this(name, cost, weight, ItemType.WEAPON, minecraftType, minecraftData);
		this.damageSmall = damageSmall;
		this.damageMedium = damageMedium;
		this.critical = critical;
		this.rangeIncrement = rangeIncrement;
		this.weaponTypes = weaponTypes;
	}
	
	//For armour
	private DnDMaterial(String name, int cost, int weight, int armourBonus, int dexBonus, int armourCheckPenalty, int arcaneSpellFailureChance, int speed30ft, int speed20ft, Material minecraftType) {
		this(name, cost, weight, armourBonus, dexBonus, armourCheckPenalty, arcaneSpellFailureChance, speed30ft, speed20ft, minecraftType, (byte) 0);
	}
	
	private DnDMaterial(String name, int cost, int weight, int armourBonus, int dexBonus, int armourCheckPenalty, int arcaneSpellFailureChance, int speed30ft, int speed20ft, Material minecraftType, byte minecraftData) {
		this(name, cost, weight, ItemType.ARMOUR, minecraftType, minecraftData);
		this.armourBonus = armourBonus;
		this.dexBonus = dexBonus;
		this.armourCheckPenalty = armourCheckPenalty;
		this.arcaneSpellFailureChance = arcaneSpellFailureChance;
		this.speed30ft = speed30ft;
		this.speed20ft = speed20ft;
	}
	
	//For stuff that works as both weapons and as armour
	private DnDMaterial(String name, int cost, int weight, String damageSmall, String damageMedium, int critical, int rangeIncrement, WeaponType[] weaponTypes, int armourBonus, int dexBonus, int armourCheckPenalty, int arcaneSpellFailureChance, int speed30ft, int speed20ft, Material minecraftType) {
		this(name, cost, weight, damageSmall, damageMedium, critical, rangeIncrement, weaponTypes, armourBonus, dexBonus, armourCheckPenalty, arcaneSpellFailureChance, speed30ft, speed20ft, minecraftType, (byte) 0);
	}
	
	private DnDMaterial(String name, int cost, int weight, String damageSmall, String damageMedium, int critical, int rangeIncrement, WeaponType[] weaponTypes, int armourBonus, int dexBonus, int armourCheckPenalty, int arcaneSpellFailureChance, int speed30ft, int speed20ft, Material minecraftType, byte minecraftData) {
		this(name, cost, weight, ItemType.WEAPON_AND_ARMOUR, minecraftType, minecraftData);
		this.damageSmall = damageSmall;
		this.damageMedium = damageMedium;
		this.critical = critical;
		this.rangeIncrement = rangeIncrement;
		this.weaponTypes = weaponTypes;
		this.armourBonus = armourBonus;
		this.dexBonus = dexBonus;
		this.armourCheckPenalty = armourCheckPenalty;
		this.arcaneSpellFailureChance = arcaneSpellFailureChance;
		this.speed30ft = speed30ft;
		this.speed20ft = speed20ft;
	}

	/**
	 * Gets the name of the material
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the cost of one of the material
	 * 
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}
	
	/**
	 * Gets the weight of one of the material
	 * 
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	
	/**
	 * Gets the item type of the material
	 * 
	 * @return the item type
	 */
	public ItemType getItemType() {
		return itemType;
	}
	
	/**
	 * Gets the type of item this is in Minecraft
	 * 
	 * @return the material Minecraft sees this as
	 */
	public Material getMinecraftType() {
		return minecraftType;
	}
	
	/**
	 * Gets the data byte this item holds in Minecraft
	 * 
	 * @return the minecraft data
	 */
	public byte getMinecraftData() {
		return minecraftData;
	}

	//Weapon-specific stuff
	/**
	 * Gets the roll string for small weapons of this type, as wielded by halflings, gnomes, etc. (weapons only, returns null otherwise)
	 * 
	 * @return the string to roll, for example 1d4
	 */
	public String getDamageSmall() {
		return damageSmall;
	}
	
	/**
	 * Gets the roll string for medium weapons of this type, as wielded by humans, elves, half-orcs, etc. (weapons only, returns null otherwise)
	 * 
	 * @return the string to roll, for example 1d4
	 */
	public String getDamageMedium() {
		return damageMedium;
	}
	
	/**
	 * Gets the multiplier for critical hits (weapons only)
	 * 
	 * @return the critical multiplier
	 */
	public int getCritical() {
		return critical;
	}
	
	/**
	 * Gets the amount the range is incremented while using items of this type (weapons only)
	 * 
	 * @return the range increment
	 */
	public int getRangeIncrement() {
		return rangeIncrement;
	}
	
	/**
	 * Gets the types of weapon this material is (weapons only)
	 * 
	 * @return an array of this material's weapon types
	 */
	public WeaponType[] getWeaponTypes() {
		return weaponTypes;
	}
	
	//Armour-specific stuff
	/**
	 * Gets the armour bonus of this material (armour only)
	 * 
	 * @return the armour bonus of this material
	 */
	public int getArmourBonus() {
		return armourBonus;
	}
	
	/**
	 * Gets the dexterity bonus of this material (armour only)
	 * 
	 * @return the dexterity bonus of this material
	 */
	public int getDexBonus() {
		return dexBonus;
	}
	
	/**
	 * Gets the armour check penalty of this material (armour only)
	 * 
	 * @return the armour bonus of this material
	 */
	public int getArmourCheckPenalty() {
		return armourCheckPenalty;
	}
	
	/**
	 * Gets the arcane spell failure chance of this material (armour only)
	 * 
	 * @return the armour spell failure chance
	 */
	public int getArcaneSpellFailureChance() {
		return arcaneSpellFailureChance;
	}
	
	/**
	 * Gets the speed while wearing this material for races that have an unencumbered speed of 30ft (humans, elves, half-elves and half-orcs) (armour only)
	 * 
	 * @return the speed while wearing this material
	 */
	public int getSpeed30ft() {
		return speed30ft;
	}
	
	/**
	 * Gets the speed while wearing this material for races that have an unencumbered speed of 20ft (dwarves, gnomes and halflings) (armour only)
	 * 
	 * @return the speed while wearing this material
	 */
	public int getSpeed20ft() {
		return speed20ft;
	}

}
