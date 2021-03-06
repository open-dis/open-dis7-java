package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@74a10858;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 16886
 */
public class Type83152mmSPGunHowitzer extends EntityType
{
    /** Default constructor */
    public Type83152mmSPGunHowitzer()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 16886, Type 83 152mm SP Gun-Howitzer
    }
}
