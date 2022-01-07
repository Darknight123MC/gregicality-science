package gregicality.science.common.item;

import gregtech.api.items.metaitem.MetaItem;
import net.minecraftforge.oredict.OreDictionary;

import static gregtech.common.items.MetaItems.WOODEN_FORM_BRICK;

public class GCYSMetaItems {

    ////////////////////////////////////
    //            Circuits            //
    ////////////////////////////////////

    public static MetaItem<?>.MetaValueItem BIOWARE_PROCESSOR;
    public static MetaItem<?>.MetaValueItem BIOWARE_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem BIOWARE_COMPUTER;
    public static MetaItem<?>.MetaValueItem BIOWARE_MAINFRAME;

    public static MetaItem<?>.MetaValueItem OPTICAL_PROCESSOR;
    public static MetaItem<?>.MetaValueItem OPTICAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem OPTICAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem OPTICAL_MAINFRAME;

    public static MetaItem<?>.MetaValueItem EXOTIC_PROCESSOR;
    public static MetaItem<?>.MetaValueItem EXOTIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem EXOTIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem EXOTIC_MAINFRAME;

    public static MetaItem<?>.MetaValueItem COSMIC_PROCESSOR;
    public static MetaItem<?>.MetaValueItem COSMIC_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem COSMIC_COMPUTER;
    public static MetaItem<?>.MetaValueItem COSMIC_MAINFRAME;

    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_PROCESSOR;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_COMPUTER;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_MAINFRAME;

    ////////////////////////////////////
    //       Circuit Components       //
    ////////////////////////////////////

    // SMDs
    public static MetaItem<?>.MetaValueItem SMD_TRANSISTOR_BIOWARE;
    public static MetaItem<?>.MetaValueItem SMD_RESISTOR_BIOWARE;
    public static MetaItem<?>.MetaValueItem SMD_CAPACITOR_BIOWARE;
    public static MetaItem<?>.MetaValueItem SMD_DIODE_BIOWARE;

    public static MetaItem<?>.MetaValueItem SMD_TRANSISTOR_OPTICAL;
    public static MetaItem<?>.MetaValueItem SMD_RESISTOR_OPTICAL;
    public static MetaItem<?>.MetaValueItem SMD_CAPACITOR_OPTICAL;
    public static MetaItem<?>.MetaValueItem SMD_DIODE_OPTICAL;

    public static MetaItem<?>.MetaValueItem SMD_TRANSISTOR_EXOTIC;
    public static MetaItem<?>.MetaValueItem SMD_RESISTOR_EXOTIC;
    public static MetaItem<?>.MetaValueItem SMD_CAPACITOR_EXOTIC;
    public static MetaItem<?>.MetaValueItem SMD_DIODE_EXOTIC;

    public static MetaItem<?>.MetaValueItem SMD_TRANSISTOR_COSMIC;
    public static MetaItem<?>.MetaValueItem SMD_RESISTOR_COSMIC;
    public static MetaItem<?>.MetaValueItem SMD_CAPACITOR_COSMIC;
    public static MetaItem<?>.MetaValueItem SMD_DIODE_COSMIC;

    public static MetaItem<?>.MetaValueItem SMD_TRANSISTOR_SUPRACAUSAL;
    public static MetaItem<?>.MetaValueItem SMD_RESISTOR_SUPRACAUSAL;
    public static MetaItem<?>.MetaValueItem SMD_CAPACITOR_SUPRACAUSAL;
    public static MetaItem<?>.MetaValueItem SMD_DIODE_SUPRACAUSAL;

    // Wafers and Boules
    public static MetaItem<?>.MetaValueItem BOULE_DUBNIUM;
    public static MetaItem<?>.MetaValueItem BOULE_RUTHERFORDIUM;
    public static MetaItem<?>.MetaValueItem HASSIUM_BOULE;
    public static MetaItem<?>.MetaValueItem NDYAG_BOULE;
    public static MetaItem<?>.MetaValueItem PRHOYLF_BOULE;
    public static MetaItem<?>.MetaValueItem LUTMYVO_BOULE;
    public static MetaItem<?>.MetaValueItem PERIODICALLY_POLED_LITHIUM_NIOBATE_BOULE;

