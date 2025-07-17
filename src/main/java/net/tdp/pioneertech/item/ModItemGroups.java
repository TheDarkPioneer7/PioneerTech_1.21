package net.tdp.pioneertech.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tdp.pioneertech.PioneerTech;
import net.tdp.pioneertech.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup Pioneer_Tech = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PioneerTech.MOD_ID, "pioneertech"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT))
                    .displayName(Text.translatable("itemgroup.pioneertech.pioneertech"))
                    .entries(((displayContext, entries) -> {

                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_NUGGET);
                        entries.add(ModBlocks.ALUMINIUM_BLOCK);
                        entries.add(ModItems.ALUMINIUM_INGOT);
                        entries.add(ModItems.ALUMINIUM_NUGGET);

                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.ALUMINIUM_SWORD);
                        entries.add(ModItems.ALUMINIUM_PICKAXE);
                        entries.add(ModItems.ALUMINIUM_AXE);
                        entries.add(ModItems.ALUMINIUM_SHOVEL);
                        entries.add(ModItems.ALUMINIUM_HOE);


                    }))
                    .build());



    public static void registerItemGroups() {
        PioneerTech.LOGGER.info("Registering Item Groups for " + PioneerTech.MOD_ID);
    }
}
