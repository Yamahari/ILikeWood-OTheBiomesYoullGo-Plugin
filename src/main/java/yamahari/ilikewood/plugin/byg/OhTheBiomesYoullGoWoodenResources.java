package yamahari.ilikewood.plugin.byg;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.client.model.generators.ModelProvider;
import yamahari.ilikewood.plugin.byg.util.Constants;
import yamahari.ilikewood.plugin.byg.util.Util;
import yamahari.ilikewood.plugin.byg.util.resources.WoodenLogResource;
import yamahari.ilikewood.plugin.byg.util.resources.WoodenPlanksResource;
import yamahari.ilikewood.plugin.byg.util.resources.WoodenSlabResource;
import yamahari.ilikewood.plugin.byg.util.resources.WoodenStrippedLogResource;
import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.registry.resource.IWoodenResource;
import yamahari.ilikewood.registry.resource.resources.IWoodenLogResource;
import yamahari.ilikewood.registry.resource.resources.IWoodenPlanksResource;
import yamahari.ilikewood.registry.resource.resources.IWoodenSlabResource;
import yamahari.ilikewood.registry.resource.resources.IWoodenStrippedLogResource;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class OhTheBiomesYoullGoWoodenResources
{
    public static final Map<IWoodType, IWoodenPlanksResource> PLANKS;
    public static final Map<IWoodType, IWoodenLogResource> LOGS;
    public static final Map<IWoodType, IWoodenStrippedLogResource> STRIPPED_LOGS;
    public static final Map<IWoodType, IWoodenSlabResource> SLABS;
    public static final Map<IWoodType, IWoodenResource> BOOKSHELFS = getResource(WoodenBlockType.BOOKSHELF);
    public static final Map<IWoodType, IWoodenResource> CRAFTING_TABLES = getResource(WoodenBlockType.CRAFTING_TABLE);
    // public static final Map<IWoodType, IWoodenResource> WALLS = getResource(WoodenBlockType.WALL);

    static
    {
        final Map<IWoodType, IWoodenPlanksResource> planks = new HashMap<>();
        final Map<IWoodType, IWoodenLogResource> logs = new HashMap<>();
        final Map<IWoodType, IWoodenStrippedLogResource> strippedLogs = new HashMap<>();
        final Map<IWoodType, IWoodenSlabResource> slabs = new HashMap<>();

        OhTheBiomesYoullGoWoodTypes.getAll().forEach(woodType ->
        {
            final String logPostFix = getLogPostFix(woodType);
            final ResourceLocation planksResource = new ResourceLocation(Constants.BYG_MOD_ID, Util.toRegistryName(woodType.getName(), "planks"));
            final ResourceLocation logResource = new ResourceLocation(Constants.BYG_MOD_ID, Util.toRegistryName(woodType.getName(), logPostFix));
            final ResourceLocation strippedLogResource = new ResourceLocation(Constants.BYG_MOD_ID, Util.toRegistryName("stripped", woodType.getName(), logPostFix));
            final ResourceLocation slabResource = new ResourceLocation(Constants.BYG_MOD_ID, Util.toRegistryName(woodType.getName(), "slab"));

            final ResourceLocation planksTexture =
                new ResourceLocation(planksResource.getNamespace(), Util.toPath(ModelProvider.BLOCK_FOLDER, woodType.getName(), "planks"));

            planks.put(woodType, new WoodenPlanksResource(planksTexture, planksResource,
                BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).sound(SoundType.WOOD).strength(2.0F, 3.0F)
            ));

            if (woodType.equals(OhTheBiomesYoullGoWoodTypes.GREEN_ENCHANTED) || woodType.equals(OhTheBiomesYoullGoWoodTypes.BLUE_ENCHANTED) || woodType.equals(
                OhTheBiomesYoullGoWoodTypes.EMBUR))
            {
                logs.put(woodType,
                    new WoodenLogResource(new ResourceLocation(logResource.getNamespace(), Util.toPath(ModelProvider.BLOCK_FOLDER, woodType.getName(), "log_top")),
                        new ResourceLocation(logResource.getNamespace(), Util.toPath(ModelProvider.BLOCK_FOLDER, woodType.getName(), "log")), logResource,
                        new IWoodenLogResource.SideTextureProperties(true, true, 10)
                    )
                );
            }
            else
            {
                logs.put(woodType,
                    new WoodenLogResource(new ResourceLocation(logResource.getNamespace(), Util.toPath(ModelProvider.BLOCK_FOLDER, woodType.getName(), "log_top")),
                        new ResourceLocation(logResource.getNamespace(), Util.toPath(ModelProvider.BLOCK_FOLDER, woodType.getName(), "log")), logResource
                    )
                );
            }

            if (!woodType.equals(OhTheBiomesYoullGoWoodTypes.IMPARIUS))
            {
                strippedLogs.put(woodType, new WoodenStrippedLogResource(
                    new ResourceLocation(strippedLogResource.getNamespace(), Util.toPath(ModelProvider.BLOCK_FOLDER, woodType.getName(), "stripped_log_top")),
                    new ResourceLocation(strippedLogResource.getNamespace(), Util.toPath(ModelProvider.BLOCK_FOLDER, woodType.getName(), "stripped_log")),
                    strippedLogResource
                ));
            }
            slabs.put(woodType, new WoodenSlabResource(planksTexture, planksTexture, planksTexture, slabResource));
        });

        PLANKS = Collections.unmodifiableMap(planks);
        LOGS = Collections.unmodifiableMap(logs);
        STRIPPED_LOGS = Collections.unmodifiableMap(strippedLogs);
        SLABS = Collections.unmodifiableMap(slabs);
    }

    private OhTheBiomesYoullGoWoodenResources()
    {
    }


    private static Map<IWoodType, IWoodenResource> getResource(final WoodenBlockType blockType)
    {
        final Map<IWoodType, IWoodenResource> bookshelfs = new HashMap<>();
        OhTheBiomesYoullGoWoodTypes
            .getAll()
            .forEach(
                woodType -> bookshelfs.put(woodType, () -> new ResourceLocation(Constants.BYG_MOD_ID, Util.toRegistryName(woodType.getName(), blockType.getName()))));
        return Collections.unmodifiableMap(bookshelfs);
    }

    private static String getLogPostFix(final IWoodType woodType)
    {
        if (woodType.equals(OhTheBiomesYoullGoWoodTypes.EMBUR))
        {
            return "pedu";
        }
        return Arrays.asList(OhTheBiomesYoullGoWoodTypes.BULBIS, OhTheBiomesYoullGoWoodTypes.IMPARIUS, OhTheBiomesYoullGoWoodTypes.SYTHIAN).contains(woodType) ? "stem"
            : "log";
    }
}
