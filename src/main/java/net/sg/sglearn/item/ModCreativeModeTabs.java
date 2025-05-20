package net.sg.sglearn.item;

import net.minecraft.client.gui.components.tabs.Tab;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sg.sglearn.SgLearn;
import net.sg.sglearn.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SgLearn.MOD_ID);

    public static final Supplier<CreativeModeTab> SG_ITEMS_TAB = CREATIVE_MODE_TAB.register("sg_items_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.CHARGE_INGOT.get()))
                    .title(Component.translatable("creativetab.sglearn.sg_items"))
                    .displayItems(((parameters, output) ->{
                        output.accept(ModItems.CHARGE_INGOT);
                        output.accept(ModItems.SOUL_INGOT);
                        output.accept(ModItems.TITANIUM_INGOT);
                        output.accept(ModBlocks.TITANIUM_ORE);
                        output.accept(ModBlocks.TITANIUM_BLOCK);
                        output.accept(ModItems.SOUL_DAGGER);
                    }))

                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);

    }
}
