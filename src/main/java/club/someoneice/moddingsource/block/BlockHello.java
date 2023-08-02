package club.someoneice.moddingsource.block;

import club.someoneice.moddingsource.ExampleMain;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

class BlockHello extends Block {
    public BlockHello() {
        super(Material.wood);

        String name = "example_block";
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(name);
        this.setBlockTextureName(ExampleMain.MODID + ":" + name);

        GameRegistry.registerBlock(this, name);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        player.addChatMessage(new ChatComponentText("Hello World!"));

        return true;
    }
}