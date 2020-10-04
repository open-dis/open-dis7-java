package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f631ca0
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 10090
 */
public class M730ChaparralSurfacetoAirMissileSAMlauncher extends EntityType
{
    public M730ChaparralSurfacetoAirMissileSAMlauncher()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)3); // uid 10080, FMC M113 Armored Personnel Carrier (APC)
        setSpecific((byte)10); // uid 10090, M730 Chaparral Surface-to-Air Missile (SAM) launcher
    }
}
