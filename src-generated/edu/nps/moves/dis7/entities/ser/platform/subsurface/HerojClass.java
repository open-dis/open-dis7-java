package edu.nps.moves.dis7.entities.ser.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4487c0c2;
 * Country: Serbia and Montenegro;
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 19087
 */
public class HerojClass extends EntityType
{
    /** Default constructor */
    public HerojClass()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 19086, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 19087, Heroj Class
    }
}
