package naturegamr.qolstuffsmod.init;

import naturegamr.qolstuffsmod.QualityOfLifeStuffs;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    public static Identifier id(String path) {
        return Identifier.of(QualityOfLifeStuffs.MOD_ID, path);
    }
    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, id(name), item);
    }
    public static final Item COOKED_EGG = register("cooked_egg", new Item(new Item.Settings()));
    public static void load() {}
}
