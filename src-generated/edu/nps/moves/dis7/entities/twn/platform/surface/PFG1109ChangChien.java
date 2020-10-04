package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a6d30e2
 * Country: Taiwan, Province of China (TWN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 19148
 */
public class PFG1109ChangChien extends EntityType
{
    public PFG1109ChangChien()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 19140, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 19141, Cheng Kung Class (Kwang Hua Project)
        setSpecific((byte)7); // uid 19148, PFG 1109 Chang Chien
    }
}