    public static MetaItem<?>.MetaValueItem WAFER_DUBNIUM;
    public static MetaItem<?>.MetaValueItem WAFER_RUTHERFORDIUM;
    public static MetaItem<?>.MetaValueItem HASSIUM_WAFER;
    public static MetaItem<?>.MetaValueItem COATED_HASSIUM_WAFER;
    public static MetaItem<?>.MetaValueItem PHOTOCOATED_HASSIUM_WAFER;
    public static MetaItem<?>.MetaValueItem NDYAG_ROD;
    public static MetaItem<?>.MetaValueItem PRHOYLF_ROD;
    public static MetaItem<?>.MetaValueItem LUTMYVO_ROD;
    public static MetaItem<?>.MetaValueItem ARAM_WAFER;
    public static MetaItem<?>.MetaValueItem HASOC_WAFER;
    public static MetaItem<?>.MetaValueItem UHASOC_WAFER;
    public static MetaItem<?>.MetaValueItem UHPIC_WAFER;
    public static MetaItem<?>.MetaValueItem OPTICAL_SOC_WAFER;
    public static MetaItem<?>.MetaValueItem UNTREATED_EXOTIC_WAFER;
    public static MetaItem<?>.MetaValueItem EXOTIC_WAFER;

    public static MetaItem<?>.MetaValueItem ARAM;
    public static MetaItem<?>.MetaValueItem HASOC;
    public static MetaItem<?>.MetaValueItem UHASOC;
    public static MetaItem<?>.MetaValueItem UHPIC;
    public static MetaItem<?>.MetaValueItem OPTICAL_SOC;
    public static MetaItem<?>.MetaValueItem EXOTIC_CHIP;

    // Circuit Boards
    public static MetaItem<?>.MetaValueItem KAPTON_BOARD;
    public static MetaItem<?>.MetaValueItem KAPTON_CIRCUIT_BOARD;

    // Circuit Cores
    public static MetaItem<?>.MetaValueItem NEURO_SUPPORT_UNIT;
    public static MetaItem<?>.MetaValueItem CYBER_PROCESSING_UNIT;
    public static MetaItem<?>.MetaValueItem OPTICAL_PROCESSING_CORE;
    public static MetaItem<?>.MetaValueItem EXOTIC_PROCESSING_CORE;
    public static MetaItem<?>.MetaValueItem COSMIC_PROCESSING_UNIT_CORE;
    public static MetaItem<?>.MetaValueItem COSMIC_PROCESSING_CORE;
    public static MetaItem<?>.MetaValueItem SUPRACAUSAL_PROCESSING_CORE;

    // Wetware/Bioware Process Items
    public static MetaItem<?>.MetaValueItem ULTRASONIC_HOMOGENIZER;
    public static MetaItem<?>.MetaValueItem STERILIZED_PETRI_DISH;
    public static MetaItem<?>.MetaValueItem CONTAMINATED_PETRI_DISH;
    public static MetaItem<?>.MetaValueItem ELECTRICALLY_WIRED_PETRI_DISH;
    public static MetaItem<?>.MetaValueItem CLEAN_CULTURE;
    public static MetaItem<?>.MetaValueItem PIEZOELECTRIC_CRYSTAL;

    public static MetaItem<?>.MetaValueItem SHEWANELLA_CULTURE;
    public static MetaItem<?>.MetaValueItem STREPTOCOCCUS_CULTURE;
    public static MetaItem<?>.MetaValueItem ESCHERICHIA_CULTURE;
    public static MetaItem<?>.MetaValueItem BIFIDOBACTERIUM_CULTURE;
    public static MetaItem<?>.MetaValueItem BREVIBACTERIUM_CULTURE;
    public static MetaItem<?>.MetaValueItem CUPRIVADUS_CULTURE;

