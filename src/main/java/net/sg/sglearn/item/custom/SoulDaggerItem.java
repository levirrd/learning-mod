package net.sg.sglearn.item.custom;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SoulDaggerItem extends SwordItem {
    public SoulDaggerItem(Tier tier, Item.Properties properties) {
        super(tier, properties);
    }
    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity living) {
            living.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,50,1));
            living.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,50,1));
        }
        return super.onLeftClickEntity(stack, player, entity);

    }
}
