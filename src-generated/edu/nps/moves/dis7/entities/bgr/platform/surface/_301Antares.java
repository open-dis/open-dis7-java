package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@402a079c;
 * Country: Bulgaria (BGR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27892
 */
public class _301Antares extends EntityType
{
    /** Default constructor */
    public _301Antares()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 27889, Tank Landing Ship
        setSubCategory((byte)1); // uid 27890, Polnochny Class
        setSpecific((byte)2); // uid 27892, 301 Antares
    }
}
