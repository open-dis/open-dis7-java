package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@8deb645;
 * Country: Singapore (SGP);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27901
 */
public class _90Vigilance extends EntityType
{
    /** Default constructor */
    public _90Vigilance()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27897, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 27898, Victory Class
        setSpecific((byte)3); // uid 27901, 90 Vigilance
    }
}
