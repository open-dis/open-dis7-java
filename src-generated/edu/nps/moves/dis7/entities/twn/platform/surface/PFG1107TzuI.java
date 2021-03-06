package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@620c8641;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19146
 */
public class PFG1107TzuI extends EntityType
{
    /** Default constructor */
    public PFG1107TzuI()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 19140, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 19141, Cheng Kung Class (Kwang Hua Project)
        setSpecific((byte)5); // uid 19146, PFG 1107 Tzu-I
    }
}
