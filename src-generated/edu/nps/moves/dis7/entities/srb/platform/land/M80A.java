package edu.nps.moves.dis7.entities.srb.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@474c9131;
 * Country: Serbia (SRB);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30146
 */
public class M80A extends EntityType
{
    /** Default constructor */
    public M80A()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 30145, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 30146, M-80A
    }
}
