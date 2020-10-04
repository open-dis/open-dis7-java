package edu.nps.moves.dis7.entities.ukr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2eeb0f9b
 * Country: Ukraine (UKR)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27851
 */
public class U206Vinnytsia extends EntityType
{
    public U206Vinnytsia()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27845, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 27849, Grisha V Class
        setSpecific((byte)2); // uid 27851, U-206 Vinnytsia
    }
}
