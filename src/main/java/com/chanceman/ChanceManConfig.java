package com.chanceman;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("chanceman")
public interface ChanceManConfig extends Config
{
    @ConfigItem(
            keyName = "freeToPlay",
            name = "Free To Play Mode",
            description = "Only allow free-to-play items",
            position = 1
    )
    default boolean freeToPlay()
    {
        return false;
    }

    @ConfigItem(
            keyName = "enableFreeToPlayTradeOnlyItems",
            name = "Roll F2P Trade Only Items",
            description = "Include items only obtainable through trade or Grand Exchange on F2P servers." +
                    " Only applies if Free To Play Mode is active.",
            position = 2
    )
    default boolean enableFreeToPlayTradeOnlyItems()
    {
        return false;
    }

    @ConfigItem(
            keyName = "enableItemSets",
            name = "Roll Item Sets",
            description = "Include item set items in the rollable items list. Disabling this will exclude any" +
                    " item set items from random rolls.",
            position = 3
    )
    default boolean enableItemSets() { return true; }

    @ConfigItem(
            keyName = "enableFlatpacks",
            name = "Roll Flatpacks",
            description = "Include flatpacks in the rollable items list. Disabling this will prevent" +
                    " flatpacks from being rolled.",
            position = 4
    )
    default boolean enableFlatpacks() { return true; }

    @ConfigItem(
            keyName = "requireWeaponPoison",
            name = "Weapon Poison Unlock Requirements",
            description = "Force poison variants to roll only if both the base weapon and the corresponding" +
                    " weapon poison are unlocked. (Disabling this will allow poisoned variants to roll even if " +
                    "the poison is locked.)",
            position = 5
    )
    default boolean requireWeaponPoison() { return true; }
}
