package com.livingprogram.main;

import com.livingprogram.blocks.ModBlocks;
import com.livingprogram.item.ModItems;
import com.livingprogram.lib.RefStrings;
import com.livingprogram.world.ModWorld;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by admin on 1/1/2016.
 */
@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION) //Setting up MODID, NAME, VERSION
public class MainRegistry
{
    //Proxies
    @SidedProxy (clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
    public static ServerProxy proxy;
    //EventHandlers
    @Mod.EventHandler
    public static void PreLoad(FMLPreInitializationEvent PreEvent) //When game first launches, runs the below
    {
        ModItems.mainRegistry();
        ModBlocks.mainRegistry();
        ModWorld.mainRegistry();
        CraftingManager.mainRegistry();
        proxy.registerRenderInfo();
    }
    @Mod.EventHandler
    public static void event(FMLInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public static void PostLoad(FMLPostInitializationEvent PostEvent)
    {

    }
}
