package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@22d8cfe0;
 * Country: Algeria (DZA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27049
 */
public class NanuchkaIIBuryaclass extends EntityType
{
    /** Default constructor */
    public NanuchkaIIBuryaclass()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27048, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 27049, Nanuchka II (Burya) class
    }
}
