package edu.nps.moves.dis7.entities.chn.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f3c0399;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: ANTI_ARMOR;
 *
 * Entity type uid: 21367
 */
public class HEforType69MBT extends EntityType
{
    /** Default constructor */
    public HEforType69MBT()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21356, Ballistic
        setSubCategory((byte)3); // uid 21359, 100 mm
        setSpecific((byte)8); // uid 21367, HE (for Type 69 MBT)
    }
}
