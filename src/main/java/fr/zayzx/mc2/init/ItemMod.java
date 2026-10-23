
package fr.zayzx.mc2.init;

import fr.zayzx.mc2.utils.Reference;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public final class ItemMod {

    private ItemMod() {}

    public static final Item TEST = Registry.register(
        BuiltInRegistries.ITEM,
        ResourceLocation.fromNamespaceAndPath(
            Reference.MOD_ID,
            "test"
        ),
        new Item(new Item.Properties())
    );

    public static void register() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
            .register(entries -> entries.accept(TEST));
    }
}
