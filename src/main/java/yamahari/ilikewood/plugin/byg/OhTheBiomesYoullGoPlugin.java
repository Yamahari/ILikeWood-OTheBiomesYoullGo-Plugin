package yamahari.ilikewood.plugin.byg;

import net.minecraft.block.Block;
import yamahari.ilikewood.ILikeWoodPlugin;
import yamahari.ilikewood.IModPlugin;
import yamahari.ilikewood.plugin.byg.util.Constants;
import yamahari.ilikewood.registry.IWoodenObjectRegistry;
import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.registry.resource.IWoodenResourceRegistry;
import yamahari.ilikewood.registry.woodenitemtier.IWoodenItemTierRegistry;
import yamahari.ilikewood.registry.woodtype.IWoodTypeRegistry;

@ILikeWoodPlugin
public final class OhTheBiomesYoullGoPlugin implements IModPlugin {
    public static IWoodenObjectRegistry<Block, WoodenBlockType> BLOCK_REGISTRY;

    @Override
    public String getModId() {
        return Constants.BYG_MOD_ID;
    }

    @Override
    public void registerWoodTypes(final IWoodTypeRegistry registry) {
        OhTheBiomesYoullGoWoodTypes.getAll().forEach(registry::register);
    }

    @Override
    public void registerWoodenItemTiers(final IWoodenItemTierRegistry registry) {
        OhTheBiomesYoullGoWoodenItemTiers.getAll().forEach(registry::register);
    }

    @Override
    public void registerWoodenResources(final IWoodenResourceRegistry registry) {
        OhTheBiomesYoullGoWoodTypes.getAll().forEach(woodType -> {
            registry.registerPlanksResource(woodType, OhTheBiomesYoullGoWoodenResources.PLANKS.get(woodType));
            registry.registerLogResource(woodType, OhTheBiomesYoullGoWoodenResources.LOGS.get(woodType));
            registry.registerStrippedLogResource(woodType,
                OhTheBiomesYoullGoWoodenResources.STRIPPED_LOGS.get(woodType));
            registry.registerSlabResource(woodType, OhTheBiomesYoullGoWoodenResources.SLABS.get(woodType));
            registry.registerBlockResource(woodType,
                WoodenBlockType.BOOKSHELF,
                OhTheBiomesYoullGoWoodenResources.BOOKSHELFS.get(woodType));
            registry.registerBlockResource(woodType,
                WoodenBlockType.CRAFTING_TABLE,
                OhTheBiomesYoullGoWoodenResources.CRAFTING_TABLES.get(woodType));
            /*registry.registerBlockResource(woodType,
                WoodenBlockType.WALL,
                OhTheBiomesYoullGoWoodenResources.WALLS.get(woodType));*/
        });
    }

    @Override
    public void acceptBlockRegistry(final IWoodenObjectRegistry<Block, WoodenBlockType> registry) {
        BLOCK_REGISTRY = registry;
    }
}