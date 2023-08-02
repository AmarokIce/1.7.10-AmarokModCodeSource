package club.someoneice.moddingsource.block;

import club.someoneice.moddingsource.ExampleMain;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IIcon;

public class BlockExample extends Block {
    public static final BlockExample block = new BlockExample();

    public BlockExample() {
        super(Material.wood);

        String name = "example_block";
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(name);
        this.setBlockTextureName(ExampleMain.MODID + ":" + name);

        GameRegistry.registerBlock(this, ItemBlockExample.class, name);
    }

    private static final class ItemBlockExample extends ItemBlock {
        @SideOnly(Side.CLIENT)
        private IIcon icon;

        public ItemBlockExample() {
            super(block);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public void registerIcons(IIconRegister register) {
            this.icon = register.registerIcon(ExampleMain.MODID + ":example_block_item");
        }

        @Override
        @SideOnly(Side.CLIENT)
        public IIcon getIconFromDamage(int meta) {
            return this.icon;
        }
    }
}
