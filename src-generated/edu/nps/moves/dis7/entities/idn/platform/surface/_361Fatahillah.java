package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@331acdad;
 * Country: Indonesia (IDN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27395
 */
public class _361Fatahillah extends EntityType
{
    /** Default constructor */
    public _361Fatahillah()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27393, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27394, Fatahillah Class
        setSpecific((byte)1); // uid 27395, 361 Fatahillah
    }
}
