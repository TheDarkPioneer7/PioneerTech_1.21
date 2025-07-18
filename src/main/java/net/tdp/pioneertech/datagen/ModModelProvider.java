package net.tdp.pioneertech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.tdp.pioneertech.block.ModBlocks;
import net.tdp.pioneertech.item.ModItems;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINIUM_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINIUM_NUGGET, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ALUMINIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINIUM_HOE, Models.HANDHELD);


        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_BOOTS);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.ALUMINIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ALUMINIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ALUMINIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ALUMINIUM_BOOTS);


    }
}
