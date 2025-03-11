package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("masterBedroom",
                new Room(
                        new Wall("North"),
                        new Wall("South"),
                        new Wall("East"),
                        new Wall("West"),
                        new Ceiling(4, PaintColor.GREEN),
                        new Bed("Çift Kişilik", 5, 2, 3, 2),
                        new Lamp(LampType.NEON, false, 90),
                        new Wardrobe(3, 2, 50),
                        new Carpet(4, 6, PaintColor.WHITE))
        );

    }
}