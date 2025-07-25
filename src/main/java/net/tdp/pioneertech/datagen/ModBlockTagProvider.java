package net.tdp.pioneertech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.tdp.pioneertech.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.ALUMINIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ALUMINIUM_BLOCK);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK);


        //getOrCreateTagBuilder(ModTags.Blocks.NEEDS_STEEL_TOOL)
          //      .addTag(BlockTags.NEEDS_DIAMOND_TOOL);


        //getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ALUMINIUM_TOOL)
          //      .addTag(BlockTags.NEEDS_DIAMOND_TOOL);


    }
}
