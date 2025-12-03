package net.tyalternative.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.tyalternative.tutorialmod.block.ModBlocks;
import net.tyalternative.tutorialmod.item.ModItemGroups;
import net.tyalternative.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// added comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroup();
	}
}