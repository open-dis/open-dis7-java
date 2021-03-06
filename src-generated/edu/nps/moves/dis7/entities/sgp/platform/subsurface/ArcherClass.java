package edu.nps.moves.dis7.entities.sgp.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@14b0e127;
 * Country: Singapore (SGP);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 27281
 */
public class ArcherClass extends EntityType
{
    /** Default constructor */
    public ArcherClass()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 26615, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)2); // uid 27281, Archer Class
    }
}
