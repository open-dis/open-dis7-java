package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@123a439b;
 * Country: Australia (AUS);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31179
 */
public class HMTExtendaAUS extends EntityType
{
    /** Default constructor */
    public HMTExtendaAUS()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 28910, Small Wheeled Utility Vehicle
        setSubCategory((byte)6); // uid 31178, High Mobility Transporter (HMT) (AUS)
        setSpecific((byte)1); // uid 31179, HMT Extenda (AUS)
    }
}
