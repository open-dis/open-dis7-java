package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@238bfd6c;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 14802
 */
public class Foxtrotclass extends EntityType
{
    /** Default constructor */
    public Foxtrotclass()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 14799, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)3); // uid 14802, Foxtrot class
    }
}
