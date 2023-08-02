package club.someoneice.moddingsource;

import club.someoneice.moddingsource.init.ItemInit;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMain.MODID, version = ExampleMain.VERSION, modLanguage = "java")
public final class ExampleMain {
    public static final String MODID = "example_mod_id";
    public static final String VERSION = "example-1.0";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static final CreativeTabs TAB = new CreativeTabs("example_item_group") {
        @Override
        public Item getTabIconItem() {
            return ItemInit.ITEM_EXAMPLE;
        }
    };



    /**
     * 这里是预加载初始化事件
     */
    @Mod.EventHandler
    public void initPre(FMLPreInitializationEvent event) {
        LOGGER.info("Hello Pre Initialization!");
    }

    /**
     * 这里是正常初始化事件
     */
    @Mod.EventHandler
    public void initCommon(FMLInitializationEvent event) {
        new ItemInit();
    }

    /**
     * 这里是通讯加载初始化事件
     */
    @Mod.EventHandler
    public void initPost(FMLPostInitializationEvent event) {

    }

    /**
     * 这里是服务器加载初始化事件
     */
    @Mod.EventHandler
    public void initServer(FMLServerStartingEvent event) {

    }

    /**
     * 这里是客户端初始化事件
     */
    @Mod.EventHandler
    public void initClient(FMLClientHandler event) {

    }
}
