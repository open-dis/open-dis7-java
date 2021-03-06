package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@55b7a4e0;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28873
 */
public class AmphibiousTransportDock extends EntityType
{
    /** Default constructor */
    public AmphibiousTransportDock()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 28873, Amphibious Transport Dock
    }
}
