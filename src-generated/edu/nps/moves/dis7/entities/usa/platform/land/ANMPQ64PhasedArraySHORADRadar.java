package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7af52ec7;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10724
 */
public class ANMPQ64PhasedArraySHORADRadar extends EntityType
{
    /** Default constructor */
    public ANMPQ64PhasedArraySHORADRadar()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)6); // uid 10720, Towed VSHORAD Gun / Missile System
        setSpecific((byte)4); // uid 10724, AN/MPQ-64 Phased Array SHORAD Radar
    }
}
