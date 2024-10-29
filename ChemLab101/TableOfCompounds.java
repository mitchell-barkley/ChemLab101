package ChemLab101.ChemLab101;
public class TableOfCompounds {
    private Compounds[] compounds;

    public TableOfCompounds() {
        compounds = new Compounds[31];
        compounds[0] = new Compounds("Water", "H2O", 18.01528, "Inorganic", "Water is a transparent, tasteless, odorless, and nearly colorless chemical substance, which is the main constituent of Earth's streams, lakes, and oceans, and the fluids of most living organisms.");
        compounds[1] = new Compounds("Carbon Dioxide", "CO2", 44.0095, "Inorganic", "Carbon dioxide is a colorless gas with a density about 60% higher than that of dry air. Carbon dioxide consists of a carbon atom covalently double bonded to two oxygen atoms.");
        compounds[2] = new Compounds("Glucose", "C6H12O6", 180.156, "Organic", "Glucose is a simple sugar with the molecular formula C6H12O6. Glucose is the most abundant monosaccharide, a subcategory of carbohydrates.");
        compounds[3] = new Compounds("Sucrose", "C12H22O11", 342.29648, "Organic", "Sucrose is common sugar. It is a disaccharide, a molecule composed of two monosaccharides: glucose and fructose.");
        compounds[4] = new Compounds("Methane", "CH4", 16.04, "Inorganic", "Methane is a chemical compound with the chemical formula CH4. It is a group-14 hydride and the simplest alkane, and is the main constituent of natural gas.");
        compounds[5] = new Compounds("Ethanol", "C2H5OH", 46.06844, "Organic", "Ethanol is a chemical compound, a simple alcohol with the chemical formula C2H5OH. Ethanol is a volatile, flammable, colorless liquid with a slight characteristic odor.");
        compounds[6] = new Compounds("Acetic Acid", "CH3COOH", 60.052, "Organic", "Acetic acid, systematically named ethanoic acid, is a colorless liquid organic compound with the chemical formula CH3COOH. It is classified as a weak acid.");
        compounds[7] = new Compounds("Ammonia", "NH3", 17.031, "Inorganic", "Ammonia is a compound of nitrogen and hydrogen with the formula NH3. A stable binary hydride, and the simplest pnictogen hydride, ammonia is a colourless gas with a characteristic pungent smell.");
        compounds[8] = new Compounds("Hydrochloric Acid", "HCl", 36.461, "Inorganic", "Hydrochloric acid or muriatic acid is a colorless inorganic chemical system with the formula HCl. Hydrochloric acid has a distinctive pungent smell.");
        compounds[9] = new Compounds("Sodium Chloride", "NaCl", 58.44, "Inorganic", "Sodium chloride, commonly known as salt, is an ionic compound with the chemical formula NaCl, representing a 1:1 ratio of sodium and chloride ions.");
        compounds[10] = new Compounds("Calcium Carbonate", "CaCO3", 100.0869, "Inorganic", "Calcium carbonate is a chemical compound with the formula CaCO3. It is a common substance found in rocks as the minerals calcite and aragonite.");
        compounds[11] = new Compounds("Sodium Bicarbonate", "NaHCO3", 84.0066, "Inorganic", "Sodium bicarbonate, commonly known as baking soda, is a chemical compound with the formula NaHCO3. It is a salt composed of a sodium cation and a bicarbonate anion.");
        compounds[12] = new Compounds("Potassium Chloride", "KCl", 74.5513, "Inorganic", "Potassium chloride is a metal halide salt composed of potassium and chlorine. It is odorless and has a white or colorless vitreous crystal appearance.");
        compounds[13] = new Compounds("Calcium Hydroxide", "Ca(OH)2", 74.093, "Inorganic", "Calcium hydroxide, traditionally called slaked lime, is an inorganic compound with the chemical formula Ca(OH)2. It is a colorless crystal or white powder and is obtained when calcium oxide is mixed, or slaked with water.");
        compounds[14] = new Compounds("Sodium Hydroxide", "NaOH", 40.00, "Inorganic", "Sodium hydroxide, also known as lye and caustic soda, is an inorganic compound with the formula NaOH. It is a white solid ionic compound consisting of sodium cations Na+ and hydroxide anions OH−.");
        compounds[15] = new Compounds("Potassium Hydroxide", "KOH", 56.1056, "Inorganic", "Potassium hydroxide is an inorganic compound with the formula KOH, commonly called caustic potash. Along with sodium hydroxide, this colorless solid is a prototypical strong base.");
        compounds[16] = new Compounds("Sulfuric Acid", "H2SO4", 98.079, "Inorganic", "Sulfuric acid, H2SO4, is a strong mineral acid. It is soluble in water at all concentrations. It was once known as oil of vitriol, and has an oily consistency when concentrated.");
        compounds[17] = new Compounds("Nitric Acid", "HNO3", 63.012, "Inorganic", "Nitric acid, HNO3, is a colorless liquid that is highly corrosive and toxic. It is a strong mineral acid that is soluble in water at all concentrations.");
        compounds[18] = new Compounds("Phosphoric Acid", "H3PO4", 97.994, "Inorganic", "Phosphoric acid, also known as orthophosphoric acid or phosphoric(V) acid, is a weak acid with the chemical formula H3PO4. It is normally encountered as a colorless syrup of 85% concentration in water.");
        compounds[19] = new Compounds("Sodium Carbonate", "Na2CO3", 105.9888, "Inorganic", "Sodium carbonate, Na2CO3, is the water-soluble sodium salt of carbonic acid. It most commonly occurs as a crystalline decahydrate, which readily effloresces to form a white powder, the monohydrate.");
        compounds[20] = new Compounds("Potassium Carbonate", "K2CO3", 138.205, "Inorganic", "Potassium carbonate is the inorganic compound with the formula K2CO3. It is a white salt, which is soluble in water. It is deliquescent, often appearing as a damp or wet solid.");
        compounds[21] = new Compounds("Sodium Sulfate", "Na2SO4", 142.0421, "Inorganic", "Sodium sulfate, also known as sulfate of soda, is the inorganic compound with formula Na2SO4 as well as several related hydrates. All forms are white solids that are highly soluble in water.");
        compounds[22] = new Compounds("Potassium Sulfate", "K2SO4", 174.259, "Inorganic", "Potassium sulfate is a non-flammable white crystalline salt which is soluble in water. The chemical compound is commonly used in fertilizers, providing both potassium and sulfur.");
        compounds[23] = new Compounds("Sodium Nitrate", "NaNO3", 84.9947, "Inorganic", "Sodium nitrate is the chemical compound with the formula NaNO3. This alkali metal nitrate salt is also known as Chile saltpeter to distinguish it from ordinary saltpeter, potassium nitrate.");
        compounds[24] = new Compounds("Potassium Nitrate", "KNO3", 101.1032, "Inorganic", "Potassium nitrate is a chemical compound with the chemical formula KNO3. It is an ionic salt of potassium ions K+ and nitrate ions NO3−, and is therefore an alkali metal nitrate.");
        compounds[25] = new Compounds("Sodium Phosphate", "Na3PO4", 163.9407, "Inorganic", "Sodium phosphate is a generic term that may refer to any sodium salt of phosphoric acid. They are a class of phosphates that have the sodium cation.");
        compounds[26] = new Compounds("Potassium Phosphate", "K3PO4", 212.27, "Inorganic", "Potassium phosphate is a generic term for the salts of potassium and phosphate ions including: Monopotassium phosphate (KH2PO4) (Molar mass approx: 136 g/mol) Dipotassium phosphate (K2HPO4) (Molar mass approx: 174 g/mol) Tripotassium phosphate (K3PO4) (Molar mass approx: 212 g/mol)");
        compounds[27] = new Compounds("Sodium Hydrogen Carbonate", "NaHCO3", 84.0066, "Inorganic", "Sodium bicarbonate, commonly known as baking soda, is a chemical compound with the formula NaHCO3. It is a salt composed of a sodium cation and a bicarbonate anion.");
        compounds[28] = new Compounds("Potassium Hydrogen Carbonate", "KHCO3", 100.115, "Inorganic", "Potassium bicarbonate (also known as potassium hydrogen carbonate or potassium acid carbonate) is a colorless, odorless, slightly basic, salty substance.");
        compounds[29] = new Compounds("Sodium Hypochlorite", "NaClO", 74.44, "Inorganic", "Sodium hypochlorite is a chemical compound with the formula NaClO. It is composed of a sodium cation and a hypochlorite anion; it may also be viewed as the sodium salt of hypochlorous acid.");
        compounds[30] = new Compounds("Potassium Hypochlorite", "KClO", 90.55, "Inorganic", "Potassium hypochlorite is the inorganic compound with the formula KClO. This colorless solid is related to potassium chlorate, and it is a strong oxidizing agent.");
    }

    public Compounds[] getCompounds() {
        return compounds;
    }

    public void setCompounds(Compounds[] compounds) {
        this.compounds = compounds;
    }

    public void displayCompounds() {
        for (int i = 0; i < compounds.length; i++) {
            System.out.println(compounds[i].toString());
            System.out.println();
        }
    }
}
