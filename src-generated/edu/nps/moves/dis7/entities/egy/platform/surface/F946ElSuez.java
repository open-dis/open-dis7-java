package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4e08711f;
 * Country: Egypt (EGY);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23130
 */
public class F946ElSuez extends EntityType
{
    /** Default constructor */
    public F946ElSuez()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18799, Guided Missile Frigates
        setSubCategory((byte)1); // uid 18800, Descubierta Class (FFG)
        setSpecific((byte)2); // uid 23130, F946 El Suez
    }
}
