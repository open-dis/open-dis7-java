package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@74e52ef6
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 25506
 */
public class Y344Arvak extends EntityType
{
    public Y344Arvak()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 25469, Utility
        setSubCategory((byte)2); // uid 25505, Arvak Class
        setSpecific((byte)1); // uid 25506, Y344 Arvak
    }
}
