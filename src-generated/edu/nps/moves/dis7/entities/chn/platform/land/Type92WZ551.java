package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@33723e30;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26334
 */
public class Type92WZ551 extends EntityType
{
    /** Default constructor */
    public Type92WZ551()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 16876, Armored Fighting Vehicle
        setSubCategory((byte)6); // uid 16882, NORINCO WZ 551 Armored Personnel Carrier (APC)
        setSpecific((byte)1); // uid 26334, Type 92 WZ551
    }
}
