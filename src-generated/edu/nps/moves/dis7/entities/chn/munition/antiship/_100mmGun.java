package edu.nps.moves.dis7.entities.chn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@615efd1c;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 21434
 */
public class _100mmGun extends EntityType
{
    /** Default constructor */
    public _100mmGun()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)2); // uid 21433, Ballistic
        setSubCategory((byte)1); // uid 21434, 100 mm Gun
    }
}
