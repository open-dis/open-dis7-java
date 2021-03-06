package edu.nps.moves.dis7.entities.mys.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@388ffbc2;
 * Country: Malaysia (MYS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27401
 */
public class F25Kasturi extends EntityType
{
    /** Default constructor */
    public F25Kasturi()
    {
        setCountry(Country.MALAYSIA_MYS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27399, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27400, Kasturi Class
        setSpecific((byte)1); // uid 27401, F25 Kasturi
    }
}
