package net.tdp.pioneertech.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.tdp.pioneertech.PioneerTech;
import net.tdp.pioneertech.PioneerTech;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> STEEL_ARMOR_MATERIAL = registerArmorMaterial("steel",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 10);
            }), 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(ModItems.STEEL_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(PioneerTech.MOD_ID, "steel"))), 1, 0));

    public static final RegistryEntry<ArmorMaterial> ALUMINIUM_ARMOR_MATERIAL = registerArmorMaterial("aluminium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), (map) -> {
                map.put(ArmorItem.Type.HELMET, 1);
                map.put(ArmorItem.Type.CHESTPLATE, 4);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.BODY, 8);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(ModItems.ALUMINIUM_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(PioneerTech.MOD_ID, "aluminium"))), 0, 0));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(PioneerTech.MOD_ID , name), material.get());
    }
}
