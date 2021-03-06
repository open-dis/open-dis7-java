package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@302552ec;
 * Country: Egypt (EGY);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 23129
 */
public class _956ElNasser extends EntityType
{
    /** Default constructor */
    public _956ElNasser()
    {
        setCountry(Country.COMMENT_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18799, Guided Missile Frigates
        setSubCategory((byte)2); // uid 18802, Jianghu I Class (FFG)
        setSpecific((byte)2); // uid 23129, 956 El Nasser
    }
}