    // Optical Process Items
    public static MetaItem<?>.MetaValueItem CLADDED_OPTICAL_FIBER_CORE;

    public static MetaItem<?>.MetaValueItem LOW_FREQUENCY_LASER;
    public static MetaItem<?>.MetaValueItem MEDIUM_FREQUENCY_LASER;
    public static MetaItem<?>.MetaValueItem HIGH_FREQUENCY_LASER;
    public static MetaItem<?>.MetaValueItem NON_LINEAR_OPTICAL_LENS;
    public static MetaItem<?>.MetaValueItem HIGHLY_REFLECTIVE_MIRROR;
    public static MetaItem<?>.MetaValueItem ROTATING_TRANSPARENT_SURFACE;
    public static MetaItem<?>.MetaValueItem ELECTRON_SOURCE;

    // Exotic Process Items
    public static MetaItem<?>.MetaValueItem FULLERENE_POLYMER_MATRIX_SOFT_TUBING;
    public static MetaItem<?>.MetaValueItem FULLERENE_POLYMER_MATRIX_FINE_TUBING;
    public static MetaItem<?>.MetaValueItem X_RAY_WAVEGUIDE;
    public static MetaItem<?>.MetaValueItem MICROFOCUS_X_RAY_TUBE;
    public static MetaItem<?>.MetaValueItem X_RAY_MIRROR_PLATE;
    public static MetaItem<?>.MetaValueItem EXCITATION_MAINTAINER;
    public static MetaItem<?>.MetaValueItem CRYOGENIC_INTERFACE;
    public static MetaItem<?>.MetaValueItem RYDBERG_SPINORIAL_ASSEMBLY;
    public static MetaItem<?>.MetaValueItem X_RAY_LASER;

    // Cosmic Process Items
    public static MetaItem<?>.MetaValueItem AEROGRAPHENE;
    public static MetaItem<?>.MetaValueItem SCINTILLATOR_CRYSTAL;
    public static MetaItem<?>.MetaValueItem SCINTILLATOR;
    public static MetaItem<?>.MetaValueItem LEPTON_TRAP_CRYSTAL;
    public static MetaItem<?>.MetaValueItem HASSIUM_SEED_CRYSTAL;
    public static MetaItem<?>.MetaValueItem GRATING_LITHOGRAPHY_MASK;
    public static MetaItem<?>.MetaValueItem DIFFRACTOR_GRATING_MIRROR;
    public static MetaItem<?>.MetaValueItem ULTRASHORT_PULSE_LASER;

    // Supracausal Process Items
    public static MetaItem<?>.MetaValueItem NEUTRONIUM_SPHERE;
    public static MetaItem<?>.MetaValueItem TRIPLET_NEUTRONIUM_SPHERE;
    public static MetaItem<?>.MetaValueItem CHARGED_TRIPLET_NEUTRONIUM_SPHERE;
    public static MetaItem<?>.MetaValueItem CONTAINED_REISSNER_NORDSTROM_SINGULARITY;
    public static MetaItem<?>.MetaValueItem CONTAINED_KERR_NEWMANN_SINGULARITY;
    public static MetaItem<?>.MetaValueItem CONTAINED_KERR_SINGULARITY;
    public static MetaItem<?>.MetaValueItem CONTAINED_HIGH_DENSITY_PROTONIC_MATTER;
    public static MetaItem<?>.MetaValueItem TIME_DILATION_CONTAINMENT_UNIT;
    public static MetaItem<?>.MetaValueItem MICROWORMHOLE_GENERATOR;
    public static MetaItem<?>.MetaValueItem MACROWORMHOLE_GENERATOR;
    public static MetaItem<?>.MetaValueItem STABILIZED_WORMHOLE_GENERATOR;
    public static MetaItem<?>.MetaValueItem CONTAINED_EXOTIC_MATTER;
    public static MetaItem<?>.MetaValueItem SEPARATION_ELECTROMAGNET;
    public static MetaItem<?>.MetaValueItem SPHERE_FIELD_SHAPE;

