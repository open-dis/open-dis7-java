package edu.nps.moves.dis7.entities.aus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6956de9
 * Country: Australia (AUS)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 29313
 */
public class F35JointStrikeFighterJSF extends EntityType
{
    public F35JointStrikeFighterJSF()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 29312, Fighter/Air Defense
        setSubCategory((byte)2); // uid 29313, F-35 Joint Strike Fighter (JSF)
    }
}
