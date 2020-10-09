package edu.nps.moves.dis7.entities.egy.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@26b3fd41
 * Country: Egypt (EGY)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27493
 */
public class Auxiliary extends EntityType
{
    public Auxiliary()
    {
        setCountry(Country.EGYPT_EGY);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27493, Auxiliary
    }
}
