package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ea75b05;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 19960
 */
public class WCMDwithCombinedEffectsMunitionBLU97B extends EntityType
{
    /** Default constructor */
    public WCMDwithCombinedEffectsMunitionBLU97B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 19887, Guided
        setSubCategory((byte)22); // uid 19958, Wind-Corrected Munitions Dispenser (WCMD)
        setSpecific((byte)2); // uid 19960, WCMD with Combined Effects Munition (BLU-97/B)
    }
}
