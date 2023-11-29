package club.someoneice.moddingsource.init;

import club.someoneice.moddingsource.ExampleMain;
import club.someoneice.moddingsource.item.ItemExample;
import club.someoneice.moddingsource.item.ItemExampleFood;
import com.google.common.collect.Maps;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.Map;

public class ItemInit {
    public static final Item ITEM_EXAMPLE = new ItemExample();
    public static final Item ITEM_EXAMPLE_FOOD = new ItemExampleFood(5, 0.5f, false, true);


    /* 其他注册，暂不使用 */
    public static final Map<String, Item> ITEM_LIST = Maps.newHashMap();

    public static void CommonRegistry() {
        GameRegistry.registerItem(ITEM_EXAMPLE, "item_example", ExampleMain.MODID);
    }

    public static void ListRegistry() {
        for (String item : ITEM_LIST.keySet()) {
            GameRegistry.registerItem(ITEM_LIST.get(item), item, ExampleMain.MODID);
        }
    }
}
