package edu.nps.moves.dis7.entities.nzl.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@24f43aa3;
 * Country: New Zealand (NZL);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 32002
 */
public class NH90NZDF extends EntityType
{
    /** Default constructor */
    public NH90NZDF()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 32001, Utility Helicopter
        setSubCategory((byte)1); // uid 32002, NH-90 NZDF
    }
}
