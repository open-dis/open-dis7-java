package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4beddc56;
 * Country: Poland (POL);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32570
 */
public class _263Hydrograf extends EntityType
{
    /** Default constructor */
    public _263Hydrograf()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)21); // uid 32567, Surveillance Ship
        setSubCategory((byte)1); // uid 32568, Nawigator Class (Modified Moma Project 863)
        setSpecific((byte)2); // uid 32570, 263 Hydrograf
    }
}
