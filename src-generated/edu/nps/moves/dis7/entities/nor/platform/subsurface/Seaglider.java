package edu.nps.moves.dis7.entities.nor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@22db8f4;
 * Country: Norway (NOR);
 * Entity kind: Platform;
 * Domain: SUBSURFACE;
 *
 * Entity type uid: 29292
 */
public class Seaglider extends EntityType
{
    /** Default constructor */
    public Seaglider()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)8); // uid 29289, Unmanned Underwater Vehicle (UUV)
        setSubCategory((byte)3); // uid 29292, Seaglider
    }
}
