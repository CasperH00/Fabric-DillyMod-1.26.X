package net.dilly.dillymod.item;

import net.dilly.dillymod.DillyMod;
import net.dilly.dillymod.food.ModFoods;
import net.dilly.dillymod.item.custom.DillyOnAStick;
import net.dilly.dillymod.item.custom.EnergyBarItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item DILLY = registerItem("dilly", Item::new);
    public static final Item WEED = registerItem("weed", Item::new);

    public static final Item DILLY_ON_A_STICK = registerItem("dilly_on_a_stick", properties -> new DillyOnAStick(properties.durability(1000)));

    //public static final Item ENERGY_BAR = registerItem("energy_bar", properties -> new Item(properties.food(ModFoods.ENERGY_BAR, ModFoods.ENERGY_BAR_CONSUMABLE)));

    public static final Item ENERGY_BAR = registerItem("energy_bar",
            properties -> new EnergyBarItem(properties.food(ModFoods.ENERGY_BAR, ModFoods.ENERGY_BAR_CONSUMABLE)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DillyMod.MOD_ID, name)))));
    }

    public static void registerModItems() {
        DillyMod.LOGGER.info("Registering Mod Items for " + DillyMod.MOD_ID);


    }
}