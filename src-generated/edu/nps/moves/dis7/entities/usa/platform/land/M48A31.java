package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6b6eae52;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10716
 */
public class M48A31 extends EntityType
{
    /** Default constructor */
    public M48A31()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)5); // uid 10705, Self -Propelled VSHORAD Gun / Missile System
        setSpecific((byte)7); // uid 10712, Loral Aeronutronic 48 Chaparral
        setExtra((byte)4); // uid 10716, M48A3
    }
}
