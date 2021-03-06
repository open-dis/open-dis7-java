package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@718dbd79;
 * Country: Saudi Arabia (SAU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17883
 */
public class _424AlKharj extends EntityType
{
    /** Default constructor */
    public _424AlKharj()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17879, Mine Countermeasure/Ship Craft
        setSubCategory((byte)1); // uid 17880, Sandown Class (minehunters-coastal)
        setSpecific((byte)3); // uid 17883, 424 Al Kharj
    }
}
