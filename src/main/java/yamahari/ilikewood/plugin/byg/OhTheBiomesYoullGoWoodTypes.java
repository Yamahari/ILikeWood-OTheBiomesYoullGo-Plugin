package yamahari.ilikewood.plugin.byg;

import com.mojang.blaze3d.platform.NativeImage;
import yamahari.ilikewood.plugin.byg.util.Constants;
import yamahari.ilikewood.plugin.byg.util.WoodType;
import yamahari.ilikewood.registry.woodtype.IWoodType;

import java.util.stream.Stream;

public final class OhTheBiomesYoullGoWoodTypes {
    public static final IWoodType ASPEN = withStrippedLog(Constants.ASPEN, new int[]{
        color(127, 87, 72),
        color(140, 96, 79),
        color(153, 105, 86),
        color(191, 120, 79),
        color(196, 129, 90),
        color(200, 137, 101),
        color(222, 157, 127),
        color(221, 173, 141)});

    public static final IWoodType BAOBAB = withStrippedLog(Constants.BAOBAB, new int[]{
        color(70, 59, 32),
        color(91, 77, 42),
        color(108, 92, 50),
        color(122, 104, 56),
        color(135, 114, 62),
        color(147, 124, 67),
        color(168, 141, 77),
        color(179, 153, 91)});

    public static final IWoodType BLUE_ENCHANTED = withStrippedLog(Constants.BLUE_ENCHANTED, new int[]{
        color(39, 46, 78),
        color(44, 52, 88),
        color(50, 58, 98),
        color(56, 66, 112),
        color(60, 70, 119),
        color(63, 74, 125),
        color(68, 81, 136),
        color(76, 89, 148)});

    public static final IWoodType BULBIS = withStrippedLog(Constants.BULBIS, new int[]{
        color(58, 37, 75),
        color(69, 44, 89),
        color(84, 55, 109),
        color(113, 54, 150),
        color(121, 58, 161),
        color(128, 62, 172),
        color(148, 74, 191),
        color(157, 94, 197)});

    public static final IWoodType CHERRY = withStrippedLog(Constants.CHERRY, new int[]{
        color(69, 9, 19),
        color(79, 12, 21),
        color(94, 16, 27),
        color(97, 18, 34),
        color(102, 19, 33),
        color(107, 19, 32),
        color(118, 21, 35),
        color(128, 24, 39)});

    public static final IWoodType CIKA = withStrippedLog(Constants.CIKA, new int[]{
        color(77, 36, 22),
        color(89, 43, 29),
        color(100, 49, 32),
        color(120, 51, 28),
        color(127, 54, 30),
        color(133, 56, 31),
        color(148, 64, 36),
        color(174, 76, 43)});

    public static final IWoodType CYPRESS = withStrippedLog(Constants.CYPRESS, new int[]{
        color(83, 83, 54),
        color(93, 92, 60),
        color(118, 112, 66),
        color(118, 115, 81),
        color(131, 126, 73),
        color(141, 137, 94),
        color(157, 148, 107),
        color(172, 162, 114)});

    public static final IWoodType EBONY = withStrippedLog(Constants.EBONY, new int[]{
        color(18, 18, 18),
        color(23, 23, 23),
        color(26, 26, 26),
        color(31, 31, 31),
        color(32, 32, 32),
        color(33, 33, 33),
        color(36, 36, 36),
        color(41, 41, 41)});

    public static final IWoodType EMBUR = withStrippedLog(Constants.EMBUR, new int[]{
        color(49, 39, 31),
        color(58, 46, 36),
        color(66, 52, 43),
        color(73, 58, 47),
        color(76, 61, 50),
        color(79, 64, 53),
        color(85, 68, 55),
        color(93, 75, 60)});

    public static final IWoodType ETHER = withStrippedLog(Constants.ETHER, new int[]{
        color(22, 59, 40),
        color(27, 74, 51),
        color(31, 84, 58),
        color(32, 84, 58),
        color(35, 92, 63),
        color(37, 99, 68),
        color(44, 120, 82),
        color(51, 138, 94)});

