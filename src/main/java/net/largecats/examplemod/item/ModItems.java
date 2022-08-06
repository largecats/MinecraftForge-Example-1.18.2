package net.largecats.examplemod.item;

import net.largecats.examplemod.ExampleMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID); // register a list of custom items under mod id

    public static final RegistryObject<Item> CAT = ITEMS.register("cat",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))); // item will be in miscellaneous tab in minecraft

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
