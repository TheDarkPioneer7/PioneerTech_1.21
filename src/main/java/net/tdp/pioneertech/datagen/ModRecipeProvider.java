package net.tdp.pioneertech.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.tdp.pioneertech.block.ModBlocks;
import net.tdp.pioneertech.item.ModItems;

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SWORD)
                .pattern("Q")
                .pattern("Q")
                .pattern("S")
                .input('Q', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                .pattern("QQQ")
                .pattern(" S ")
                .pattern(" S ")
                .input('Q', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_AXE)
                .pattern("QQ")
                .pattern("QS")
                .pattern(" S")
                .input('Q', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL)
                .pattern("Q")
                .pattern("S")
                .pattern("S")
                .input('Q', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.STEEL_HOE)
                .pattern("QQ")
                .pattern(" S")
                .pattern(" S")
                .input('Q', ModItems.STEEL_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_SWORD)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_PICKAXE)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_AXE)
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_SHOVEL)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.ALUMINIUM_HOE)
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_HELMET)
                .pattern("QQQ")
                .pattern("Q Q")
                .input('Q', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_CHESTPLATE)
                .pattern("Q Q")
                .pattern("QQQ")
                .pattern("QQQ")
                .input('Q', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_LEGGINGS)
                .pattern("QQQ")
                .pattern("Q Q")
                .pattern("Q Q")
                .input('Q', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STEEL_BOOTS)
                .pattern("Q Q")
                .pattern("Q Q")
                .input('Q', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.ALUMINIUM_BOOTS)
                .pattern("A A")
                .pattern("A A")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter);

        /* ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARBURIZING_FURNACE)
                .pattern("AAA")
                .pattern("A A")
                .pattern("AAA")
                .input('A', ModItems.ALUMINIUM_INGOT)
                .criterion(hasItem(ModItems.ALUMINIUM_INGOT), conditionsFromItem(ModItems.ALUMINIUM_INGOT))
                .offerTo(exporter); */

    }
}