    public static MetaItem<?>.MetaValueItem TOPOLOGICAL_MANIPULATOR_UNIT;
    public static MetaItem<?>.MetaValueItem RELATIVISTIC_SPINORIAL_MEMORY_SYSTEM;
    public static MetaItem<?>.MetaValueItem GRAVITON_TRANSDUCER;
    public static MetaItem<?>.MetaValueItem NUCLEAR_CLOCK;
    public static MetaItem<?>.MetaValueItem MANIFOLD_OSCILLATORY_POWER_CELL;
    public static MetaItem<?>.MetaValueItem QCD_PROTECTIVE_PLATING;
    public static MetaItem<?>.MetaValueItem CTC_GUIDANCE_UNIT;
    public static MetaItem<?>.MetaValueItem CTC_COMPUTATIONAL_UNIT_CONTAINER;
    public static MetaItem<?>.MetaValueItem EIGENFOLDED_KERR_MANIFOLD;
    public static MetaItem<?>.MetaValueItem CTC_COMPUTATIONAL_UNIT;
    public static MetaItem<?>.MetaValueItem RECURSIVELY_FOLDED_NEGATIVE_SPACE;

    // Misc Circuit Components
    public static MetaItem<?>.MetaValueItem UNSTABLE_STAR;

    public static MetaItem<?>.MetaValueItem PLATE_FIELD_SHAPE;
    public static MetaItem<?>.MetaValueItem INGOT_FIELD_SHAPE;
    public static MetaItem<?>.MetaValueItem PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem RHENIUM_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem NEUTRON_PLASMA_CONTAINMENT_CELL;
    public static MetaItem<?>.MetaValueItem DEGENERATE_RHENIUM_PLATE;

    public static MetaItem<?>.MetaValueItem LASER_DIODE;
    public static MetaItem<?>.MetaValueItem LASER_COOLING_UNIT;
    public static MetaItem<?>.MetaValueItem MAGNETIC_TRAP;
    public static MetaItem<?>.MetaValueItem EMPTY_LASER_COOLING_CONTAINER;
    public static MetaItem<?>.MetaValueItem BOSE_EINSTEIN_COOLING_CONTAINER;

    public static MetaItem<?>.MetaValueItem WIRE_FIELD_SHAPE;
    public static MetaItem<?>.MetaValueItem EXTREMELY_DURABLE_PLASMA_CELL;
    public static MetaItem<?>.MetaValueItem DENSE_NEUTRON_PLASMA_CELL;
    public static MetaItem<?>.MetaValueItem COSMIC_NEUTRON_PLASMA_CELL;
    public static MetaItem<?>.MetaValueItem HIGHLY_DENSE_POLYMER_PLATE;
    public static MetaItem<?>.MetaValueItem COSMIC_MESH_CONTAINMENT_UNIT;
    public static MetaItem<?>.MetaValueItem COSMIC_FABRIC;
    public static MetaItem<?>.MetaValueItem COSMIC_MESH;
    public static MetaItem<?>.MetaValueItem ROD_FIELD_SHAPE;

    ///////////////////////////////////
    //           Batteries           //
    ///////////////////////////////////

    public static MetaItem<?>.MetaValueItem BATTERY_MEDIUM_LIS_EMPTY;
    public static MetaItem<?>.MetaValueItem BATTERY_LARGE_LIS_EMPTY;

    public static MetaItem<?>.MetaValueItem BATTERY_SMALL_FLUORIDE_EMPTY;
    public static MetaItem<?>.MetaValueItem BATTERY_MEDIUM_FLUORIDE_EMPTY;
    public static MetaItem<?>.MetaValueItem BATTERY_LARGE_FLUORIDE_EMPTY;

