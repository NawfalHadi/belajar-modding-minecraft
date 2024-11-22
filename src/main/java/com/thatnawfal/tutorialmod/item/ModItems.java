package com.thatnawfal.tutorialmod.item;

import com.thatnawfal.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item BLUE_SHIT = registerItem("blue_shit", new Item(new Item.Settings()));
    public static final Item RAW_BLUE_SHIT = registerItem("raw_blue_shit", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registerin Mod Items for" + TutorialMod.MOD_ID);

//      Memasukkan Item Kedalam List creative
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(BLUE_SHIT);
            entries.add(RAW_BLUE_SHIT);
        });
    }

}
