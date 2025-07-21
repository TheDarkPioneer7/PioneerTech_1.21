package net.tdp.pioneertech;

import net.fabricmc.api.ModInitializer;

import net.tdp.pioneertech.block.ModBlocks;
import net.tdp.pioneertech.item.ModItemGroups;
import net.tdp.pioneertech.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PioneerTech implements ModInitializer {
	public static final String MOD_ID = "pioneertech";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}