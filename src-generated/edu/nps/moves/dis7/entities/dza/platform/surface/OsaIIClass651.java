package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5ef04b5;
 * Country: Algeria (DZA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27032
 */
public class OsaIIClass651 extends EntityType
{
    /** Default constructor */
    public OsaIIClass651()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 27023, Light/Patrol Craft
        setSubCategory((byte)1); // uid 27024, Osa II Class
        setSpecific((byte)8); // uid 27032, 651
    }
}
