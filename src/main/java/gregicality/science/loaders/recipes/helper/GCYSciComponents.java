package gregicality.science.loaders.recipes.helper;

import com.google.common.collect.ImmutableMap;
import gregicality.science.common.block.GCYSciMetaBlocks;
import gregicality.science.common.item.GCYSciMetaItems;
import gregicality.science.common.block.GATransparentCasing;
import gregtech.api.GTValues;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.loaders.recipe.CraftingComponent;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static gregicality.science.api.GCYSciMaterials.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class GCYSciComponents {

    public static CraftingComponent.Component GEAR;
    public static CraftingComponent.Component CABLE_DOUBLE;
    public static CraftingComponent.Component PLATE_DENSE;

    public static void register() {
        CraftingComponent.PUMP.appendIngredients(ImmutableMap.of(
                9, GCYSciMetaItems.ELECTRIC_PUMP_UHV,
                10, GCYSciMetaItems.ELECTRIC_PUMP_UEV,
                11, GCYSciMetaItems.ELECTRIC_PUMP_UIV,
                12, GCYSciMetaItems.ELECTRIC_PUMP_UMV,
                13, GCYSciMetaItems.ELECTRIC_PUMP_UXV));
        CraftingComponent.PUMP.appendIngredients(ImmutableMap.of(14, GCYSciMetaItems.ELECTRIC_PUMP_MAX));

        CraftingComponent.CABLE.appendIngredients(ImmutableMap.of(
                9, new UnificationEntry(cableGtSingle, AbyssalAlloy),
                10, new UnificationEntry(cableGtSingle, TitanSteel),
                11, new UnificationEntry(cableGtSingle, BlackTitanium),
                12, new UnificationEntry(cableGtSingle, Neutronium),
                13, new UnificationEntry(cableGtSingle, Neutronium)));
        CraftingComponent.CABLE.appendIngredients(ImmutableMap.of(14, new UnificationEntry(wireGtQuadruple, MarkerMaterials.Tier.Super)));

        // TODO Wire

        CraftingComponent.CABLE_QUAD.appendIngredients(ImmutableMap.of(
                9, new UnificationEntry(cableGtQuadruple, AbyssalAlloy),
                10, new UnificationEntry(cableGtQuadruple, TitanSteel),
                11, new UnificationEntry(cableGtQuadruple, BlackTitanium),
                12, new UnificationEntry(cableGtQuadruple, Neutronium),
                13, new UnificationEntry(cableGtQuadruple, Neutronium)));
        CraftingComponent.CABLE_QUAD.appendIngredients(ImmutableMap.of(14, new UnificationEntry(wireGtQuadruple, MarkerMaterials.Tier.Super)));

        CraftingComponent.PIPE_NORMAL.appendIngredients(ImmutableMap.of(
                6, new UnificationEntry(pipeNormalFluid, Enderium),
                7, new UnificationEntry(pipeNormalFluid, Naquadah),
                8, new UnificationEntry(pipeNormalFluid, Ultimet),
                9, new UnificationEntry(pipeNormalFluid, Zeron100),
                10, new UnificationEntry(pipeNormalFluid, Lafium)));
        CraftingComponent.PIPE_NORMAL.appendIngredients(ImmutableMap.of(GTValues.FALLBACK, new UnificationEntry(pipeNormalFluid, Neutronium)));

        // TODO Pipe Large

        CraftingComponent.GLASS.appendIngredients(ImmutableMap.of(
                0, new ItemStack(Blocks.GLASS, 1, GTValues.W),
                1, new ItemStack(Blocks.GLASS, 1, GTValues.W),
                2, GCYSciMetaBlocks.TRANSPARENT_CASING.getItemVariant(GATransparentCasing.CasingType.REINFORCED_GLASS),
                3, GCYSciMetaBlocks.TRANSPARENT_CASING.getItemVariant(GATransparentCasing.CasingType.BOROSILICATE_GLASS),
                4, GCYSciMetaBlocks.TRANSPARENT_CASING.getItemVariant(GATransparentCasing.CasingType.NICKEL_GLASS)));
        CraftingComponent.GLASS.appendIngredients(ImmutableMap.of(
                5, GCYSciMetaBlocks.TRANSPARENT_CASING.getItemVariant(GATransparentCasing.CasingType.CHROME_GLASS),
                6, GCYSciMetaBlocks.TRANSPARENT_CASING.getItemVariant(GATransparentCasing.CasingType.TUNGSTEN_GLASS),
                7, GCYSciMetaBlocks.TRANSPARENT_CASING.getItemVariant(GATransparentCasing.CasingType.IRIDIUM_GLASS),
                GTValues.FALLBACK, GCYSciMetaBlocks.TRANSPARENT_CASING.getItemVariant(GATransparentCasing.CasingType.OSMIRIDIUM_GLASS)));

        CraftingComponent.PLATE.appendIngredients(ImmutableMap.of(
                6, new UnificationEntry(plate, RhodiumPlatedPalladium),
                7, new UnificationEntry(plate, HSSS),
                8, new UnificationEntry(plate, Tritanium),
                9, new UnificationEntry(plate, Seaborgium),
                10, new UnificationEntry(plate, Bohrium)));
        CraftingComponent.PLATE.appendIngredients(ImmutableMap.of(
                11, new UnificationEntry(plate, Quantum),
                GTValues.FALLBACK, new UnificationEntry(plate, Neutronium)));

        CraftingComponent.MOTOR.appendIngredients(ImmutableMap.of(
                9, GCYSciMetaItems.ELECTRIC_MOTOR_UHV,
                10, GCYSciMetaItems.ELECTRIC_MOTOR_UEV,
                11, GCYSciMetaItems.ELECTRIC_MOTOR_UIV,
                12, GCYSciMetaItems.ELECTRIC_MOTOR_UMV,
                13, GCYSciMetaItems.ELECTRIC_MOTOR_UXV));
        CraftingComponent.MOTOR.appendIngredients(ImmutableMap.of(14, GCYSciMetaItems.ELECTRIC_MOTOR_MAX));

        CraftingComponent.ROTOR.appendIngredients(ImmutableMap.of(
                9, new UnificationEntry(rotor, Ruridit),
                GTValues.FALLBACK, new UnificationEntry(rotor, Neutronium)));

        CraftingComponent.SENSOR.appendIngredients(ImmutableMap.of(
                9, GCYSciMetaItems.SENSOR_UHV,
                10, GCYSciMetaItems.SENSOR_UEV,
                11, GCYSciMetaItems.SENSOR_UIV,
                12, GCYSciMetaItems.SENSOR_UMV,
                13, GCYSciMetaItems.SENSOR_UXV));
        CraftingComponent.SENSOR.appendIngredients(ImmutableMap.of(14, GCYSciMetaItems.SENSOR_MAX));

        // Grinder, no changes needed yet

        // Diamond, no changes needed yet

        CraftingComponent.PISTON.appendIngredients(ImmutableMap.of(
                9, GCYSciMetaItems.ELECTRIC_PISTON_UHV,
                10, GCYSciMetaItems.ELECTRIC_PISTON_UEV,
                11, GCYSciMetaItems.ELECTRIC_PISTON_UIV,
                12, GCYSciMetaItems.ELECTRIC_PISTON_UMV,
                13, GCYSciMetaItems.ELECTRIC_PISTON_UXV));
        CraftingComponent.PISTON.appendIngredients(ImmutableMap.of(14, GCYSciMetaItems.ELECTRIC_PISTON_MAX));

        CraftingComponent.EMITTER.appendIngredients(ImmutableMap.of(
                9, GCYSciMetaItems.EMITTER_UHV,
                10, GCYSciMetaItems.EMITTER_UEV,
                11, GCYSciMetaItems.EMITTER_UIV,
                12, GCYSciMetaItems.EMITTER_UMV,
                13, GCYSciMetaItems.EMITTER_UXV));
        CraftingComponent.EMITTER.appendIngredients(ImmutableMap.of(14, GCYSciMetaItems.EMITTER_MAX));

        CraftingComponent.CONVEYOR.appendIngredients(ImmutableMap.of(
                9, GCYSciMetaItems.CONVEYOR_MODULE_UHV,
                10, GCYSciMetaItems.CONVEYOR_MODULE_UEV,
                11, GCYSciMetaItems.CONVEYOR_MODULE_UIV,
                12, GCYSciMetaItems.CONVEYOR_MODULE_UMV,
                13, GCYSciMetaItems.CONVEYOR_MODULE_UXV));
        CraftingComponent.CONVEYOR.appendIngredients(ImmutableMap.of(14, GCYSciMetaItems.CONVEYOR_MODULE_MAX));

        CraftingComponent.ROBOT_ARM.appendIngredients(ImmutableMap.of(
                9, GCYSciMetaItems.ROBOT_ARM_UHV,
                10, GCYSciMetaItems.ROBOT_ARM_UEV,
                11, GCYSciMetaItems.ROBOT_ARM_UIV,
                12, GCYSciMetaItems.ROBOT_ARM_UMV,
                13, GCYSciMetaItems.ROBOT_ARM_UXV));
        CraftingComponent.ROBOT_ARM.appendIngredients(ImmutableMap.of(
                14, GCYSciMetaItems.ROBOT_ARM_MAX
        ));

        CraftingComponent.COIL_HEATING.appendIngredients(ImmutableMap.of(
                GTValues.FALLBACK, new UnificationEntry(wireGtDouble, EnrichedNaquadahAlloy)
        ));

        CraftingComponent.COIL_HEATING_DOUBLE.appendIngredients(ImmutableMap.of(
                GTValues.FALLBACK, new UnificationEntry(wireGtQuadruple, EnrichedNaquadahAlloy)
        ));

        CraftingComponent.COIL_ELECTRIC.appendIngredients(ImmutableMap.<Integer, Object>builder()
                .put(1, new UnificationEntry(wireGtDouble, Copper))
                .put(2, new UnificationEntry(wireGtQuadruple, Cupronickel))
                .put(3, new UnificationEntry(wireGtQuadruple, Electrum))
                .put(4, new UnificationEntry(wireGtQuadruple, AnnealedCopper))
                .put(5, new UnificationEntry(wireGtQuadruple, Graphene))
                .put(6, new UnificationEntry(wireGtQuadruple, NiobiumTitanium))
                .put(7, new UnificationEntry(wireGtQuadruple, VanadiumGallium))
                .put(8, new UnificationEntry(wireGtOctal, VanadiumGallium)) // set this to override CEu's entry
                .put(GTValues.FALLBACK, new UnificationEntry(wireGtOctal, VanadiumGallium))
                .build()
        );

        // Stick Magnetic, no changes needed yet

        // Stick Distillation, no changes needed yet

        CraftingComponent.FIELD_GENERATOR.appendIngredients(ImmutableMap.<Integer, Object>builder()
                .put(9, GCYSciMetaItems.FIELD_GENERATOR_UHV)
                .put(10, GCYSciMetaItems.FIELD_GENERATOR_UEV)
                .put(11, GCYSciMetaItems.FIELD_GENERATOR_UIV)
                .put(12, GCYSciMetaItems.FIELD_GENERATOR_UMV)
                .put(13, GCYSciMetaItems.FIELD_GENERATOR_UXV)
                .put(14, GCYSciMetaItems.FIELD_GENERATOR_MAX)
                .build()
        );

        // Stick Electromagnetic, no changes needed yet

        CraftingComponent.STICK_RADIOACTIVE.appendIngredients(ImmutableMap.of(
                2, new UnificationEntry(stick, Uranium235),
                3, new UnificationEntry(stick, Plutonium241),
                4, new UnificationEntry(stick, Curium247),
                5, new UnificationEntry(stick, Californium253),
                6, new UnificationEntry(stick, Fermium259)));
        CraftingComponent.STICK_RADIOACTIVE.appendIngredients(ImmutableMap.of(
                7, new UnificationEntry(stick, Naquadria),
                GTValues.FALLBACK, new UnificationEntry(stick, Tritanium)));

        // TODO Pipe Reactor

        // TODO Hermetic Casings?

        // New Components
        GEAR = new CraftingComponent.Component(Stream.of(new Object[][]{

                {0, new UnificationEntry(gear, Steel)},
                {1, new UnificationEntry(gear, Steel)},
                {2, new UnificationEntry(gear, Aluminium)},
                {3, new UnificationEntry(gear, StainlessSteel)},
                {4, new UnificationEntry(gear, Titanium)},
                {5, new UnificationEntry(gear, TungstenSteel)},
                {6, new UnificationEntry(gear, RhodiumPlatedPalladium)},
                {7, new UnificationEntry(gear, HSSS)},
                {8, new UnificationEntry(gear, Tritanium)},
                {9, new UnificationEntry(gear, Seaborgium)},
                {10, new UnificationEntry(gear, Bohrium)},
                {11, new UnificationEntry(gear, Quantum)},
                {GTValues.FALLBACK, new UnificationEntry(gear, Neutronium)},

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        PLATE_DENSE = new CraftingComponent.Component(Stream.of(new Object[][]{

                {0, new UnificationEntry(plateDense, Steel)},
                {1, new UnificationEntry(plateDense, Steel)},
                {2, new UnificationEntry(plateDense, Aluminium)},
                {3, new UnificationEntry(plateDense, StainlessSteel)},
                {4, new UnificationEntry(plateDense, Titanium)},
                {5, new UnificationEntry(plateDense, TungstenSteel)},
                {6, new UnificationEntry(plateDense, RhodiumPlatedPalladium)},
                {7, new UnificationEntry(plateDense, HSSS)},
                {8, new UnificationEntry(plateDense, Tritanium)},
                {9, new UnificationEntry(plateDense, Seaborgium)},
                {10, new UnificationEntry(plateDense, Bohrium)},
                {11, new UnificationEntry(plateDense, Quantum)},
                {GTValues.FALLBACK, new UnificationEntry(plateDense, Neutronium)},

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

        CABLE_DOUBLE = new CraftingComponent.Component(Stream.of(new Object[][]{

                {0, new UnificationEntry(cableGtDouble, Lead)},
                {1, new UnificationEntry(cableGtDouble, Tin)},
                {2, new UnificationEntry(cableGtDouble, Copper)},
                {3, new UnificationEntry(cableGtDouble, Gold)},
                {4, new UnificationEntry(cableGtDouble, Aluminium)},
                {5, new UnificationEntry(cableGtDouble, Platinum)},
                {6, new UnificationEntry(cableGtDouble, NiobiumTitanium)},
                {7, new UnificationEntry(cableGtDouble, Naquadah)},
                {8, new UnificationEntry(cableGtDouble, NaquadahAlloy)},
                {9, new UnificationEntry(cableGtDouble, AbyssalAlloy)},
                {10, new UnificationEntry(cableGtDouble, TitanSteel)},
                {11, new UnificationEntry(cableGtDouble, BlackTitanium)},
                {12, new UnificationEntry(cableGtDouble, Neutronium)},
                {13, new UnificationEntry(cableGtDouble, Neutronium)},
                {14, new UnificationEntry(cableGtDouble, MarkerMaterials.Tier.Super)}

        }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));
    }
}