    public static MetaItem<?>.MetaValueItem BATTERY_MEDIUM_LIS;
    public static MetaItem<?>.MetaValueItem BATTERY_LARGE_LIS;

    public static MetaItem<?>.MetaValueItem BATTERY_SMALL_FLUORIDE;
    public static MetaItem<?>.MetaValueItem BATTERY_MEDIUM_FLUORIDE;
    public static MetaItem<?>.MetaValueItem BATTERY_LARGE_FLUORIDE;

    ////////////////////////////////////
    //         Misc MetaItems         //
    ////////////////////////////////////

    // Misc
    public static MetaItem<?>.MetaValueItem PYROLYTIC_CARBON;
    public static MetaItem<?>.MetaValueItem GRAPHENE_IRON_PLATE;
    public static MetaItem<?>.MetaValueItem MEMORY_FOAM_BLOCK;

    // Brine
    public static MetaItem<?>.MetaValueItem RAPIDLY_ROTATING_CRUCIBLE;
    public static MetaItem<?>.MetaValueItem HEAVY_METAL_ABSORBING_YARN;
    public static MetaItem<?>.MetaValueItem URANIUM_SATURATED_YARN;
    public static MetaItem<?>.MetaValueItem BORON_RETAINING_YARN;
    public static MetaItem<?>.MetaValueItem BORON_SATURATED_YARN;
    public static MetaItem<?>.MetaValueItem LITHIUM_SIEVE;
    public static MetaItem<?>.MetaValueItem LITHIUM_SATURATED_LITHIUM_SIEVE;
    public static MetaItem<?>.MetaValueItem ACRYLIC_YARN;

    // Nanotubes
    public static MetaItem<?>.MetaValueItem NANOTOME;

    // SuperconductorSMD
    public static MetaItem<?>.MetaValueItem ALUMINO_SILICATE_GLASS_TUBE;
//    public static MetaItem<?>.MetaValueItem INDUCTOR;
    public static MetaItem<?>.MetaValueItem BALLAST;
    public static MetaItem<?>.MetaValueItem UVA_LAMP_CORE;
    public static MetaItem<?>.MetaValueItem BLUE_LAMP_CORE;
    public static MetaItem<?>.MetaValueItem GREEN_LAMP_CORE;
    public static MetaItem<?>.MetaValueItem RED_LAMP_CORE;
    public static MetaItem<?>.MetaValueItem WHITE_LAMP_CORE;
    public static MetaItem<?>.MetaValueItem UVA_HALIDE_LAMP;
    public static MetaItem<?>.MetaValueItem BLUE_HALIDE_LAMP;
    public static MetaItem<?>.MetaValueItem GREEN_HALIDE_LAMP;
    public static MetaItem<?>.MetaValueItem RED_HALIDE_LAMP;
    public static MetaItem<?>.MetaValueItem WHITE_HALIDE_LAMP;
    public static MetaItem<?>.MetaValueItem ACTINIUM_PLASMA_CONTAINMENT_CELL;

    // Insulation Wire Assembly
    public static MetaItem<?>.MetaValueItem PEEK_POLYAMIDE_FOIL;
    public static MetaItem<?>.MetaValueItem HIGHLY_INSULATING_FOIL;
    public static MetaItem<?>.MetaValueItem INSULATION_WIRE_ASSEMBLY;

    // Batteries
    public static MetaItem<?>.MetaValueItem CHARGED_LEPTON_TRAP_CRYSTAL;
    public static MetaItem<?>.MetaValueItem NANOSILICON_CATHODE;

    public static void init() {
        GCYSMetaItem item = new GCYSMetaItem();
        item.setRegistryName("ga_meta_item");
    }

    public static void registerOreDict() {
        // Misc OreDictionary Additions
        OreDictionary.registerOre("formWood", WOODEN_FORM_BRICK.getStackForm());
        OreDictionary.registerOre("ingotPyroliticCarbon", PYROLYTIC_CARBON.getStackForm()); // for NC compatibility
    }
}