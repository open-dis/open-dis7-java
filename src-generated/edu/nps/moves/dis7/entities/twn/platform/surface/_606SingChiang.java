package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5fcfde70;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 31417
 */
public class _606SingChiang extends EntityType
{
    /** Default constructor */
    public _606SingChiang()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19156, Light/Patrol Craft
        setSubCategory((byte)2); // uid 19208, Ching Chiang (Jin-Jiang) Class
        setSpecific((byte)3); // uid 31417, 606 Sing Chiang
    }
}
