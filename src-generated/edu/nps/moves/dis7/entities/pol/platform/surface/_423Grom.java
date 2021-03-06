package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5649ec46;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23052
 */
public class _423Grom extends EntityType
{
    /** Default constructor */
    public _423Grom()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 23045, Frigate (including Corvette)
        setSubCategory((byte)2); // uid 23049, Orkan (Sassnitz) Class
        setSpecific((byte)3); // uid 23052, 423 Grom
    }
}
