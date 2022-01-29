package yamahari.ilikewood.plugin.byg;

import net.minecraft.world.item.crafting.Ingredient;
import yamahari.ilikewood.plugin.byg.util.Constants;
import yamahari.ilikewood.registry.objecttype.WoodenBlockType;
import yamahari.ilikewood.registry.woodenitemtier.DefaultWoodenItemTier;
import yamahari.ilikewood.registry.woodenitemtier.IWoodenItemTier;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.stream.Stream;

public final class OhTheBiomesYoullGoWoodenItemTiers {
    public static final IWoodenItemTier ASPEN = createItemTier(OhTheBiomesYoullGoWoodTypes.ASPEN, Constants.ASPEN);
    public static final IWoodenItemTier BAOBAB = createItemTier(OhTheBiomesYoullGoWoodTypes.BAOBAB, Constants.BAOBAB);
    public static final IWoodenItemTier BLUE_ENCHANTED =
        createItemTier(OhTheBiomesYoullGoWoodTypes.BLUE_ENCHANTED, Constants.BLUE_ENCHANTED);
    public static final IWoodenItemTier BULBIS = createItemTier(OhTheBiomesYoullGoWoodTypes.BULBIS, Constants.BULBIS);
    public static final IWoodenItemTier CHERRY = createItemTier(OhTheBiomesYoullGoWoodTypes.CHERRY, Constants.CHERRY);
    public static final IWoodenItemTier CIKA = createItemTier(OhTheBiomesYoullGoWoodTypes.CIKA, Constants.CIKA);
    public static final IWoodenItemTier CYPRESS =
        createItemTier(OhTheBiomesYoullGoWoodTypes.CYPRESS, Constants.CYPRESS);
    public static final IWoodenItemTier EBONY = createItemTier(OhTheBiomesYoullGoWoodTypes.EBONY, Constants.EBONY);
    public static final IWoodenItemTier EMBUR = createItemTier(OhTheBiomesYoullGoWoodTypes.EMBUR, Constants.EMBUR);
    public static final IWoodenItemTier ETHER = createItemTier(OhTheBiomesYoullGoWoodTypes.ETHER, Constants.ETHER);
    public static final IWoodenItemTier FIR = createItemTier(OhTheBiomesYoullGoWoodTypes.FIR, Constants.FIR);
    //public static final IWoodenItemTier GLACIAL_OAK =
    //    createItemTier(OhTheBiomesYoullGoWoodTypes.GLACIAL_OAK, Constants.GLACIAL_OAK);
    public static final IWoodenItemTier GREEN_ENCHANTED =
        createItemTier(OhTheBiomesYoullGoWoodTypes.GREEN_ENCHANTED, Constants.GREEN_ENCHANTED);
    public static final IWoodenItemTier HOLLY = createItemTier(OhTheBiomesYoullGoWoodTypes.HOLLY, Constants.HOLLY);
    public static final IWoodenItemTier IMPARIUS =
        createItemTier(OhTheBiomesYoullGoWoodTypes.IMPARIUS, Constants.IMPARIUS);
    public static final IWoodenItemTier JACARANDA =
        createItemTier(OhTheBiomesYoullGoWoodTypes.JACARANDA, Constants.JACARANDA);
    public static final IWoodenItemTier LAMENT = createItemTier(OhTheBiomesYoullGoWoodTypes.LAMENT, Constants.LAMENT);
    public static final IWoodenItemTier MAHOGANY =
        createItemTier(OhTheBiomesYoullGoWoodTypes.MAHOGANY, Constants.MAHOGANY);
    public static final IWoodenItemTier MANGROVE =
        createItemTier(OhTheBiomesYoullGoWoodTypes.MANGROVE, Constants.MANGROVE);
    public static final IWoodenItemTier MAPLE = createItemTier(OhTheBiomesYoullGoWoodTypes.MAPLE, Constants.MAPLE);
    public static final IWoodenItemTier NIGHTSHADE =
        createItemTier(OhTheBiomesYoullGoWoodTypes.NIGHTSHADE, Constants.NIGHTSHADE);
    public static final IWoodenItemTier PALM = createItemTier(OhTheBiomesYoullGoWoodTypes.PALM, Constants.PALM);
    public static final IWoodenItemTier PINE = createItemTier(OhTheBiomesYoullGoWoodTypes.PINE, Constants.PINE);
    /*public static final IWoodenItemTier RAINBOW_EUCALYPTUS =
        createItemTier(OhTheBiomesYoullGoWoodTypes.RAINBOW_EUCALYPTUS, Constants.RAINBOW_EUCALYPTUS);*/
    public static final IWoodenItemTier REDWOOD =
        createItemTier(OhTheBiomesYoullGoWoodTypes.REDWOOD, Constants.REDWOOD);
    public static final IWoodenItemTier SKYRIS = createItemTier(OhTheBiomesYoullGoWoodTypes.SKYRIS, Constants.SKYRIS);
    public static final IWoodenItemTier SYTHIAN =
        createItemTier(OhTheBiomesYoullGoWoodTypes.SYTHIAN, Constants.SYTHIAN);
    public static final IWoodenItemTier WILLOW = createItemTier(OhTheBiomesYoullGoWoodTypes.WILLOW, Constants.WILLOW);
    public static final IWoodenItemTier WITCH_HAZEL =
        createItemTier(OhTheBiomesYoullGoWoodTypes.WITCH_HAZEL, Constants.WITCH_HAZEL);
    public static final IWoodenItemTier ZELKOVA =
        createItemTier(OhTheBiomesYoullGoWoodTypes.ZELKOVA, Constants.ZELKOVA);

