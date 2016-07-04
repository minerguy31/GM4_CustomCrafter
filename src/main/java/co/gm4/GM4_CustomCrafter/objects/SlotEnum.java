package co.gm4.GM4_CustomCrafter.objects;

import java.util.Locale;

/**
 * Project: GM4_CustomCrafter
 * Author: SpiderRobotMan
 * Date: Jul 04 2016
 * Website: http://www.spiderrobotman.com
 */
public enum SlotEnum {
    SLOT_1(0),
    SLOT_2(1),
    SLOT_3(2),
    SLOT_4(3),
    SLOT_5(4),
    SLOT_6(5),
    SLOT_7(6),
    SLOT_8(7),
    SLOT_9(8);

    private int id;
    SlotEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SlotEnum fromString(String string) {
        return SlotEnum.valueOf(string.toUpperCase(Locale.ENGLISH));
    }

    public static SlotEnum fromInt(int integer) {
        for(SlotEnum s: SlotEnum.values()) {
            if(s.getId() == integer) {
                return s;
            }
        }
        throw new IllegalArgumentException("No enum with id " + integer + " found");
    }
}
