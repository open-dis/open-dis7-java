package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@21f8e55f
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 13873
 */
public class AmurIIClassrepairship92 extends EntityType
{
    public AmurIIClassrepairship92()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)10); // uid 13869, Amur II Class (repair ship)
        setSpecific((byte)4); // uid 13873, 92
    }
}
