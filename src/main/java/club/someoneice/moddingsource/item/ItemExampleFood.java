package club.someoneice.moddingsource.item;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemExampleFood extends ItemFood {

    public ItemExampleFood(int hunger, float saturation, boolean isMeat, boolean canAlwaysEatable) {
        super(hunger, saturation, isMeat);

        if (canAlwaysEatable) this.setAlwaysEdible();
        this.maxStackSize = 1;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack item){
        return EnumAction.eat;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_){
        return 32;
    }
}
