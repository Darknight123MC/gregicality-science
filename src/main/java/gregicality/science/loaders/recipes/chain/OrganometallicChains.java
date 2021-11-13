package gregicality.science.loaders.recipes.chain;

import static gregicality.science.api.GAMaterials.*;
import static gregtech.api.recipes.RecipeMaps.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.dust;


public class OrganometallicChains{
    public static void init(){

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(8000) //2CH4O -> CH3OCH3 + H2O
                .fluidInputs(Methanol.getFluid(2000))
                .notConsumable(dust, Alumina)
                .notConsumable(dust, SiliconDioxide)
                .fluidOutputs(Dimethylether.getFluid(1000))
                .fluidOutputs(Water.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(2000) //CH3OCH3 + C2H4O -> C4H10O2
                .fluidInputs(Dimethylether.getFluid(1000))
                .fluidInputs(EthyleneOxide.getFluid(1000))
                .fluidOutputs(Dimethoxyethane.getFluid(1000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(2000) //C5H6 + LiC4H9 -> LiC5H5 + C4H10
                .fluidInputs(Cyclopentadiene.getFluid(1000))
                .fluidInputs(Dimethoxyethane.getFluid(1000))
                .fluidInputs(ButylLithium.getFluid(1000))
                .fluidOutputs(Butane.getFluid(1000))
                .fluidOutputs(LithiumCyclopentadienide.getFluid(1000))
                .buildAndRegister();

        //BLAST_RECIPES.recipeBuilder().duration(1800).EUt(120) //2H + 2CfO2 -> Cf2O3 + H2O
        //        .blastFurnaceTemp(2500)
        //        .fluidInputs(Hydrogen.getFluid(2000))
//                .input(Californium, GAEnums.gregicadditions.materials.GAOrePrefix.dioxide, 6) todo nuclear rework
        //        .output(dust, CaliforniumTrioxide, 5)
        //        .fluidOutputs(Water.getFluid(1000))
        //        .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(240).EUt(2000) //6HCl + Cf2O3 -> 2CfCl3 + 3H2O
                .fluidInputs(HydrochloricAcid.getFluid(6000))
                .input(dust, CaliforniumTrioxide, 5)
                .output(dust, CaliforniumTrichloride, 8)
                .fluidOutputs(Water.getFluid(3000))
                .buildAndRegister();

        CHEMICAL_RECIPES.recipeBuilder().duration(160).EUt(200000) //3LiC5H5 + CfCl3 -> CfC15H15 + 3LiCf
                .fluidInputs(LithiumCyclopentadienide.getFluid(3000))
                .input(dust, CaliforniumTrichloride, 4)
                .output(dust, LithiumChloride, 6)
                .fluidOutputs(CaliforniumCyclopentadienide.getFluid(1000))
                .buildAndRegister();

    }
}