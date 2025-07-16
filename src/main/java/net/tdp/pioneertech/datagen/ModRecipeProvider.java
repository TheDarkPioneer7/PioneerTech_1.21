package net.tdp.pioneertech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.tdp.pioneertech.PioneerTech;
import net.tdp.pioneertech.block.ModBlocks;
import net.tdp.pioneertech.item.ModItems;

import java.util.AbstractCollection;
import java.util.List;
import java.util.concurrent.CompletableFuture;


public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate (RecipeExporter exporter) {
        List<ItemConvertible> STEEL_SMELTABLES = List.of(Items.IRON_INGOT);


        offerSmelting(exporter, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT, 0.7f, 200, "steel_ingot_from_smelting");
        offerBlasting(exporter, STEEL_SMELTABLES, RecipeCategory.MISC, ModItems.STEEL_INGOT, 0.7f, 100, "steel_ingot_from_blasting");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BLOCK, "steel_block_from_steel_ingot", null, "steel_ingot_from_steel_blocks", null);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.STEEL_NUGGET, RecipeCategory.MISC, ModItems.STEEL_INGOT, "steel_ingot_from_steel_nuggets", null, "steel_nuggets_from_steel_ingot", null);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALUMINIUM_BLOCK, "aluminium_block_from_aluminium_ingot", null, "aluminium_ingot_from_aluminium_blocks", null);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ALUMINIUM_NUGGET, RecipeCategory.MISC, ModItems.ALUMINIUM_INGOT, "aluminium_ingot_from_aluminium_nuggets", null, "aluminium_nuggets_from_aluminium_ingot", null);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_SWORD)
                .pattern("R")
                .pattern("R")
                .pattern("S")
                .input('R', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_PICKAXE)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_AXE)
                .pattern("RR")
                .pattern("RS")
                .pattern(" S")
                .input('R', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_SHOVEL)
                .pattern("R")
                .pattern("S")
                .pattern("S")
                .input('R', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_HOE)
                .pattern("RR")
                .pattern(" S")
                .pattern(" S")
                .input('R', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);




    }
}