    public static final IWoodType FIR = withStrippedLog(Constants.FIR, new int[]{
        color(69, 51, 38),
        color(87, 64, 46),
        color(100, 72, 53),
        color(121, 77, 58),
        color(130, 88, 66),
        color(139, 99, 73),
        color(159, 117, 83),
        color(178, 143, 108)});

    /*public static final IWoodType GLACIAL_OAK = withoutStrippedLog(Constants.GLACIAL_OAK, new int[]{
               color(130, 153, 149),
               color(151, 179, 181),
               color(161, 169, 148),
               color(174, 190, 188),
               color(188, 188, 154),
               color(189, 199, 200),
               color(204, 209, 221),
               color(205, 212, 208)});*/

    public static final IWoodType GREEN_ENCHANTED = withStrippedLog(Constants.GREEN_ENCHANTED, new int[]{
        color(39, 78, 42),
        color(44, 88, 59),
        color(50, 98, 60),
        color(54, 104, 62),
        color(55, 108, 69),
        color(56, 112, 75),
        color(63, 125, 76),
        color(69, 135, 82)});

    public static final IWoodType HOLLY = withStrippedLog(Constants.HOLLY, new int[]{
        color(123, 101, 91),
        color(135, 111, 100),
        color(146, 120, 108),
        color(180, 135, 105),
        color(186, 143, 115),
        color(191, 151, 125),
        color(216, 172, 149),
        color(216, 185, 161)});

    public static final IWoodType IMPARIUS = withoutStrippedLog(Constants.IMPARIUS, new int[]{
        color(51, 107, 115),
        color(64, 121, 128),
        color(78, 135, 141),
        color(92, 149, 155),
        color(99, 156, 162),
        color(105, 163, 168),
        color(119, 177, 181),
        color(133, 191, 195)});

    public static final IWoodType JACARANDA = withStrippedLog(Constants.JACARANDA, new int[]{
        color(92, 61, 60),
        color(113, 74, 73),
        color(134, 88, 87),
        color(145, 105, 100),
        color(152, 109, 105),
        color(159, 113, 109),
        color(167, 119, 118),
        color(175, 124, 123)});

    public static final IWoodType LAMENT = withStrippedLog(Constants.LAMENT, new int[]{
        color(43, 39, 79),
        color(52, 47, 96),
        color(56, 50, 103),
        color(65, 60, 119),
        color(69, 63, 126),
        color(72, 66, 133),
        color(78, 71, 144),
        color(87, 79, 161)});

    public static final IWoodType MAHOGANY = withStrippedLog(Constants.MAHOGANY, new int[]{
        color(59, 38, 42),
        color(75, 48, 54),
        color(93, 60, 67),
        color(109, 70, 78),
        color(116, 76, 84),
        color(122, 82, 90),
        color(140, 90, 100),
        color(160, 106, 117)});

    public static final IWoodType MANGROVE = withStrippedLog(Constants.MANGROVE, new int[]{
        color(123, 111, 111),
        color(133, 133, 133),
        color(150, 146, 146),
        color(159, 153, 153),
        color(163, 163, 163),
        color(181, 181, 181),
        color(194, 194, 194),
        color(209, 209, 209)});

    public static final IWoodType MAPLE = withStrippedLog(Constants.MAPLE, new int[]{
        color(58, 53, 49),
        color(73, 66, 60),
        color(83, 75, 70),
        color(101, 85, 78),
        color(109, 95, 87),
        color(116, 104, 96),
        color(132, 120, 110),
        color(153, 143, 133)});

    public static final IWoodType NIGHTSHADE = withStrippedLog(Constants.NIGHTSHADE, new int[]{
        color(103, 57, 15),
        color(121, 68, 18),
        color(138, 77, 21),
        color(138, 78, 21),
        color(151, 86, 23),
        color(163, 94, 24),
        color(190, 109, 28),
        color(219, 125, 33)});

