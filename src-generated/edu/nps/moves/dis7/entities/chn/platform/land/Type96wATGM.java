package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1a3869f4;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31159
 */
public class Type96wATGM extends EntityType
{
    /** Default constructor */
    public Type96wATGM()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 16857, Tank
        setSubCategory((byte)10); // uid 31156, Type 96
        setSpecific((byte)1); // uid 31157, Type 96 MBT
        setExtra((byte)2); // uid 31159, Type 96 w/ATGM
    }
}
