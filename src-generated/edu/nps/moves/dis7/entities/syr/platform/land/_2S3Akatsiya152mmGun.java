package edu.nps.moves.dis7.entities.syr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@646c0a67;
 * Country: Syrian Arab Republic (SYR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31704
 */
public class _2S3Akatsiya152mmGun extends EntityType
{
    /** Default constructor */
    public _2S3Akatsiya152mmGun()
    {
        setCountry(Country.SYRIAN_ARAB_REPUBLIC_SYR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 31702, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 31704, 2S3 Akatsiya 152-mm Gun
    }
}
