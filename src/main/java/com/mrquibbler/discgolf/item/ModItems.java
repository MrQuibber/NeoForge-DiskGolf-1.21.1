package com.mrquibbler.discgolf.item;

import com.mrquibbler.discgolf.DiscGolf;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DiscGolf.MOD_ID);

    //Items Below
    public static final DeferredItem<Item> RED_DRIVER = ITEMS.register("red_driver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_DRIVER = ITEMS.register("orange_driver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_DRIVER = ITEMS.register("yellow_driver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_DRIVER = ITEMS.register("green_driver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_DRIVER = ITEMS.register("blue_driver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_DRIVER = ITEMS.register("purple_driver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RED_PUTTER = ITEMS.register("red_putter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGE_PUTTER = ITEMS.register("orange_putter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOW_PUTTER = ITEMS.register("yellow_putter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_PUTTER = ITEMS.register("green_putter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_PUTTER = ITEMS.register("blue_putter",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_PUTTER = ITEMS.register("purple_putter",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
