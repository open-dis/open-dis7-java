package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@36061cf3;
 * Country: Saudi Arabia (SAU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 17882
 */
public class _422Shaqra extends EntityType
{
    /** Default constructor */
    public _422Shaqra()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17879, Mine Countermeasure/Ship Craft
        setSubCategory((byte)1); // uid 17880, Sandown Class (minehunters-coastal)
        setSpecific((byte)2); // uid 17882, 422 Shaqra
    }
}
