package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3c0e00a8;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10694
 */
public class PatriotBTOC extends EntityType
{
    /** Default constructor */
    public PatriotBTOC()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)2); // uid 10691, MIM-104 Raytheon Patriot High-to-Medium Altitude Air Defense (HIMAD) System
        setSpecific((byte)1); // uid 10692, Patriot Command Center
        setExtra((byte)2); // uid 10694, Patriot BTOC
    }
}
