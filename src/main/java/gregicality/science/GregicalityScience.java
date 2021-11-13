package gregicality.science;

import gregicality.science.api.capabilities.GregicalityCapabilities;
import gregicality.science.common.CommonProxy;
import gregicality.science.common.GAConfig;
import gregicality.science.api.covers.CoverBehaviors;
import gregicality.science.common.item.GAMetaBlocks;
import gregicality.science.common.GAMetaTileEntities;
import gregicality.science.integrations.theoneprobe.TheOneProbeCompatibility;
import gregicality.science.api.GALog;
import gregtech.api.GTValues;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

import java.io.IOException;

@Mod(   modid        = GregicalityScience.MODID,
        name         = GregicalityScience.NAME,
        version      = GregicalityScience.VERSION,
        dependencies = "required-after:gregtech@[2.0,);required-after:gcym")
public class GregicalityScience {

    public static final String MODID = "gcys";
    public static final String NAME = "Gregicality: Science";
    public static final String VERSION = "@VERSION@";

    @SidedProxy(modId = MODID, clientSide = "gregicality.science.common.ClientProxy", serverSide = "gregicality.science.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void onConstruction(FMLConstructionEvent event) {
        GAEnums.onConstruction();
        GAConfig.syncMachineConfigs();
        GTValues.HT = true; // force GTCEu to register UHV+ Hulls, Casings, Basic Electric Pieces like Transformers, Bat Buffers, etc.
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        GALog.init(event.getModLog());
        proxy.preLoad();
        GregicalityCapabilities.init();
        MinecraftForge.EVENT_BUS.register(new GAEventHandler());

        GAMetaBlocks.init();
        GAMetaTileEntities.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) throws IOException {
        proxy.onLoad();
        if (GTValues.isModLoaded(GTValues.MODID_TOP)) {
            GALog.logger.info("TheOneProbe found. Enabling integration...");
            TheOneProbeCompatibility.registerCompatibility();
        }
        CoverBehaviors.init();
    }
}