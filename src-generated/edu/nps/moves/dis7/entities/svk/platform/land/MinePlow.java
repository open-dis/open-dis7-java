package edu.nps.moves.dis7.entities.svk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6a4ccef7;
 * Country: Slovakia (SVK);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27907
 */
public class MinePlow extends EntityType
{
    /** Default constructor */
    public MinePlow()
    {
        setCountry(Country.SLOVAKIA_SVK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 27907, Mine Plow
    }
}
