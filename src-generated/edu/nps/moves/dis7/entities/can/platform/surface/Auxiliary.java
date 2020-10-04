package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@bd8db5a
 * Country: Canada (CAN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18784
 */
public class Auxiliary extends EntityType
{
    public Auxiliary()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18784, Auxiliary
    }
}
