package edu.nps.moves.dis7.entities.nzl.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3e587920;
 * Country: New Zealand (NZL);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 29189
 */
public class PACP750XSTOL extends EntityType
{
    /** Default constructor */
    public PACP750XSTOL()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 29188, Cargo/Tanker
        setSubCategory((byte)1); // uid 29189, PAC P-750 XSTOL
    }
}
