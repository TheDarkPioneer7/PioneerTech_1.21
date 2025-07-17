package net.tdp.pioneertech.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tdp.pioneertech.PioneerTech;

public class ModItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot", new Item(new Item.Settings()));
    public static final Item ALUMINIUM_NUGGET = registerItem("aluminium_nugget", new Item(new Item.Settings()));





    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterials.STEEL_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STEEL_INGOT, 3, -2.4f))));

    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterials.STEEL_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STEEL_INGOT, 1, -2.8f))));

    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterials.STEEL_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STEEL_INGOT, 5, -3))));

    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
            new ShovelItem(ModToolMaterials.STEEL_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STEEL_INGOT, 1.5f, -3))));

    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterials.STEEL_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STEEL_INGOT, -2.5f, 0))));


    public static final Item ALUMINIUM_SWORD = registerItem("aluminium_sword",
            new SwordItem(ModToolMaterials.ALUMINIUM_INGOT, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM_INGOT, 3, -2.4f))));

    public static final Item ALUMINIUM_PICKAXE = registerItem("aluminium_pickaxe",
            new PickaxeItem(ModToolMaterials.ALUMINIUM_INGOT, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM_INGOT, 1, -2.8f))));

    public static final Item ALUMINIUM_AXE = registerItem("aluminium_axe",
            new AxeItem(ModToolMaterials.ALUMINIUM_INGOT, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM_INGOT, 5, -3))));

    public static final Item ALUMINIUM_SHOVEL = registerItem("aluminium_shovel",
            new ShovelItem(ModToolMaterials.ALUMINIUM_INGOT, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM_INGOT, 1.5f, -3))));

    public static final Item ALUMINIUM_HOE = registerItem("aluminium_hoe",
            new HoeItem(ModToolMaterials.ALUMINIUM_INGOT, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ALUMINIUM_INGOT, -2, 0))));




    private static Item registerItem(String name, Item item) {

        return Registry.register(Registries.ITEM, Identifier.of(PioneerTech.MOD_ID, name), item);

    }

    public static void registerModItems() {
        PioneerTech.LOGGER.info("Registering Mod Items for " + PioneerTech.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(STEEL_INGOT);
            entries.add(ALUMINIUM_INGOT);
        });
    }

}
