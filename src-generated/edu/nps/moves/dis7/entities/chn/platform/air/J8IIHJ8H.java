package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1cab0bfb;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 25580
 */
public class J8IIHJ8H extends EntityType
{
    /** Default constructor */
    public J8IIHJ8H()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 16966, Fighter/Air Defense
        setSubCategory((byte)3); // uid 16973, Shenyang J-8 (Finback)
        setSpecific((byte)4); // uid 25580, J-8IIH (J-8H)
    }
}