    private OhTheBiomesYoullGoWoodenItemTiers() {
    }

    private static IWoodenItemTier createItemTier(final IWoodType woodType, final String name) {
        return new DefaultWoodenItemTier(woodType,
            Constants.BYG_MOD_ID,
            name,
            () -> Ingredient.of(OhTheBiomesYoullGoPlugin.BLOCK_REGISTRY.getObject(woodType, WoodenBlockType.PANELS)));
    }

    public static Stream<IWoodenItemTier> getAll() {
        return Stream.of(OhTheBiomesYoullGoWoodenItemTiers.ASPEN,
            OhTheBiomesYoullGoWoodenItemTiers.BAOBAB,
            OhTheBiomesYoullGoWoodenItemTiers.BLUE_ENCHANTED,
            OhTheBiomesYoullGoWoodenItemTiers.BULBIS,
            OhTheBiomesYoullGoWoodenItemTiers.CHERRY,
            OhTheBiomesYoullGoWoodenItemTiers.CIKA,
            OhTheBiomesYoullGoWoodenItemTiers.CYPRESS,
            OhTheBiomesYoullGoWoodenItemTiers.EBONY,
            OhTheBiomesYoullGoWoodenItemTiers.EMBUR,
            OhTheBiomesYoullGoWoodenItemTiers.ETHER,
            OhTheBiomesYoullGoWoodenItemTiers.FIR,
            // OhTheBiomesYoullGoWoodenItemTiers.GLACIAL_OAK,
            OhTheBiomesYoullGoWoodenItemTiers.GREEN_ENCHANTED,
            OhTheBiomesYoullGoWoodenItemTiers.HOLLY,
            OhTheBiomesYoullGoWoodenItemTiers.IMPARIUS,
            OhTheBiomesYoullGoWoodenItemTiers.JACARANDA,
            OhTheBiomesYoullGoWoodenItemTiers.LAMENT,
            OhTheBiomesYoullGoWoodenItemTiers.MAHOGANY,
            OhTheBiomesYoullGoWoodenItemTiers.MANGROVE,
            OhTheBiomesYoullGoWoodenItemTiers.MAPLE,
            OhTheBiomesYoullGoWoodenItemTiers.NIGHTSHADE,
            OhTheBiomesYoullGoWoodenItemTiers.PALM,
            OhTheBiomesYoullGoWoodenItemTiers.PINE,
            // OhTheBiomesYoullGoWoodenItemTiers.RAINBOW_EUCALYPTUS,
            OhTheBiomesYoullGoWoodenItemTiers.REDWOOD,
            OhTheBiomesYoullGoWoodenItemTiers.SKYRIS,
            OhTheBiomesYoullGoWoodenItemTiers.SYTHIAN,
            OhTheBiomesYoullGoWoodenItemTiers.WILLOW,
            OhTheBiomesYoullGoWoodenItemTiers.WITCH_HAZEL,
            OhTheBiomesYoullGoWoodenItemTiers.ZELKOVA);
    }
}
