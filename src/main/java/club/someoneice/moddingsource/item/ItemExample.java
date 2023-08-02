package club.someoneice.moddingsource.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import club.someoneice.moddingsource.ExampleMain;

public class ItemExample extends Item {
    public ItemExample() {
        String name = "example_item";
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setUnlocalizedName(name);
        this.setTextureName(ExampleMain.MODID + ":" + name);

        GameRegistry.registerItem(this, name, ExampleMain.MODID);
    }
}
