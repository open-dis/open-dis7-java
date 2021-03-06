package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d28bcd5;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23047
 */
public class _436Metalowiec extends EntityType
{
    /** Default constructor */
    public _436Metalowiec()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 23045, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 23046, Gornik (Tarantul I) Class
        setSpecific((byte)1); // uid 23047, 436 Metalowiec
    }
}
