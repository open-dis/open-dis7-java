package edu.nps.moves.dis7.entities.srb.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@c35af2a;
 * Country: Serbia (SRB);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 30143
 */
public class M84AS extends EntityType
{
    /** Default constructor */
    public M84AS()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 30142, Tank
        setSubCategory((byte)1); // uid 30143, M-84AS
    }
}
