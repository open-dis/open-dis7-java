package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7196a8f1;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32383
 */
public class SS19StilletoMod4Stage2Booster extends EntityType
{
    /** Default constructor */
    public SS19StilletoMod4Stage2Booster()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)50); // uid 32379, SS-19 Stilleto Mod-4
        setSpecific((byte)4); // uid 32383, SS-19 Stilleto Mod-4 Stage 2 Booster
    }
}
