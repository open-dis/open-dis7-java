package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a34e9f;
 * Country: Russia (RUS);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30398
 */
public class ASR600ZvezdochkaProject20180 extends EntityType
{
    /** Default constructor */
    public ASR600ZvezdochkaProject20180()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)115); // uid 30397, ASR/AGE Zvezdochka class (Project 20180/20181/20183)
        setSpecific((byte)1); // uid 30398, ASR600 Zvezdochka (Project 20180)
    }
}
