package com.brightspark.sparkshammers.init;

import com.brightspark.sparkshammers.item.*;
import com.brightspark.sparkshammers.reference.Materials;
import com.brightspark.sparkshammers.reference.Names;
import com.brightspark.sparkshammers.util.ClientUtils;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SHItems
{
    //Hammer Heads
    public static final ItemResource hammerHeadWood = new ItemResource(Names.Items.HAMMER_HEAD_WOOD);
    //Hammers
    public static final ItemAOE hammerWood = new ItemAOE(Names.Items.HAMMER_WOOD, Materials.HAMMER_WOOD);
    public static final ItemAOE hammerStone = new ItemAOE(Names.Items.HAMMER_STONE, Materials.HAMMER_STONE);
    public static final ItemAOE hammerIron = new ItemAOE(Names.Items.HAMMER_IRON, Materials.HAMMER_IRON);
    public static final ItemAOE hammerGold = new ItemAOE(Names.Items.HAMMER_GOLD, Materials.HAMMER_GOLD);
    public static final ItemAOE hammerDiamond = new ItemAOE(Names.Items.HAMMER_DIAMOND, Materials.HAMMER_DIAMOND);

    public static final ItemAOE hammerThor = new ItemHammerThor();
    public static final ItemAOE hammerMini = new ItemAOE(Names.Items.HAMMER_MINI, Materials.HAMMER_MINI).setMineWidth(0).setShiftRotating(true);
    public static final ItemAOE hammerGiant = new ItemAOE(Names.Items.HAMMER_GIANT, Materials.HAMMER_GIANT).setMineWidth(4).setMineHeight(4);
    public static final ItemAOE hammerNetherStar = new ItemHammerNetherStar();

    //Excavator Heads
    public static final ItemResource excavatorHeadWood = new ItemResource(Names.Items.EXCAVATOR_HEAD_WOOD);
    //Excavators
    public static final ItemAOE excavatorWood = new ItemAOE(Names.Items.EXCAVATOR_WOOD, Materials.HAMMER_WOOD, true);
    public static final ItemAOE excavatorStone = new ItemAOE(Names.Items.EXCAVATOR_STONE, Materials.HAMMER_STONE, true);
    public static final ItemAOE excavatorIron = new ItemAOE(Names.Items.EXCAVATOR_IRON, Materials.HAMMER_IRON, true);
    public static final ItemAOE excavatorGold = new ItemAOE(Names.Items.EXCAVATOR_GOLD, Materials.HAMMER_GOLD, true);
    public static final ItemAOE excavatorDiamond = new ItemAOE(Names.Items.EXCAVATOR_DIAMOND, Materials.HAMMER_DIAMOND, true);

    //Debug
    public static final ItemDebug debug = new ItemDebug();

    public static void regItems()
    {
        //Heammer Heads
        GameRegistry.register(hammerHeadWood);
        //Hammers
        GameRegistry.register(hammerWood);
        GameRegistry.register(hammerStone);
        GameRegistry.register(hammerIron);
        GameRegistry.register(hammerGold);
        GameRegistry.register(hammerDiamond);

        GameRegistry.register(hammerThor);
        GameRegistry.register(hammerMini);
        GameRegistry.register(hammerGiant);
        GameRegistry.register(hammerNetherStar);

        //Excavator Heads
        GameRegistry.register(excavatorHeadWood);
        //Excavators
        GameRegistry.register(excavatorWood);
        GameRegistry.register(excavatorStone);
        GameRegistry.register(excavatorIron);
        GameRegistry.register(excavatorGold);
        GameRegistry.register(excavatorDiamond);

        //Debug
        GameRegistry.register(debug);
    }

    public static void regModels()
    {
        //Hammers
        ClientUtils.regModel(hammerHeadWood);
        ClientUtils.regModel(hammerWood);
        ClientUtils.regModel(hammerStone);
        ClientUtils.regModel(hammerIron);
        ClientUtils.regModel(hammerGold);
        ClientUtils.regModel(hammerDiamond);

        ClientUtils.regModel(hammerThor);
        ClientUtils.regModel(hammerMini);
        ClientUtils.regModel(hammerGiant);
        ClientUtils.regModel(hammerNetherStar);

        //Excavators
        ClientUtils.regModel(excavatorHeadWood);
        ClientUtils.regModel(excavatorWood);
        ClientUtils.regModel(excavatorStone);
        ClientUtils.regModel(excavatorIron);
        ClientUtils.regModel(excavatorGold);
        ClientUtils.regModel(excavatorDiamond);

        //Debug
        ClientUtils.regModel(debug);
    }
}
