package com.livingprogram.world;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by admin on 1/1/2016.
 */
public class ModWorld
{
    public static void mainRegistry()
    {
        initializeWorldGen();

    }
    public static void initializeWorldGen()
    {

    }
    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability)
    {
        GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
    }
}
