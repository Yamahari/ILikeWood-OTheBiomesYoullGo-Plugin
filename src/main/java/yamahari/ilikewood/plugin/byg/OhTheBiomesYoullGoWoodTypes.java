package yamahari.ilikewood.plugin.byg;

import yamahari.ilikewood.plugin.byg.util.Constants;
import yamahari.ilikewood.plugin.byg.util.WoodType;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.stream.Stream;

public final class OhTheBiomesYoullGoWoodTypes {
    public static final IWoodType ASPEN = withStrippedLog(Constants.ASPEN);
    public static final IWoodType BAOBAB = withStrippedLog(Constants.BAOBAB);
    public static final IWoodType BLUE_ENCHANTED = withStrippedLog(Constants.BLUE_ENCHANTED);
    public static final IWoodType BULBIS = withStrippedLog(Constants.BULBIS);
    public static final IWoodType CHERRY = withStrippedLog(Constants.CHERRY);
    public static final IWoodType CIKA = withStrippedLog(Constants.CIKA);
    public static final IWoodType CYPRESS = withStrippedLog(Constants.CYPRESS);
    public static final IWoodType EBONY = withStrippedLog(Constants.EBONY);
    public static final IWoodType EMBUR = withStrippedLog(Constants.EMBUR);
    public static final IWoodType ETHER = withStrippedLog(Constants.ETHER);
    public static final IWoodType FIR = withStrippedLog(Constants.FIR);
    //public static final IWoodType GLACIAL_OAK = withoutStrippedLog(Constants.GLACIAL_OAK);
    public static final IWoodType GREEN_ENCHANTED = withStrippedLog(Constants.GREEN_ENCHANTED);
    public static final IWoodType HOLLY = withStrippedLog(Constants.HOLLY);
    public static final IWoodType IMPARIUS = withoutStrippedLog(Constants.IMPARIUS);
    public static final IWoodType JACARANDA = withStrippedLog(Constants.JACARANDA);
    public static final IWoodType LAMENT = withStrippedLog(Constants.LAMENT);
    public static final IWoodType MAHOGANY = withStrippedLog(Constants.MAHOGANY);
    public static final IWoodType MANGROVE = withStrippedLog(Constants.MANGROVE);
    public static final IWoodType MAPLE = withStrippedLog(Constants.MAPLE);
    public static final IWoodType NIGHTSHADE = withStrippedLog(Constants.NIGHTSHADE);
    public static final IWoodType PALM = withStrippedLog(Constants.PALM);
    public static final IWoodType PINE = withStrippedLog(Constants.PINE);
    public static final IWoodType RAINBOW_EUCALYPTUS = withStrippedLog(Constants.RAINBOW_EUCALYPTUS);
    public static final IWoodType REDWOOD = withStrippedLog(Constants.REDWOOD);
    public static final IWoodType SKYRIS = withStrippedLog(Constants.SKYRIS);
    public static final IWoodType SYTHIAN = withStrippedLog(Constants.SYTHIAN);
    public static final IWoodType WILLOW = withStrippedLog(Constants.WILLOW);
    public static final IWoodType WITCH_HAZEL = withStrippedLog(Constants.WITCH_HAZEL);
    public static final IWoodType ZELKOVA = withStrippedLog(Constants.ZELKOVA);

    private OhTheBiomesYoullGoWoodTypes() {
    }

    private static IWoodType withStrippedLog(final String name) {
        return new WoodType(name, true);
    }

    private static IWoodType withoutStrippedLog(final String name) {
        return new WoodType(name, false);
    }

    public static Stream<IWoodType> getAll() {
        return Stream.of(ASPEN,
            BAOBAB,
            BLUE_ENCHANTED,
            BULBIS,
            CHERRY,
            CIKA,
            CYPRESS,
            EBONY,
            EMBUR,
            ETHER,
            FIR,
            //GLACIAL_OAK,
            GREEN_ENCHANTED,
            HOLLY,
            IMPARIUS,
            JACARANDA,
            LAMENT,
            MAHOGANY,
            MANGROVE,
            MAPLE,
            NIGHTSHADE,
            PALM,
            PINE,
            RAINBOW_EUCALYPTUS,
            REDWOOD,
            SKYRIS,
            SYTHIAN,
            WILLOW,
            WITCH_HAZEL,
            ZELKOVA);
    }
}
