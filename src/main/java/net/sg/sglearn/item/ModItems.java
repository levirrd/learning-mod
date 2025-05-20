package net.sg.sglearn.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sg.sglearn.SgLearn;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SgLearn.MOD_ID);

    public static final DeferredItem<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
           ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SOUL_INGOT = ITEMS.register("soulingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHARGE_INGOT = ITEMS.register("charge_ingot",
            ()-> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