    public static final IWoodType PALM = withStrippedLog(Constants.PALM, new int[]{
        color(77, 72, 61),
        color(104, 91, 69),
        color(121, 105, 78),
        color(135, 126, 104),
        color(145, 134, 108),
        color(155, 141, 111),
        color(168, 155, 122),
        color(176, 167, 146)});

    public static final IWoodType PINE = withStrippedLog(Constants.PINE, new int[]{
        color(99, 91, 76),
        color(110, 103, 84),
        color(122, 115, 98),
        color(153, 142, 112),
        color(160, 149, 121),
        color(166, 156, 129),
        color(178, 167, 138),
        color(197, 185, 154)});

    /*public static final IWoodType RAINBOW_EUCALYPTUS = withStrippedLog(Constants.RAINBOW_EUCALYPTUS, new int[]{
        color(151, 125, 108),
        color(156, 105, 80),
        color(157, 131, 90),
        color(164, 164, 158),
        color(181, 155, 121),
        color(185, 164, 145),
        color(191, 147, 124),
        color(202, 181, 144)});*/

    public static final IWoodType REDWOOD = withStrippedLog(Constants.REDWOOD, new int[]{
        color(48, 21, 21),
        color(59, 26, 26),
        color(67, 30, 30),
        color(83, 29, 29),
        color(89, 31, 31),
        color(94, 33, 33),
        color(106, 37, 37),
        color(128, 45, 45)});

    public static final IWoodType SKYRIS = withStrippedLog(Constants.SKYRIS, new int[]{
        color(0, 70, 105),
        color(3, 84, 125),
        color(29, 108, 148),
        color(27, 122, 168),
        color(29, 130, 178),
        color(30, 137, 187),
        color(32, 148, 203),
        color(36, 168, 229)});

    public static final IWoodType SYTHIAN = withStrippedLog(Constants.SYTHIAN, new int[]{
        color(69, 53, 0),
        color(86, 66, 0),
        color(103, 84, 0),
        color(123, 105, 4),
        color(137, 117, 5),
        color(150, 129, 5),
        color(172, 148, 9),
        color(187, 166, 13)});

    public static final IWoodType WILLOW = withStrippedLog(Constants.WILLOW, new int[]{
        color(28, 33, 15),
        color(34, 41, 18),
        color(50, 59, 26),
        color(56, 66, 30),
        color(59, 71, 31),
        color(66, 79, 35),
        color(74, 89, 39),
        color(85, 102, 45)});

    public static final IWoodType WITCH_HAZEL = withStrippedLog(Constants.WITCH_HAZEL, new int[]{
        color(189, 131, 38),
        color(245, 204, 39),
        color(255, 238, 110),
        color(34, 83, 55),
        color(40, 98, 64),
        color(78, 97, 46),
        color(49, 119, 77),
        color(89, 110, 52)});

    public static final IWoodType ZELKOVA = withStrippedLog(Constants.ZELKOVA, new int[]{
        color(79, 39, 19),
        color(89, 47, 23),
        color(102, 53, 26),
        color(130, 74, 35),
        color(140, 81, 41),
        color(150, 88, 47),
        color(171, 99, 54),
        color(191, 109, 54)});

    private OhTheBiomesYoullGoWoodTypes() {
    }

    private static int color(final int r, final int g, final int b) {
        return NativeImage.combine(0xFF, b, g, r);
    }

    private static IWoodType withStrippedLog(final String name, final int[] colors) {
        return new WoodType(name, new IWoodType.Colors(colors), true);
    }

    private static IWoodType withoutStrippedLog(final String name, final int[] colors) {
        return new WoodType(name, new IWoodType.Colors(colors), false);
    }

    public static Stream<IWoodType> getAll() {
        return Stream.of(ASPEN, BAOBAB, BLUE_ENCHANTED, BULBIS, CHERRY, CIKA, CYPRESS,
            EBONY,
            EMBUR,
            ETHER,
            FIR,
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
            REDWOOD,
            SKYRIS,
            SYTHIAN,
            WILLOW,
            WITCH_HAZEL,
            ZELKOVA);
    }
}
