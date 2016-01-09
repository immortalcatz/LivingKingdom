package com.livingprogram.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by admin on 1/1/2016.
 */
public class ModItems
{
    public static void mainRegistry()
    {
        initializeItem();
        registerItem();
    }

    public static Item quantiumParticle;

    public static void initializeItem()
    {
        quantiumParticle = new Item().setUnlocalizedName("ModItems").setCreativeTab(CreativeTabs.tabMaterials);
    }
    public static void registerItem()
    {
        GameRegistry.registerItem(quantiumParticle, quantiumParticle.getUnlocalizedName());
    }
}
