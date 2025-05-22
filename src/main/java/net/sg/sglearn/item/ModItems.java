package net.sg.sglearn.item;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sg.sglearn.SgLearn;
import net.sg.sglearn.item.custom.SoulDaggerItem;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SgLearn.MOD_ID);
    //titanium ingot
    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
           ()-> new Item(new Item.Properties().fireResistant()));
    //soul ingot
    public static final DeferredItem<Item> SOUL_INGOT = ITEMS.register("soul_ingot",
            ()-> new Item(new Item.Properties()));
    //charge ingot
    public static final DeferredItem<Item> CHARGE_INGOT = ITEMS.register("charge_ingot",
            ()-> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    //soul dagger
    public static final DeferredItem<SwordItem> SOUL_DAGGER = ITEMS.register("soul_dagger",
            ()-> new SoulDaggerItem(Tiers.NETHERITE, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.NETHERITE,2,-2.0F))));
    //raw titanium
    public static final DeferredItem<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}

