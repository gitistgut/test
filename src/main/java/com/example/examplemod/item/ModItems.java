package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.versions.forge.ForgeVersion;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> TNT_THROWABLE = ITEMS.register("tnt_throwable",
            () -> new Item(new Item.Properties().stacksTo(16)));   //tab(ModCreativeModeTab.TUTORIAL_TAB)));

        public static void register(IEventBus eventbus) {
            ITEMS.register(eventbus);
        }
   }
