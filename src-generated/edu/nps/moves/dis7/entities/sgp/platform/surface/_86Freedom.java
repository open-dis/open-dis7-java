package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@574cd322;
 * Country: Singapore (SGP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32107
 */
public class _86Freedom extends EntityType
{
    /** Default constructor */
    public _86Freedom()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 32101, Light/Patrol Craft
        setSubCategory((byte)1); // uid 32102, Fearless Class
        setSpecific((byte)5); // uid 32107, 86 Freedom
    }
}
