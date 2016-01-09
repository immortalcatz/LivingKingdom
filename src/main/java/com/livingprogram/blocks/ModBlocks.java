package com.livingprogram.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by admin on 1/1/2016.
 */
public class ModBlocks
{
    public static void mainRegistry()
    {
        registerItem();
    }

    public static Block threeByThreeStone;
    public static Block lightInfusedGreatOakWood;
    public static Block lightInfusedGreatOakHeartwood;
    public static Block lightInfusedGreatOakBark;
    public static Block greatOakHeartOfLightShell;
    public static void registerItem()
    {
        GameRegistry.registerBlock(threeByThreeStone = new ThreeByThreeStone(), "threeByThreeStone");
        GameRegistry.registerBlock(lightInfusedGreatOakWood = new LightInfusedGreatOakWood(), "lightInfusedGreatOakWood");
        GameRegistry.registerBlock(lightInfusedGreatOakHeartwood = new LightInfusedGreatOakHeartwood(), "lightInfusedGreatHeartwood");
        GameRegistry.registerBlock(lightInfusedGreatOakBark = new LightInfusedGreatOakBark(), "lightInfusedGreatOakBark");
        GameRegistry.registerBlock(greatOakHeartOfLightShell = new GreatOakHeartOfLightShell(), "greatOakHeartOfLightShell");
    }
}
