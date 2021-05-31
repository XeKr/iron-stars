package com.xekr.ironstars;

import com.xekr.ironstars.items.CommonItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class AllItems {
    //Items
    public static CommonItem chip = new CommonItem("chip");
    public static CommonItem circuit_board = new CommonItem("circuit_board");
    public static CommonItem copper_wire = new CommonItem("copper_wire");
    public static CommonItem hardened_resin = new CommonItem("hardened_resin");
    public static CommonItem magnet = new CommonItem("magnet");
    public static CommonItem resin = new CommonItem("resin");
    public static CommonItem silicon = new CommonItem("silicon");
    public static CommonItem steel_ingot = new CommonItem("steel_ingot");
    public static CommonItem sticky_resin = new CommonItem("sticky_resin");
    public static CommonItem titanium_alloy_ingot = new CommonItem("titanium_alloy_ingot");
    public static CommonItem titanium_ingot = new CommonItem("titanium_ingot");

    //BlockItems
    public static BlockItem coil = new BlockItem(AllBlocks.coil,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem electric_wire = new BlockItem(AllBlocks.electricWire,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem magnet_block = new BlockItem(AllBlocks.magnetBlock,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem moon_dust = new BlockItem(AllBlocks.moonDust,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem moon_rock = new BlockItem(AllBlocks.moonRock,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem moon_soil = new BlockItem(AllBlocks.moonSoil,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem motor = new BlockItem(AllBlocks.motor,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem motor_lay = new BlockItem(AllBlocks.motorLay,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem silicon_block = new BlockItem(AllBlocks.siliconBlock,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem steel_block = new BlockItem(AllBlocks.steelBlock,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem steel_tiles = new BlockItem(AllBlocks.steelTiles,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem titanium_alloy_block = new BlockItem(AllBlocks.titaniumAlloyBlock,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem titanium_block = new BlockItem(AllBlocks.titaniumBlock,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem titanium_ore = new BlockItem(AllBlocks.titaniumOre,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem turbine = new BlockItem(AllBlocks.turbine,new Item.Properties().group(CreateTab.ITON_STAR));
    public static BlockItem windmill = new BlockItem(AllBlocks.windmill,new Item.Properties().group(CreateTab.ITON_STAR));

}
