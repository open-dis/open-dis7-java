package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f1483fd;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10467
 */
public class OEMRCPATRIOTAntennaMastGroupAMGonM942chassis extends EntityType
{
    /** Default constructor */
    public OEMRCPATRIOTAntennaMastGroupAMGonM942chassis()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)5); // uid 10435, M939 6X6 5-ton cargo truck
        setSpecific((byte)32); // uid 10467, OE-MRC PATRIOT Antenna Mast Group (AMG) on M942 chassis
    }
}
